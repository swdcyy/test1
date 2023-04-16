package com.kuaishou.live.preview.item.presenter.ad.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.preview.item.presenter.ad.c$a;
import com.kuaishou.live.preview.item.presenter.ad.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import wk3.b;
import wk3.f;
import ekd.y0;
import com.kuaishou.live.preview.item.presenter.ad.b;
import java.lang.Runnable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mxb.j0;
import java.lang.Math;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.yxcorp.gifshow.autoplay.live.g;
import brd.t;
import jl3.b;
import el3.f;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import sx.d;
import el3.d;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import rx.b;
import rx.d;
import tkd.b;
import tkd.d;
import nl9.r;
import mxb.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c extends PresenterV2	// class@000e0b
{
    public final b A;
    public QPhoto p;
    public BaseFragment q;
    public b r;
    public g s;
    public f t;
    public SlidePlayViewModel u;
    public List v;
    public int w;
    public int x;
    public y0 y;
    public final LiveAutoPlay$b z;
    public static final String B = "c";

    public void c(){
       super();
       this.x = 0;
       this.z = new c$a(this);
       this.A = new c$b(this);
    }
    public void E8(){
       Iterator iterator;
       int i2;
       boolean i3;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "2")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(this.p);
       if (photoAdverti == null) {
          return;
       }
       this.u = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.t.f3(this.A);
       if (this.y == null && !PatchProxy.applyVoid(null, this, uoc, "5")) {
          this.y = new y0(500, new b(this));
       }
       PhotoAdvertisement mAdData = photoAdverti.mAdData;
       Integer integer = 1;
       if (mAdData != null && !q.f(mAdData.mPlayedReportTime)) {
          this.v = new ArrayList(photoAdverti.mAdData.mPlayedReportTime);
       }else {
          mAdData = photoAdverti.mAdLiveForFansTop;
          if (mAdData != null) {
             PhotoAdvertisement$FanstopLiveInfo mAdData1 = mAdData.mAdData;
             if (mAdData1 != null && !q.f(mAdData1.mPlayedReportTime)) {
                this.v = new ArrayList(photoAdverti.mAdLiveForFansTop.mAdData.mPlayedReportTime);
             }
          }
          this.v = new ArrayList(integer);
       }
       if (!PatchProxy.applyVoid(null, this, uoc, "8")) {
          c tv = this.v;
          if (tv != null) {
             int i = 15;
             if (tv.size() > i) {
                this.v = new ArrayList(this.v.subList(0, i));
             }
             if (!PatchProxy.applyVoid(null, this, uoc, "10")) {
                iterator = this.v.iterator();
                while (iterator.hasNext()) {
                   i2 = iterator.next().intValue();
                   if (PatchProxy.isSupport(uoc)) {
                      int[] obj = PatchProxy.applyOneRefs(Integer.valueOf(i2), this, uoc, "11");
                      if (obj != PatchProxyResult.class) {
                         i3 = obj.booleanValue();
                      }else {
                      label_00e3 :
                         obj = j0.a;
                         int len = obj.length;
                         int i4 = 0;
                         while (true) {
                            if (i4 < len) {
                               int i5 = i2 - obj[i4];
                               if (2000 > Math.abs(i5)) {
                                  i3 = true;
                               }else {
                                  i4 = i4 + 1;
                               }
                            }else {
                               i3 = false;
                            }
                         }
                      }
                   }else {
                      goto label_00e3 ;
                   }
                   if (i3) {
                      iterator.remove();
                      Log.n(c.B, "filter config point around anchor, duration: "+i2);
                   }else {
                      continue ;
                   }
                }
             }
             if (!PatchProxy.applyVoid(null, this, uoc, "9") && this.v.size() > integer) {
                iterator = this.v.iterator();
                int i1 = iterator.next().intValue();
                while (iterator.hasNext()) {
                   i2 = iterator.next().intValue();
                   i3 = i2 - i1;
                   if (2000 > Math.abs(i3)) {
                      iterator.remove();
                      Log.n(c.B, "filter config point , duration: "+i2);
                   }else {
                      i1 = i2;
                   }
                }
             }
          }
       }
       this.v.add(0, Integer.valueOf(0));
       if (a.t().d("adSimplePlayNewReport", 0)) {
          this.s.P(this.z);
       }else if(PatchProxy.applyVoid(null, this, uoc, "3")){
          this.X7(this.r.c().distinctUntilChanged().subscribe(new f(this), Functions.e));
       }
       d.P8().T0(this.p.mEntity, "", null, 0);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.s.Z(this.z);
       this.t.I1(this.A);
       this.R8(true);
       d.a(0x691527a8).Uw().b(this.p, 2);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       c ty = this.y;
       if (ty != null) {
          ty.d();
       }
       d.a(0x691527a8).Uw().c(this.p, 2);
       return;
    }
    public void R8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "7")) {
          return;
       }
       uoc = this.y;
       if (uoc != null) {
          uoc.e();
       }
       if (p0) {
          d.a(0x691527a8).Uw().a(this.p, 2);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.r = this.r8("LIVE_PLAY_STATE");
       this.q = this.r8("DETAIL_FRAGMENT");
       this.s = this.r8("LIVE_SIMPLE_PLAY_MODULE");
       this.t = this.r8("LIVE_PREVIEW_LIFECYCLE_SERVICE");
       return;
    }
}
