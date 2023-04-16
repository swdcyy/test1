package com.kwai.live.gzone.accompanyplay.edit.g0;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import im8.g;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.edit.g0$b;
import com.kwai.library.widget.popup.common.c$b;
import n37.q0;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import n37.p0;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import crd.b;
import lnc.b9;
import com.kwai.live.gzone.accompanyplay.edit.m;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import f37.o0;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.live.gzone.accompanyplay.edit.g0$a;
import erd.g;
import brd.t;
import android.view.LayoutInflater;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import android.content.Context;
import android.app.Activity;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n37.t0;
import java.util.Map;
import java.util.HashMap;

public class g0 extends c implements PopupInterface$f, g	// class@000bf4
{
    public g0$b p;
    public PresenterV2 q;
    public d r;
    public b s;
    public View t;
    public View u;
    public View v;
    public TextView w;
    public RecyclerView x;
    public View y;
    public static final int z;

    static {
       g0.z = a1.d(0x7f0707af);
    }
    public void g0(g0$b p0){
       super(p0);
       this.p = p0;
       p0.A(false);
       p0.L(this);
       p0.F(new q0(p0));
       p0.N(new p0(p0));
    }
    public void O(Bundle p0){
       g0 og0 = g0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og0, "2")) {
          return;
       }
       if (this.z() == null) {
          return;
       }
       this.u = this.f.findViewById(0x7f0a1dde);
       this.v = this.f.findViewById(0x7f0a1de3);
       this.w = this.f.findViewById(0x7f0a1de8);
       this.t = this.f.findViewById(0x7f0a1de9);
       this.x = this.f.findViewById(0x7f0a1dee);
       b9.a(this.s);
       if (!PatchProxy.applyVoid(null, this, og0, "3")) {
          if (this.p.H.f != null) {
             p0.width = this.p.H.h;
             p0.height = -1;
             p0.gravity = 5;
             o0.p(this.t, true);
             if (this.p.H.g == null) {
                g0 tx = this.x;
                tx.setPadding(g0.z, tx.getPaddingTop(), g0.z, this.x.getPaddingBottom());
                tx.leftMargin = a1.e(4.00f);
                tx.rightMargin = a1.e(4.00f);
             }
          }else {
             p0.height = this.p.H.j;
             o0.p(this.t, false);
          }
       }
       this.s = this.p.H.l.subscribe(new g0$a(this));
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g0.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       g0 tp = this.p;
       Objects.requireNonNull(tp);
       g0$b uob = PatchProxy.apply(null, tp, g0$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = tp.I;
          if (uob == null) {
             uob = tp.q();
          }
       }
       return a.d(uob, 0x7f0d0b76, p2, false);
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "4")) {
          return;
       }
       g0 tq = this.q;
       if (tq != null && tq.R1()) {
          this.q.destroy();
          this.q = null;
       }
       b9.a(this.s);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g0.class, new t0());
       }else {
          obj.put(g0.class, null);
       }
       return obj;
    }
}
