package com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.pymk.slide.play.empty.b;
import com.yxcorp.gifshow.pymk.slide.play.empty.c;
import hka.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment$b;
import qvb.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e9c.k;
import y8c.t;
import z1.k;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import ekd.i;
import android.content.Context;
import androidx.fragment.app.Fragment;
import ekd.m1;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import le5.f;
import androidx.recyclerview.widget.RecyclerView;
import tkd.b;
import tkd.d;
import rx5.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import k7c.e;
import qvb.q;
import java.util.concurrent.atomic.AtomicBoolean;
import l17.a;
import k7c.b;
import k7c.c;
import java.util.Objects;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import ix6.g;
import java.util.List;
import k7c.d;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.Map;
import java.lang.Boolean;
import y8c.g;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment$a;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment$5;

public final class PymkDetailSlidePlayRecyclerFragment extends RecyclerFragment	// class@0016d6
{
    public a F;
    public k G;
    public KwaiGrootViewPager H;
    public f I;
    public SlidePlayViewModel J;
    public q K;
    public RecyclerView$r L;
    public static final int M;

    public void PymkDetailSlidePlayRecyclerFragment(){
       super();
       this.F = b.a;
       this.G = c.b;
    }
    public k Ah(){
       Object obj = PatchProxy.apply(null, this, PymkDetailSlidePlayRecyclerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PymkDetailSlidePlayRecyclerFragment$b(this, this, this.q());
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, PymkDetailSlidePlayRecyclerFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(PymkDetailSlidePlayRecyclerFragment.class, "8");
       return new k();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, PymkDetailSlidePlayRecyclerFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.get();
    }
    public boolean Eh(){
       return true;
    }
    public int M(){
       return 1;
    }
    public boolean Xg(){
       return false;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PymkDetailSlidePlayRecyclerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.h(p0, 0x7f0d12a0, p1, false, 2);
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PymkDetailSlidePlayRecyclerFragment.class, "2")) {
          return;
       }
       super.fh(p0, p1);
       int i = 0;
       if (i.c() && this.getContext() != null) {
          View view = m1.f(p0, R.id.mock_status_bar_padding_view);
          view.getLayoutParams().height = n.A(this.getContext());
          view.setVisibility(i);
       }
       if (!f.b()) {
          this.t.setClipToPadding(true);
          View[] viewArray = new View[true];
          viewArray[i] = p0;
          d.a(0x77cfa10c).Qa(this, viewArray);
       }
       Object[] objArray = null;
       String str = "5";
       if (!PatchProxy.applyVoid(objArray, this, PymkDetailSlidePlayRecyclerFragment.class, str)) {
          if (this.getParentFragment() != null) {
             objArray = this.getParentFragment().getParentFragment();
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(objArray);
          this.J = slidePlayVie;
          if (slidePlayVie != null) {
             e uoe = new e(this);
             this.K = uoe;
             this.J.e(uoe);
          }
       }
       if (this.H != null) {
          AtomicBoolean uAtomicBoole = new AtomicBoolean();
          b uob = new b(a.a(this.h0()));
          PymkDetailSlidePlayRecyclerFragment tH = this.H;
          if (!PatchProxy.applyVoidThreeRefs(tH, uAtomicBoole, uob, this, PymkDetailSlidePlayRecyclerFragment.class, "3")) {
             c uoc = new c(this, uob, uAtomicBoole);
             this.I = uoc;
             Objects.requireNonNull(tH);
             if (!PatchProxy.applyVoidOneRefs(uoc, tH, KwaiGrootViewPager.class, str)) {
                if (tH.a2 == null) {
                   tH.a2 = new g();
                }
                KwaiGrootViewPager a2 = tH.a2;
                Objects.requireNonNull(a2);
                if (!PatchProxy.applyVoidOneRefs(uoc, a2, g.class, "2") && !a2.a.contains(uoc)) {
                   a2.a.add(uoc);
                }
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(uAtomicBoole, uob, this, PymkDetailSlidePlayRecyclerFragment.class, "4")) {
             this.L = new d(this, uob, uAtomicBoole);
             this.h0().addOnScrollListener(this.L);
          }
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d12a0;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PymkDetailSlidePlayRecyclerFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PymkDetailSlidePlayRecyclerFragment.class, null);
       return objectsByTag;
    }
    public boolean lh(){
       return false;
    }
    public void onDestroyView(){
       PymkDetailSlidePlayRecyclerFragment tI;
       if (PatchProxy.applyVoid(null, this, PymkDetailSlidePlayRecyclerFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       PymkDetailSlidePlayRecyclerFragment tH = this.H;
       if (tH != null) {
          tI = this.I;
          if (tI != null) {
             Objects.requireNonNull(tH);
             Object obj = PatchProxy.applyOneRefs(tI, tH, KwaiGrootViewPager.class, "6");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }else {
                KwaiGrootViewPager a2 = tH.a2;
                if (a2 != null) {
                   obj = PatchProxy.applyOneRefs(tI, a2, g.class, "3");
                   boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a2.a.remove(tI);
                }
             }
             this.I = null;
          }
       }
       tH = this.J;
       if (tH != null) {
          tI = this.K;
          if (tI != null) {
             tH.b(tI);
             this.K = null;
             this.J = null;
          }
       }
       if (this.L != null) {
          this.h0().removeOnScrollListener(this.L);
          this.L = null;
       }
       return;
    }
    public int qh(){
       return 0x7f0a337a;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, PymkDetailSlidePlayRecyclerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PymkDetailSlidePlayRecyclerFragment$a(this);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, PymkDetailSlidePlayRecyclerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PymkDetailSlidePlayRecyclerFragment$5(this);
    }
}
