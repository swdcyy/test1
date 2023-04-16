package com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.postentrance.presenter.KsBottomBarCameraPresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import yqb.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;

public final class KsBottomBarCameraPresenterV2$onBind$1 extends FunctionReferenceImpl implements l	// class@001055
{

    public void KsBottomBarCameraPresenterV2$onBind$1(KsBottomBarCameraPresenterV2 p0){
       super(1, p0, KsBottomBarCameraPresenterV2.class, "handleProfileEmptyGuideShowEvent", "handleProfileEmptyGuideShowEvent\(Lcom/yxcorp/gifshow/nasa/EmptyGuideShowEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsBottomBarCameraPresenterV2$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, KsBottomBarCameraPresenterV2.class, "19")) {
          treceiver.A = p0.a;
       }
       return;
    }
}
