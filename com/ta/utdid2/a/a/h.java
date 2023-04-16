package com.ta.utdid2.a.a.h;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;

public class h	// class@000cc7
{

    public static String get(String p0,String p1){
       String str = String.class;
       try{
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{str,str};
          Object[] objArray = new Object[]{p0,p1};
          p1 = uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
          return p1;
       }catch(java.lang.Exception e0){
       }
    }
}
