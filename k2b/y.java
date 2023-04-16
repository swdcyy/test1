package k2b.y;
import java.util.HashMap;
import java.lang.Object;
import android.os.Message;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import ukd.a;
import java.util.List;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import k2b.r;
import java.lang.System;
import java.sql.Date;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import ekd.e0;
import android.content.Context;
import f3b.d;
import com.yxcorp.utility.Log;

public class y	// class@001bc8
{
    public static HashMap a;
    public static Context b;
    public static final int c;

    static {
       y.a = new HashMap();
    }
    public void y(){
       super();
    }
    public static Intent a(Message p0){
       Message obj = PatchProxy.applyOneRefs(p0, null, y.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.obj;
       int sDK_INT = Build$VERSION.SDK_INT;
       String str = 28;
       if (sDK_INT < str && p0.what == 100) {
          return a.d(obj, "intent");
       }
       if (sDK_INT >= str && p0.what == 159) {
          List list = a.d(obj, "mActivityCallbacks");
          if (list != null) {
             int i = 0;
             while (i < list.size()) {
                Intent obj1 = list.get(i);
                if (obj1 != null) {
                   obj1 = a.d(obj1, "mIntent");
                   if (obj1 != null) {
                      return obj1;
                   }
                }
                i = i + 1;
             }
          }
       }
       return null;
    }
    public static String b(int p0,boolean p1,Long p2,String p3){
       StringBuilder str1;
       String str2;
       if (PatchProxy.isSupport(y.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, p3, null, y.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (0 - p2.longValue())? String.valueOf(p2): TextUtils.k(p3);
       int i = 0;
       if (p0 == 26 || p0 == 27) {
          i = 1;
       }
       if (p1) {
          str1 = "";
          str2 = (i)? "lastReportFirstContactForeground": "lastReportDateForeground";
          return str1+str2+r.a()+str;
       }else {
          str1 = "";
          str2 = (i)? "lastReportFirstContactBackground": "lastReportDateBackground";
          return str1+str2+r.a()+str;
       }
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, y.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = System.currentTimeMillis();
       return (new Date(l).toString()).equals(new Date((l - (n.A1().K() * 1000))).toString());
    }
    public static boolean d(String p0,int p1){
       Context obj;
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, oy, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = y.b;
       if (obj == null) {
          obj = e0.b;
       }
       String str = new Date(System.currentTimeMillis()).toString();
       if (y.a.get(p0) == null || !y.a.containsKey(p0)) {
          y.a.put(p0, d.b(obj, p0, ""));
       }
       if (str.equals(y.a.get(p0))) {
          return true;
       }else {
          Log.g("LogManager", "report add heart beat event£¬type = "+p1+"   key£º"+p0);
          if (p1) {
             y.a.put(p0, str);
          }
          return false;
       }
    }
    public static void e(String p0,int p1,long p2){
       if (PatchProxy.isSupport(y.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), null, y.class, "2")) {
          return;
       }
       String str = "set heartBeat status report add heart beat event£¬type = ";
       Log.g("LogManager", str+p1);
       Context b = y.b;
       if (b == null) {
          b = e0.b;
       }
       String str1 = new Date(p2).toString();
       Log.g("LogManager", str+p1+"   key£º"+p0);
       if (p1) {
          d.d(b, p0, str1);
          y.a.put(p0, str1);
       }
       return;
    }
}
