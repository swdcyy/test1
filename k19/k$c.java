package k19.k$c;
import d6a.a;
import k19.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c$b;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import crd.a;
import java.lang.Runnable;
import k19.b;
import com.kwai.library.widget.viewpager.RecyclerViewPager$b;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo;
import tw.j;
import java.util.ArrayList;
import com.yxcorp.gifshow.widget.SwipeLayout;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import com.yxcorp.gifshow.profile.widget.ConsumeScrollRecyclerViewPager;
import android.content.Context;
import lnc.a1;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.ad.detail.widget.RecyclerViewPagerIndicator;
import k19.t;
import yx.j0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import k19.d;
import k19.f;
import erd.g;
import crd.b;
import brd.t;
import k19.l;
import k19.m;
import k19.n;

public class k$c extends a	// class@002a86
{
    public ViewTreeObserver$OnGlobalLayoutListener b;
    public final k c;

    public void k$c(k p0){
       this.c = p0;
       super();
       this.b = null;
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, k$c.class, "3")) {
          return;
       }
       this.a();
       return;
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$c.class, "2")) {
          return;
       }
       if (this.c.getActivity() != null && this.c.getActivity() instanceof GifshowActivity) {
          this.c.getActivity().getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.c.K);
       }
       ViewTreeObserver viewTreeObse = this.c.w.getViewTreeObserver();
       if (viewTreeObse != null) {
          k$c tb = this.b;
          if (tb != null) {
             viewTreeObse.removeOnGlobalLayoutListener(tb);
          }
       }
       this.c.F.d();
       k$c tc = this.c;
       tc.w.removeCallbacks(tc.H);
       tc = this.c;
       tc.w.removeCallbacks(tc.G);
       this.c.w.setVisibility(8);
       k a = this.c.A;
       if (a != null) {
          a.d();
          this.c.A.c(objArray);
          tc = this.c;
          tc.A = objArray;
          tc.D = 0;
       }
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, k$c.class, "4")) {
          return;
       }
       this.c.x.setTranslationX(0);
       k$c tc = this.c;
       tc.w.setTranslationX((float)(- tc.E));
       return;
    }
    public void i2(){
       Object[] objArray2;
       k$c uoc = k$c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
          return;
       }
       k$c tc = this.c;
       View view = tc.m8();
       Objects.requireNonNull(tc);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       if (!PatchProxy.applyVoidOneRefs(view, tc, ok, "7")) {
          k v = tc.v;
          tc.w = (v != null && v.getParent() != null)? tc.v.inflate(): view.findViewById(0x7f0a0ee0);
          LinearLayout linearLayout = view.findViewById(R.id.ll_pager_root);
          if (linearLayout.getChildCount() > 1) {
             linearLayout.removeViewAt(false);
          }
          v = PatchProxy.apply(objArray, tc, ok, "13");
          if (v != patchProxyRe) {
          }else if(!q.f(tc.B)){
             v = tc.B;
          }else {
             PhotoAdvertisement$MerchandiseInfo merchandiseI = j.r(tc.p);
             if (merchandiseI == null) {
                objArray2 = objArray;
             }else {
                PhotoAdvertisement$MerchandiseInfo mDiscountInf = merchandiseI.mDiscountInfoList;
                ArrayList uArrayList = new ArrayList();
                if (!q.f(mDiscountInf)) {
                   uArrayList.addAll(mDiscountInf);
                }
                merchandiseI = merchandiseI.mMerchandiseItemInfoList;
                if (!q.f(merchandiseI)) {
                   uArrayList.addAll(merchandiseI);
                }
                objArray2 = uArrayList;
             }
          }
          tc.B = v;
          k y = tc.y;
          if (y != null) {
             tc.t.l(y);
          }
          ConsumeScrollRecyclerViewPager uConsumeScro = PatchProxy.apply(objArray, tc, ok, "10");
          if (uConsumeScro != patchProxyRe) {
          }else {
             uConsumeScro = new ConsumeScrollRecyclerViewPager(tc.getActivity());
             uConsumeScro.setFadingEdgeLength(a1.d(R.dimen.arg_RES_7f070329));
             uConsumeScro.setHorizontalFadingEdgeEnabled(true);
             uConsumeScro.setLayoutParams(new LinearLayout$LayoutParams(-1, -2));
          }
          tc.y = uConsumeScro;
          tc.t.a(uConsumeScro);
          linearLayout.addView(tc.y, false);
          tc.z = linearLayout.findViewById(0x7f0a34e2);
          t ot = new t(tc.p);
          if (q.f(v)) {
             Object[] objArray1 = new Object[false];
             j0.a("AdDetailECommercePresenter", "initView itemList is empty", objArray1);
          }else {
             tc.C = v.size();
             ot.W0(v);
             tc.y.setAdapter(ot);
             if (v.size() > 1) {
                tc.z.setVisibility(false);
                tc.z.j(tc.y, v.size());
                tc.X8(true);
             }else {
                tc.z.setVisibility(8);
                tc.X8(false);
             }
             tc.X7(ot.y.subscribe(new d(tc), f.b));
          }
       }
       if (this.c.getActivity() != null && this.c.getActivity() instanceof GifshowActivity) {
          this.c.getActivity().getSupportFragmentManager().registerFragmentLifecycleCallbacks(this.c.K, false);
       }
       tc = this.c;
       tc.F.c(tc.r.subscribe(new l(this), m.b));
       this.a();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          this.b = new n(this);
          ViewTreeObserver viewTreeObse = this.c.w.getViewTreeObserver();
          if (viewTreeObse != null) {
             viewTreeObse.addOnGlobalLayoutListener(this.b);
          }
       }
       this.c.I.clear();
       return;
    }
}
