package com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter$onBind$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter;
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
import j50.e;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.util.Map;
import pf5.d;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import j50.b;
import hf6.b;
import brd.t;
import ff6.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class RankExtraTriggerPresenter$onBind$3 extends FunctionReferenceImpl implements l	// class@000aa3
{

    public void RankExtraTriggerPresenter$onBind$3(RankExtraTriggerPresenter p0){
       super(1, p0, RankExtraTriggerPresenter.class, "onPhotoForward", "onPhotoForward\(Lcom/yxcorp/gifshow/event/photo/core/PhotoShared;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       RankExtraTriggerPresenter p1;
       if (PatchProxy.applyVoidOneRefs(p0, this, RankExtraTriggerPresenter$onBind$3.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, RankExtraTriggerPresenter.class, "17")) {
          RankExtraTriggerPresenter p = treceiver.p;
          String str = "mPhoto";
          if (p == null) {
             a.S(str);
          }
          if (!(a.g(p.mEntity, p0.a) ^ 0x01)) {
             int i = 2;
             if (treceiver.B.contains(Integer.valueOf(i))) {
                RankExtraTriggerPresenter x = treceiver.x;
                if (x != null) {
                   p1 = treceiver.p;
                   if (p1 == null) {
                      a.S(str);
                   }
                   QPhoto mEntity = p1.mEntity;
                   a.o(mEntity, "mPhoto.mEntity");
                   e uoe = new e(mEntity);
                   p1 = treceiver.r;
                   if (p1 == null) {
                      a.S("mLogger");
                   }
                   Object obj = p1.get();
                   RankExtraTriggerPresenter p2 = treceiver.p;
                   if (p2 == null) {
                      a.S(str);
                   }
                   uoe.h(d.a(obj, p2, 0, 0, 12, null));
                   RankExtraTriggerPresenter u = treceiver.u;
                   a.m(u);
                   x.o0(u.b().getBizId(), "user_feature", uoe);
                   x = treceiver.u;
                   a.m(x);
                   x.a(i).subscribe(Functions.d(), Functions.d());
                }
             }
          }
       }
    label_00aa :
       return;
    }
}
