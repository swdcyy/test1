package com.kwai.framework.abtest.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k56.a;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.System;
import java.util.Objects;
import wu8.p;
import i56.j;
import java.lang.Runnable;
import t45.c;
import java.lang.Number;
import java.lang.Integer;

public class f	// class@000b0c
{
    public boolean a;
    public static f b;

    public void f(){
       super();
    }
    public static boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.b(p0, Boolean.class, Boolean.FALSE).booleanValue();
    }
    public static Object b(String p0,Type p1,Object p2){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, f.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return p2;
       }
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "1");
       Object[] objArray = null;
       if (obj == patchProxyRe) {
          if (!TextUtils.isEmpty(p0) && p1 != null) {
             try{
                obj1 = a.a(p0, p1, a.a.get(p0), a.b.get(p0));
             }catch(java.lang.Exception e0){
                ExceptionHandler.handleCaughtException(e0);
                obj1 = objArray;
             }
             if (obj1 != null) {
                p2 = obj1;
             }
          }
          obj = p2;
       }
       long l = System.currentTimeMillis();
       p2 = f.c();
       Objects.requireNonNull(p2);
       if (!PatchProxy.applyVoid(objArray, p2, f.class, "2") && p2.a == null) {
          p2.g();
       }
       p1 = p.d().h(p0, p1, obj);
       long l1 = System.currentTimeMillis() - l;
       if (l1 - 50 >= 0) {
          c.a(new j(p0, l1));
       }
       return p1;
    }
    public static synchronized f c(){
       _monitor_enter(f.class);
       Object obj = PatchProxy.apply(null, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(f.class);
          return obj;
       }else if(f.b == null){
          f.b = new f();
       }
       _monitor_exit(f.class);
       return f.b;
    }
    public static boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (f.e(p0))? true: false;
       return b;
    }
    public static int e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.f(p0, 0);
    }
    public static int f(String p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uof, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return f.b(p0, Integer.class, Integer.valueOf(p1)).intValue();
    }
    public void g(){
       if (this.a != null) {
          return;
       }
       this.a = true;
       return;
    }
}
