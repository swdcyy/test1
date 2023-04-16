package com.google.protobuf.NewInstanceSchemas;
import com.google.protobuf.NewInstanceSchema;
import com.google.protobuf.NewInstanceSchemaLite;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Constructor;

public final class NewInstanceSchemas	// class@00048d
{
    public static final NewInstanceSchema FULL_SCHEMA;
    public static final NewInstanceSchema LITE_SCHEMA;

    static {
       NewInstanceSchemas.FULL_SCHEMA = NewInstanceSchemas.loadSchemaForFullRuntime();
       NewInstanceSchemas.LITE_SCHEMA = new NewInstanceSchemaLite();
    }
    public void NewInstanceSchemas(){
       super();
    }
    public static NewInstanceSchema full(){
       return NewInstanceSchemas.FULL_SCHEMA;
    }
    public static NewInstanceSchema lite(){
       return NewInstanceSchemas.LITE_SCHEMA;
    }
    public static NewInstanceSchema loadSchemaForFullRuntime(){
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}
