package com.google.protobuf.MapFieldSchemas;
import com.google.protobuf.MapFieldSchema;
import com.google.protobuf.MapFieldSchemaLite;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Constructor;

public final class MapFieldSchemas	// class@000477
{
    public static final MapFieldSchema FULL_SCHEMA;
    public static final MapFieldSchema LITE_SCHEMA;

    static {
       MapFieldSchemas.FULL_SCHEMA = MapFieldSchemas.loadSchemaForFullRuntime();
       MapFieldSchemas.LITE_SCHEMA = new MapFieldSchemaLite();
    }
    public void MapFieldSchemas(){
       super();
    }
    public static MapFieldSchema full(){
       return MapFieldSchemas.FULL_SCHEMA;
    }
    public static MapFieldSchema lite(){
       return MapFieldSchemas.LITE_SCHEMA;
    }
    public static MapFieldSchema loadSchemaForFullRuntime(){
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
}
