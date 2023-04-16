package com.tencent.connect.a.a;
import android.content.Context;
import com.tencent.connect.auth.QQToken;
import java.lang.String;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.g;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Field;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.b.e;

public class a	// class@000e12
{
    public static Class a;
    public static Class b;
    public static Method c;
    public static Method d;
    public static Method e;
    public static Method f;
    public static boolean g;

    public static void a(Context p0,QQToken p1,String p2,String[] p3){
       if (!a.g) {
          return;
       }
       try{
          a.b(p0, p1);
          Object[] objArray = new Object[]{p0,p2,p3};
          a.d.invoke(a.b, objArray);
       }catch(java.lang.Exception e3){
          SLog.e("OpenConfig", "trackCustomEvent exception: "+e3.toString());
       }
       return;
    }
    public static boolean a(Context p0,QQToken p1){
       return g.a(p0, p1.getAppId()).b("Common_ta_enable");
    }
    public static void b(Context p0,QQToken p1){
       Object[] objArray;
       try{
          int i = 1;
          if (a.a(p0, p1)) {
             objArray = new Object[i];
             objArray[0] = Boolean.TRUE;
             a.f.invoke(a.a, objArray);
          }else {
             objArray = new Object[i];
             objArray[0] = Boolean.FALSE;
             a.f.invoke(a.a, objArray);
          }
       }catch(java.lang.Exception e3){
          SLog.e("OpenConfig", "checkStatStatus exception: "+e3.toString());
       }
       return;
    }
    public static void c(Context p0,QQToken p1){
       Class tYPE;
       Class tYPE1;
       String str = String.class;
       String str1 = "Aqc"+p1.getAppId();
       try{
          a.a = Class.forName("com.tencent.stat.StatConfig");
          Class uClass = Class.forName("com.tencent.stat.StatService");
          a.b = uClass;
          Class[] uClassArray = new Class[]{Context.class,str};
          a.c = uClass.getMethod("reportQQ", uClassArray);
          Class[] uClassArray1 = new Class[]{Context.class,str,String[].class};
          a.d = a.b.getMethod("trackCustomEvent", uClassArray1);
          uClassArray1 = new Class[]{Context.class,tYPE};
          tYPE = Integer.TYPE;
          a.e = a.b.getMethod("commitEvents", uClassArray1);
          uClassArray1 = new Class[]{tYPE1};
          tYPE1 = Boolean.TYPE;
          a.f = a.a.getMethod("setEnableStatService", uClassArray1);
          a.b(p0, p1);
          Class[] uClassArray2 = new Class[]{tYPE1};
          Object[] objArray = new Object[]{Boolean.FALSE};
          a.a.getMethod("setAutoExceptionCaught", uClassArray2).invoke(a.a, objArray);
          uClassArray2 = new Class[]{tYPE1};
          objArray = new Object[]{Boolean.TRUE};
          a.a.getMethod("setEnableSmartReporting", uClassArray2).invoke(a.a, objArray);
          uClassArray2 = new Class[]{tYPE};
          objArray = new Object[]{Integer.valueOf(1440)};
          a.a.getMethod("setSendPeriodMinutes", uClassArray2).invoke(a.a, objArray);
          Class uClass1 = Class.forName("com.tencent.stat.StatReportStrategy");
          uClassArray1 = new Class[]{uClass1};
          Object[] objArray1 = new Object[]{uClass1.getField("PERIOD").get(null)};
          a.a.getMethod("setStatSendStrategy", uClassArray1).invoke(a.a, objArray1);
          uClassArray2 = new Class[]{Context.class,str,str};
          Object[] objArray2 = new Object[]{p0,str1,Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null)};
          a.b.getMethod("startStatService", uClassArray2).invoke(a.b, objArray2);
          a.g = true;
       }catch(java.lang.Exception e11){
          SLog.e("OpenConfig", "start4QQConnect exception: "+e11.toString());
       }
       return;
    }
    public static void d(Context p0,QQToken p1){
       if (!TextUtils.isEmpty(p1.getOpenId())) {
          e.a().a(p1.getOpenId(), p1.getAppId(), "2", "1", "11", "0", "0", "0");
       }
       if (!a.g) {
          return;
       }else {
          a.b(p0, p1);
          if (p1.getOpenId() != null) {
             try{
                Object[] objArray = new Object[]{p0,p1.getOpenId()};
                a.c.invoke(a.b, objArray);
             }catch(java.lang.Exception e10){
                SLog.e("OpenConfig", "reportQQ exception: "+e10.toString());
             }
          }
       }
    }
}
