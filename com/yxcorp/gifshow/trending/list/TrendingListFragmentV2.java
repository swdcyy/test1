package com.yxcorp.gifshow.trending.list.TrendingListFragmentV2;
import syb.a;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import ykc.c;
import java.util.ArrayList;
import java.lang.String;
import com.yxcorp.gifshow.entity.TrendingInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xkc.a;
import tkc.i;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.trending.list.TrendingSubListFragment;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.TrendingTitleInfo;
import com.yxcorp.gifshow.trending.list.TrendingListFragmentV2$b;
import java.lang.StringBuilder;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import android.text.TextPaint;
import android.os.Bundle;
import com.yxcorp.gifshow.entity.TrendingListRequestInfo;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.viewpager.widget.ViewPager;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.HorizontalScrollView;
import com.facebook.drawee.view.SimpleDraweeView;
import n3d.a;
import java.lang.Runnable;
import java.lang.Long;
import tkc.b;
import q87.c;
import k2b.i3;
import alc.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Map;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.trending.list.TrendingListFragmentV2$c;
import android.animation.Animator$AnimatorListener;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import zf6.k;
import qvb.a;
import java.util.Collection;
import ekd.q;
import k2b.e0;
import com.yxcorp.gifshow.trending.list.f;
import ykc.v;
import java.util.HashMap;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.b;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import ykc.a;
import xb.t$b;
import com.yxcorp.gifshow.trending.list.TrendingListFragmentV2$a;
import androidx.viewpager.widget.ViewPager$i;
import zkc.r;
import zkc.a;
import rkd.b;
import zkc.b;
import ykc.k;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout$c;
import ykc.j;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import ykc.l;
import erd.g;

public class TrendingListFragmentV2 extends TabHostFragment implements a, g	// class@001dae
{
    public NestedParentRelativeLayout B;
    public View C;
    public PresenterV2 D;
    public i E;
    public PublishSubject F;
    public PublishSubject G;
    public c H;
    public String I;
    public PublishSubject J;
    public PublishSubject K;
    public int L;
    public TrendingListRequestInfo M;
    public String N;
    public ImageView O;
    public TextView P;
    public KwaiImageView Q;
    public View R;
    public c S;
    public String T;
    public final List U;
    public b U0;
    public final List V;
    public String V0;
    public final List W;
    public boolean W0;
    public boolean X;
    public boolean X0;
    public i3 Y;
    public boolean Y0;
    public boolean Z;
    public Runnable Z0;
    public a a1;
    public Map b1;
    public static final int c1;

    public void TrendingListFragmentV2(){
       super();
       this.F = PublishSubject.g();
       this.G = PublishSubject.g();
       this.H = a.g();
       this.J = PublishSubject.g();
       this.S = new c();
       this.U = new ArrayList();
       this.V = new ArrayList();
       this.W = new ArrayList();
       this.X = true;
       this.Z = false;
       this.Y0 = false;
    }
    public void A8(String p0){
       this.I = p0;
    }
    public void B6(TrendingInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TrendingListFragmentV2.class, "22")) {
          return;
       }
       TrendingListFragmentV2 tF = this.F;
       if (tF != null) {
          tF.onNext(new a(p0, null));
       }
       return;
    }
    public void Bb(){
       if (PatchProxy.applyVoid(null, this, TrendingListFragmentV2.class, "21")) {
          return;
       }
       Fragment uFragment = this.t();
       if (uFragment instanceof TrendingSubListFragment) {
          uFragment.q().a();
       }
       return;
    }
    public void D3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TrendingListFragmentV2.class, "19")) {
          return;
       }
       this.Y0 = true;
       if (TextUtils.n(p0, "USER_TAG_SEARCH")) {
          this.W0 = true;
          this.X0 = true;
       }
       return;
    }
    public void G5(List p0){
       String title;
       PagerSlidingTabStrip$d uod;
       Bundle uBundle;
       PatchProxyResult patchProxyRe1;
       TrendingListRequestInfo trendingList = this;
       List list = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(list, trendingList, TrendingListFragmentV2.class, "2")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       String str = 1;
       while (i < p0.size()) {
          title = list.get(i).getTitle();
          trendingList.U.add(i, list.get(i).mBackgroundUrl);
          trendingList.V.add(i, list.get(i).mDarkBackgroundUrl);
          trendingList.W.add(i, list.get(i).mTrendingType);
          String str1 = title+i;
          TrendingSubListFragment obj = PatchProxy.applyTwoRefs(str1, title, trendingList, TrendingListFragmentV2.class, "13");
          if (obj != patchProxyRe) {
             uod = obj;
          }else {
             TextView textView = a.a(this.getActivity(), R.layout.arg_RES_7f0d1636);
             textView.setText(title);
             textView.getPaint().setFakeBoldText(str);
             uod = new PagerSlidingTabStrip$d(str1, textView);
          }
          obj = TrendingSubListFragment.class;
          TrendingTitleInfo mTrendingTyp = list.get(i).mTrendingType;
          TrendingListFragmentV2$b obj1 = PatchProxy.applyOneRefs(mTrendingTyp, trendingList, TrendingListFragmentV2.class, "11");
          if (obj1 != patchProxyRe) {
             uBundle = obj1;
             patchProxyRe1 = patchProxyRe;
          }else {
             Bundle uBundle1 = new Bundle();
             if (trendingList.M == null) {
                trendingList.M = new TrendingListRequestInfo();
             }
             TrendingListFragmentV2 m = trendingList.M;
             patchProxyRe1 = patchProxyRe;
             TrendingListRequestInfo trendingList2 = new TrendingListRequestInfo(m.mPhotoId, mTrendingTyp, m.mCurrentPlayTrendingInfoId, m.mTrendingRequestSource, m.mTrendingRequestListInfo, trendingList.I, trendingList.N, m.mTrendingSource, m.mLocation);
             SerializableHook.putSerializable(uBundle1, "TRENDING_LIST_REQUEST_INFO", str);
             uBundle = uBundle1;
          }
          obj1 = new TrendingListFragmentV2$b(this, uod, obj, uBundle, p0);
          uArrayList.add(v12);
          List list1 = p0;
          TrendingListFragmentV2 trendingList1 = this;
          if ((list1.get(i).mTrendingType).equals(trendingList1.I)) {
             trendingList1.L = i;
          }
          i = i + 1;
          list = list1;
          trendingList = trendingList1;
          patchProxyRe = patchProxyRe1;
       }
       boolean b = trendingList;
       patchProxyRe1 = patchProxyRe;
       b.u.setOffscreenPageLimit(p0.size());
       b.Kh(uArrayList);
       TrendingListFragmentV2 l = b.L;
       if (l != null) {
          b.X = false;
       }
       b.Gh(l, null);
       boolean i1 = p0.size();
       if (PatchProxy.isSupport(TrendingListFragmentV2.class)) {
          Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(i1), b, TrendingListFragmentV2.class, "4");
          if (obj2 != patchProxyRe1) {
             i1 = obj2.booleanValue();
          label_0155 :
             if (i1 != null) {
                this.zh().setVisibility(8);
             }else {
                this.zh().setVisibility(0);
                if (b.Q != null && b.L < b.U.size()) {
                   if (this.Sh()) {
                      b.Q.setImageURI(b.V.get(b.L));
                   }else {
                      b.Q.setImageURI(b.U.get(b.L));
                   }
                }
             }
             return;
          }
       }
       if (!this.Th() || i1 != str) {
          str = 0;
       }
       title = str;
       goto label_0155 ;
    }
    public void H9(a p0){
       this.a1 = p0;
    }
    public void I6(View p0,Runnable p1,boolean p2){
       TrendingListFragmentV2 trendingList = this;
       View view = p0;
       if (PatchProxy.isSupport(TrendingListFragmentV2.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, TrendingListFragmentV2.class, "8")) {
          return;
       }
       if (this.getView() != null && view) {
          this.Qh();
          int b = false;
          trendingList.Z = b;
          TrendingListFragmentV2 i = trendingList.I;
          TrendingListFragmentV2 b1 = trendingList.b1;
          Object[] objArray = null;
          Long longx = PatchProxy.apply(objArray, trendingList, TrendingListFragmentV2.class, "25");
          if (longx != PatchProxyResult.class) {
          }else {
             Object[] objArray1 = new Object[b];
             b.C().w("TrendingListFragmentV2", "getCurrentOpenTimeSliceSum", objArray1);
             TrendingListFragmentV2 longx2 = trendingList.Y;
             if (longx2 != null) {
                trendingList.Y = objArray;
                longx = Long.valueOf(longx2.k());
             }else {
                longx = Long.valueOf(0);
             }
          }
          long l = longx.longValue();
          ClientEvent$ElementPackage a longx1 = a.class;
          if (PatchProxy.isSupport(longx1)) {
             b = 1;
             if (PatchProxy.applyVoidFourRefs(i, Integer.valueOf(p2), b1, Long.valueOf(l), null, a.class, "11")) {
             label_00da :
                float[] uofloatArray = new float[]{0,(float)this.getView().getHeight()};
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.getView(), "translationY", uofloatArray);
                objectAnimat.setDuration(300);
                objectAnimat.addListener(new TrendingListFragmentV2$c(trendingList, p1, view));
                objectAnimat.start();
                if (this.t() != null) {
                   this.t().h0().setEnabled(false);
                }
             }
          }else {
             b = 1;
          }
          if (PatchProxy.isSupport(longx1)) {
             longx1 = PatchProxy.applyFourRefs(i, Integer.valueOf(p2), b1, Long.valueOf(l), null, a.class, "26");
             if (longx1 != PatchProxyResult.class) {
             label_00d7 :
                u1.u(b, longx1, objArray);
                goto label_00da ;
             }
          }
          longx1 = new ClientEvent$ElementPackage();
          longx1.name = "CLOSE_POPULAR_POPUP";
          longx1.action2 = "CLOSE_POPULAR_POPUP";
          i3 oi3 = a.e(b1);
          oi3.d("trending_type", i);
          oi3.c("popular_popup_stay_length", Long.valueOf(l));
          oi3.c("close_type", Integer.valueOf(p2));
          longx1.params = oi3.e();
          goto label_00d7 ;
       }
    label_011c :
       return;
    }
    public void L0(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TrendingListFragmentV2.class, "20")) {
          return;
       }
       this.b1 = p0;
       TrendingListFragmentV2 tJ = this.J;
       if (tJ != null) {
          tJ.onNext(p0);
       }
       return;
    }
    public final void Qh(){
       if (PatchProxy.applyVoid(null, this, TrendingListFragmentV2.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("TrendingListFragmentV2", "endCurrentOpenTimeSlice", objArray);
       TrendingListFragmentV2 tY = this.Y;
       if (tY != null) {
          tY.g();
       }
       return;
    }
    public String Rh(){
       TrendingListFragmentV2 obj = PatchProxy.apply(null, this, TrendingListFragmentV2.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj != null && obj.i2() != null) {
          return this.E.i2();
       }
       obj = this.V0;
       if (obj != null) {
          return obj;
       }
       return "";
    }
    public boolean Sh(){
       Object obj = PatchProxy.apply(null, this, TrendingListFragmentV2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k.d();
    }
    public final boolean Th(){
       TrendingListFragmentV2 obj = PatchProxy.apply(null, this, TrendingListFragmentV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.T;
       boolean b = (obj != null && obj.equals("nearby"))? true: false;
       return b;
    }
    public void Uh(String p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, TrendingListFragmentV2.class, "15")) {
          return;
       }
       String str = "TrendingListFragmentV2";
       int i = 0;
       if (p0 != null) {
          Object[] objArray = new Object[i];
          b.C().w(str, "showingTrendingDesc-"+p0, objArray);
       }
       TrendingListFragmentV2 tE = this.E;
       if (tE != null && !q.f(tE.getItems())) {
          List items = this.E.getItems();
          int i1 = 0;
          while (true) {
             if (i1 < items.size()) {
                TrendingInfo trendingInfo = items.get(i1);
                if (trendingInfo != null && TextUtils.n(trendingInfo.mDesc, p0)) {
                   objArray1 = new Object[i];
                   b.C().w(str, "onNext\(i\)"+i1, objArray1);
                   this.G.onNext(Integer.valueOf(i1));
                   return;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                objArray1 = new Object[i];
                b.C().w(str, "onNext\(-1\)", objArray1);
                this.G.onNext(Integer.valueOf(-1));
                break ;
             }
          }
       }
       return;
    }
    public void Vh(String p0){
       this.S.c = p0;
    }
    public final void Wh(){
       if (PatchProxy.applyVoid(null, this, TrendingListFragmentV2.class, "23")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("TrendingListFragmentV2", "startNewOpenTimeSlice", objArray);
       if (this.Y == null) {
          this.Y = new i3();
       }
       this.Y.p();
       return;
    }
    public void X8(View p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TrendingListFragmentV2.class, "7")) {
          return;
       }
       if (this.getView() != null && p0 != null) {
          a.l(this.I, this.b1, this.Rh(), this);
          this.Wh();
          this.Z = true;
          this.getView().post(new f(this, p0, p1));
       }
       return;
    }
    public void Z6(String p0){
       this.S.b = p0;
    }
    public void bf(TrendingListRequestInfo p0){
       this.M = p0;
    }
    public void c6(Runnable p0){
       this.Z0 = p0;
    }
    public void ee(String p0){
       this.S.d = p0;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TrendingListFragmentV2.class, "12")) {
          return;
       }
       super.fh(p0, p1);
       this.t.setTabGravity(3);
       this.t.setShouldReMeasure(false);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d1632;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TrendingListFragmentV2.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, TrendingListFragmentV2.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(TrendingListFragmentV2.class, new v());
       }else {
          obj.put(TrendingListFragmentV2.class, null);
       }
       return obj;
    }
    public void lb(String p0){
       this.V0 = p0;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TrendingListFragmentV2.class, "10")) {
          return;
       }
       super.onDestroyView();
       TrendingListFragmentV2 tD = this.D;
       if (tD != null) {
          tD.destroy();
       }
       tD = this.U0;
       if (tD != null) {
          tD.dispose();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TrendingListFragmentV2.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.B = p0.findViewById(0x7f0a2c2c);
       this.C = p0.findViewById(0x7f0a30b4);
       this.O = p0.findViewById(0x7f0a4073);
       this.P = p0.findViewById(0x7f0a2c31);
       this.Q = p0.findViewById(0x7f0a2c28);
       View view = p0.findViewById(R.id.trending_header_down_icon);
       this.R = view;
       if (this.X0 != null) {
          view.setBackgroundResource(R.drawable.common_base_close_24);
       }
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().w("TrendingListFragmentV2", "onViewCreated, onNext\(-1\)", objArray);
       this.G.onNext(Integer.valueOf(-1));
       b = true;
       int i1 = 8;
       if (this.Th()) {
          this.P.setText(R.string.arg_RES_7f104da0);
          this.O.setVisibility(i1);
          this.P.setVisibility(i);
          this.Q.setVisibility(i1);
          this.P.getPaint().setFakeBoldText(b);
       }else {
          this.P.setText(R.string.arg_RES_7f104da2);
          this.P.setVisibility(i1);
          this.O.setVisibility(i);
          this.O.setBackgroundResource(R.drawable.arg_RES_7f080c3f);
          this.Q.setVisibility(i);
          this.Q.getHierarchy().u(a.l);
       }
       this.u.addOnPageChangeListener(new TrendingListFragmentV2$a(this));
       if (!PatchProxy.applyVoid(null, this, TrendingListFragmentV2.class, "6")) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.D = presenterV2;
          presenterV2.f(this.getView());
          if (this.W0 == null) {
             this.D.U7(new r());
          }
          this.D.U7(new a());
          if (b.g()) {
             this.D.U7(new b());
          }
          objArray = new Object[b];
          objArray[i] = this;
          this.D.i(objArray);
       }
       if (this.Y0 != null && this.Z0 != null) {
          this.B.setOnDragListener(new k(this));
          p0.findViewById(R.id.more_trending_header).setOnClickListener(new j(this));
       }
       this.U0 = this.Vg().g().subscribe(new l(this));
       return;
    }
    public List wh(){
       Object obj = PatchProxy.apply(null, this, TrendingListFragmentV2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
}
