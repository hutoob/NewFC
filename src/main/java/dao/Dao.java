package dao;

import bean.News;
import bean.Tu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 赵浩博
 * @version 1.0.0
 * @ClassName Dao.java
 * @Description TODO
 * @createTime 2021年11月25日 14:46:00
 */
public class Dao {
    //获取新闻标题出处
    public List<News> getNew(String fenlei){
        String sql="select * from "+fenlei;
        List<News> list=new ArrayList<News>();
        Connection con=DBUtil.getConnection();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String title=res.getString("title");
                String cname=res.getString("channelName");
                News news=new News(title,cname);
                list.add(news);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public String getNewC(String title,String fenlei){
        if(fenlei.equals("体育焦点")){fenlei="体育";}
        String sql="select * from "+fenlei+" where title='"+title+"'";
        String data="";
        Connection con=DBUtil.getConnection();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            if(res.next()){
                data=res.getString("content");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return data;
    }
    public List<Tu> getTu(){
        String sql="select * from Tu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("name");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> warTu(){
        String sql="select * from warTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> eduTu(){
        String sql="select * from eduTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> kejiTu(){
        String sql="select * from kejiTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> hourseTu(){
        String sql="select * from hourseTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> gameTu(){
        String sql="select * from gameTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> carTu(){
        String sql="select * from carTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> moneyTu(){
        String sql="select * from moneyTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> tiyuTu(){
        String sql="select * from tiyuTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> yuleTu(){
        String sql="select * from yuleTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
    public List<Tu> mainTu(){
        String sql="select * from mainTu";
        Connection con=DBUtil.getConnection();
        List<Tu> list=new ArrayList<Tu>();
        try {
            PreparedStatement prepare=con.prepareStatement(sql);
            ResultSet res=prepare.executeQuery();
            while(res.next()){
                String name=res.getString("word");
                String num=res.getString("num");
                Tu tu=new Tu(name,num);
                list.add(tu);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
