package com.yxcorp.gifshow.ad.fill.AbsAdFillingStrategyPresenter$mObserver$1;
import qvb.q;
import com.yxcorp.gifshow.ad.fill.AbsAdFillingStrategyPresenter;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.sdk.switchconfig.a;
import qvb.i;
import java.util.List;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import com.yxcorp.gifshow.ad.fill.AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$1;
import msd.l;
import com.yxcorp.gifshow.ad.fill.AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$2;
import java.util.Iterator;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache$a;
import java.lang.Long;
import androidx.collection.LruCache;

public final class AbsAdFillingStrategyPresenter$mObserver$1 implements q	// class@00176d
{
    public final AbsAdFillingStrategyPresenter b;

    public void AbsAdFillingStrategyPresenter$mObserver$1(AbsAdFillingStrategyPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       AbsAdFillingStrategyPresenter$mObserver$1 omObserver$1 = AbsAdFillingStrategyPresenter$mObserver$1.class;
       if (PatchProxy.isSupport(omObserver$1) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, omObserver$1, "1")) {
          return;
       }
       if (!a.t().d("enableAdFillingStrategy", false)) {
          return;
       }
       i oi = this.b.q();
       if (oi != null) {
          List items = oi.getItems();
          if (items != null) {
             m om = CollectionsKt___CollectionsKt.l1(items);
             if (om != null) {
                om = SequencesKt___SequencesKt.o0(om);
                if (om != null) {
                   om = SequencesKt___SequencesKt.g1(om, AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$1.INSTANCE);
                   if (om != null) {
                      om = SequencesKt___SequencesKt.i0(om, AbsAdFillingStrategyPresenter$mObserver$1$onFinishLoading$2.INSTANCE);
                      if (om != null) {
                         Iterator iterator = om.iterator();
                         while (iterator.hasNext()) {
                            AdNotShownCache.c.a().remove(Long.valueOf(iterator.next().mCreativeId));
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
