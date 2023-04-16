package com.google.protobuf.ListFieldSchema;
import com.google.protobuf.ListFieldSchema$ListFieldSchemaFull;
import com.google.protobuf.ListFieldSchema$1;
import com.google.protobuf.ListFieldSchema$ListFieldSchemaLite;
import java.lang.Object;
import java.util.List;

public abstract class ListFieldSchema	// class@000468
{
    public static final ListFieldSchema FULL_INSTANCE;
    public static final ListFieldSchema LITE_INSTANCE;

    static {
       ListFieldSchema.FULL_INSTANCE = new ListFieldSchema$ListFieldSchemaFull(null);
       ListFieldSchema.LITE_INSTANCE = new ListFieldSchema$ListFieldSchemaLite(null);
    }
    public void ListFieldSchema(){
       super();
    }
    public void ListFieldSchema(ListFieldSchema$1 p0){
       super();
    }
    public static ListFieldSchema full(){
       return ListFieldSchema.FULL_INSTANCE;
    }
    public static ListFieldSchema lite(){
       return ListFieldSchema.LITE_INSTANCE;
    }
    public abstract void makeImmutableListAt(Object p0,long p1);
    public abstract void mergeListsAt(Object p0,Object p1,long p2);
    public abstract List mutableListAt(Object p0,long p1);
}
