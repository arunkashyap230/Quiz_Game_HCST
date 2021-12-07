package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1 style=\"text-align:center\"><font size=\"7\">Quiz Game</font></h1>\n");
      out.write("        \n");
      out.write("        <h3>1.The home of Gargi, Maitrey and Kapila was at.</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question1\" value=\"Vidisha\">A.Vidisha</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question1\" value=\"Ujjain\">B.Ujjain</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question1\" value=\"Pataliputra\">C.Pataliputra</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question1\" value=\"Mithila\">D.Mithila</p><br>\n");
      out.write("        \n");
      out.write("        <h3>2.Which of the following Vedas provides information about the civilization of the Early Vedic Age?</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question2\" value=\"Rig-Veda\">A.Rig-Veda</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question2\" value=\"Yajur-Veda\">B.Yajur-Veda</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question2\" value=\"Atharva-Veda\">C.Atharva-Veda</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question2\" value=\"Sama-Veda\">D.Sama-Veda</p>\n");
      out.write("        \n");
      out.write("        <h3>3.The most important text of vedic mathematics is:</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question3\" value=\"Satapatha Brahman\">A.Satapatha Brahman</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question3\" value=\"Atharva Veda\">B.Atharva Veda</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question3\" value=\"Sulva Sutras\">C.Sulva Sutras</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question3\" value=\"Chhandogya Upanished\">D.Chhandogya Upanished</p><br>\n");
      out.write("        \n");
      out.write("        <h3>4.Which of the following Craftsmanship was not practised by the Aryans?</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question4\" value=\"Pottery\">A.Pottery</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question4\" value=\"jewellery\">B.jewellery</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question4\" value=\"Carpentry\">C.Carpentry</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question4\" value=\"Blacksmith\">D.Blacksmith</p><br>\n");
      out.write("        \n");
      out.write("        <h3>5.The words \"Satyameva Jayate” in the State Emblem of india were taken from</h3>\n");
      out.write("        <p><input type=\"radio\" name=\"question5\" value=\"Upanishads\">A.Upanishads</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question5\" value=\"Sama veda\">B.Sama veda</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question5\" value=\"Rig Veda\">C.Rig Veda</p>\n");
      out.write("        <p><input type=\"radio\" name=\"question5\" value=\"Ramayana\">D.Ramayana</p><br>\n");
      out.write("        \n");
      out.write("        <button type=\"button\" class=\"btn\"><font size=\"5\">Sumbit quiz</button>\n");
      out.write("        \n");
      out.write(" \n");
      out.write("        \n");
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
