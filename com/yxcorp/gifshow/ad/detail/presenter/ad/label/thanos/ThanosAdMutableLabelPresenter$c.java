package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter$c;
import t19.a$a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import vq4.a;
import java.util.Objects;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter$onNonActionbarClick$appender$1;
import n49.e;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.o;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import vz8.a;
import erd.g;
import com.yxcorp.gifshow.photoad.PhotoAdClientLogReport;
import com.kuaishou.webkit.URLUtil;
import wkd.b;
import k59.c2;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import k59.c2$a;

public final class ThanosAdMutableLabelPresenter$c implements a$a	// class@0015bf
{
    public final ThanosAdMutableLabelPresenter a;

    public void ThanosAdMutableLabelPresenter$c(ThanosAdMutableLabelPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0,PhotoAdvertisement$ExtraDisplayTag p1){
       a uoa;
       ThanosAdMutableLabelPresenter p1;
       ThanosAdMutableLabelPresenter$c uoc = ThanosAdMutableLabelPresenter$c.class;
       ThanosAdMutableLabelPresenter thanosAdMuta = ThanosAdMutableLabelPresenter.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1")) {
          return;
       }
       a.p(p1, "label");
       if (p1.mCanClick == null) {
          return;
       }
       PhotoAdvertisement$ExtraDisplayTag mUrl = p1.mUrl;
       int i = 1;
       uoc = (mUrl == null || !mUrl.length())? 1: null;
       if (uoc) {
          uoc = this.a;
          uoa = uoc.P8((p0 + i), p1);
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoidOneRefs(uoa, uoc, thanosAdMuta, "19")) {
             e uoe = new e(79);
             uoe.b(new ThanosAdMutableLabelPresenter$onNonActionbarClick$appender$1(uoa));
             ThanosAdMutableLabelPresenter s = uoc.s;
             if (s == null) {
                a.S("mPhotoAdActionBarClickProcessor");
             }
             thanosAdMuta = uoc.p;
             if (thanosAdMuta == null) {
                a.S("mPhoto");
             }
             s.a(thanosAdMuta, uoc.getActivity(), uoe);
          }
       }else {
          uoc = this.a;
          uoa = uoc.P8((p0 + i), p1);
          Objects.requireNonNull(uoc);
          if (!PatchProxy.applyVoidOneRefs(uoa, uoc, thanosAdMuta, "20")) {
             j0 oj0 = o.z();
             int i1 = 141;
             ThanosAdMutableLabelPresenter p = uoc.p;
             if (p == null) {
                a.S("mPhoto");
             }
             oj0.e(i1, p.mEntity).d(new a(uoa)).a();
             p1 = uoc.p;
             if (p1 == null) {
                a.S("mPhoto");
             }
             QPhoto mEntity = p1.mEntity;
             a.o(mEntity, "mPhoto.mEntity");
             PhotoAdClientLogReport.b(mEntity, 79);
          }
          Activity activity = this.a.getActivity();
          if (activity != null && URLUtil.isNetworkUrl(p1.mUrl)) {
             Object obj = b.a(0xdb243e0);
             a.o(activity, "it");
             ThanosAdMutableLabelPresenter$c ta = this.a;
             Objects.requireNonNull(ta);
             ThanosAdMutableLabelPresenter thanosAdMuta1 = PatchProxy.apply(null, ta, thanosAdMuta, "2");
             if (thanosAdMuta1 != PatchProxyResult.class) {
             }else {
                thanosAdMuta1 = ta.p;
                if (thanosAdMuta1 == null) {
                   a.S("mPhoto");
                }
             }
             PhotoAdvertisement$ExtraDisplayTag mUrl1 = p1.mUrl;
             a.o(mUrl1, "label.mUrl");
             c2$a.a(obj, activity, new PhotoAdDataWrapper(thanosAdMuta1.getEntity()), mUrl1, false, 8, null);
          }
       }
    label_0103 :
       return;
    }
}
