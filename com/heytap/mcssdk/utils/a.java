package com.heytap.mcssdk.utils.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;

public class a	// class@00053f
{

    public void a(){
       super();
    }
    public static String a(String p0){
       Object obj = null;
       try{
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p0};
          return Class.forName("android.os.SystemProperties").getMethod("get", uClassArray).invoke(obj, objArray);
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static boolean a(){
       return ("file").equals(a.a("ro.crypto.type"));
    }
}
