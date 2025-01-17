<%@page contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<%@page isErrorPage="true" %>

<h2>Error Information</h2>

<%
if (exception instanceof java.lang.NumberFormatException) {
%>
    <p><strong>Error Type:</strong> Invalid Number Format</p>
    <p><strong>Details:</strong> Please ensure that you have entered a valid number.</p>
<%
} else if (exception instanceof java.lang.NullPointerException) {
%>
    <p><strong>Error Type:</strong> Null Pointer Exception</p>
    <p><strong>Details:</strong> It seems like you tried to access something that doesn't exist.</p>
<%
} else if (exception instanceof java.lang.ArrayIndexOutOfBoundsException) {
%>
    <p><strong>Error Type:</strong> Array Index Out of Bounds</p>
    <p><strong>Details:</strong> You tried to access an invalid index of an array.</p>
<%
} else {
%>
    <p><strong>Error Type:</strong> General Exception</p>
    <p><strong>Details:</strong> <%= exception.getMessage() %></p>
<%
}
%>

<h3>Additional Information:</h3>
<p><strong>Exception Class:</strong> <%= exception.getClass().getName() %></p>

<h3>Stack Trace:</h3>
<pre>
<% 
for (StackTraceElement element : exception.getStackTrace()) {
    out.println(element.toString());
}
%>
</pre>

<%@include file="../footer.html" %>

