package com.yxcorp.retrofit.dryrun.CommonParamsCompareManager;
import zk.d;
import com.google.gson.Gson;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$b;
import java.util.Map;
import com.google.common.collect.f;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Iterator;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import okhttp3.Request;
import java.util.Collections;
import okhttp3.Headers;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Runnable;
import android.os.Handler;
import ekd.s1;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$Type;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$a;
import java.lang.StringBuilder;
import mjd.a;

public class CommonParamsCompareManager	// class@000964
{
    public final Map a;
    public final Map b;
    public final Map c;
    public static final Gson d;
    public static final Object e;

    static {
       d uod = new d();
       uod.c();
       CommonParamsCompareManager.d = uod.b();
       CommonParamsCompareManager.e = new Object();
    }
    public void CommonParamsCompareManager(){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
       this.c = new HashMap();
    }
    public static CommonParamsCompareManager c(){
       return CommonParamsCompareManager$b.a;
    }
    public final Map a(Map p0,Map p1,boolean p2){
       String[] stringArray;
       String[] stringArray1;
       String[] stringArray2;
       HashMap hashMap = new HashMap();
       f uof = Maps.d(p0, p1);
       Map map = uof.c();
       Map map1 = uof.b();
       Map map2 = uof.a();
       Iterator iterator = map.keySet().iterator();
       object oobject = null;
       int i = 2;
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (p2) {
             stringArray = new String[i];
             stringArray[0] = p0.get(str);
             stringArray[1] = oobject;
             hashMap.put(str, Arrays.asList(stringArray));
          }else {
             stringArray = new String[i];
             stringArray[0] = oobject;
             stringArray[1] = p0.get(str);
             hashMap.put(str, Arrays.asList(stringArray));
          }
       }
       iterator = map1.keySet().iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (p2) {
             stringArray1 = new String[i];
             stringArray1[0] = oobject;
             stringArray1[1] = p1.get(str1);
             hashMap.put(str1, Arrays.asList(stringArray1));
          }else {
             stringArray1 = new String[i];
             stringArray1[0] = p1.get(str1);
             stringArray1[1] = oobject;
             hashMap.put(str1, Arrays.asList(stringArray1));
          }
       }
       Iterator iterator1 = map2.keySet().iterator();
       while (iterator1.hasNext()) {
          String str2 = iterator1.next();
          HashSet hashSet = new HashSet();
          hashSet.add("__NS_sig3");
          hashSet.add("keyconfig_state");
          hashSet.add("X-REQUESTID");
          if (!hashSet.contains(str2)) {
             if (p2) {
                stringArray2 = new String[i];
                stringArray2[0] = p0.get(str2);
                stringArray2[1] = p1.get(str2);
                hashMap.put(str2, Arrays.asList(stringArray2));
             }else {
                stringArray2 = new String[i];
                stringArray2[0] = p1.get(str2);
                stringArray2[1] = p0.get(str2);
                hashMap.put(str2, Arrays.asList(stringArray2));
             }
          }
       }
       return hashMap;
    }
    public final Map b(Request p0){
       if (p0 == null) {
          return Collections.emptyMap();
       }
       Headers headers = p0.headers();
       HashMap hashMap = new HashMap();
       Iterator iterator = headers.names().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          String str1 = headers.get(str);
          if (!TextUtils.x(str1)) {
             hashMap.put(str, str1);
          }
       }
       return hashMap;
    }
    public final void d(Runnable p0){
       s1.c().post(p0);
    }
    public void e(String p0,Request p1,CommonParamsCompareManager$Type p2){
       this.d(new CommonParamsCompareManager$a(this, p2, p0, p1));
    }
    public void f(String p0,Request p1){
       Object e = CommonParamsCompareManager.e;
       _monitor_enter(e);
       this.c.put(p0, p1);
       _monitor_exit(e);
       a.c("CommonParamsCompareManager", "original map size: "+this.c.size());
    }
    public Request g(String p0){
       Object e = CommonParamsCompareManager.e;
       _monitor_enter(e);
       _monitor_exit(e);
       return this.c.remove(p0);
    }
    public final Map h(String p0){
       if (TextUtils.x(p0)) {
          return Collections.emptyMap();
       }
       HashMap hashMap = new HashMap();
       String[] stringArray = p0.split(";");
       int len = stringArray.length;
       int i = 0;
       while (i < len) {
          String[] stringArray1 = (stringArray[i]).split("=", 2);
          if (!stringArray1.length) {
             a.b("CommonParamsCompareManager", "Split error, current cookieString is:"+p0);
          }else {
             String str = 1;
             if (stringArray1.length == str) {
                hashMap.put(stringArray1[0], "");
             }else {
                hashMap.put(stringArray1[0], stringArray1[str]);
             }
          }
          i = i + 1;
       }
       return hashMap;
    }
}
