package com.kuaishou.live.core.show.luckystar.openresult.f;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import yb2.i;
import dc2.a;
import p91.m;
import brd.t;
import zb2.o;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.luckystar.openresult.d;
import com.kuaishou.live.core.show.luckystar.openresult.e;
import erd.g;
import crd.b;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import zb2.p;
import com.facebook.imagepipeline.request.ImageRequest;
import boc.d0;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class f extends c	// class@000cea
{
    public i p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public RecyclerView t;
    public KwaiImageView u;
    public ValueAnimator v;
    public static String sLivePresenterClassName = "LiveLuckyStarOpenResultRollPresenter";

    public void f(){
       super();
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "5")) {
          LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
          linearLayout.setOrientation(1);
          this.t.setLayoutManager(linearLayout);
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "6")) {
          uof = this.p;
          this.X7(uof.m.a(new a(uof.a.getLiveStreamId(), this.p.c)).observeOn(d.a).subscribe(new d(this), new e(this)));
       }
       this.R8();
       return;
    }
    public void J8(){
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uof, "12")) {
          uof = this.v;
          if (uof != null && uof.isRunning()) {
             this.v.cancel();
             this.v = null;
          }
          this.t.setAdapter(null);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "14")) {
          return;
       }
       this.s.setText(R.string.arg_RES_7f10262e);
       this.s.setVisibility(0);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "13")) {
          return;
       }
       this.q.setVisibility(0);
       this.t.setVisibility(0);
       this.r.setVisibility(0);
       this.s.setVisibility(4);
       this.r.setText(R.string.arg_RES_7f102615);
       d uod = Fresco.newDraweeControllerBuilder();
       uod.q(true);
       uod.u(d0.e(p.a));
       AbstractDraweeController uAbstractDra = uod.e();
       this.q.setVisibility(0);
       this.q.setController(uAbstractDra);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a212e);
       this.r = m1.f(p0, 0x7f0a2149);
       this.s = m1.f(p0, 0x7f0a2145);
       this.t = m1.f(p0, 0x7f0a2135);
       this.u = m1.f(p0, 0x7f0a2109);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(i.class);
       return;
    }
}
