package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class next_0020page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quiz Game</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"text-align:center\"><font size=\"7\">Next Quiz</font></h1>\n");
      out.write("        \n");
      out.write("        <h3>1.Bada Imambada is located in ………….</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question1\" value=\"Chennai\">A.Chennai</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question1\" value=\"jammu & kashmir\">B.jammu & kashmir</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question1\" value=\"Agra\">C.Agra</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question1\" value=\"D.Lucknow\">D.Lucknow</p><br>\n");
      out.write("        \n");
      out.write("        <h3>2.Radio Astronomy Center is located in …</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question2\" value=\"Udhagamandalam\">A.Udhagamandalam</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question2\" value=\"Mumbai\">B.Mumbai</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question2\" value=\"Hyderabad\">C.Hyderabad</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question2\" value=\"Kolkata\">D.Kolkata</p>\n");
      out.write("        \n");
      out.write("        <h3>3. Which among the following oceans looks like the English alphabet ‘S?’</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question3\" value=\"Atlantic\">A.Atlantic </p>\n");
      out.write("        <p><input type=\"radio\" name=\"question3\" value=\"Pacific\">B.Pacific</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question3\" value=\"Indian\">C.Indian</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question3\" value=\"Arctic\">D.Arctic</p><br>\n");
      out.write("        \n");
      out.write("        <h3>4.As per the Census 2011, what is the life expectancy rate for male in India?</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question4\" value=\"65\">A.65</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question4\" value=\"78\">B.78</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question4\" value=\"82\">C.82</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question4\" value=\"58\">D.58</p><br>\n");
      out.write("        \n");
      out.write("        <h3>5. ……………………. was the first person who travelled the North Pole.</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question5\" value=\"Tenzing Norgay\">A.Tenzing Norgay</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question5\" value=\"Edmund Hilary\">B.Edmund Hilary</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question5\" value=\"Rober Peary\">C.Rober Peary</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question5\" value=\"Ronald Amundsen\">D.Ronald Amundsen</p><br>\n");
      out.write("        \n");
      out.write("        <button style=\"text-align:center\" type=\"button\" class=\"btn\"><font size=\"5\">Sumbit quiz</button>\n");
      out.write("     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
