package com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import dda.l;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Integer;
import java.util.List;
import nsd.r0;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import java.util.Arrays;
import v40.b;

public final class EveRankExtraTriggerPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@000a9d
{

    public void EveRankExtraTriggerPresenter$onBind$1(EveRankExtraTriggerPresenter p0){
       super(1, p0, EveRankExtraTriggerPresenter.class, "onPhotoForward", "onPhotoForward\(Lcom/yxcorp/gifshow/event/photo/core/PhotoShared;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       EveRankExtraTriggerPresenter u;
       if (PatchProxy.applyVoidOneRefs(p0, this, EveRankExtraTriggerPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, EveRankExtraTriggerPresenter.class, "14")) {
          EveRankExtraTriggerPresenter p = treceiver.p;
          if (p == null) {
             a.S("mPhoto");
          }
          if (!(a.g(p.mEntity, p0.a) ^ 1) && treceiver.y.contains(Integer.valueOf(2))) {
             Object[] objArray = new Object[]{u.b().getTaskId()};
             u = treceiver.u;
             a.m(u);
             String str = String.format("custom_infer_%s", Arrays.copyOf(objArray, 1));
             a.o(str, "java.lang.String.format\(format, *args\)");
             b.b(str, "CLICK_SEND_BUTTON");
          }
       }
    label_006f :
       return;
    }
}
