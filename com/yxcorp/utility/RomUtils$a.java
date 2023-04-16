package com.yxcorp.utility.RomUtils$a;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;
import java.lang.NoSuchMethodException;
import java.lang.ClassNotFoundException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.utility.l;

public class RomUtils$a	// class@0013fe
{

    public static String a(String p0){
       String str;
       try{
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p0};
          str = uClass.getDeclaredMethod("get", uClassArray).invoke(uClass, objArray);
       label_0033 :
          if (TextUtils.isEmpty(str)) {
             str = l.b("getprop "+p0);
          }
          return str;
       }catch(java.lang.ClassNotFoundException e0){
          e0.printStackTrace();
       }catch(java.lang.NoSuchMethodException e0){
          e0.printStackTrace();
       }catch(java.lang.IllegalAccessException e0){
          e0.printStackTrace();
       }catch(java.lang.reflect.InvocationTargetException e0){
          e0.printStackTrace();
       }
       str = null;
       goto label_0033 ;
    }
}
