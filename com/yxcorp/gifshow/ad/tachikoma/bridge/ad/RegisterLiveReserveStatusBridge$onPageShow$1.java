package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterLiveReserveStatusBridge$onPageShow$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.RegisterLiveReserveStatusBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import wl9.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import a59.f;
import wkd.b;
import mxb.f0;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import lnc.i3;
import a59.a;
import a59.a$a;

public final class RegisterLiveReserveStatusBridge$onPageShow$1 extends FunctionReferenceImpl implements l	// class@001818
{

    public void RegisterLiveReserveStatusBridge$onPageShow$1(RegisterLiveReserveStatusBridge p0){
       super(1, p0, RegisterLiveReserveStatusBridge.class, "onMainThread", "onMainThread\(Lcom/yxcorp/gifshow/commercial/event/AdLiveReserveEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       RegisterLiveReserveStatusBridge b;
       if (PatchProxy.applyVoidOneRefs(p0, this, RegisterLiveReserveStatusBridge$onPageShow$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, RegisterLiveReserveStatusBridge.class, "4") && p0.g(treceiver.d.e())) {
          f0 uof0 = b.a(-762347696);
          QPhoto qPhoto = treceiver.d.e();
          BaseFeed entity = (qPhoto != null)? qPhoto.getEntity(): null;
          uof0.r1(entity, "has_live_ad_reserved", Boolean.valueOf(p0.e()));
          i3 oi3 = i3.f();
          oi3.a("hasReserved", Boolean.valueOf(p0.e()));
          b = treceiver.b;
          if (b != null) {
             a$a.a(b, oi3.e(), null, 2, null);
          }
       }
    label_0070 :
       return;
    }
}
