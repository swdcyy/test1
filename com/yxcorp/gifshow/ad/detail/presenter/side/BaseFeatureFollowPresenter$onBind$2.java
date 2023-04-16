package com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.ad.detail.presenter.side.BaseFeatureFollowPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.framework.model.user.User;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.component.photo.detail.slide.widget.SlidePlayFollowAnimationView;

public final class BaseFeatureFollowPresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@001691
{

    public void BaseFeatureFollowPresenter$onBind$2(BaseFeatureFollowPresenter p0){
       super(1, p0, BaseFeatureFollowPresenter.class, "updateUser", "updateUser\(Lcom/kwai/framework/model/user/User;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseFeatureFollowPresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, BaseFeatureFollowPresenter.class, "24") && treceiver.y != null) {
          boolean b = p0.isFollowingOrFollowRequesting();
          if (treceiver.z != b) {
             treceiver.z = b;
             if (b) {
                if (treceiver.P8()) {
                   if (!PatchProxy.applyVoid(null, treceiver, BaseFeatureFollowPresenter.class, "28")) {
                      BaseFeatureFollowPresenter x = treceiver.x;
                      if (x != null) {
                         x.c();
                      }
                   }
                }else {
                   treceiver.W8();
                }
             }else {
                treceiver.X8();
             }
          }
       }
       return;
    }
}
