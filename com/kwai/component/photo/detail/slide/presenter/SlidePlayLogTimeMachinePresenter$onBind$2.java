package com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import le5.g;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;
import com.yxcorp.gifshow.log.timemachine.EventTriggerType;
import com.yxcorp.gifshow.log.timemachine.TMLogManager;
import a3b.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class SlidePlayLogTimeMachinePresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@000a8c
{

    public void SlidePlayLogTimeMachinePresenter$onBind$2(SlidePlayLogTimeMachinePresenter p0){
       super(1, p0, SlidePlayLogTimeMachinePresenter.class, "onNasaSlidePageDataCleared", "onNasaSlidePageDataCleared\(Lcom/kwai/component/photo/detail/slide/SlideFirstPageItemClearEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayLogTimeMachinePresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       SlidePlayLogTimeMachinePresenter slidePlayLog = SlidePlayLogTimeMachinePresenter.class;
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, slidePlayLog, "8") && treceiver.r != null) {
          SlidePlayLogTimeMachinePresenter$a s = SlidePlayLogTimeMachinePresenter.s;
          TabIdentifier tabIdentifie = a.h(p0.b);
          if (tabIdentifie != null && !(a.g(s.a(tabIdentifie), treceiver.r) ^ 0x01)) {
             p0 = p0.a;
             a.o(p0, "event.mOldFirstPagePhotos");
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                Object obj1 = obj;
                a.o(obj1, "it");
                int i = obj1.isShowed() ^ 0x01;
                if (i) {
                   uArrayList.add(obj);
                }
             }
             treceiver.R8("REFRESH_REMOVE_UNSHOWN_FEED", uArrayList);
             SlidePlayLogTimeMachinePresenter r = treceiver.r;
             String messageType = EventTriggerType.SlideDataSource.getMessageType();
             if (!PatchProxy.applyVoidTwoRefs(r, messageType, treceiver, slidePlayLog, "12")) {
                TMLogManager e = TMLogManager.e;
                if (!e.c(r)) {
                   e.a(r).g();
                   Log.g(r+'_'+messageType, "#onBizSessionReset  bizSessionId="+e.a(r).a());
                }
             }
          }
       }
       return;
    }
}
