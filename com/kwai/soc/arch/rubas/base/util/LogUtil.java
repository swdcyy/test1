package com.kwai.soc.arch.rubas.base.util.LogUtil;
import com.kwai.soc.arch.rubas.base.util.LogUtil$ENABLE$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Thread;

public final class LogUtil	// class@00189b
{
    public static final p a;
    public static boolean b;
    public static final LogUtil c;

    static {
       LogUtil.c = new LogUtil();
       LogUtil.a = s.c(LogUtil$ENABLE$2.INSTANCE);
    }
    public void LogUtil(){
       super();
    }
    public static final void a(String p0,a p1){
       LogUtil logUtil = LogUtil.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, logUtil, "3")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "contentProvider");
       if (!LogUtil.b) {
          LogUtil c = LogUtil.c;
          Objects.requireNonNull(c);
          Boolean uBoolean = PatchProxy.apply(null, c, logUtil, "1");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = LogUtil.a.getValue();
          }
          if (!uBoolean.booleanValue()) {
          label_004a :
             return;
          }
       }
       Thread thread = Thread.currentThread();
       a.o(thread, "Thread.currentThread\(\)");
       thread.getName();
       p1.invoke();
       goto label_004a ;
    }
    public static final void b(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LogUtil.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "contentProvider");
       p1.invoke();
       return;
    }
    public final boolean c(){
       return LogUtil.b;
    }
    public final void d(boolean p0){
       LogUtil.b = p0;
    }
}
