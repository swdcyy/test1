package o66.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import o66.d$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import android.content.SharedPreferences;
import java.util.Set;
import vid.b;
import java.util.Iterator;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Number;
import java.lang.System;
import java.lang.Long;
import java.io.File;
import qkd.b;
import com.kwai.performance.stability.crash.monitor.message.NativeExceptionMessage;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;

public class d	// class@001fac
{
    public static SharedPreferences a;
    public static final long[] b;

    static {
       long[] olongArray = new long[0];
       d.b = olongArray;
    }
    public void d(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Uri uri = Uri.parse(p0);
       return uri.getScheme()+"://"+uri.getAuthority()+uri.getPath();
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       Map map = a.a.i(p0, new d$a().getType());
       obj = map.get("current_web_url");
       if (obj == null) {
          obj = map.get("web_url");
       }
       if (!obj instanceof String) {
          return null;
       }else {
          return obj;
       }
    }
    public static List c(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0.length() > 0 && p0.charAt((p0.length() - 1)) == '/') {
          Iterator iterator = b.a(d.a).iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (str.startsWith(p0)) {
                obj.add(str);
             }
          }
       }else {
          p0 = d.a(p0);
          if (d.a.contains(p0)) {
             obj.add(p0);
          }
       }
       return obj;
    }
    public static void d(ExceptionMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "4")) {
          return;
       }
       d.e(p0);
       return;
    }
    public static void e(ExceptionMessage p0){
       boolean b;
       String str;
       String obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, d.class, "5")) {
          return;
       }
       if (d.a == null) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String obj1 = PatchProxy.applyOneRefs(p0, obj, d.class, "6");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          str = 1;
          if (("com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity").equals(p0.mCurrentActivity)) {
             b = true;
          }else {
             obj1 = d.b(p0.mStatusMap);
             Log.g("CrashCounter", "activity: "+p0.mCurrentActivity+", current webview url: "+obj1);
             b = TextUtils.isEmpty(obj1) ^ str;
          }
       }
       if (b && !PatchProxy.applyVoidOneRefs(p0, obj, d.class, "8")) {
          obj1 = d.b(p0.mStatusMap);
          str = d.a(obj1);
          StringBuilder str1 = "current webview url: "+obj1;
          Log.g("CrashCounter", str1+", new url: "+str);
          obj1 = String.valueOf(p0.mCurrentTimeStamp);
          _monitor_enter(d.class);
          obj = d.a.getString(str, obj);
          if (obj != null) {
             if (obj.contains(obj1)) {
                Log.g("CrashCounter", "Crash already counted, Uuid: "+p0.mLogUUID+", Timestamp: "+obj1);
                _monitor_exit(d.class);
             }else {
                obj1 = obj+","+obj1;
             }
          }
          g.a(d.a.edit().putString(str, obj1));
          _monitor_exit(d.class);
       }
       return;
    }
    public static int f(String p0){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uod, "1");
       if (obj1 != patchProxyRe) {
          return obj1.intValue();
       }
       if (d.a == null) {
          return -1;
       }
       long l = System.currentTimeMillis();
       long[] olongArray = PatchProxy.applyOneRefs(p0, obj, uod, "11");
       int i = 0;
       if (olongArray != patchProxyRe) {
       }else if(p0 == null){
          olongArray = d.b;
       }else {
          List list = d.c(p0);
          if (list.isEmpty()) {
             olongArray = d.b;
          }else {
             StringBuilder str = "";
             Iterator iterator = list.iterator();
             String str1 = ",";
             while (iterator.hasNext()) {
                String str2 = d.a.getString(iterator.next(), obj);
                if (str2 != null) {
                   if (str.length()) {
                      str = str+str1;
                   }
                   str = str+str2;
                }
             }
             if (!str.length()) {
                olongArray = d.b;
             }else {
                String[] stringArray = (str).split(str1);
                olongArray = new long[stringArray.length];
                for (i1 = 0; i1 < stringArray.length; i1 = i1 + 1) {
                   olongArray[i1] = Long.parseLong(stringArray[i1]);
                }
             }
          }
       }
       int len = olongArray.length;
       i1 = 0;
       while (i < len) {
          long l1 = l - olongArray[i];
          if (l1 - 0x5265c00 < 0) {
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       return i1;
    }
    public static ExceptionMessage g(File p0,boolean p1){
       Gson obj;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uod, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          String str = b.f0(p0);
          obj = a.a;
          NativeExceptionMessage nativeExcept = (p1)? NativeExceptionMessage.class: JavaExceptionMessage.class;
          return obj.i(str, nativeExcept);
       }catch(java.lang.Exception e4){
          Log.o("CrashCounter", "readDumpFile Exception", e4);
          return null;
       }
    }
}
