/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2025-06-19 01:46:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1750036417110L));
    _jspx_dependants.put("jar:file:/C:/Works/kyobo/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/kyobo/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

String path = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<link href=\"css/main.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.7.0.min.js\"></script>\r\n");
      out.write("<script src=\"js/hangang.js\"></script>\r\n");
      out.write("<script src=\"js/best.js\"></script>\r\n");
      out.write("<script src=\"js/md_recommed.js\"></script>\r\n");
      out.write("<script src=\"js/ai_recommed.js\"></script>\r\n");
      out.write("<script src=\"js/kyobo_best.js\"></script>\r\n");
      out.write("<script src=\"js/kyobo_best1.js\"></script>\r\n");
      out.write("<script src=\"js/peoples.js\"></script>\r\n");
      out.write("<script src=\"js/kyobo_made.js\"></script>\r\n");
      out.write("<script src=\"js/kyobo_pod.js\"></script>\r\n");
      out.write("<script src=\"js/event.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>Kyobo</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div id=\"top-banner\">\r\n");
      out.write("				<div class=\"banner-left\"></div>\r\n");
      out.write("				<div class=\"banner-right\">\r\n");
      out.write("					");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      boolean _jspx_th_c_005fchoose_005f0_reused = false;
      try {
        _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fchoose_005f0.setParent(null);
        int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
        if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("						");
            //  c:when
            org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
            boolean _jspx_th_c_005fwhen_005f0_reused = false;
            try {
              _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
              // /index.jsp(36,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty loginUser}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
              int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
              if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("   	   ");
                  out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
                  out.write("님 &nbsp;| <a\r\n");
                  out.write("								href=\"");
                  out.print(request.getContextPath());
                  out.write("/logout.do\">로그아웃</a>&nbsp; |\r\n");
                  out.write("  	  ");
                  int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
              _jspx_th_c_005fwhen_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
            }
            out.write("\r\n");
            out.write("						");
            //  c:otherwise
            org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
            boolean _jspx_th_c_005fotherwise_005f0_reused = false;
            try {
              _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
              int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
              if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n");
                  out.write("							<a href=\"");
                  out.print(request.getContextPath());
                  out.write("/member/login.jsp\">로그인</a> &nbsp; |\r\n");
                  out.write("     	 <a href=\"");
                  out.print(path);
                  out.write("/sign up.html\">회원가입</a> &nbsp;|\r\n");
                  out.write("   		 ");
                  int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
              _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
              _jspx_th_c_005fotherwise_005f0_reused = true;
            } finally {
              org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
            }
            out.write("\r\n");
            out.write("					");
            int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
        _jspx_th_c_005fchoose_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
      }
      out.write("\r\n");
      out.write("					<a href=\"#\">회원혜택 ▼</a> &nbsp;|<a href=\"#\">주문배송 </a> &nbsp;| <a\r\n");
      out.write("						href=\"member/checkAdmin.jsp\">도서관리</a> &nbsp;| <a\r\n");
      out.write("						href=\"notice board.jsp\">게시판 </a>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<nav id=\"main-top-menu\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"#\">교보문고</a></li>\r\n");
      out.write("					<li><a href=\"#\">eBook</a></li>\r\n");
      out.write("					<li><a href=\"#\">sam</a></li>\r\n");
      out.write("					<li><a href=\"#\">핫트랙스</a></li>\r\n");
      out.write("					<li><a href=\"#\">스토리</a></li>\r\n");
      out.write("					<li><a href=\"#\">브랜드 더보기 ▼</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</nav>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"main-header\">\r\n");
      out.write("				<div class=\"logo\">\r\n");
      out.write("					<a href=\"index.jsp\"><img src=\"img/logo_book.svg\" alt=\"로고\" /></a>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"search-box\">\r\n");
      out.write("					<input type=\"text\" placeholder=\"거대한 속임수와 의외의 진실\" />\r\n");
      out.write("					<button>\r\n");
      out.write("						<img class=\"searchimg\" src=\"img/serch_img.png\" alt=\"검색\" />\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"icons\">\r\n");
      out.write("					<div class=\"benefit\">이번주 혜택 UP!</div>\r\n");
      out.write("					<div class=\"cart\">\r\n");
      out.write("						<img src=\"img/cart.png\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"user\">\r\n");
      out.write("						<a href=\"#\"><img src=\"img/prfile.png\" /></a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"menu\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a class=\"green\" href=\"#\">책의날특집</a></li>\r\n");
      out.write("					<li><a class=\"green\" href=\"#\">한강산문집</a></li>\r\n");
      out.write("					<li><a href=\"#\">베스트</a></li>\r\n");
      out.write("					<li><a href=\"#\">신상품</a></li>\r\n");
      out.write("					<li><a href=\"#\">이벤트</a></li>\r\n");
      out.write("					<li><a href=\"#\">바로펀딩</a></li>\r\n");
      out.write("					<li><a href=\"#\">PICKS</a></li>\r\n");
      out.write("					<li><a href=\"#\">CASTING</a></li>\r\n");
      out.write("					<li><a href=\"#\">컬처라운지</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div id=\"main_wrap\">\r\n");
      out.write("				<div id=\"slider\">\r\n");
      out.write("					<ul class=\"sliderwrap\">\r\n");
      out.write("						<li><a href=\"sub.html\"><img\r\n");
      out.write("								src=\"img/slider1.jpg\" alt=\"슬라이더1\" /></a></li>\r\n");
      out.write("						<li><a href=\"sub.html\"><img\r\n");
      out.write("								src=\"img/slider2.jpg\" alt=\"슬라이더2\" /></a></li>\r\n");
      out.write("						<li><a href=\"sub.html\"><img\r\n");
      out.write("								src=\"img/slider3.jpg\" alt=\"슬라이더3\" /></a></li>\r\n");
      out.write("						<li><a href=\"sub.html\"><img\r\n");
      out.write("								src=\"img/slider4.jpg\" alt=\"슬라이더4\" /></a></li>\r\n");
      out.write("						<li><a href=\"sub.html\"><img\r\n");
      out.write("								src=\"img/slider5.jpg\" alt=\"슬라이더5\" /></a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"salewarp\">\r\n");
      out.write("					<div id=\"sidemenu\"></div>\r\n");
      out.write("					<div id=\"sale\">\r\n");
      out.write("						<ul class=\"sale-list\">\r\n");
      out.write("							<li class=\"sale-item\"><img src=\"img/sale1.jpg\" alt=\"오늘만 특가\" />\r\n");
      out.write("								<div class=\"sale-text\">\r\n");
      out.write("									<h2>\r\n");
      out.write("										오늘만 특가<br />노르잇 높이조절 독서대\r\n");
      out.write("									</h2>\r\n");
      out.write("									<p>오늘만 이 가격 26,900원!</p>\r\n");
      out.write("								</div></li>\r\n");
      out.write("							<li class=\"sale-item\"><img src=\"img/sale2.jpg\" alt=\"스테들러 샤프\" />\r\n");
      out.write("								<div class=\"sale-text\">\r\n");
      out.write("									<h2>\r\n");
      out.write("										오늘만 특가<br />스테들러 770 제도샤프\r\n");
      out.write("									</h2>\r\n");
      out.write("									<p>오늘만 이 가격 13,800원!</p>\r\n");
      out.write("								</div></li>\r\n");
      out.write("							<li class=\"sale-item\"><img src=\"img/sale3.jpg\"\r\n");
      out.write("								alt=\"카네이션 트로피\" />\r\n");
      out.write("								<div class=\"sale-text\">\r\n");
      out.write("									<h2>\r\n");
      out.write("										오늘만 특가<br />카네이션 트로피 용돈박스\r\n");
      out.write("									</h2>\r\n");
      out.write("									<p>오늘만 이 가격 15,300원!</p>\r\n");
      out.write("								</div></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"sale-buttons\">\r\n");
      out.write("							<button id=\"prev\">←</button>\r\n");
      out.write("							<span id=\"page-indicator\">01 - 03</span>\r\n");
      out.write("							<button id=\"next\">→</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"mini_mission_wrap\">\r\n");
      out.write("				<div id=\"mini_menu\">\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li><a href=\"sub.html\"><img\r\n");
      out.write("								src=\"img/mini_menu1.svg\" alt=\"미니메뉴\" />할인혜택</a></li>\r\n");
      out.write("						<li><a href=\"v\"><img\r\n");
      out.write("								src=\"img/mini_menu2.svg\" alt=\"미니메뉴\" />오늘만특가</a></li>\r\n");
      out.write("						<li><a href=\"sub.html\"><img\r\n");
      out.write("								src=\"img/mini_menu3.svg\" alt=\"미니메뉴\" />책그리고꽃</a></li>\r\n");
      out.write("						<li><a href=\"#\"><img\r\n");
      out.write("								src=\"img/mini_menu4.svg\" alt=\"미니메뉴\" />음반/영상</a></li>\r\n");
      out.write("						<li><a href=\"#\"><img\r\n");
      out.write("								src=\"img/mini_menu5.svg\" alt=\"미니메뉴\" />바로출판</a></li>\r\n");
      out.write("						<li><a href=\"#\"><img\r\n");
      out.write("								src=\"img/mini_menu6.svg\" alt=\"미니메뉴\" />이달의 책</a></li>\r\n");
      out.write("						<li><a href=\"#\"><img\r\n");
      out.write("								src=\"img/mini_menu7.svg\" alt=\"미니메뉴\" />손글씨캠페인</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li><a href=\"#\"><img\r\n");
      out.write("								src=\"img/mini_menu8.svg\" alt=\"미니메뉴\" />사은품</a></li>\r\n");
      out.write("						<li><a href=\"#\"><img\r\n");
      out.write("								src=\"img/mini_menu9.svg\" alt=\"미니메뉴\" />추천</a></li>\r\n");
      out.write("						<li><a href=\"#\"><img\r\n");
      out.write("								src=\"img/mini_menu10.svg\" alt=\"미니메뉴\" />APP혜택</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div id=\"today_mission\">\r\n");
      out.write("					<a href=\"#\"><img src=\"img/ad1.jpg\" alt=\"광고\" /></a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"today_choice\">\r\n");
      out.write("				<h2>오늘의 선택</h2>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a href=\"#\">국내도서</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">외국도서</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">eBook</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">sam</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">핫트랙스</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">교보only</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"the_gravity\">\r\n");
      out.write("				<div id=\"book1\">\r\n");
      out.write("					<a class=\"gravity\" href=\"#\"><img\r\n");
      out.write("						src=\"img/gravity.jpg\" alt=\"중력책사진\" /></a>\r\n");
      out.write("					<ul>\r\n");
      out.write("						<p>수학의 중력</p>\r\n");
      out.write("						<li><a class=\"blue\" href=\"#\">중력과 시공간을\r\n");
      out.write("								이해하기 위한 모든 수학</a></li>\r\n");
      out.write("						<li>필즈상 수상자 야우싱퉁이 일반상대성이론의 발전사를 따라갑니다.<br />아인슈타인부터 현대까지\r\n");
      out.write("							물리학과 함께한 수학의 서사!\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("					<a class=\"think\" href=\"#\"><img\r\n");
      out.write("						src=\"img/book1_1.jpg\" alt=\"book1\" /></a> <a\r\n");
      out.write("						class=\"think\" href=\"#\"><img\r\n");
      out.write("						src=\"img/book1_2.jpg\" alt=\"book1\" /></a> <a\r\n");
      out.write("						class=\"think\" href=\"#\"><img\r\n");
      out.write("						src=\"img/book1_3.jpg\" alt=\"book1\" /></a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"AD\">\r\n");
      out.write("				<a href=\"#\"><img src=\"img/ad2.png\" alt=\"광고\" /></a> <a href=\"#\"><img\r\n");
      out.write("					src=\"img/ad3.png\" alt=\"광고\" /></a>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"hangang\">\r\n");
      out.write("				<h2>한강 신문집이 곧 출간돼요</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"book-list\"></div>\r\n");
      out.write("			<script src=\"js/hangang.js\"></script>\r\n");
      out.write("			<div id=\"recommend\">\r\n");
      out.write("				<h2>출판사에서 자신있게 추천해요</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"recommend-list\"></div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"md\">\r\n");
      out.write("				<h2>MD들이 신중하게 골랐어요</h2>\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a class=\"blue\" href=\"#\">국내도서</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">외국도서</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">eBook</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">sam</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">핫트랙스</a></li>\r\n");
      out.write("					<li>|</li>\r\n");
      out.write("					<li><a href=\"#\">교보only</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"md_commend-list\"></div>\r\n");
      out.write("			<div id=\"AD\">\r\n");
      out.write("				<a href=\"#\"><img src=\"img/ad3.png\" alt=\"광고\" /></a> <a href=\"#\"><img\r\n");
      out.write("					src=\"img/ad4.png\" alt=\"광고\" /></a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"Ai_recommed_wrap\">\r\n");
      out.write("				<div id=\"Ai_recommed\">\r\n");
      out.write("					<h2>\r\n");
      out.write("						AI추천<br />PICKS\r\n");
      out.write("					</h2>\r\n");
      out.write("					<p>\r\n");
      out.write("						발견의 기쁨을 선물합니다<br /> 취향을 분석해 꼭 맞는 책을 <br />추천해 드릴게요!\r\n");
      out.write("					</p>\r\n");
      out.write("					<button id=\"login_reco\">\r\n");
      out.write("						<a href=\"#\"><p>로그인하고 더 많은 추천 받기</p></a>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div id=\"ai_pick-list\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"kyobo_best_background\">\r\n");
      out.write("				<div id=\"kyobo_best_wrap\">\r\n");
      out.write("					<div id=\"bestthe\">\r\n");
      out.write("						<h2>베스트</h2>\r\n");
      out.write("						<p>더보기+</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div id=\"kyobo_list\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a class=\"blue\" href=\"#\">전체</a></li>\r\n");
      out.write("							<li><a href=\"#\">국내도서</a></li>\r\n");
      out.write("							<li><a href=\"#\">외국도서</a></li>\r\n");
      out.write("							<li><a href=\"#\">eBook</a></li>\r\n");
      out.write("							<li><a href=\"#\">sam</a></li>\r\n");
      out.write("							<li><a href=\"#\">핫트랙스</a></li>\r\n");
      out.write("							<li><a href=\"#\">교보only</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<div id=\"stady\">\r\n");
      out.write("							<ul>\r\n");
      out.write("								<li><a class=\"bold\" href=\"#\">스테디셀러</a></li>\r\n");
      out.write("								<li><a href=\"#\">외국도서</a></li>\r\n");
      out.write("								<li><a href=\"#\">국내도서</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"best_list\"></div>\r\n");
      out.write("				<div id=\"best_list_2\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"people\">\r\n");
      out.write("				<h2>사람들이 많이 찾고있어요</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"peoples-list\"></div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"AD_1\">\r\n");
      out.write("				<a href=\"#\"><img src=\"img/ad5.jpg\" alt=\"광고\" /></a>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"kyobo_made\">\r\n");
      out.write("				<h2>교보문고가 만들었어요</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"kyobomade-list\"></div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"kyobo_pod\">\r\n");
      out.write("				<h2>바로출판 POD</h2>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"kyobo_pod-list\"></div>\r\n");
      out.write("\r\n");
      out.write("			<div id=\"event_1\">\r\n");
      out.write("				<h2>이벤트의 정성이 달라요</h2>\r\n");
      out.write("\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a class=\"blue\" href=\"#\">교보문고</a></li>\r\n");
      out.write("					<li><a href=\"#\">|</a></li>\r\n");
      out.write("					<li><a href=\"#\">ebook</a></li>\r\n");
      out.write("					<li><a href=\"#\">|</a></li>\r\n");
      out.write("					<li><a href=\"#\">핫트랙스</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"event_2\">\r\n");
      out.write("				<a href=\"#\"><img src=\"img/event1.jpg\" alt=\"이벤트\" /></a> <a href=\"#\"><img\r\n");
      out.write("					src=\"img/event2.jpg\" alt=\"이벤트\" /></a> <a href=\"#\"><img\r\n");
      out.write("					src=\"img/event3.jpg\" alt=\"이벤트\" /></a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr width=\"100%\" color=\"gray\" size=\"1\" />\r\n");
      out.write("\r\n");
      out.write("			<footer class=\"footer\">\r\n");
      out.write("				<div class=\"footer-top\">\r\n");
      out.write("					<div class=\"notice-left\">\r\n");
      out.write("						<strong>공지사항</strong> <a href=\"#\">컬처랜드 시스템 점검 안내(4/24)</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"notice-right\">\r\n");
      out.write("						<a href=\"#\">더보기 +</a> <strong>당첨자 발표</strong> <a href=\"#\">[공통]\r\n");
      out.write("							한강 신작 산문집 『빛과 실』 알림 신청 이벤트 당첨자 발표</a> <a href=\"#\">더보기 +</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<hr class=\"footer-divider\" />\r\n");
      out.write("\r\n");
      out.write("				<div class=\"footer-middle\">\r\n");
      out.write("					<div class=\"middle-left\">\r\n");
      out.write("						<img src=\"img/logo.svg\" alt=\"교보문고 로고\" class=\"footer-logo\" />\r\n");
      out.write("						<ul class=\"footer-links\">\r\n");
      out.write("							<li><a href=\"#\">회사소개</a></li>\r\n");
      out.write("							<li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("							<li><a href=\"#\">개인정보처리방침</a></li>\r\n");
      out.write("							<li><a href=\"#\">청소년보호정책</a></li>\r\n");
      out.write("							<li><a href=\"#\">대량주문안내</a></li>\r\n");
      out.write("							<li><a href=\"#\">협력사여러분</a></li>\r\n");
      out.write("							<li><a href=\"#\">채용정보</a></li>\r\n");
      out.write("							<li><a href=\"#\">광고소개</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"footer-bottom\">\r\n");
      out.write("					<div class=\"bottom-left\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li>대표이사 : 허정도 | 서울특별시 종로구 종로1 | 사업자등록번호 : 102-81-11670</li>\r\n");
      out.write("							<li>대표전화 : 1544-1900 (발신자 부담전화) | FAX : 0502-987-5711 (지역번호\r\n");
      out.write("								공통)</li>\r\n");
      out.write("							<li>서울특별시 통신판매업신고번호 : 제 653호\r\n");
      out.write("								<button class=\"biz-btn\">사업자정보확인</button>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<p>© KYOBO BOOK CENTRE</p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"footer-right\">\r\n");
      out.write("						<div class=\"family-sns-wrap\">\r\n");
      out.write("							<select class=\"family-site\">\r\n");
      out.write("								<option>Family Site</option>\r\n");
      out.write("								<option>교보생명</option>\r\n");
      out.write("								<option>교보증권</option>\r\n");
      out.write("								<option>교보DTS</option>\r\n");
      out.write("							</select>\r\n");
      out.write("							<div class=\"social-icons\">\r\n");
      out.write("								<a href=\"#\"><img src=\"img/footer1.png\" alt=\"YouTube\" /></a> <a\r\n");
      out.write("									href=\"#\"><img src=\"img/footer2.png\" alt=\"Facebook\" /></a> <a\r\n");
      out.write("									href=\"#\"><img src=\"img/footer3.png\" alt=\"Instagram\" /></a>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"service-info\">\r\n");
      out.write("							<p>\r\n");
      out.write("								토스페이먼츠 구매안전서비스\r\n");
      out.write("								<button class=\"service-btn\">서비스가입확인</button>\r\n");
      out.write("							</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								고객님은 안전거래를 위해 현금 등으로 결제 시 저희 쇼핑몰에서 가입한<br />토스페이먼츠의 구매안전서비스를\r\n");
      out.write("								이용하실 수 있습니다.\r\n");
      out.write("							</p>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"certification\">\r\n");
      out.write("							<img src=\"img/footer4.png\" alt=\"ISMS 인증\" class=\"isms-logo\" />\r\n");
      out.write("							<div class=\"certification-text\">\r\n");
      out.write("								<p>\r\n");
      out.write("									정보보호관리체계<br />ISMS 인증획득\r\n");
      out.write("								</p>\r\n");
      out.write("								<p>\r\n");
      out.write("									[인증범위] 인터넷 교보문고 및 브랜드 서비스 운영<br />[유효기간] 2023.11.15 ~\r\n");
      out.write("									2026.11.14\r\n");
      out.write("								</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</footer>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("  document.addEventListener(\"DOMContentLoaded\", function () {\r\n");
      out.write("    const sliderWrap = document.querySelector(\".sliderwrap\");\r\n");
      out.write("    const slides = document.querySelectorAll(\".sliderwrap li\");\r\n");
      out.write("    const totalSlides = slides.length;\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    let currentSlide = 0;\r\n");
      out.write("    let isTransitioning = false;\r\n");
      out.write("\r\n");
      out.write("    if (totalSlides > 0) {\r\n");
      out.write("      const firstSlideClone = slides[0].cloneNode(true);\r\n");
      out.write("      sliderWrap.appendChild(firstSlideClone);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function moveMainSlide(index) {\r\n");
      out.write("      sliderWrap.style.transition = \"transform 0.5s ease-in-out\";\r\n");
      out.write("      sliderWrap.style.transform = `translateX(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${-890 * index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("px)`;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function nextMainSlide() {\r\n");
      out.write("      if (isTransitioning) return;\r\n");
      out.write("      isTransitioning = true;\r\n");
      out.write("\r\n");
      out.write("      currentSlide++;\r\n");
      out.write("      moveMainSlide(currentSlide);\r\n");
      out.write("\r\n");
      out.write("      if (currentSlide === totalSlides) {\r\n");
      out.write("        setTimeout(() => {\r\n");
      out.write("          sliderWrap.style.transition = \"none\";\r\n");
      out.write("          currentSlide = 0;\r\n");
      out.write("          moveMainSlide(currentSlide);\r\n");
      out.write("        }, 500);\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      setTimeout(() => {\r\n");
      out.write("        isTransitioning = false;\r\n");
      out.write("      }, 600);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    setInterval(nextMainSlide, 5000);\r\n");
      out.write("\r\n");
      out.write("    // 🔽 세일 슬라이드\r\n");
      out.write("    const saleList = document.querySelector(\".sale-list\");\r\n");
      out.write("    const saleItems = document.querySelectorAll(\".sale-item\");\r\n");
      out.write("    const pageIndicator = document.getElementById(\"page-indicator\");\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    let saleIndex = 0;\r\n");
      out.write("\r\n");
      out.write("    function updateSaleSlide() {\r\n");
      out.write("      saleList.style.transform = `translateX(-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${274 * saleIndex}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("px)`;\r\n");
      out.write("      pageIndicator.textContent = `0");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${saleIndex + 1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" - 0");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${saleItems.length}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    document.getElementById(\"prev\").addEventListener(\"click\", () => {\r\n");
      out.write("      saleIndex = (saleIndex - 1 + saleItems.length) % saleItems.length;\r\n");
      out.write("      updateSaleSlide();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    document.getElementById(\"next\").addEventListener(\"click\", () => {\r\n");
      out.write("      saleIndex = (saleIndex + 1) % saleItems.length;\r\n");
      out.write("      updateSaleSlide();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    updateSaleSlide();\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
