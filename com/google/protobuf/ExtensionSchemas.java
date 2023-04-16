package com.google.protobuf.ExtensionSchemas;
import com.google.protobuf.ExtensionSchemaLite;
import com.google.protobuf.ExtensionSchema;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Constructor;

public final class ExtensionSchemas	// class@000411
{
    public static final ExtensionSchema FULL_SCHEMA;
    public static final ExtensionSchema LITE_SCHEMA;

    static {
       ExtensionSchemas.LITE_SCHEMA = new ExtensionSchemaLite();
       ExtensionSchemas.FULL_SCHEMA = ExtensionSchemas.loadSchemaForFullRuntime();
    }
    public void ExtensionSchemas(){
       super();
    }
    public static ExtensionSchema full(){
       ExtensionSchema fULL_SCHEMA = ExtensionSchemas.FULL_SCHEMA;
       if (fULL_SCHEMA != null) {
          return fULL_SCHEMA;
       }
       throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
    public static ExtensionSchema lite(){
       return ExtensionSchemas.LITE_SCHEMA;
    }
    public static ExtensionSchema loadSchemaForFullRuntime(){
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}
