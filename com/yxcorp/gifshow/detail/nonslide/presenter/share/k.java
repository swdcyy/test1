package com.yxcorp.gifshow.detail.nonslide.presenter.share.k;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.a;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.i;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.k$a;
import z2a.r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import java.util.Set;
import z2a.s;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e06.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kzc.c;
import cg6.b;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.c;
import kzc.e;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import uw9.o;
import q87.c;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;

public class k extends a	// class@0015e7
{
    public b A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final a E;
    public final k3 F;
    public BaseFragment s;
    public List t;
    public PublishSubject u;
    public Set v;
    public SlidePlayViewModel w;
    public x x;
    public b y;
    public b z;
    public static final x G;

    static {
       k.G = i.b;
    }
    public void k(){
       super();
       this.x = k.G;
       this.C = false;
       this.D = false;
       this.E = new k$a(this);
       this.F = new r(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       k ts = this.s;
       if (ts != null) {
          this.w = SlidePlayViewModel.S0(ts.getParentFragment());
       }
       ts = this.w;
       if (ts != null) {
          ts.P(this.s, this.E);
       }else {
          ts = this.t;
          if (ts != null) {
             ts.add(this.E);
          }
       }
       this.v.add(this.F);
       this.X7(this.u.subscribe(new s(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       k tw = this.w;
       if (tw != null) {
          tw.D(this.s, this.E);
       }else {
          tw = this.t;
          if (tw != null) {
             tw.remove(this.E);
          }
       }
       this.v.remove(this.F);
       return;
    }
    public void P8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "5")) {
          return;
       }
       super.P8(p0);
       this.R8();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       b9.a(this.y);
       b9.a(this.z);
       b9.a(this.A);
       return;
    }
    public boolean S8(){
       List obj = PatchProxy.apply(null, this, k.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a().l(this.getActivity());
       List list = b.b().l(this.getActivity());
       if (!q.f(obj) || !q.f(list)) {
          Object[] objArray = new Object[0];
          o.C().s("SHARE_GUIDE_BASE", "显示引导时，其他浮层在显示"+q.f(obj)+","+q.f(obj), objArray);
          return true;
       }else if(ForwardGridSectionFragment.W0.a()){
          Object[] objArray1 = new Object[0];
          o.C().s("SHARE_GUIDE_BASE", "显示引导时，分享面板在显示", objArray1);
          return true;
       }else {
          return 0;
       }
    }
    public void V8(){
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.s = this.t8("DETAIL_FRAGMENT");
       this.t = this.t8("DETAIL_ATTACH_LISTENERS");
       this.u = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       this.v = this.r8("DETAIL_SCREEN_TOUCH_LISTENER");
       return;
    }
}
