package servlet; /**
 * @ClassName ${NAME}.java
 * @author 赵浩博
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年11月25日 14:46:00
 */

import bean.News;
import bean.Tu;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import dao.Dao;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    Dao dao=new Dao();
    private void getNews(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String fenlei=request.getParameter("f");
        List<News> list=dao.getNew(fenlei);
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("id",i+1);
            ob.put("title",list.get(i).getTitle());
            ob.put("channelName",list.get(i).getCname());
            json.add(ob);
        }
        JSONObject ob=new JSONObject();
        ob.put("code",0);
        ob.put("msg","");
        ob.put("count",1);
        ob.put("data",json);
        PrintWriter out=response.getWriter();
        out.write(ob.toString());
    }
    private void getData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fenlei=request.getParameter("fenlei");
        String title=request.getParameter("title");
        String data=dao.getNewC(title,fenlei);
        response.getWriter().write(data);
    }
    private void getTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.getTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void warTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.warTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void yuleTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.yuleTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void gameTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.gameTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void tiyuTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.tiyuTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void hourseTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.hourseTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void carTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.carTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void kejiTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.kejiTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void moneyTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.moneyTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void eduTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.eduTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    private void mainTu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Tu> list=dao.mainTu();
        JSONArray json=new JSONArray();
        for(int i=0;i<list.size();i++){
            JSONObject ob=new JSONObject();
            ob.put("name",list.get(i).getName());
            ob.put("num",list.get(i).getNum());
            json.add(ob);
        }
        response.getWriter().write(json.toString());
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String method=request.getParameter("method");
        if("getNew".equals(method)){
            getNews(request,response);
        }else if("getData".equals(method)){
            getData(request,response);
        }else if("getTu".equals(method)){
            getTu(request,response);
        }else if("warTu".equals(method)){
            warTu(request,response);
        }else if("yuleTu".equals(method)){
            yuleTu(request,response);
        }else if("gameTu".equals(method)){
            gameTu(request,response);
        }else if("tiyuTu".equals(method)){
            tiyuTu(request,response);
        }else if("kejiTu".equals(method)){
            kejiTu(request,response);
        }else if("hourseTu".equals(method)){
            hourseTu(request,response);
        }else if("carTu".equals(method)){
            carTu(request,response);
        }else if("eduTu".equals(method)){
            eduTu(request,response);
        }else if("mainTu".equals(method)){
            mainTu(request,response);
        }else if("moneyTu".equals(method)){
            moneyTu(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
