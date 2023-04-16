package com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import i50.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$a;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Collection;

public final class SlidePlayLogTimeMachinePresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@000a8b
{

    public void SlidePlayLogTimeMachinePresenter$onBind$1(SlidePlayLogTimeMachinePresenter p0){
       super(1, p0, SlidePlayLogTimeMachinePresenter.class, "onCandidateItemClear", "onCandidateItemClear\(Lcom/kuaishou/eve/kit/rerank/event/RankCandidateClearEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayLogTimeMachinePresenter$onBind$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, SlidePlayLogTimeMachinePresenter.class, "6") && (p0 != null && treceiver.r != null)) {
          SlidePlayLogTimeMachinePresenter$a s = SlidePlayLogTimeMachinePresenter.s;
          b a = p0.a;
          Objects.requireNonNull(s);
          String str = PatchProxy.applyOneRefs(a, s, SlidePlayLogTimeMachinePresenter$a.class, "2");
          if (str != PatchProxyResult.class) {
          }else if(a == null){
             int i1 = a.hashCode();
             if (i1 != -874940603) {
                if (i1 == -290659282 && a.equals("featured")) {
                   str = "NasaFeature";
                }
             }else if(a.equals("thanos")){
                str = "NebulaHot";
             }
          }
          str = null;
          if (!(a.g(str, treceiver.r) ^ 0x01)) {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p0.b.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                int i = obj.isShowed() ^ 0x01;
                if (i) {
                   uArrayList.add(obj);
                }
             }
             treceiver.R8("RERANK_CANDIDATE_FEED_CLEAR", uArrayList);
          }
       }
    label_0097 :
       return;
    }
}
