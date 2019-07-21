package com.stackroute;

import com.stackroute.crud.Create;
import com.stackroute.crud.Delete;
import com.stackroute.crud.Retrieve;
import com.stackroute.crud.Update;

public class App {
    public static void main(String args[])
    {
        //creating a table and inserting values in it
        Create create = new Create();
        create.create(204,"mark",20,"male");
        //deleting a record from the table with id 204
        Delete delete = new Delete();
        delete.delete(204);
        //updating a record with id 203
        Update update = new Update();
        update.update(203, "Mark", 23, "male");
        //retrieving the table details using select command
        Retrieve retrieve = new Retrieve();
        retrieve.retreive();

    }
}
