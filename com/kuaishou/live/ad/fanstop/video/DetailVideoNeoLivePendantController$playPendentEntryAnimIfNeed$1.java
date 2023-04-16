package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController;
import msd.l;
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
import com.yxcorp.gifshow.commercial.response.magnetic.LiveNeoPendentTasksResponse;
import qrd.j0;
import java.lang.IllegalStateException;
import java.util.Objects;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import java.lang.Boolean;
import dsd.a;
import kotlin.Result;
import yx.j0;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;
import java.lang.Integer;
import android.view.ViewGroup;
import android.view.View;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$addPendentToScreen$2$anim$1;
import ftd.k;
import msd.a;
import android.animation.AnimatorSet;
import dsd.e;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$startCountDownIfNeed$1;
import crd.b;

public final class DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1 extends SuspendLambda implements p	// class@0009b9
{
    public final l $animationAction;
    public Object L$0;
    public Object L$1;
    public int label;
    public k0 p$;
    public final DetailVideoNeoLivePendantController this$0;

    public void DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1(DetailVideoNeoLivePendantController p0,l p1,c p2){
       this.this$0 = p0;
       this.$animationAction = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1(this.this$0, this.$animationAction, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       boolean b;
       Integer integer;
       DetailVideoNeoLivePendantController uDetailVideo = DetailVideoNeoLivePendantController.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1 tlabel = this.label;
       DetailVideoNeoLivePendantController$startCountDownIfNeed$1 ostartCountD = 2;
       int i = 1;
       if (tlabel != null) {
          if (tlabel != i) {
             if (tlabel == ostartCountD) {
                j0.n(p0);
             label_0111 :
                if (p0.booleanValue()) {
                   p0 = this.this$0;
                   if (p0.n(p0.g)) {
                      p0 = this.this$0;
                      Objects.requireNonNull(p0);
                      if (!PatchProxy.applyVoid(null, p0, uDetailVideo, "9")) {
                         p0.d().setOnClickListener(new DetailVideoNeoLivePendantController$showDialogOnPendentClicked$1(p0));
                      }
                   }
                   this.this$0.k();
                   p0 = this.this$0;
                   Objects.requireNonNull(p0);
                   if (!PatchProxy.applyVoid(null, p0, uDetailVideo, "15")) {
                      if (p0.c()) {
                         p0.a(p0.d().b(p0.b(), new DetailVideoNeoLivePendantController$startCountDownIfNeed$1(p0)));
                      }else {
                         p0.i();
                      }
                   }
                }else {
                   this.this$0.i();
                }
                return l1.a;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$0;
             j0.n(p0);
          }
       }else {
          j0.n(p0);
          tlabel = this.p$;
          p0 = this.this$0;
          if (p0.d != null) {
             return l1.a;
          }else {
             this.L$0 = tlabel;
             this.label = i;
             p0 = p0.m(0, this);
             if (p0 == obj) {
                return obj;
             }
          }
       }
       if (p0 == null || p0.shouldHidePendent()) {
          this.this$0.i();
          return l1.a;
       }else {
          DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1 tthis$0 = this.this$0;
          DetailVideoNeoLivePendantController$playPendentEntryAnimIfNeed$1 t$animationA = this.$animationAction;
          this.L$0 = tlabel;
          this.L$1 = p0;
          this.label = ostartCountD;
          Objects.requireNonNull(tthis$0);
          p0 = new l(IntrinsicsKt__IntrinsicsJvmKt.d(this), i);
          p0.u();
          b = false;
          if (tthis$0.d != null) {
             p0.resumeWith(Result.constructor-impl(a.a(b)));
          }else if(!tthis$0.c()){
             Object[] objArray = new Object[b];
             j0.c("DetailVideoNeoLivePendantController", "Unable to add pendant on screen", objArray);
             p0.resumeWith(Result.constructor-impl(a.a(b)));
          }else {
             tthis$0.d = i;
             if (t$animationA == null) {
                LiveAdNeoPendantBaseView liveAdNeoPen = tthis$0.d();
                DetailVideoNeoLivePendantController g = tthis$0.g;
                if (g != null) {
                   LiveAdNeoParam mTaskInfoPar = g.mTaskInfoParam;
                   if (mTaskInfoPar != null) {
                      integer = a.f(mTaskInfoPar.mTopPendantType);
                   label_00c4 :
                      liveAdNeoPen.setPendantType(integer);
                      tthis$0.d().setCoolDownBgImageResourceIfNeed$commercial_live_release(tthis$0.b());
                      DetailVideoNeoLivePendantController o = tthis$0.o;
                      if (o != null) {
                         o.addView(tthis$0.d());
                      }
                      p0.resumeWith(Result.constructor-impl(a.a(i)));
                   }
                }
                integer = null;
                goto label_00c4 ;
             }else {
                t$animationA.invoke(tthis$0.d().e(tthis$0.b(), new DetailVideoNeoLivePendantController$addPendentToScreen$2$anim$1(p0)));
             }
          }
          p0 = p0.r();
          if (p0 == b.h()) {
             e.c(this);
          }
          if (p0 == obj) {
             return obj;
          }else {
             goto label_0111 ;
          }
       }
    }
}
