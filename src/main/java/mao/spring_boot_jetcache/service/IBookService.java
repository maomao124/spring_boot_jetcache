package mao.spring_boot_jetcache.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import mao.spring_boot_jetcache.entity.Book;


/**
 * Project name(项目名称)：spring_boot_vue_and_element_UI_book_information_management_system
 * Package(包名): mao.book_management.service
 * Class(类名): IBookService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/9
 * Time(创建时间)： 13:12
 * Version(版本): 1.0
 * Description(描述)： IService接口
 */


public interface IBookService extends IService<Book>
{

    /**
     * Save book
     *
     * @param book the book
     * @return the boolean
     */
    boolean saveBook(Book book);

    /**
     * Modify
     *
     * @param book the book
     * @return the boolean
     */
    boolean modify(Book book);

    /**
     * Delete
     *
     * @param id the id
     * @return the boolean
     */
    boolean delete(Integer id);

    /**
     * Gets page.
     *
     * @param currentPage the current page
     * @param pageSize    the page size
     * @return the page
     */
    IPage<Book> getPage(int currentPage, int pageSize);

    /**
     * Gets page.
     *
     * @param currentPage the current page
     * @param pageSize    the page size
     * @param book        the book
     * @return the page
     */
    IPage<Book> getPage(int currentPage, int pageSize, Book book);


    /**
     * Gets book by id.
     * 有缓存
     *
     * @param id the id
     * @return the book by id
     */
    Book getBookById(Integer id);

}
