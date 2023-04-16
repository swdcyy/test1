package com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$bind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.f;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class HomeFollowFeedsComponent$bind$3 extends FunctionReferenceImpl implements l	// class@001186
{

    public void HomeFollowFeedsComponent$bind$3(HomeFollowFeedsComponent p0){
       super(1, p0, HomeFollowFeedsComponent.class, "onHomeHuaweiMateXFoldEvent", "onHomeHuaweiMateXFoldEvent\(Lcom/yxcorp/gifshow/events/HomeHuaweiMateXFoldEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowFeedsComponent$bind$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onHomeHuaweiMateXFoldEvent(p0);
       return;
    }
}
