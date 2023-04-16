package com.google.protobuf.ExtensionRegistryFactory;
import java.lang.Class;
import java.lang.Object;
import com.google.protobuf.ExtensionRegistryLite;
import java.lang.String;
import java.lang.reflect.Method;

public final class ExtensionRegistryFactory	// class@00040a
{
    public static final Class EXTENSION_REGISTRY_CLASS;

    static {
       ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS = ExtensionRegistryFactory.reflectExtensionRegistry();
    }
    public void ExtensionRegistryFactory(){
       super();
    }
    public static ExtensionRegistryLite create(){
       ExtensionRegistryLite uExtensionRe = ExtensionRegistryFactory.invokeSubclassFactory("newInstance");
       if (uExtensionRe != null) {
       }else {
          uExtensionRe = new ExtensionRegistryLite();
       }
       return uExtensionRe;
    }
    public static ExtensionRegistryLite createEmpty(){
       ExtensionRegistryLite uExtensionRe = ExtensionRegistryFactory.invokeSubclassFactory("getEmptyRegistry");
       if (uExtensionRe != null) {
       }else {
          uExtensionRe = ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
       }
       return uExtensionRe;
    }
    public static final ExtensionRegistryLite invokeSubclassFactory(String p0){
       Class eXTENSION_RE = ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS;
       if (eXTENSION_RE == null) {
          return null;
       }
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          return eXTENSION_RE.getDeclaredMethod(p0, uClassArray).invoke(null, objArray);
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public static boolean isFullRegistry(ExtensionRegistryLite p0){
       Class eXTENSION_RE = ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS;
       boolean b = (eXTENSION_RE != null && eXTENSION_RE.isAssignableFrom(p0.getClass()))? true: false;
       return b;
    }
    public static Class reflectExtensionRegistry(){
       try{
          return Class.forName("com.google.protobuf.ExtensionRegistry");
       }catch(java.lang.ClassNotFoundException e0){
          return null;
       }
    }
}
