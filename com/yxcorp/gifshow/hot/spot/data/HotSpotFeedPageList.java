package com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import s1b.b;
import jb5.d;
import com.yxcorp.gifshow.action.RealActionBizType;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$recoExtCollector$2;
import msd.a;
import qrd.p;
import qrd.s;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$onCreateRequest$1;
import ava.e;
import msd.l;
import erd.g;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$onCreateRequest$2;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.model.hotspot.HotsData;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import qc5.a;
import java.lang.System;
import java.lang.Math;
import wkd.b;
import zc5.b;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$b;
import java.util.concurrent.Callable;
import com.google.gson.JsonObject;
import r1b.b;
import com.yxcorp.gifshow.loadmore.config.LoadMorePolicy;
import java.lang.Boolean;
import qvb.a;
import la6.b;

public final class HotSpotFeedPageList extends d implements b	// class@001826
{
    public int C;
    public RealActionBizType D;
    public int E;
    public long F;
    public final p G;
    public String H;
    public HotSpotModel I;
    public HotSpotModel J;
    public JsonObject K;

    public void HotSpotFeedPageList(){
       super();
       this.D = RealActionBizType.HOT_SPOT;
       this.G = s.c(HotSpotFeedPageList$recoExtCollector$2.INSTANCE);
    }
    public t I1(){
       t obj = PatchProxy.apply(null, this, HotSpotFeedPageList.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.I1();
       this.N2(0);
       obj = this.Q2().observeOn(d.a).doOnNext(new e(new HotSpotFeedPageList$onCreateRequest$1(this))).doOnNext(new e(new HotSpotFeedPageList$onCreateRequest$2(this))).doOnError(new HotSpotFeedPageList$a(this));
       a.o(obj, "requestFeedFromNetwork\(\)¡­rror { onNetworkError\(\) }");
       return obj;
    }
    public void K2(HomeFeedResponse p0,List p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotSpotFeedPageList.class, "8")) {
          return;
       }
       super.K2(p0, p1);
       int i = 1;
       if (this.C == i) {
          if (p1 != null && !p1.isEmpty()) {
             i = 0;
          }
          HotsData hotsData = null;
          if (!i && p0 != null) {
             HomeFeedResponse mHotsData = p0.mHotsData;
             if (mHotsData != null) {
                HotsData mHotSpotToda = mHotsData.mPopular;
                if (mHotSpotToda != null) {
                   str = mHotSpotToda.mTitleName;
                label_002e :
                   this.H = str;
                   if (p0 != null) {
                      mHotsData = p0.mHotsData;
                      if (mHotsData != null) {
                         mHotSpotToda = mHotsData.mHotSpotToday;
                      label_003a :
                         this.I = mHotSpotToda;
                         if (p0 != null) {
                            mHotsData = p0.mHotsData;
                            if (mHotsData != null) {
                               mHotSpotToda = mHotsData.mHotSpotInterest;
                            label_0046 :
                               this.J = mHotSpotToda;
                               if (p0 != null) {
                                  p0 = p0.mHotsData;
                                  if (p0 != null) {
                                     hotsData = p0.bigEvent;
                                  }
                               }
                               this.K = hotsData;
                            }
                         }
                         mHotSpotToda = hotsData;
                         goto label_0046 ;
                      }
                   }
                   mHotSpotToda = hotsData;
                   goto label_003a ;
                }
             }
          }
          str = hotsData;
          goto label_002e ;
       }
       return;
    }
    public void M1(Object p0,List p1){
       this.K2(p0, p1);
    }
    public t Q2(){
       a obj = PatchProxy.apply(null, this, HotSpotFeedPageList.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Y2();
       a.o(obj, "recoExtCollector");
       String str = obj.a();
       this.C = this.u;
       long l = System.currentTimeMillis();
       if (Math.abs((l - this.F)) - (long)300 > 0) {
          b.a(-869999145).h();
       }
       this.F = l;
       t ot = t.defer(new HotSpotFeedPageList$b(this, str)).subscribeOn(d.c);
       a.o(ot, "Observable.defer {\n     ¡­eOn\(KwaiSchedulers.ASYNC\)");
       return ot;
    }
    public final JsonObject W2(){
       return this.K;
    }
    public void X(b p0){
       b l = (p0 != null)? p0.l: null;
       this.E = (l == null)? 0: p0.l.mPageSize;
       return;
    }
    public final HotSpotModel X2(){
       return this.J;
    }
    public final a Y2(){
       Object obj = PatchProxy.apply(null, this, HotSpotFeedPageList.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getValue();
    }
    public final HotSpotModel Z2(){
       return this.I;
    }
    public final boolean a3(){
       Object obj = PatchProxy.apply(null, this, HotSpotFeedPageList.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.H == null && (this.I == null && (this.J == null && !super.isEmpty())))? true: false;
       return b;
    }
    public void d2(b p0,List p1){
       this.K2(p0, p1);
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, HotSpotFeedPageList.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.isEmpty() && (this.H == null && (this.I == null && this.J == null)))? true: false;
       return b;
    }
    public int t2(){
       return 15;
    }
    public int w2(){
       return 0x272c;
    }
    public String z2(){
       return "hot_spot";
    }
}
