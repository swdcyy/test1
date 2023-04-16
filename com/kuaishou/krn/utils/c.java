package com.kuaishou.krn.utils.c;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Map;
import java.util.List;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.ViewParent;
import com.kuaishou.krn.utils.b;
import java.lang.Runnable;
import ekd.s1;

public class c	// class@000925
{
    public static int a = 3;
    public static boolean b;
    public static final Map c;

    static {
       c.c = new ConcurrentHashMap();
    }
    public void c(){
       super();
    }
    public static View a(Context p0,int p1){
       List obj1;
       c uoc = c.class;
       Object obj = null;
       if (PatchProxy.isSupport(uoc)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uoc, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (!c.b) {
          return LayoutInflater.from(p0).inflate(p1, obj);
       }else {
          obj1 = c.c.get(Integer.valueOf(p1));
          if (obj1 == null || obj1.isEmpty()) {
             return LayoutInflater.from(p0).inflate(p1, obj);
          }else {
             String str = "LayoutCacheManager";
             Log.g(str, "命中缓存: "+p1);
             View view = obj1.remove(0);
             if (view.getParent() != null) {
                Log.g(str, "缓存的View已被使用，有线程问题");
             }
             int a = c.a;
             if (obj1.size() < a) {
                c.d(p1, (a - obj1.size()));
             }
             return view;
          }
       }
    }
    public static boolean b(){
       return c.b;
    }
    public static void c(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uoc, "2")) {
          return;
       }
       if (!c.b) {
          return;
       }
       c.d(p0, c.a);
       return;
    }
    public static void d(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uoc, "1")) {
          return;
       }
       s1.d(new b(p1, p0));
       return;
    }
}
