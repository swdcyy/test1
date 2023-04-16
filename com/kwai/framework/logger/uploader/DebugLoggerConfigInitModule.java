package com.kwai.framework.logger.uploader.DebugLoggerConfigInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import o56.d;
import com.yxcorp.gifshow.log.n;
import com.kwai.framework.logger.config.b;
import java.util.Objects;
import aa6.c;
import w96.l;

public class DebugLoggerConfigInitModule extends a	// class@00166b
{

    public void DebugLoggerConfigInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, DebugLoggerConfigInitModule.class, "1")) {
          return;
       }
       if (a.a().c() && d.i) {
          o0 l = n.L;
          if (l instanceof b) {
             Objects.requireNonNull(l);
             if (!PatchProxy.applyVoid(null, l, b.class, "4")) {
                l.d(l.a(), null);
             }
          }
       }
       return;
    }
}
