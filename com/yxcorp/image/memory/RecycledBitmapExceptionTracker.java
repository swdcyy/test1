package com.yxcorp.image.memory.RecycledBitmapExceptionTracker;
import com.yxcorp.image.memory.RecycledBitmapExceptionTracker$subscriberMap$1;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StackTraceElement;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.RuntimeException;
import zsd.u;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.lang.StringBuilder;
import i0d.c;
import java.lang.IllegalStateException;
import tc.u;
import android.graphics.Bitmap;
import java.lang.Integer;
import kb.e;
import java.lang.Boolean;
import kb.f;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.image.fresco.wrapper.a$e;
import java.util.HashMap;
import kotlin.text.StringsKt__StringsKt;

public final class RecycledBitmapExceptionTracker	// class@001a16
{
    public static final RecycledBitmapExceptionTracker$subscriberMap$1 a;
    public static final HashSet b;
    public static final RecycledBitmapExceptionTracker c;

    static {
       RecycledBitmapExceptionTracker.c = new RecycledBitmapExceptionTracker();
       RecycledBitmapExceptionTracker.a = new RecycledBitmapExceptionTracker$subscriberMap$1();
       RecycledBitmapExceptionTracker.b = new HashSet();
    }
    public void RecycledBitmapExceptionTracker(){
       super();
    }
    public final void a(Throwable p0){
       RecycledBitmapExceptionTracker recycledBitm = RecycledBitmapExceptionTracker.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, recycledBitm, "9")) {
          return;
       }
       String message = p0.getMessage();
       if (message != null) {
          StackTraceElement[] stackTrace = p0.getStackTrace();
          if (stackTrace != null) {
             int i = 0;
             StackTraceElement stackTraceEl = ArraysKt___ArraysKt.ke(stackTrace, i);
             if (stackTraceEl != null && p0 instanceof RuntimeException) {
                String str = null;
                if (u.q2(message, "Canvas: trying to use a recycled bitmap android.graphics.Bitmap@", i, 2, str) && a.g(stackTraceEl.getMethodName(), "throwIfCannotDraw")) {
                   String str1 = message.substring(64);
                   a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
                   _monitor_enter(this);
                   HashSet obj = PatchProxy.applyOneRefs(str1, this, recycledBitm, "4");
                   if (obj != PatchProxyResult.class) {
                      _monitor_exit(this);
                   }else {
                      obj = RecycledBitmapExceptionTracker.a.get(str1);
                      if (obj != null) {
                         str = obj.toString();
                      }
                      _monitor_exit(this);
                      obj = str;
                   }
                   c.a(p0, "detailMessage", message+", request subscribed by: "+obj);
                }
             }
          }
       }
       return;
    }
    public final void b(Throwable p0){
       RecycledBitmapExceptionTracker recycledBitm = RecycledBitmapExceptionTracker.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, recycledBitm, "8")) {
          return;
       }
       String message = p0.getMessage();
       if (message != null) {
          StackTraceElement[] stackTrace = p0.getStackTrace();
          if (stackTrace != null) {
             int i = 0;
             StackTraceElement stackTraceEl = ArraysKt___ArraysKt.ke(stackTrace, i);
             if (stackTraceEl != null && (p0 instanceof IllegalStateException && (u.q2(message, "key is null, but exclusiveEntries count:", i, 2, null) && a.g(stackTraceEl.getClassName(), u.class.getName())))) {
                StringBuilder str = message+", find recycled bitmap that subscribed by: ";
                _monitor_enter(this);
                String str1 = PatchProxy.apply(null, this, recycledBitm, "6");
                if (str1 != PatchProxyResult.class) {
                }else {
                   str1 = RecycledBitmapExceptionTracker.b.toString();
                   a.o(str1, "recycledBitmaps.toString\(\)");
                }
                _monitor_exit(this);
                c.a(p0, "detailMessage", str+str1);
             }
          }
       }
       return;
    }
    public final String c(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecycledBitmapExceptionTracker.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.toHexString(p0.hashCode());
    }
    public final void d(Bitmap p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecycledBitmapExceptionTracker.class, "1")) {
          return;
       }
       a.p(p0, "bitmap");
       a.p(p1, "subscriber");
       RecycledBitmapExceptionTracker$subscriberMap$1 obj = PatchProxy.applyOneRefs(p1, this, RecycledBitmapExceptionTracker.class, "2");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          String name = p1.getClass().getName();
          String str1 = "subscriber::class.java.name";
          a.o(name, str1);
          String name1 = f.class.getName();
          a.o(name1, "FirstAvailableDataSourceSupplier::class.java.name");
          if (!u.q2(name, name1, b, 2, null)) {
             name = p1.getClass().getName();
             a.o(name, str1);
             str1 = AbstractDraweeController.class.getName();
             a.o(str1, "AbstractDraweeController::class.java.name");
             if (!u.q2(name, str1, b, 2, null) && !p1 instanceof a$e) {
             label_0068 :
                if (b) {
                   return;
                }else {
                   _monitor_enter(this);
                   if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecycledBitmapExceptionTracker.class, "3")) {
                      _monitor_exit(this);
                   }else {
                      String str = this.c(p0);
                      obj = RecycledBitmapExceptionTracker.a;
                      HashSet hashSet = obj.get(str);
                      if (hashSet == null) {
                         hashSet = new HashSet();
                         a.o(str, "hashCodeStr");
                         obj.put(str, hashSet);
                      }
                      a.o(hashSet, "subscriberMap[hashCodeSt¡­Map[hashCodeStr] = this }");
                      str = PatchProxy.applyOneRefs(p1, this, RecycledBitmapExceptionTracker.class, "11");
                      if (str != PatchProxyResult.class) {
                      }else {
                         str = StringsKt__StringsKt.i5(p1.toString(), '@', null, 2, null);
                      }
                      hashSet.add(str);
                      _monitor_exit(this);
                   }
                   return;
                }
             }
          }
          b = true;
          goto label_0068 ;
       }
    }
}
