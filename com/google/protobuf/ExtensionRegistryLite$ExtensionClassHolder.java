package com.google.protobuf.ExtensionRegistryLite$ExtensionClassHolder;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;

public class ExtensionRegistryLite$ExtensionClassHolder	// class@00040b
{
    public static final Class INSTANCE;

    static {
       ExtensionRegistryLite$ExtensionClassHolder.INSTANCE = ExtensionRegistryLite$ExtensionClassHolder.resolveExtensionClass();
    }
    public void ExtensionRegistryLite$ExtensionClassHolder(){
       super();
    }
    public static Class resolveExtensionClass(){
       try{
          return Class.forName("com.google.protobuf.Extension");
       }catch(java.lang.ClassNotFoundException e0){
          return null;
       }
    }
}
