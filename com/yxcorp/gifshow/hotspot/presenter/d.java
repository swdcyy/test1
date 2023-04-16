package com.yxcorp.gifshow.hotspot.presenter.d;
import com.yxcorp.gifshow.hotspot.presenter.e;
import q99.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.hotspot.presenter.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import joc.y;
import bwa.b;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta$CardData;
import com.yxcorp.gifshow.commoninsertcard.entity.TrendingCard;
import vkc.b;
import com.yxcorp.gifshow.commoninsertcard.entity.TrendingCard$SlidePlayUnit;
import com.yxcorp.gifshow.hotspot.presenter.a;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import java.util.List;
import android.view.ViewGroup;
import g9c.a;
import java.util.Map;
import kwa.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import kwa.a;
import fwa.d;
import fwa.b;
import y8c.g;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$o;
import java.lang.Runnable;
import ekd.k1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.hotspot.utils.a;
import java.lang.Integer;
import java.lang.reflect.Field;
import java.lang.Exception;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$n;
import gwa.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import kwa.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.hotspot.presenter.b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Number;
import java.util.Iterator;
import kwa.d;
import ekd.m1;

public class d extends e	// class@0018e8
{
    public RecyclerView A;
    public d B;
    public a C;
    public final a D;
    public final RecyclerView$r E;
    public List r;
    public Map s;
    public b t;
    public BaseFragment u;
    public CommonInsertCardFeed v;
    public b w;
    public LinearLayoutManager x;
    public RecyclerView$n y;
    public f z;

    public void d(a p0){
       super();
       this.r = new ArrayList();
       this.E = new d$a(this);
       this.D = p0;
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "5")) {
          return;
       }
       y.b(this.A);
       if (this.w == null) {
          b uob = new b(this.v, this.D, this.u);
          this.w = uob;
          this.A.setAdapter(uob);
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "8")) {
          d tv = this.v;
          if (tv != null) {
             CommonInsertCardFeed mCommonInser = tv.mCommonInsertCardFeedMeta;
             if (mCommonInser != null) {
                CommonInsertCardFeedMeta mCardData = mCommonInser.mCardData;
                if (mCardData != null) {
                   CommonInsertCardFeedMeta$CardData mTrendingCar = mCardData.mTrendingCard;
                   if (mTrendingCar != null && mTrendingCar.mSlidePlayUnit != null) {
                      if (!PatchProxy.applyVoid(objArray, this, uod, "9") && b.b()) {
                         q.c(this.v.mCommonInsertCardFeedMeta.mCardData.mTrendingCard.mSlidePlayUnit.mQPhotos, a.a);
                      }
                      this.r.addAll(this.v.mCommonInsertCardFeedMeta.mCardData.mTrendingCard.mSlidePlayUnit.mQPhotos);
                   }
                }
             }
          }
       }
       if (q.f(this.r)) {
          this.A.setVisibility(8);
       }else {
          this.A.setVisibility(0);
          this.w.W0(this.r);
          this.w.k0();
       }
       if (this.s.containsKey(this.v)) {
          this.z = this.s.get(this.v);
       }else {
          f uof = new f();
          this.z = uof;
          this.s.put(this.v, uof);
       }
       this.x.scrollToPositionWithOffset(this.z.b(), this.z.a());
       uod = this.C;
       if (uod == null) {
          this.C = new a(this.v);
       }else {
          uod.b = this.v;
       }
       if (this.B == null) {
          this.B = new d(this.C, this.A, this.w);
       }
       uod = this.B;
       Objects.requireNonNull(uod);
       if (!PatchProxy.applyVoid(objArray, uod, d.class, "1")) {
          uod.a.addOnChildAttachStateChangeListener(uod.f);
          k1.r(uod.c, 100);
       }
       return;
    }
    public void F8(){
       int i1;
       b uob;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       super.F8();
       LinearLayoutManager linearLayout = new LinearLayoutManager(this.getActivity());
       this.x = linearLayout;
       linearLayout.setOrientation(0);
       this.A.setLayoutManager(this.x);
       this.A.setItemAnimator(objArray);
       this.A.addOnScrollListener(this.E);
       a uoa = new a();
       d tA = this.A;
       int i = 6000;
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(tA, Integer.valueOf(i), objArray, uoa1, "12")) {
          try{
             Field declaredFiel = tA.getClass().getDeclaredField("mMaxFlingVelocity");
             declaredFiel.setAccessible(true);
             declaredFiel.set(tA, Integer.valueOf(i));
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       super.H8();
       this.A.removeOnScrollListener(this.E);
       d tw = this.w;
       if (tw != null) {
          tw.Z0();
       }
       tw = this.t;
       if (tw != null) {
          tw.dispose();
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "6")) {
          return;
       }
       d tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, d.class, "2")) {
          tB.a.removeOnChildAttachStateChangeListener(tB.f);
          k1.m(tB.c);
       }
       return;
    }
    public View P8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.h0().getLayoutManager().findViewByPosition(p0);
    }
    public int R8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (!q.f(this.r) && p0 != null) {
          Iterator iterator = this.r.iterator();
          while (iterator.hasNext()) {
             if (p0.equals(iterator.next())) {
                i = this.w.P0(p0);
                break ;
             }
          }
       }
       return i;
    }
    public void S8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "13")) {
          return;
       }
       super.S8(p0);
       uod = this.x;
       if (uod != null) {
          uod.scrollToPositionWithOffset(p0, (a1.d(R.dimen.arg_RES_7f07034b) * 2));
       }
       RxBus.f.b(new d(this.getActivity().hashCode(), this.v));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.A = m1.f(p0, 0x7f0a06d2);
       return;
    }
    public RecyclerView h0(){
       return this.A;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       super.j8();
       this.u = this.r8("FRAGMENT");
       this.v = this.q8(CommonInsertCardFeed.class);
       this.s = this.r8("HOTSPOT_LIST_SCROLL_STATE");
       return;
    }
}
