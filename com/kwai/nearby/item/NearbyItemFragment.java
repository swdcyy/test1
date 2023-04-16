package com.kwai.nearby.item.NearbyItemFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import elb.g0;
import pd7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import e9c.k;
import e9c.f;
import y8c.q;
import e9c.h;
import hka.k;
import e9c.h$b;
import e9c.a;
import y8c.t;
import db5.g;
import tc7.a;
import com.kwai.nearby.local.container.NearbySecondaryContainerFragment;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.f;
import com.kwai.nearby.tab.presenter.a;
import java.util.Objects;
import db5.b;
import androidx.recyclerview.widget.RecyclerView;
import g9c.d;
import lnc.a1;
import uh5.e;
import d6a.u;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kwai.component.homepage_interface.fragment.LazyLoadFragmentContainer;
import b9c.y;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import im8.c;
import java.lang.Number;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import qvb.i;
import jb5.d;
import hka.l;
import hka.j;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.DecoSafeStaggeredLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public abstract class NearbyItemFragment extends RecyclerFragment	// class@000f76
{
    public final e F;
    public final a G;
    public PresenterV2 H;
    public boolean I;

    public void NearbyItemFragment(){
       super();
       this.F = new g0();
       this.G = new a();
       this.I = false;
    }
    private void Hh(){
       if (PatchProxy.applyVoid(null, this, NearbyItemFragment.class, "5")) {
          return;
       }
       if (this.I == null) {
          this.I = true;
          this.Jh();
       }
       return;
    }
    public PresenterV2 B2(){
       Object[] objArray = null;
       PresenterV2 obj = PatchProxy.applyWithListener(objArray, this, NearbyItemFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new k());
       String str = "17";
       if (!PatchProxy.applyVoidOneRefsWithListener(obj, this, NearbyItemFragment.class, str)) {
          obj.U7(new f(this));
          PatchProxy.onMethodExit(NearbyItemFragment.class, str);
       }
       h oh = new h(this.rh(), true, false);
       oh.P8(objArray);
       obj.U7(oh);
       obj.U7(new a());
       PatchProxy.onMethodExit(NearbyItemFragment.class, "16");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, NearbyItemFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new g(this);
    }
    public boolean Dh(){
       return false;
    }
    public boolean Eh(){
       return true;
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, NearbyItemFragment.class, "15")) {
          return;
       }
       if (this.Ih() > 0) {
          this.H.U7(new a(this.Ih()));
       }
       int i = this instanceof NearbySecondaryContainerFragment;
       if (i ^ 0x01) {
          this.H.U7(new f());
       }
       this.H.U7(new a(i));
       return;
    }
    public int Ih(){
       return 0;
    }
    public void Jh(){
       if (PatchProxy.applyVoid(null, this, NearbyItemFragment.class, "6")) {
          return;
       }
       NearbyItemFragment tG = this.G;
       Objects.requireNonNull(tG);
       if (!PatchProxy.applyVoidOneRefs(this, tG, a.class, "2")) {
          tG.e = new b(this.h0(), this.ia());
          int i = a1.d(R.dimen.arg_RES_7f070fdf);
          if (e.f()) {
             int i1 = (u.a())? n.A(a1.c()): 0;
             tG.b = i + i1;
          }
       }
       return;
    }
    public int M(){
       return 2;
    }
    public boolean S0(){
       return true;
    }
    public boolean Xg(){
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, NearbyItemFragment.class, "12")) {
          return;
       }
       super.a();
       return;
    }
    public boolean c1(){
       Fragment uFragment;
       Fragment obj = PatchProxy.apply(null, this, NearbyItemFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getParentFragment();
       if (obj instanceof LazyLoadFragmentContainer) {
          uFragment = obj;
          obj = obj.getParentFragment();
       }else {
          uFragment = this;
       }
       boolean b = true;
       if (obj instanceof y && obj.t() != uFragment) {
          b = false;
       }
       return b;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, NearbyItemFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.eh(p0, p1, p2);
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, NearbyItemFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.Hh();
       obj = super.fg();
       obj.add(this.G);
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NearbyItemFragment.class, "3")) {
          return;
       }
       super.fh(p0, p1);
       this.Hh();
       this.H = new PresenterV2();
       this.Gh();
       this.H.f(p0);
       if (!PatchProxy.applyVoid(null, this, NearbyItemFragment.class, "4")) {
          Object[] objArray = new Object[]{this.G,this,new c("FRAGMENT", this)};
          this.H.i(objArray);
       }
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, NearbyItemFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.Ih() > 0)? 0x7f0d04f8: 0x7f0d04f6;
       return i;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NearbyItemFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(NearbyItemFragment.class, null);
       return objectsByTag;
    }
    public abstract String getUrl();
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, NearbyItemFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.K0();
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, NearbyItemFragment.class, "7")) {
          return;
       }
       NearbyItemFragment tH = this.H;
       if (tH != null) {
          tH.destroy();
       }
       super.onDestroyView();
       return;
    }
    public void onMultiWindowModeChanged(boolean p0){
       if (PatchProxy.isSupport(NearbyItemFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NearbyItemFragment.class, "19")) {
          return;
       }
       super.onMultiWindowModeChanged(p0);
       this.G.d.onNext(Boolean.valueOf(p0));
       return;
    }
    public h$b ph(){
       return null;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, NearbyItemFragment.class, "14")) {
          return;
       }
       super.u();
       return;
    }
    public boolean u2(){
       Object obj = PatchProxy.apply(null, this, NearbyItemFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.q() instanceof d) {
          return (this.q().F2() ^ 0x01);
       }
       return j.f(this);
    }
    public RecyclerView$LayoutManager xh(){
       DecoSafeStaggeredLayoutManager obj = PatchProxy.apply(null, this, NearbyItemFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DecoSafeStaggeredLayoutManager(2, 1);
       obj.setGapStrategy(2);
       obj.N(this.h0());
       return obj;
    }
}
