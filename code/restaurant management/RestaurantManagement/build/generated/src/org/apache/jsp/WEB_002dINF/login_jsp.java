package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/39e8541ce6.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"src/css/styles.css\">\n");
      out.write("        <!-- CSS only -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"vh-100\" style=\"background-color: #508bfc;\">\n");
      out.write("            <div class=\"container py-5 h-100\">\n");
      out.write("              <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                <div class=\"col-12 col-md-8 col-lg-6 col-xl-5\">\n");
      out.write("                  <div class=\"card shadow-2-strong\" style=\"border-radius: 1rem;\">\n");
      out.write("                    <div class=\"card-body p-5 text-center\">\n");
      out.write("                      <h3 class=\"mb-5\">Sign in</h3>\n");
      out.write("                        <form action = \"LoginControl\" method = \"post\">\n");
      out.write("                          <div class=\"form-outline mb-4\">\n");
      out.write("                              <input type=\"text\" id=\"typeEmailX-2\" class=\"form-control form-control-lg\" name=\"username\" />\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"form-outline mb-4\">\n");
      out.write("                              <input type=\"password\" id=\"typePasswordX-2\" class=\"form-control form-control-lg\" name=\"password\" />\n");
      out.write("                          </div>\n");
      out.write("                            <!-- Checkbox -->\n");
      out.write("                          <div class=\"form-check d-flex justify-content-start mb-4\">\n");
      out.write("                            <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"form1Example3\" />\n");
      out.write("                            <label class=\"form-check-label\" for=\"form1Example3\"> Remember password </label>\n");
      out.write("                          </div>\n");
      out.write("                          <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Login</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </section>\n");
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
