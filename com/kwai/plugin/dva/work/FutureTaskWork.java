package com.kwai.plugin.dva.work.FutureTaskWork;
import com.kwai.plugin.dva.work.ListenableWork;
import com.kwai.plugin.dva.work.FutureTaskWork$a;
import nsd.u;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ftd.r1;
import com.kwai.plugin.dva.work.FutureTaskWork$execute$_run$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import java.lang.Exception;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.work.c;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.work.WorkExecutors;
import sj7.a;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public abstract class FutureTaskWork extends ListenableWork	// class@000ec2
{
    public c f;
    public static final FutureTaskWork$a g;
    public static boolean h;

    static {
       FutureTaskWork.g = new FutureTaskWork$a(null);
    }
    public void FutureTaskWork(){
       super();
    }
    public static final void i(CoroutineDispatcher p0,FutureTaskWork p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FutureTaskWork.class, "5")) {
          return;
       }
       a.f(r1.b, p0, null, new FutureTaskWork$execute$_run$1(p1, null), 2, null);
       return;
    }
    public void b(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FutureTaskWork.class, "2")) {
          return;
       }
       FutureTaskWork tf = this.f;
       if (tf == null) {
          a.S("mTask");
          tf = null;
       }
       tf.d(p0);
       return;
    }
    public void c(int p0){
       c uoc;
       FutureTaskWork uFutureTaskW = FutureTaskWork.class;
       if (PatchProxy.isSupport(uFutureTaskW) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFutureTaskW, "4")) {
          return;
       }
       uFutureTaskW = this.f;
       if (uFutureTaskW == null) {
          a.S("mTask");
          uoc = null;
       }
       uoc.m((float)p0);
       return;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FutureTaskWork.class, "3")) {
          return;
       }
       FutureTaskWork tf = this.f;
       if (tf == null) {
          a.S("mTask");
          tf = null;
       }
       tf.r(p0);
       return;
    }
    public final c h(CoroutineDispatcher p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FutureTaskWork.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "dispatcher");
       p1 = c.j(p1);
       a.o(p1, "newInit\(initData\)");
       this.f = p1;
       if (!FutureTaskWork.h) {
          WorkExecutors.c.execute(new a(p0, this));
       }else {
          FutureTaskWork.i(p0, this);
       }
       FutureTaskWork tf = this.f;
       if (tf == null) {
          a.S("mTask");
          tf = null;
       }
       return tf;
    }
}
