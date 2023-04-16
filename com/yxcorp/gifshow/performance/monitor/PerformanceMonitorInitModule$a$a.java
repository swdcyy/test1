package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$a$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.NativeBitmapHooker;
import java.util.Objects;
import yf7.h;
import java.lang.StringBuilder;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;

public final class PerformanceMonitorInitModule$a$a implements Runnable	// class@000e49
{
    public static final PerformanceMonitorInitModule$a$a b;

    static {
       PerformanceMonitorInitModule$a$a.b = new PerformanceMonitorInitModule$a$a();
    }
    public void PerformanceMonitorInitModule$a$a(){
       super();
    }
    public final void run(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, PerformanceMonitorInitModule$a$a.class, "1")) {
          return;
       }
       NativeBitmapHooker d = NativeBitmapHooker.d;
       Objects.requireNonNull(d);
       String str = null;
       if (!NativeBitmapHooker.c && NativeBitmapHooker.a) {
          String str1 = "native_bitmap";
          if (NativeBitmapHooker.b) {
             h.d(str1, "already hooked");
             b = NativeBitmapHooker.b;
          }else {
             b = d.enable();
             boolean b1 = true;
             if (!b) {
                str = true;
             }
             NativeBitmapHooker.b = str;
             if (!str) {
                NativeBitmapHooker.c = b1;
                h.b(str1, "error: "+b);
                h oh = b.a(0x4b316083);
                if (oh != null) {
                   oh.k("", "native_bitmap_error", String.valueOf(b));
                }
             }else {
                h.d(str1, "hook success");
             }
             b = NativeBitmapHooker.b;
          }
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       d.enableDebug(uoc.c());
       return;
    }
}
