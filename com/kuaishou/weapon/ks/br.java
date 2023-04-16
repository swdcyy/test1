package com.kuaishou.weapon.ks.br;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import com.kuaishou.weapon.ks.br$a;
import android.os.Build$VERSION;
import android.os.Process;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Boolean;
import android.content.pm.ApplicationInfo;
import java.lang.CharSequence;

public final class br	// class@0011ef
{
    public static br$a a;

    public void br(){
       super();
    }
    public static String a(Context p0){
       String str = (br.b(p0))? "arm64-v8a": "armeabi-v7a";
       return str;
    }
    public static boolean b(Context p0){
       boolean b = false;
       if (br.c(p0) == br$a.c) {
          b = true;
       }
       return b;
    }
    public static br$a c(Context p0){
       br$a a = br.a;
       if (a != null) {
          return a;
       }
       if (Build$VERSION.SDK_INT >= 23) {
          br$a c = (Process.is64Bit())? br$a.c: br$a.b;
       label_0016 :
          br.a = c;
       }else {
          Class uClass = Class.forName("dalvik.system.VMRuntime");
          Class[] uClassArray = new Class[0];
          Class[] uClassArray1 = new Class[0];
          Method declaredMeth = uClass.getDeclaredMethod("is64Bit", uClassArray1);
          Object[] objArray = new Object[0];
          Object[] objArray1 = new Object[0];
          a = (declaredMeth.invoke(uClass.getDeclaredMethod("getRuntime", uClassArray).invoke(uClass, objArray), objArray1).booleanValue())? br$a.c: br$a.b;
          br.a = a;
       }
       return br.a;
    }
}
