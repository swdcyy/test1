package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter$mEasyTk$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter$a;
import android.widget.FrameLayout;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import android.app.Activity;
import lnc.y0;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1;
import x49.n;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo;
import mxb.c;
import android.view.ViewGroup;
import x49.o;
import msd.l;
import x49.n$b;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;

public final class ThanosAdTopTagTKPresenter extends PresenterV2	// class@001588
{
    public QPhoto p;
    public List q;
    public FrameLayout r;
    public final String s;
    public final p t;
    public boolean u;
    public final ThanosAdTopTagTKPresenter$a v;

    public void ThanosAdTopTagTKPresenter(){
       super();
       this.s = "ThanosAdTopTagTKPresenter";
       this.t = s.c(ThanosAdTopTagTKPresenter$mEasyTk$2.INSTANCE);
       this.v = new ThanosAdTopTagTKPresenter$a(this);
    }
    public static final FrameLayout P8(ThanosAdTopTagTKPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mTopTagContainer");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdTopTagTKPresenter.class, "4")) {
          return;
       }
       ThanosAdTopTagTKPresenter tr = this.r;
       String str = "mTopTagContainer";
       if (tr == null) {
          a.S(str);
       }
       tr.setVisibility(8);
       tr = this.p;
       String str1 = "mPhoto";
       if (tr == null) {
          a.S(str1);
       }
       if (s.D(tr) && !y0.o(this.getActivity())) {
          ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1 oonBind$appe = new ThanosAdTopTagTKPresenter$onBind$appendBridgeGroup$1(this);
          n on = this.R8();
          Activity activity = this.getActivity();
          a.m(activity);
          a.o(activity, "activity!!");
          ThanosAdTopTagTKPresenter tr1 = this.r;
          if (tr1 == null) {
             a.S(str);
          }
          ThanosAdTopTagTKPresenter tp = this.p;
          if (tp == null) {
             a.S(str1);
          }
          tr = this.p;
          if (tr == null) {
             a.S(str1);
          }
          PhotoAdvertisement$TopTagInfo topTagInfo = c.N(tr);
          a.m(topTagInfo);
          PhotoAdvertisement$TopTagInfo mTemplateId = topTagInfo.mTemplateId;
          a.o(mTemplateId, "AdDataUtils.getTopTagInfo\(mPhoto\)!!.mTemplateId");
          this.u = n$b.a(on, activity, tr1, tp, mTemplateId, null, null, oonBind$appe, 48, null);
          tr = this.q;
          if (tr == null) {
             a.S("mAttachListeners");
          }
          tr.add(this.v);
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          tr.setVisibility(0);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdTopTagTKPresenter.class, "5")) {
          return;
       }
       ThanosAdTopTagTKPresenter tq = this.q;
       if (tq == null) {
          a.S("mAttachListeners");
       }
       tq.remove(this.v);
       this.R8().destroy();
       return;
    }
    public final n R8(){
       Object obj = PatchProxy.apply(null, this, ThanosAdTopTagTKPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdTopTagTKPresenter.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.ad_top_tag_container);
       a.o(p0, "ViewBindUtils.bindWidget¡­.id.ad_top_tag_container\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdTopTagTKPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_ATTACH_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_ATTACH_LISTENERS\)");
       this.q = obj;
       return;
    }
}
