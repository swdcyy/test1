package com.kuaishou.commercial.search.live.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.search.live.d$a;
import com.kuaishou.commercial.search.live.d$b;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Object;
import java.lang.Integer;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.commercial.search.live.c;
import erd.g;
import vy.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import s99.i;
import com.yxcorp.gifshow.autoplay.widget.ConstraintAutoPlayCard;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import java.lang.StringBuilder;
import yx.j0;
import t99.y;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import ekd.y0;
import android.view.View;
import ekd.m1;

public class d extends PresenterV2	// class@001569
{
    public QPhoto p;
    public boolean q;
    public List r;
    public int s;
    public int t;
    public y0 u;
    public LiveAutoPlayModule v;
    public ConstraintAutoPlayCard w;
    public List x;
    public final y y;
    public final i z;
    public static final String A = "d";

    public void d(){
       super();
       this.t = 0;
       this.y = new d$a(this);
       this.z = new d$b(this);
    }
    public static void P8(d p0){
       p0.S8();
    }
    private void S8(){
       if (q.f(this.r)) {
          return;
       }
       if (this.t >= this.r.size()) {
          this.V8();
          return;
       }else if(this.q == null){
          return;
       }else {
          int i = this.r.get(this.t).intValue();
          if (this.s >= i) {
             if (!i) {
                i0.a().e(68, this.p.mEntity).d(c.b).a();
             }else {
                i0.a().e(69, this.p.mEntity).d(new d(i)).a();
             }
             this.t = this.t + 1;
          }
          this.s = this.s + 500;
          return;
       }
    }
    public void E8(){
       boolean b;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
          return;
       }
       if (!this.p.isLiveStream()) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(this.p);
       if (photoAdverti == null) {
          return;
       }
       this.x.add(this.z);
       this.w.y(this.z);
       PhotoAdvertisement mAdData = photoAdverti.mAdData;
       int i = 1;
       if (mAdData != null && !q.f(mAdData.mPlayedReportTime)) {
          this.r = new ArrayList(photoAdverti.mAdData.mPlayedReportTime);
       }else {
          mAdData = photoAdverti.mAdLiveForFansTop;
          if (mAdData != null) {
             PhotoAdvertisement$FanstopLiveInfo mAdData1 = mAdData.mAdData;
             if (mAdData1 != null && !q.f(mAdData1.mPlayedReportTime)) {
                this.r = new ArrayList(photoAdverti.mAdLiveForFansTop.mAdData.mPlayedReportTime);
             }
          }
          this.r = new ArrayList(i);
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "9")) {
          d tr = this.r;
          if (tr != null) {
             int i1 = 15;
             if (tr.size() > i1) {
                this.r = new ArrayList(this.r.subList(0, i1));
             }
             if (!PatchProxy.applyVoid(objArray, this, uod, "11")) {
                Iterator iterator1 = this.r.iterator();
                while (iterator1.hasNext()) {
                   int i4 = iterator1.next().intValue();
                   if (PatchProxy.isSupport(uod)) {
                      int[] obj = PatchProxy.applyOneRefs(Integer.valueOf(i4), this, uod, "12");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                      label_00cc :
                         obj = j0.a;
                         int len = obj.length;
                         int i5 = 0;
                         while (true) {
                            if (i5 < len) {
                               int i6 = i4 - obj[i5];
                               if (2000 > Math.abs(i6)) {
                                  b = true;
                               }else {
                                  i5 = i5 + 1;
                               }
                            }else {
                               b = false;
                            }
                         }
                      }
                   }else {
                      goto label_00cc ;
                   }
                   if (b) {
                      iterator1.remove();
                      Object[] objArray2 = new Object[0];
                      j0.l(d.A, "filter config point around anchor, duration: "+i4, objArray2);
                   }else {
                      continue ;
                   }
                }
             }
             if (!PatchProxy.applyVoid(objArray, this, uod, "10") && this.r.size() > i) {
                Iterator iterator = this.r.iterator();
                int i2 = iterator.next().intValue();
                while (iterator.hasNext()) {
                   int i3 = iterator.next().intValue();
                   i = i3 - i2;
                   if (2000 > Math.abs(i)) {
                      iterator.remove();
                      Object[] objArray1 = new Object[0];
                      j0.l(d.A, "filter config point , duration: "+i3, objArray1);
                   }else {
                      i2 = i3;
                   }
                }
             }
          }
       }
       this.r.add(0, Integer.valueOf(0));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.x.remove(this.z);
       this.w.A(this.z);
       return;
    }
    public void R8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "3")) {
          return;
       }
       if (this.p.isLiveStream() && this.p.isAd()) {
          uod = this.v;
          if (uod != null) {
             if (p0) {
                uod.O(this.y);
             }else {
                uod.e0(this.y);
                this.s = 0;
                this.t = 0;
             }
          }
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       d tu = this.u;
       if (tu != null) {
          tu.e();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a30e1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.v = this.t8("SEARCH_PLAY_LIVE_PLAY_MODULE");
       this.x = this.r8("SEARCH_PLAY_CARD_LISTENERS");
       return;
    }
}
