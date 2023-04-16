package com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import cda.d;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import trd.t;
import java.util.Collection;

public final class SlidePlayLogTimeMachinePresenter$onBind$3 extends FunctionReferenceImpl implements l	// class@000a8d
{

    public void SlidePlayLogTimeMachinePresenter$onBind$3(SlidePlayLogTimeMachinePresenter p0){
       super(1, p0, SlidePlayLogTimeMachinePresenter.class, "onPhotoDeleted", "onPhotoDeleted\(Lcom/yxcorp/gifshow/event/photo/PhotoDeleteEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(d p0){
       d a;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayLogTimeMachinePresenter$onBind$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, SlidePlayLogTimeMachinePresenter.class, "9")) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          a = p0.a;
          a.o(a, "event.mPhoto");
          if (a.g(mE.getId(), a.getUserId())) {
             treceiver.R8("REMOVE_OWN_FEED", t.k(p0.a));
          }
       }
       return;
    }
}
