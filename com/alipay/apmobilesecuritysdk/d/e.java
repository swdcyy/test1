package com.alipay.apmobilesecuritysdk.d.e;
import java.lang.String;
import java.util.Map;
import java.lang.StringBuffer;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.lang.Object;
import java.lang.StringBuilder;
import android.content.Context;
import com.alipay.apmobilesecuritysdk.d.d;
import java.util.TreeMap;
import w6.b;
import com.alipay.apmobilesecuritysdk.d.b;
import com.alipay.apmobilesecuritysdk.d.c;
import com.alipay.apmobilesecuritysdk.d.a;

public final class e	// class@000e6b
{
    public static Map a;
    public static final String[] b;

    static {
       String[] stringArray = new String[]{"AD1","AD2","AD3","AD8","AD9","AD10","AD11","AD12","AD14","AD15","AD16","AD18","AD20","AD21","AD23","AD24","AD26","AD27","AD28","AD29","AD30","AD31","AD34","AA1","AA2","AA3","AA4","AC4","AC10","AE1","AE2","AE3","AE4","AE5","AE6","AE7","AE8","AE9","AE10","AE11","AE12","AE13","AE14","AE15"};
       e.b = stringArray;
    }
    public static String a(Map p0){
       StringBuffer str = "";
       ArrayList uArrayList = new ArrayList(p0.keySet());
       Collections.sort(uArrayList);
       for (int i = 0; i < uArrayList.size(); i = i + 1) {
          String str1 = uArrayList.get(i);
          String str2 = p0.get(str1);
          String str3 = "";
          if (str2 == null) {
             str2 = str3;
          }
          StringBuilder str4 = "";
          if (i) {
             str3 = "&";
          }
          str = str+str4+str3+str1+"="+str2;
       }
       return str;
    }
    public static synchronized Map a(Context p0,Map p1){
       _monitor_enter(e.class);
       if (e.a == null) {
          e.c(p0, p1);
       }
       e.a.putAll(d.a());
       _monitor_exit(e.class);
       return e.a;
    }
    public static synchronized void a(){
       _monitor_enter(e.class);
       e.a = null;
       _monitor_exit(e.class);
    }
    public static synchronized String b(Context p0,Map p1){
       _monitor_enter(e.class);
       e.a(p0, p1);
       TreeMap treeMap = new TreeMap();
       String[] b = e.b;
       int len = b.length;
       int i = 0;
       while (i < len) {
          object oobject = b[i];
          if (e.a.containsKey(oobject)) {
             treeMap.put(oobject, e.a.get(oobject));
          }
          i = i + 1;
       }
       _monitor_exit(e.class);
       return b.a(e.a(treeMap));
    }
    public static synchronized void c(Context p0,Map p1){
       _monitor_enter(e.class);
       TreeMap treeMap = new TreeMap();
       e.a = treeMap;
       treeMap.putAll(b.a(p0, p1));
       e.a.putAll(d.a(p0));
       e.a.putAll(c.a(p0));
       e.a.putAll(a.a(p0, p1));
       _monitor_exit(e.class);
    }
}
