package com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$onBind$4;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import cda.h;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$a;
import java.util.Map;
import qk.g0;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;

public final class SlidePlayLogTimeMachinePresenter$onBind$4 extends FunctionReferenceImpl implements l	// class@000a8e
{

    public void SlidePlayLogTimeMachinePresenter$onBind$4(SlidePlayLogTimeMachinePresenter p0){
       super(1, p0, SlidePlayLogTimeMachinePresenter.class, "onPhotoListFiltered", "onPhotoListFiltered\(Lcom/yxcorp/gifshow/event/photo/PhotoListFilteredEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayLogTimeMachinePresenter$onBind$4.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, SlidePlayLogTimeMachinePresenter.class, "7") && treceiver.r != null) {
          SlidePlayLogTimeMachinePresenter$a s = SlidePlayLogTimeMachinePresenter.s;
          TabIdentifier tabIdentifie = a.h(p0.a);
          if (tabIdentifie != null && !(a.g(s.a(tabIdentifie), treceiver.r) ^ 0x01)) {
             p0 = p0.b;
             if (p0 != null) {
                Map map = p0.asMap();
                if (map != null) {
                   Iterator iterator = map.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      Object key = uEntry.getKey();
                      a.o(key, "it.key");
                      Object value = uEntry.getValue();
                      a.o(value, "it.value");
                      treceiver.R8(key, value);
                   }
                }
             }
          }
       }
       return;
    }
}
