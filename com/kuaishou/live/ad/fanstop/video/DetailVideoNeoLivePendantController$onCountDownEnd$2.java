package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$onCountDownEnd$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlinx.coroutines.c;
import android.app.Activity;
import lnc.y0;

public final class DetailVideoNeoLivePendantController$onCountDownEnd$2 extends SuspendLambda implements p	// class@0009b6
{
    public Object L$0;
    public int label;
    public k0 p$;
    public final DetailVideoNeoLivePendantController this$0;

    public void DetailVideoNeoLivePendantController$onCountDownEnd$2(DetailVideoNeoLivePendantController p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       DetailVideoNeoLivePendantController$onCountDownEnd$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailVideoNeoLivePendantController$onCountDownEnd$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new DetailVideoNeoLivePendantController$onCountDownEnd$2(this.this$0, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailVideoNeoLivePendantController$onCountDownEnd$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailVideoNeoLivePendantController$onCountDownEnd$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       DetailVideoNeoLivePendantController$onCountDownEnd$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          if (c.a(1000, this) == obj) {
             return obj;
          }
       }
       if (y0.o(this.this$0.n)) {
          return l1.a;
       }else {
          this.this$0.e();
          return l1.a;
       }
    }
}
