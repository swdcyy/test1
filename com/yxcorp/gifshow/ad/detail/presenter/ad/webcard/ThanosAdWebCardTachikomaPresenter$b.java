package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import s09.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.animation.AdWebCardAnimationDelegate;
import android.view.View;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo;
import java.lang.Integer;
import t09.a;
import com.yxcorp.gifshow.ad.util.i$c;
import im8.f;
import tkd.b;
import tkd.d;
import rx4.i;
import n49.o;
import java.lang.StringBuilder;
import yx.j0;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import s09.c;
import erd.g;

public final class ThanosAdWebCardTachikomaPresenter$b implements Runnable	// class@00161b
{
    public boolean b;
    public boolean c;
    public final ThanosAdWebCardTachikomaPresenter d;

    public void ThanosAdWebCardTachikomaPresenter$b(ThanosAdWebCardTachikomaPresenter p0){
       this.d = p0;
       super();
    }
    public final void a(boolean p0){
       this.c = p0;
    }
    public final void b(boolean p0){
       this.b = p0;
    }
    public void run(){
       boolean b1;
       ThanosAdWebCardTachikomaPresenter l;
       ThanosAdWebCardTachikomaPresenter x;
       String str1;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, ThanosAdWebCardTachikomaPresenter$b.class, str)) {
          return;
       }
       ThanosAdWebCardTachikomaPresenter$b td = this.d;
       ThanosAdWebCardTachikomaPresenter$b tb = this.b;
       ThanosAdWebCardTachikomaPresenter$b tc = this.c;
       Objects.requireNonNull(td);
       ThanosAdWebCardTachikomaPresenter thanosAdWebC = ThanosAdWebCardTachikomaPresenter.class;
       if (!PatchProxy.isSupport(thanosAdWebC) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(tb), Boolean.valueOf(tc), td, thanosAdWebC, "18")) {
          boolean b = true;
          td.N = b;
          int i = 0;
          if (PatchProxy.isSupport(thanosAdWebC)) {
             ThanosAdWebCardTachikomaPresenter obj = PatchProxy.applyOneRefs(Boolean.valueOf(tc), td, thanosAdWebC, "8");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else if(td.H == b && td.W8()){
                obj = td.F;
                if (obj != null && (td.E != null && (!obj.getVisibility() && (tc != null || td.X8())))) {
                   b1 = true;
                }
             }
          label_0070 :
             b1 = false;
          }else {
             goto label_004e ;
          }
          if (b1) {
             if (!PatchProxy.isSupport(thanosAdWebC) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tb), td, thanosAdWebC, "19")) {
                d uod = new d(td, tb);
                ThanosAdWebCardTachikomaPresenter t = td.t;
                if (t == null) {
                   a.S("mPhoto");
                }
                PhotoAdvertisement photoAdverti = k.B(t);
                if (photoAdverti != null) {
                   PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
                   if (adData != null) {
                      adData = adData.mRequestEApiInfo;
                      if (adData != null) {
                         adData.setExpireIfDataNullWhenShowed();
                      }
                   }
                }
                t = td.E;
                if (t != null) {
                   if (td.L == null) {
                      td.L = new AdWebCardAnimationDelegate(t, td.F);
                   }
                   t = td.L;
                   if (t != null) {
                      thanosAdWebC = td.t;
                      if (thanosAdWebC == null) {
                         a.S("mPhoto");
                      }
                      PhotoAdvertisement photoAdverti1 = k.B(thanosAdWebC);
                      if (photoAdverti1 != null) {
                         PhotoAdvertisement$AdData adData1 = photoAdverti1.getAdData();
                         if (adData1 != null) {
                            adData1 = adData1.mAdCardTemplateInfo;
                            if (adData1 != null) {
                               objArray = Integer.valueOf(adData1.mAnimationStyle);
                            }
                         }
                      }
                      if (!PatchProxy.applyVoidOneRefs(objArray, t, AdWebCardAnimationDelegate.class, "5")) {
                         if (objArray != null) {
                            i = objArray.intValue();
                         }
                         t.g = i;
                      }
                   }
                   l = td.L;
                   if (l != null && !PatchProxy.applyVoidOneRefs(uod, l, a.class, str)) {
                      l.c(l.a, l.b, uod);
                   }
                   x = td.x;
                   if (x == null) {
                      a.S("mIsWebCardShowing");
                   }
                   x.set(Boolean.TRUE);
                }
             }
          }else if(!d.a(0x256720e1).ei() || PatchProxy.applyVoid(objArray, td, thanosAdWebC, "7")){
             l = td.H;
             if (l == -1) {
                str1 = "timeout";
             }else if(l != b){
                str1 = "h5error";
             }else {
                l = td.u;
                if (l == null) {
                   a.S("mPhotoAdActionBarClickProcessor");
                }
                if (l.c != null) {
                   str1 = "converted";
                }else if(!td.X8()){
                   str1 = "downloadStarted";
                }else {
                   str1 = "others";
                }
             }
             Object[] objArray1 = new Object[i];
             j0.l("TachikomaWebCard", "show webcard fail, reason: "+str1, objArray1);
             j0 oj0 = o.z();
             x = td.t;
             if (x == null) {
                a.S("mPhoto");
             }
             oj0.e(242, x.mEntity).d(new c(str1)).a();
          }
       }
    label_0188 :
       return;
    }
}
