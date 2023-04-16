package com.yxcorp.gifshow.detail.common.information.relationship.RecoReasonElement$2;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.common.information.relationship.RecoReasonElement;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import q2b.h$b;
import com.kuaishou.android.model.mix.HyperTag;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import k2b.u1;

public class RecoReasonElement$2 implements DefaultLifecycleObserver	// class@00144f
{
    public final RecoReasonElement b;

    public void RecoReasonElement$2(RecoReasonElement p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoReasonElement$2.class, "1")) {
          return;
       }
       RecoReasonElement$2 tb = this.b;
       if (tb.I > 0) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, RecoReasonElement.class, "25")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(tb.t.mEntity);
             h$b uob = h$b.d(0, 0);
             uob.k(tb.q0(RecoReasonElement.t0(tb.t), "INNER_PAGE_STAY_LEGTH", true));
             uob.h(uContentPack);
             u1.p0("", tb.B, uob);
          }
          tb.I = 0;
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
