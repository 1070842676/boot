package com.example.util;

import java.sql.*;

public class DBUtil {
    /**
     * 取得Connection
     * @return
     */
    public static Connection getConnection(){
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载驱动
            String url ="jdbc:mysql://127.0.0.1:3306/testone?useUnicode=true&characterEncoding=utf-8"; //flxx为要操作的数据库名
            String name="root";
            String pass="root";
            conn = DriverManager.getConnection(url,name,pass);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭ResultSet对象，释放资源
     * @param rs
     */
    public static void close(ResultSet rs)
    {
        if(rs!=null)
        {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 关闭Connection对象，释放资源
     * @param conn
     */
    public static void close(Connection conn)
    {
        if(conn!=null)
        {
            try {
                conn.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 关闭PreparedStatement对象，释放资源
     * @param pstmt
     */
    public static void close(PreparedStatement pstmt)
    {
        if(pstmt!=null)
        {
            try {
                pstmt.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 关闭Statement对象，释放资源
     * @param pstmt
     */
    public static void close(Statement pstmt)
    {
        if(pstmt!=null)
        {
            try {
                pstmt.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 开启事务
     * @param conn
     */
    public static void beginTransaction(Connection conn)
    {
        try {
            if(conn!=null){
                if(conn.getAutoCommit())
                {
                    conn.setAutoCommit(false);
                }
            }
        } catch (SQLException e) {
        }
    }
    /**
     * 关闭事务
     * @param conn
     */
    public static void commitTransaction(Connection conn)
    {
        try {
            if(conn!=null){
                if(!conn.getAutoCommit())
                {
                    conn.commit();
                }
            }
        } catch (SQLException e) {
        }
    }
    /**
     * 回滚事务
     * @param conn
     */
    public static void rollbackTransaction(Connection conn)
    {
        try {
            if(conn!=null){
                if(!conn.getAutoCommit())
                {
                    conn.rollback();
                }
            }
        } catch (SQLException e) {
        }
    }
    /**
     * 重置事务
     * @param conn
     */
    public static void resetTransaction(Connection conn)
    {
        try {
            if(conn!=null){
                if(conn.getAutoCommit())
                {
                    conn.setAutoCommit(false);
                }else{
                    conn.setAutoCommit(true);
                }
            }
        } catch (SQLException e) {
        }
    }
}
