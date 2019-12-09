import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns={"/RemotePatientMonitoring"},loadOnStartup = 1)
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,

            IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<CENTER><IMG SRC=https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Imperial_logo.svg/800px-Imperial_logo.svg.png> </CENTER>");
        printWriter.print("<CENTER><IMG SRC=https://cdnph.upi.com/svc/sv/upi_com/6521429723328/2015/1/13a6ead135860730ad2e98fb0a72425b/Wireless-router-could-silently-monitor-vital-signs.jpg > </CENTER>");
        printWriter.print("<CENTER><h1>We provide live simulation of patient's vital signs for monitoring purposes.</h1></CENTER>");
        printWriter.print("<CENTER><h1>Live Content Coming Soon!</h1></CENTER>");
        printWriter.print("<P> <CENTER> <h2>In the meantime, please send us your suggestions/feedback at <a href=\"mailto:theBteam@ic.ac.uk\">\n" +"\n" + "theBteam@ic.ac.uk</a>.</h2></CENTER>");

        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
//        resp.getWriter().write("We provide live simulation of patient's vital signs for monitoring!");
//        resp.getWriter().write("Content Coming Soon!");
        req.getServletPath();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
    }

}
