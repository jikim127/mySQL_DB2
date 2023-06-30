package com.ezen.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MainClass {

    public static void main(String[] args) {

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        SqlSession session = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("sqlSessionFactory :"+ sqlSessionFactory);

            session = sqlSessionFactory.openSession();
            System.out.println("session: "+session);
//                Blog blog = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
