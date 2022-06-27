package com.example.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Books {


        //Defining book id as primary key
        @Id
        @GeneratedValue(strategy =GenerationType.IDENTITY)
        @Column
        public int bookid;
        @Column
        public String bookname;
        @Column
        public String author;
        @Column
        public int price;
        public int getBookid()
        {
            return bookid;
        }
        public void setBookid(int bookid)
        {
            this.bookid = bookid;
        }
        public String getBookname()
        {
            return bookname;
        }
        public void setBookname(String bookname)
        {
            this.bookname = bookname;
        }
        public String getAuthor()
        {
            return author;
        }
        public void setAuthor(String author)
        {
            this.author = author;
        }
        public int getPrice()
        {
            return price;
        }
        public void setPrice(int price)
        {
            this.price = price;
        }
    }

