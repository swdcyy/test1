package com.kuaishou.lite.presenter.LiveLiteCustomAdLogPresenter;
import com.kuaishou.lite.presenter.LiveLiteBaseAdLogPresenter;
import com.kuaishou.lite.presenter.LiveLiteCustomAdLogPresenter$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import kotlin.jvm.internal.a;
import ekd.y0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.util.Collection;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ListIterator;
import java.lang.Number;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mxb.j0;
import java.lang.Math;
import java.lang.StringBuilder;
import yx.j0;
import java.util.Iterator;
import c93.b;
import mq5.b;
import d93.a;
import e93.c;
import z1.k;
import e93.d;
import z1.a;
import com.kuaishou.lite.presenter.LiveLiteCustomAdLogPresenter$b;
import tkd.b;
import tkd.d;
import nl9.r;
import mxb.e;

public final class LiveLiteCustomAdLogPresenter extends LiveLiteBaseAdLogPresenter	// class@000943
{
    public b I;
    public c J;
    public List K;
    public static final LiveLiteCustomAdLogPresenter$a L;

    static {
       LiveLiteCustomAdLogPresenter.L = new LiveLiteCustomAdLogPresenter$a(null);
    }
    public void LiveLiteCustomAdLogPresenter(){
       super();
    }
    public void E8(){
       ArrayList uArrayList;
       int i3;
       Object[] obj;
       boolean b;
       int[] a;
       LiveLiteCustomAdLogPresenter liveLiteCust = LiveLiteCustomAdLogPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteCust, "3")) {
          return;
       }
       super.E8();
       PhotoAdvertisement photoAdverti = k.B(this.h9());
       if (photoAdverti != null) {
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\) ?: return");
          if (this.k9() == null) {
             this.c9();
          }
          PhotoAdvertisement mAdData = photoAdverti.mAdData;
          int i = 1;
          if (mAdData != null) {
             PhotoAdvertisement$AdData mPlayedRepor = mAdData.mPlayedReportTime;
             if (mPlayedRepor != null && (mPlayedRepor.isEmpty() ^ i) == i) {
                uArrayList = new ArrayList(photoAdverti.mAdData.mPlayedReportTime);
             }else {
             label_0041 :
                mAdData = photoAdverti.mAdLiveForFansTop;
                if (mAdData != null) {
                   PhotoAdvertisement$FanstopLiveInfo mAdData1 = mAdData.mAdData;
                   if (mAdData1 != null) {
                      mPlayedRepor = mAdData1.mPlayedReportTime;
                      if (mPlayedRepor != null && (mPlayedRepor.isEmpty() ^ i) == i) {
                         uArrayList = new ArrayList(photoAdverti.mAdLiveForFansTop.mAdData.mPlayedReportTime);
                      }
                   }
                }
                uArrayList = new ArrayList(i);
             }
          }else {
             goto label_0041 ;
          }
          this.K = uArrayList;
          if (!PatchProxy.applyVoid(objArray, this, liveLiteCust, "7")) {
             LiveLiteCustomAdLogPresenter tK = this.K;
             if (tK != null) {
                int i1 = 15;
                if (tK.size() > i1) {
                   tK = CollectionsKt___CollectionsKt.J5(tK.subList(0, i1));
                }
                if (!PatchProxy.applyVoidOneRefs(tK, this, liveLiteCust, "9")) {
                   ListIterator listIterator1 = tK.listIterator();
                   while (listIterator1.hasNext()) {
                      i3 = listIterator1.next().intValue();
                      if (PatchProxy.isSupport(liveLiteCust)) {
                         obj = PatchProxy.applyOneRefs(Integer.valueOf(i3), this, liveLiteCust, "10");
                         if (obj != PatchProxyResult.class) {
                            b = obj.booleanValue();
                         }else {
                         label_00c3 :
                            a = j0.a;
                            int len = a.length;
                            int i4 = 0;
                            while (true) {
                               if (i4 < len) {
                                  int i5 = i3 - a[i4];
                                  if (2000 > Math.abs(i5)) {
                                     b = true;
                                  }else {
                                     i4 = i4 + 1;
                                  }
                               }else {
                                  b = false;
                               }
                            }
                         }
                      }else {
                         goto label_00c3 ;
                      }
                      if (b) {
                         listIterator1.remove();
                         obj = new Object[0];
                         j0.l("LiveLiteBaseAdLogPresenter", "filter config point around anchor, duration: "+i3, obj);
                      }else {
                         continue ;
                      }
                   }
                }
                if (!PatchProxy.applyVoidOneRefs(tK, this, liveLiteCust, "8") && tK.size() > i) {
                   ListIterator listIterator = tK.listIterator();
                   int i2 = listIterator.next().intValue();
                   while (listIterator.hasNext()) {
                      i = listIterator.next().intValue();
                      i3 = i - i2;
                      if (2000 > Math.abs(i3)) {
                         listIterator.remove();
                         Object[] objArray1 = new Object[0];
                         j0.l("LiveLiteBaseAdLogPresenter", "filter config point , duration: "+i, objArray1);
                      }else {
                         i2 = i;
                      }
                   }
                }
                this.K = tK;
             }
          }
          liveLiteCust = this.K;
          if (liveLiteCust != null) {
             liveLiteCust.add(0, Integer.valueOf(0));
          }
          this.t9();
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCustomAdLogPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       super.X8(p0);
       this.I = p0.a(b.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCustomAdLogPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       super.Y8(p0);
       this.J = p0.a(c.class);
       return;
    }
    public void o9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteCustomAdLogPresenter.class, "4")) {
          return;
       }
       LiveLiteCustomAdLogPresenter tK = this.K;
       if (tK != null) {
          String str = "LiveLiteBaseAdLogPresenter";
          int i = 0;
          if (this.l9() >= tK.size()) {
             Object[] objArray1 = new Object[i];
             j0.a(str, "all play time has reported", objArray1);
             LiveLiteBaseAdLogPresenter.B9(this, i, i, 2, objArray);
             return;
          }else {
             k ok = this.e9();
             if (ok != null) {
                d uod = ok.get();
                if (uod != null && uod.W1() == true) {
                   int i1 = tK.get(this.l9()).intValue();
                   if (this.j9() - (long)i1 >= 0) {
                      Object[] objArray2 = new Object[i];
                      j0.f(str, "report:"+i1, objArray2);
                      if (!i1) {
                         LiveLiteBaseAdLogPresenter.s9(this, 68, null, null, 6, null);
                      }else {
                         LiveLiteBaseAdLogPresenter.s9(this, 69, new LiveLiteCustomAdLogPresenter$b(i1), null, 4, null);
                      }
                      this.u9((this.l9() + 1));
                   }
                }
             }
          }
       }
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, LiveLiteCustomAdLogPresenter.class, "11")) {
          return;
       }
       super.reset();
       QPhoto qPhoto = this.h9();
       if (qPhoto != null) {
          b uob = d.a(0x691527a8);
          a.o(uob, "PluginManager.get\(Commer¡­alLivePlugin::class.java\)");
          uob.Uw().b(qPhoto, 2);
       }
       return;
    }
    public void x9(){
       if (PatchProxy.applyVoid(null, this, LiveLiteCustomAdLogPresenter.class, "5")) {
          return;
       }
       y0 oy0 = this.k9();
       if (oy0 != null && !oy0.c()) {
          oy0 = this.k9();
          if (oy0 != null) {
             oy0.d();
          }
          QPhoto qPhoto = this.h9();
          if (qPhoto != null) {
             b uob = d.a(0x691527a8);
             a.o(uob, "PluginManager.get\(Commer¡­alLivePlugin::class.java\)");
             uob.Uw().c(qPhoto, 2);
          }
       }
    label_003e :
       return;
    }
    public void y9(boolean p0,boolean p1){
       LiveLiteCustomAdLogPresenter liveLiteCust = LiveLiteCustomAdLogPresenter.class;
       if (PatchProxy.isSupport(liveLiteCust) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, liveLiteCust, "6")) {
          return;
       }
       y0 oy0 = this.k9();
       if (oy0 != null) {
          oy0.e();
       }
       QPhoto qPhoto = this.h9();
       if (qPhoto != null && p0) {
          b uob = d.a(0x691527a8);
          a.o(uob, "PluginManager.get\(Commer¡­alLivePlugin::class.java\)");
          uob.Uw().a(qPhoto, 2);
       }
       return;
    }
}
