package com.kuaishou.live.preview.item.bottomcard.widget.z;
import ok3.b;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardModel;
import ok3.f;
import java.lang.Object;
import android.animation.Animator;
import ok3.a;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.kuaishou.live.preview.item.view.LivePreviewRedPacketCountDownView;
import android.widget.TextView;
import android.widget.Button;
import com.kwai.robust.PatchProxyResult;
import ok3.c0;
import android.view.View$OnClickListener;
import ok3.d0;
import com.kuaishou.android.live.model.preview.LivePreviewRichTextTextInfo;
import nk3.w;
import com.kuaishou.live.preview.item.bottomcard.widget.t;
import com.kuaishou.live.preview.item.bottomcard.widget.u;
import com.kuaishou.live.preview.item.bottomcard.widget.y;
import com.kuaishou.live.preview.item.bottomcard.widget.v;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.preview.item.bottomcard.widget.w;
import com.kuaishou.live.preview.item.bottomcard.widget.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.t0;
import java.lang.Long;
import java.lang.System;
import ok3.b0;
import java.util.Objects;
import crd.b;
import lnc.b9;
import java.lang.StringBuilder;
import rl3.c;
import brd.t;
import com.yxcorp.utility.f;
import ml3.b;
import erd.g;
import com.yxcorp.utility.n;
import java.lang.Integer;
import com.kuaishou.live.preview.item.bottomcard.widget.q;
import com.kuaishou.live.preview.item.bottomcard.widget.r;
import ok3.a0;
import com.kuaishou.live.preview.item.bottomcard.widget.s;

public class z implements b	// class@000dd9
{
    public f d;
    public LivePreviewBottomCardModel e;
    public View f;
    public LivePreviewRedPacketCountDownView g;
    public TextView h;
    public TextView i;
    public Button j;
    public static final int k;

    public void z(LivePreviewBottomCardModel p0,f p1){
       super();
       this.d = p1;
       this.e = p0;
    }
    public Animator a(){
       return a.d(this);
    }
    public void b(ViewGroup p0){
       z oz = z.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oz, "1")) {
          return;
       }
       View view = a.k(p0, R.layout.arg_RES_7f0d0d39, false);
       this.f = view;
       view.setVisibility(false);
       z tf = this.f;
       if (!PatchProxy.applyVoidOneRefs(tf, this, oz, "4")) {
          this.g = m1.f(tf, 0x7f0a259e);
          this.h = m1.f(tf, 0x7f0a259d);
          this.i = m1.f(tf, 0x7f0a2592);
          this.j = m1.f(tf, 0x7f0a2590);
          this.g.setVisibility(8);
       }
       return;
    }
    public void c(){
       z oz = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz, "2")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, oz, "5")) {
          this.j.setClickable(true);
          this.j.setOnClickListener(new c0(this));
          this.f.setOnClickListener(new d0(this));
          LivePreviewRichTextTextInfo livePreviewR = this.k(0);
          w.c(this.g, livePreviewR);
          w.c(this.h, this.k(true));
          z ti = this.i;
          LivePreviewRichTextTextInfo livePreviewR1 = PatchProxy.apply(objArray, this, oz, "7");
          if (livePreviewR1 != patchProxyRe) {
          }else {
             livePreviewR1 = k0.d(this.e.mBottomCardContentModel, t.a, u.a, y.a, v.a).orNull();
          }
          w.c(ti, livePreviewR1);
          ti = this.j;
          LivePreviewRichTextTextInfo livePreviewR2 = PatchProxy.apply(objArray, this, oz, "8");
          if (livePreviewR2 != patchProxyRe) {
          }else {
             livePreviewR2 = k0.b(this.e.mBottomCardContentModel, w.a, x.a).orNull();
          }
          w.c(ti, livePreviewR2);
          w.b(this.i);
          if (livePreviewR != null) {
             objArray = livePreviewR.mText;
          }
          b0 uob0 = null;
          long l = (!TextUtils.x(objArray) && t0.a(objArray))? Long.parseLong(objArray): uob0;
          l = l - System.currentTimeMillis();
          if (l - uob0 > 0) {
             z tg = this.g;
             uob0 = new b0(this);
             Objects.requireNonNull(tg);
             if (!PatchProxy.isSupport(LivePreviewRedPacketCountDownView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l), uob0, tg, LivePreviewRedPacketCountDownView.class, "1")) {
                b9.a(tg.o);
                c.a("Trigger live simple redpacket countdown: "+l);
                tg.setText(tg.u(l));
                tg.p = uob0;
                tg.o = tg.n.b(l, 1000).subscribe(new b(tg));
             }
             View[] viewArray = new View[true];
             viewArray[0] = this.g;
             n.Z(0, viewArray);
          }else {
             this.j();
          }
       }
       this.d();
       return;
    }
    public void d(){
       a.h(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       this.g.t();
       return;
    }
    public int f(){
       return a.b(this);
    }
    public Animator g(){
       return a.e(this);
    }
    public View getView(){
       return this.f;
    }
    public Animator h(){
       return a.a(this);
    }
    public View i(){
       return this.j;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, z.class, "9")) {
          return;
       }
       View[] viewArray = new View[]{this.g};
       n.Z(8, viewArray);
       w.c(this.h, this.k(2));
       return;
    }
    public final LivePreviewRichTextTextInfo k(int p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oz, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return k0.d(this.e.mBottomCardContentModel, q.a, r.a, new a0(p0), s.a).orNull();
    }
}
