package com.api.fakeservices;

import java.util.ArrayList;
import java.util.List;

import com.api.book.entities.book;

public class bookservices {
    
  private static List<book> list=new ArrayList<>();
    static {
        list.add(new book(1,"java1","xyz"));
        list.add(new book(2,"java2","xyz"));
        list.add(new book(3,"java3","xyz"));
        list.add(new book(4,"java4","xyz"));
    }
public List<book> getAllBooks()
{
    return list;
}

public book findById(int id)
{ for(int i=0;i<list.size();i++)
    {  book b=new  book();
        b=list.get(i);
         if(id==b.getId())
         { return b;

         }

    }
return null; 
   
}

public void addbook(book b)
{
    list.add(b);
}
public  void deletebook(int id)
{for(int i=0;i<list.size();i++)
    {  book b=new  book();
        b=list.get(i);
         if(id==b.getId())
         { list.remove(i);
            break;

         }

    }

   

}
}
