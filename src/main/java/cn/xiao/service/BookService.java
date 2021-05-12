package cn.xiao.service;

import cn.xiao.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookById(@Param("bookID") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookID") int id);
    //查询全部的数
    List<Books> queryAllBook();
    //根据名字查询书籍
    Books queryBookByName(String bookName);

}
