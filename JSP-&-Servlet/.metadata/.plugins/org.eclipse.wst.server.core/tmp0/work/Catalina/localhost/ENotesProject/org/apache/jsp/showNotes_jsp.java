/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-11-21 02:13:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.User.Post;
import java.util.List;
import com.Db.DBConnect;
import com.DAO.PostDAO;
import com.User.UserDetails;

public final class showNotes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/all_component/navbar.jsp", Long.valueOf(1700531727981L));
    _jspx_dependants.put("/all_component/footer.jsp", Long.valueOf(1699992284973L));
    _jspx_dependants.put("/all_component/allcss.jsp", Long.valueOf(1699957916831L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.DAO.PostDAO");
    _jspx_imports_classes.add("com.User.UserDetails");
    _jspx_imports_classes.add("com.Db.DBConnect");
    _jspx_imports_classes.add("com.User.Post");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");

		UserDetails user3 = (UserDetails) session.getAttribute("userD");
		if (user3 == null) {
			response.sendRedirect("login.jsp");
			session.setAttribute("Login-error", "Please Login For Continue...");
		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"\r\n");
      out.write("		integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("		integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
      out.write("		\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Show Notes</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\r\n");
      out.write("      integrity=\"sha512-...\"\r\n");
      out.write("      crossorigin=\"anonymous\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom navbar-custom\">\r\n");
      out.write("	<a class=\"navbar-brand\" href=\"#\"><i class=\"fa fa-book\"\r\n");
      out.write("		aria-hidden=\"true\"></i> E-Notes</a>\r\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("		data-target=\"#navbarSupportedContent\"\r\n");
      out.write("		aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("		aria-label=\"Toggle navigation\">\r\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	</button>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("		<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\" href=\"home.jsp\"><i\r\n");
      out.write("					class=\"fa fa-home\" aria-hidden=\"true\"></i> Home<span\r\n");
      out.write("					class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"addNotes.jsp\"><i\r\n");
      out.write("					class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i> Add Notes</a></li>\r\n");
      out.write("\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"showNotes.jsp\"><i\r\n");
      out.write("					class=\"fa fa-sticky-note\" aria-hidden=\"true\"></i> Show Notes</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		");

		UserDetails user = (UserDetails) session.getAttribute("userD");

		if (user != null) {
		
      out.write("\r\n");
      out.write("		<a href=\"login.jsp\" class=\"btn btn-light my-2 my-sm-0 mr-2\"\r\n");
      out.write("			data-toggle=\"modal\" data-target=\"#exampleModal\" type=\"submit\"><i\r\n");
      out.write("			class=\"fa fa-user\" aria-hidden=\"true\"></i> ");
      out.print(user.getName());
      out.write("</a>\r\n");
      out.write("			<a href=\"LogoutServlet\" class=\"btn btn-light my-2 my-sm-0\" type=\"submit\"><i\r\n");
      out.write("			class=\"fas fa-sign-out-alt\" aria-hidden=\"true\"></i> Logout</a>\r\n");
      out.write("\r\n");
      out.write("		<!-- Modal -->\r\n");
      out.write("		<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\"\r\n");
      out.write("			aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("			<div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("				<div class=\"modal-content\">\r\n");
      out.write("					<div class=\"modal-header\">\r\n");
      out.write("						<h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\r\n");
      out.write("						<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("							aria-label=\"Close\">\r\n");
      out.write("							<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("						</button>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"modal-body text-center\">\r\n");
      out.write("						<i class=\"fa fa-user fa-3x\"></i>\r\n");
      out.write("						<h5></h5>\r\n");
      out.write("						<table class=\"table\">\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>User Id</th>\r\n");
      out.write("									<td>");
      out.print(user.getId());
      out.write("</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>Name</th>\r\n");
      out.write("									<td>");
      out.print(user.getName());
      out.write("</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>Email Id</th>\r\n");
      out.write("									<td>");
      out.print(user.getEmail());
      out.write("</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"modal-footer justify-content-center\">\r\n");
      out.write("						<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("							data-dismiss=\"modal\">Close</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		");

		} else {
		
      out.write("\r\n");
      out.write("		<a href=\"login.jsp\" class=\"btn btn-light my-2 my-sm-0 mr-2\"\r\n");
      out.write("			type=\"submit\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i> Login</a>\r\n");
      out.write("		<a href=\"register.jsp\" class=\"btn btn-light my-2 my-sm-0\"\r\n");
      out.write("			type=\"submit\"><i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i>\r\n");
      out.write("			Register</a>\r\n");
      out.write("\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</nav>");
      out.write('\r');
      out.write('\n');
      out.write('	');

	String updateMsg = (String) session.getAttribute("updateMsg");
	if (updateMsg != null) {
	
      out.write("\r\n");
      out.write("	<div class=\"alert alert-success\" role=\"alert\">");
      out.print(updateMsg);
      out.write("</div>\r\n");
      out.write("	");

	session.removeAttribute("updateMsg");
	}
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	");

	String wrongMsg = (String) session.getAttribute("wrongMsg");
	if (wrongMsg != null) {
	
      out.write("\r\n");
      out.write("	<div class=\"alert alert-danger\" role=\"alert\">");
      out.print(wrongMsg);
      out.write("</div>\r\n");
      out.write("	");

	session.removeAttribute("wrongMsg");
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h1 class=\"text-center mt-4 mb-3\"\r\n");
      out.write("			style=\"font-size: 2.5rem; color: #333;\">All Notes</h1>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-12\">\r\n");
      out.write("				");

				if (user3 != null) {
					PostDAO ob = new PostDAO(DBConnect.getConn());
					List<Post> post = ob.getData(user3.getId());
					for (Post po : post) {
				
      out.write("\r\n");
      out.write("				<div class=\"card mt-3 mb-4\">\r\n");
      out.write("					<img alt=\"\" src=\"img/notesbg.png\" class=\"card-img-top mt-2 mx-auto\"\r\n");
      out.write("						style=\"max-width: 100px\">\r\n");
      out.write("					<div class=\"card-body p-4\">\r\n");
      out.write("\r\n");
      out.write("						<h5 class=\"card=title\">");
      out.print(po.getTitle());
      out.write("</h5>\r\n");
      out.write("						<p>");
      out.print(po.getContent());
      out.write(".\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<b class=\"text-success\">Published By : ");
      out.print(user3.getName());
      out.write(".\r\n");
      out.write("							</b><br> <b=\"text-primary\"></b>\r\n");
      out.write("						</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							<b class=\"text-success\">Published Date : ");
      out.print(po.getPdate());
      out.write("</b><br>\r\n");
      out.write("							<b class=\"text-success\"></b>\r\n");
      out.write("						</p>\r\n");
      out.write("						<div class=\"container text-center mt-2\">\r\n");
      out.write("							<a href=\"DeleteServlet?note_id=");
      out.print( po.getId() );
      out.write("\" class=\"btn btn-danger\">Delete</a>\r\n");
      out.write("							<a href=\"edit.jsp?note_id=");
      out.print(po.getId());
      out.write("\" class=\"btn btn-primary\">Edit</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				");

				}

				}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        /* Footer Styles */\r\n");
      out.write("        .footer {\r\n");
      out.write("            background-color: #080808;\r\n");
      out.write("            padding: 40px 0;\r\n");
      out.write("            color: #eceff1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer h4 {\r\n");
      out.write("            color: #007bff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .footer p {\r\n");
      out.write("            color: #eceff1;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* Quick Links */\r\n");
      out.write("        \r\n");
      out.write("/* Footer Styles */\r\n");
      out.write(".footer {\r\n");
      out.write("    background-color: #080808;\r\n");
      out.write("    padding: 40px 0;\r\n");
      out.write("    color: #eceff1;\r\n");
      out.write("    margin-top: auto; /* Push the footer to the bottom */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer h4 {\r\n");
      out.write("    color: #007bff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer p {\r\n");
      out.write("    color: #eceff1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Quick Links */\r\n");
      out.write(".footer ul {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer ul li {\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer ul li a {\r\n");
      out.write("    color: #eceff1;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footer ul li a:hover {\r\n");
      out.write("    color: #03a9f4;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Social Media Icons */\r\n");
      out.write(".social-icons {\r\n");
      out.write("    list-style-type: none;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons li {\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons a {\r\n");
      out.write("    color: #007bff;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-icons a:hover {\r\n");
      out.write("    color: #0056b3;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!-- Your main content goes here -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Footer -->\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <!-- Project Description -->\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <h4>About E-Notes</h4>\r\n");
      out.write("                    <p>E-Notes is your go-to platform for taking and managing digital notes. Whether you're a student, professional, or simply someone who loves to stay organized, E-Notes provides a convenient way to jot down and access your notes anytime, anywhere.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Quick Links -->\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <h4>Quick Links</h4>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Features</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Download App</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <!-- Contact Information -->\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <h4>Contact Us</h4>\r\n");
      out.write("                    <p>Email: official.shahnoor@gmail.com</p>\r\n");
      out.write("                    <p>Phone: +91 913-686-1845</p>\r\n");
      out.write("                    <p>Address: Mumbai, India</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Copyright -->\r\n");
      out.write("            <div class=\"row mt-4\">\r\n");
      out.write("                <div class=\"col-md-12 text-center\">\r\n");
      out.write("                    <p>&copy; ");
      out.print( new java.util.Date().getYear() + 1900 );
      out.write(" E-Notes. All Rights Reserved.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("    <!-- Include your script files and closing body/html tags here -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
