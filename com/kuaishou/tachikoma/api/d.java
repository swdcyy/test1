package com.kuaishou.tachikoma.api.d;
import java.util.LinkedList;
import android.os.Handler;
import aq8.a;
import android.os.HandlerThread;
import android.os.Looper;
import com.kuaishou.tachikoma.api.a;
import android.os.Handler$Callback;
import java.lang.Object;
import tx4.w;
import tx4.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.tkruntime.v8.V8;
import com.tachikoma.core.bridge.a$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tachikoma.core.bridge.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import com.tachikoma.core.bridge.a$a;
import tw4.c;
import java.lang.Runnable;
import iq8.x;
import tw4.d;
import tw4.a;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8Trace;
import com.kuaishou.tachikoma.api.d$a;
import android.os.Message;
import java.lang.Throwable;
import tw4.f;
import com.tkruntime.v8.V8Value;
import tw4.e;
import java.util.concurrent.Executor;
import com.kuaishou.tachikoma.api.b;
import tw4.g;
import java.lang.Long;

public class d	// class@000f7e
{
    public static final LinkedList a;
    public static final Handler b;

    static {
       d.a = new LinkedList();
       d.b = new Handler(a.b().a().getLooper(), a.b);
    }
    public void d(){
       super();
    }
    public static void a(w p0,boolean p1,f p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, d.class, "2")) {
          return;
       }
       d.b(null, null, p0, p1, p2);
       return;
    }
    public static void b(V8 p0,a$b p1,w p2,boolean p3,f p4){
       w a;
       w d;
       Iterator obj;
       boolean b;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p4;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(d.class)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,Boolean.valueOf(p3),oobject2};
          if (PatchProxy.applyVoid(objArray, null, d.class, "1")) {
             return;
          }
       }
       String str = "";
       if (oobject1 != null) {
          str = oobject1.b;
          a = oobject1.a;
       }else {
          a = str;
       }
       if (oobject1 != null && (TextUtils.isEmpty(str) || TextUtils.isEmpty(a))) {
          x.b(new f(oobject2, p2, new Throwable("CompileManager asyncCompileCodeCache parameters is invalid")));
          return;
       }else if(oobject == null){
          d = oobject1.d;
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             obj = PatchProxy.applyTwoRefs(str, Integer.valueOf(d), null, uoa, "4");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             label_009b :
                if (b != null) {
                   if (oobject2 != null) {
                      oobject2.b(i1);
                   }
                   x.b(new c(oobject2, p2));
                   return;
                }else {
                   oobject = a.a(i1, oobject1.b);
                }
             }
          }
          obj = a.b.iterator();
          a$b uob = null;
          while (obj.hasNext()) {
             a$b uob1 = obj.next();
             if (uob1 == null || uob1.e.isEmpty()) {
                continue ;
             }else {
                a$a uoa2 = uob1.e.get(str);
                uob = (uoa2 != null && uoa2.c == d)? 1: null;
                if (uob) {
                   break ;
                }
             }
          }
          b = uob;
          goto label_009b ;
       }else if(p1.f(str, oobject1.d)){
          if (oobject2 != null) {
             oobject2.b(i1);
          }
          x.b(new d(oobject2, p2));
          return;
       }
       object oobject3 = oobject;
       if (a.c.booleanValue()) {
          V8Trace.traceLog("CompileManager", "asyncCompileWithSharedIsolate: bundleId = "+oobject1.b+", isFullCompile = "+p3);
       }else {
          i1 = p3;
       }
       d$a uoa1 = new d$a(oobject3, p0, p3, p2, p4);
       if (!PatchProxy.applyVoidOneRefs(obj, null, d.class, "4")) {
          Handler b1 = d.b;
          b1.sendMessage(b1.obtainMessage(1001, obj));
       }
       d.d(0);
       return;
    }
    public static void c(V8 p0,a$b p1,w p2,boolean p3,f p4){
       w ow;
       w ow1;
       d uod = d.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uod, "3")) {
             return;
          }
       }
       String str = "";
       if (p2 != null) {
          ow = p2.a;
          ow1 = p2.b;
       }else {
          ow1 = str;
          ow = ow1;
       }
       if (p2 != null && (!TextUtils.isEmpty(ow1) && (TextUtils.isEmpty(ow) || p0.isReleased()))) {
          x.b(new g(p4, p2, new Throwable("CompileManager asyncCompileCodeCache parameters is invalid")));
          return;
       }else if(p1.f(ow1, p2.d)){
          p4.b(i);
          x.b(new e(p4, p2));
          return;
       }else if(a.c.booleanValue()){
          V8Trace.traceLog("CompileManager", "asyncCompileWithUnSharedIsolate: bundleId = "+p2.b+", isFullCompile = "+p3);
       }
       b uob = new b(ow1, p0, p4, p2, ow, p3, p1);
       a.b(i1, p1).execute(v10);
       return;
    }
    public static void d(long p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, uod, "5")) {
          return;
       }
       Handler b = d.b;
       b.sendMessageDelayed(b.obtainMessage(1002), p0);
       return;
    }
}
