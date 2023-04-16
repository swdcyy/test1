package com.kwai.nearby.local.presenter.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.HomeLocalFragment;
import com.kwai.nearby.model.WidgetState;
import com.kwai.nearby.local.presenter.w$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import e17.i;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.x0;
import android.content.Context;
import android.content.Intent;
import jb5.d;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import qvb.q;
import qvb.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import dd7.c1;
import erd.g;
import crd.b;
import eda.n;
import dd7.d1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dd7.b1;
import io.reactivex.internal.functions.Functions;
import com.kwai.nearby.model.NearbyPendantInfo$NearbyPendantConfig;
import com.kwai.nearby.local.pendant.NearbyPendantView;
import android.widget.ImageView;
import com.kwai.nearby.model.AdsorptionStateConfig;
import android.view.View;
import com.yxcorp.utility.n;
import vc7.i0;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tw5.d;
import bsb.a;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import dd7.e1;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import android.widget.FrameLayout;
import android.animation.ObjectAnimator;
import th0.c;
import android.animation.TimeInterpolator;
import com.kwai.nearby.local.presenter.w$b;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;

public class w extends PresenterV2	// class@000fdd
{
    public NearbyPendantInfo$NearbyPendantConfig A;
    public boolean B;
    public w$c C;
    public d D;
    public CityInfo E;
    public String F;
    public final q G;
    public HomeLocalFragment p;
    public NearbyPendantView q;
    public ViewGroup r;
    public boolean s;
    public KwaiImageView t;
    public PendantAnimImageView u;
    public int v;
    public int w;
    public ImageView x;
    public WidgetState y;
    public boolean z;

    public void w(HomeLocalFragment p0){
       super();
       this.y = WidgetState.ICON;
       this.G = new w$a(this);
       this.p = p0;
    }
    public static void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, w.class, "11")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && a.b() != null) {
          if (SystemUtil.K() && i.c("KEY_ENABLE_LIFE_H5_URL_TOAST")) {
             i.d(R.style.arg_RES_7f11066a, p0);
          }
          Intent intent = b.a(0x66dce92a).a(a.b(), x0.f(p0));
          if (intent != null) {
             intent.addFlags(0x10000000);
             a.b().startActivity(intent);
          }
       }
    label_0050 :
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       this.S8();
       this.p.Qh().h(this.G);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(l.class, mAIN).subscribe(new c1(this)));
       this.X7(f.g(n.class, mAIN).subscribe(new d1(this)));
       this.X7(this.p.Z0().subscribe(new b1(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, w.class, "10")) {
          return;
       }
       this.p.Qh().f(this.G);
       this.R8(this.A);
       w tq = this.q;
       if (tq != null) {
          tq.b();
       }
       return;
    }
    public final void R8(NearbyPendantInfo$NearbyPendantConfig p0){
       View[] viewArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "9")) {
          return;
       }
       int i = 1;
       if (p0 == null || p0.mAdsorptionStateConfig == null) {
          if (this.r != null) {
             viewArray = new View[i];
             viewArray[0] = this.q;
             n.Z(8, viewArray);
          }
          return;
       }else {
          w tt = this.t;
          if (tt != null && (this.w == null && tt.getVisibility() == 8)) {
             p0 = p0.mAdsorptionStateConfig;
             if (p0.mShowPolicy != null) {
                this.W8(p0);
                this.w = this.w + i;
             }else if(this.r != null){
                viewArray = new View[i];
                viewArray[0] = this.q;
                n.Z(8, viewArray);
             }
          }else {
             goto label_0033 ;
          }
          return;
       }
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, w.class, "13")) {
          return;
       }
       this.X7(b.a(-319613407).g(a.c(this.D.getType())).observeOn(d.c).map(new e()).observeOn(d.a).subscribe(new e1(this)));
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, w.class, "20")) {
          return;
       }
       w tq = this.q;
       if (tq != null) {
          tq.b();
          this.t.setVisibility(8);
       }
       this.s = false;
       this.v = 0;
       this.w = 0;
       this.y = WidgetState.ICON;
       this.z = true;
       this.B = true;
       this.p.h0().removeOnScrollListener(this.C);
       if (this.p.c1()) {
          this.B = false;
          this.S8();
       }
       return;
    }
    public void W8(AdsorptionStateConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "14")) {
          return;
       }
       this.y = WidgetState.SUITS;
       int width = this.q.getWidth();
       if (this.s == null) {
          w tq = this.q;
          if (tq != null) {
             tq.b();
          }
          int i = 0;
          if (p0.mHasXMark == null && p0.mShowPolicy != null) {
             this.x.setVisibility(4);
          }else {
             this.x.setVisibility(i);
          }
          float[] uofloatArray = new float[]{0,(float)width};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.q, "translationX", uofloatArray);
          objectAnimat.setInterpolator(new c());
          objectAnimat.setDuration(150);
          objectAnimat.addListener(new w$b(this, width));
          objectAnimat.start();
          this.s = true;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "2")) {
          return;
       }
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.D = this.r8("local_current_city");
       return;
    }
}
