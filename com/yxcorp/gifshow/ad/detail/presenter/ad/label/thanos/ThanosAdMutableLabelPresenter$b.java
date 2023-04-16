package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;
import vq4.a;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import vz8.b;
import erd.g;
import com.yxcorp.gifshow.photoad.PhotoAdClientLogReport;

public final class ThanosAdMutableLabelPresenter$b extends a	// class@0015be
{
    public final ThanosAdMutableLabelPresenter b;

    public void ThanosAdMutableLabelPresenter$b(ThanosAdMutableLabelPresenter p0){
       this.b = p0;
       super();
    }
    public void k1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ThanosAdMutableLabelPresenter$b.class, "1")) {
          return;
       }
       ThanosAdMutableLabelPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, ThanosAdMutableLabelPresenter.class, "17")) {
          ThanosAdMutableLabelPresenter p = tb.p;
          if (p == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(p);
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
             if (adData != null) {
                adData = adData.mExtraDisplayInfo;
                if (adData != null) {
                   PhotoAdvertisement$ExtraDisplayInfo mTagInfoList = adData.mTagInfoList;
                   if (mTagInfoList != null) {
                      int i = 0;
                      Iterator iterator = mTagInfoList.iterator();
                      while (iterator.hasNext()) {
                         j0 obj = iterator.next();
                         int i1 = i + 1;
                         if (i < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         a.o(obj, "extraDisplayTag");
                         a uoa = tb.P8(i1, obj);
                         if (!PatchProxy.applyVoidOneRefs(uoa, tb, ThanosAdMutableLabelPresenter.class, "18")) {
                            obj = o.z();
                            ThanosAdMutableLabelPresenter p1 = tb.p;
                            if (p1 == null) {
                               a.S("mPhoto");
                            }
                            obj.e(140, p1.mEntity).d(new b(uoa)).a();
                            ThanosAdMutableLabelPresenter p2 = tb.p;
                            if (p2 == null) {
                               a.S("mPhoto");
                            }
                            QPhoto mEntity = p2.mEntity;
                            a.o(mEntity, "mPhoto.mEntity");
                            PhotoAdClientLogReport.c(mEntity, 140);
                         }
                         i = i1;
                      }
                   }
                }
             }
          }
       }
    label_0096 :
       return;
    }
}
