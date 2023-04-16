package com.kuaishou.live.gzone.barrage.i;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ml8.d;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.live.gzone.barrage.i$c;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.live.gzone.barrage.i$a;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kuaishou.live.gzone.barrage.i$b;
import android.app.Activity;
import com.kwai.library.widget.popup.common.f;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import b53.s;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveBarrageInfoPackage;
import b53.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import android.widget.TextView;
import android.content.res.ColorStateList;
import b53.z;
import android.widget.SeekBar$OnSeekBarChangeListener;
import b53.a0;
import pm8.a;
import android.widget.SeekBar;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.n;
import ia2.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import ia2.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Boolean;
import ekd.m1;
import b53.t;
import android.view.View$OnClickListener;
import b53.u;
import b53.v;
import b53.w;
import b53.x;
import b53.y;
import java.lang.Integer;
import android.content.Context;
import zf6.j;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;

public class i extends c implements PopupInterface$f, d	// class@001c3a
{
    public KwaiSeekBar A;
    public boolean B;
    public ClientContent$LiveStreamPackage C;
    public boolean D;
    public boolean E;
    public View p;
    public s q;
    public int r;
    public View[] s;
    public TextView[] t;
    public TextView u;
    public TextView v;
    public View w;
    public View x;
    public View y;
    public KwaiSeekBar z;

    public void i(i$c p0){
       super(p0);
       this.r = -1;
       this.B = false;
       p0.P(false);
       p0.z(true);
       p0.A(true);
       p0.L(this);
       p0.F(new i$a(this));
       p0.N(new i$b(this));
       p0.H(f.r(this.u()));
       this.C = p0.G;
       this.D = p0.H;
       this.E = p0.I;
    }
    public void N(Bundle p0){
       int i;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       i tq = this.q;
       Objects.requireNonNull(tq);
       Object[] objArray = null;
       ClientContent$LiveBarrageInfoPackage liveBarrageI = PatchProxy.apply(objArray, tq, s.class, "10");
       if (liveBarrageI != PatchProxyResult.class) {
       }else {
          s b = tq.b;
          i = 0;
          ClientContent$LiveBarrageInfoPackage liveBarrageI1 = 1;
          if (b != null) {
             if (b != liveBarrageI1) {
                i1 = (b != 2)? 0: 4;
             }else {
                i1 = 2;
             }
          }else {
             i1 = 1;
          }
          s d = tq.d;
          if (d != null) {
             if (d != liveBarrageI1) {
                if (d != 2) {
                   if (d != 3) {
                      if (d == 4) {
                         i = 5;
                      }
                   }else {
                      i = 4;
                   }
                }else {
                   i = 3;
                }
             }else {
                i = 2;
             }
          }else {
             i = 1;
          }
          liveBarrageI1 = new ClientContent$LiveBarrageInfoPackage();
          liveBarrageI1.barragePosType = i1;
          liveBarrageI1.barrageAlpha = (int)(tq.a() * 100.00f);
          liveBarrageI1.barrageTextSize = i;
          liveBarrageI = liveBarrageI1;
       }
       if (!PatchProxy.applyVoidOneRefs(liveBarrageI, objArray, e.class, "7")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLOSE_LIVE_BARRAGE_SETTING_PANEL";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveBarrageInfoPackage = liveBarrageI;
          u1.u(6, uElementPack, uContentPack);
       }
       return;
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       i tC = this.C;
       if (!PatchProxy.applyVoidOneRefs(tC, null, e.class, "3")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHOW_LIVE_BARRAGE_SETTING_PANEL";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = tC;
          u1.u0(4, uElementPack, uContentPack);
       }
       return;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       int i;
       i tt;
       int len;
       int i2;
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, i.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       this.p = (this.D != null)? a.g(p1, 0x7f0d0a6f, p2, false): a.g(p1, 0x7f0d0a6e, p2, false);
       this.doBindView(this.p);
       i oi = i.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, oi, "5")) {
          this.A.b(a1.f(R.drawable.arg_RES_7f081110), a1.f(R.drawable.arg_RES_7f081110));
          this.z.b(a1.f(R.drawable.arg_RES_7f081110), a1.f(R.drawable.arg_RES_7f081110));
          View[] viewArray = new View[3];
          this.s = viewArray;
          TextView[] textViewArra = new TextView[]{this.p.findViewById(0x7f0a03e0),this.p.findViewById(0x7f0a03e3),this.p.findViewById(0x7f0a03e1)};
          this.t = textViewArra;
          viewArray[0] = this.p.findViewById(0x7f0a03df);
          i = 1;
          int i1 = 2;
          textViewArra[i] = this.p.findViewById(0x7f0a03e4);
          textViewArra[i1] = this.p.findViewById(0x7f0a03e2);
          if (this.B != null) {
             tt = this.t;
             len = tt.length;
             for (i2 = 0; i2 < len; i2 = i2 + 1) {
                tt[i2].setTextColor(a1.b(R.color.arg_RES_7f061404));
             }
          }
          this.A.setOnSeekBarChangeListener(new z(this));
          this.z.setOnSeekBarChangeListener(new a0(this));
          int i3 = a.C();
          len = a.D();
          i2 = (i3 >= 0)? i3: 1;
          this.g0(i2);
          if (!i3) {
             this.b0(i);
          }
          this.A.setProgress(((int)(this.q.a() * 100.00f) - 20));
          this.u.setText((this.A.getProgress() + 20)+"%");
          tt = this.z;
          if (len >= 0) {
             i1 = len;
          }
          tt.setProgress(i1);
          this.h0(this.z.getProgress());
          if (this.D != null && !PatchProxy.applyVoid(objArray, this, oi, "6")) {
             Activity uActivity = n.d(this.p);
             if (uActivity != null) {
                i3 = a.a(uActivity);
                int i4 = n.j(uActivity);
                View view = this.p.findViewById(R.id.live_barrage_setting_left_view);
                View view1 = this.p.findViewById(R.id.live_barrage_setting_content_layout);
                if (view != null && view1 != null) {
                   view1.setBackground(objArray);
                   objArray.width = i4;
                   this.p.setBackground(a.b(this.E));
                   objArray.width = i3;
                   objArray.width = i3 - i4;
                   view.setVisibility(false);
                }
             }
          }
       }
    label_0190 :
       if (this.q == null) {
          this.q(false);
       }
       return this.p;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "9")) {
          return;
       }
       i tr = this.r;
       if (tr > null) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putInt("live_barrage_setting_apha_model", tr);
          g.a(uEditor);
       }
       return;
    }
    public final void b0(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "10")) {
          return;
       }
       this.x.setEnabled((p0 ^ 0x01));
       this.w.setEnabled((p0 ^ 0x01));
       this.A.setEnabled((p0 ^ 0x01));
       this.z.setEnabled((p0 ^ 0x01));
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, i.class, "11")) {
          return;
       }
       this.g0(0);
       this.q.e(0);
       this.q.g();
       e.b(0);
       this.b0(true);
       return;
    }
    public void d0(){
       if (PatchProxy.applyVoid(null, this, i.class, "13")) {
          return;
       }
       this.b0(false);
       this.g0(2);
       this.q.e(2);
       this.q.g();
       e.b(2);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a1a73);
       this.u = m1.f(p0, 0x7f0a03dd);
       this.v = m1.f(p0, 0x7f0a03e6);
       this.z = m1.f(p0, 0x7f0a03e5);
       this.x = m1.f(p0, 0x7f0a1a76);
       this.A = m1.f(p0, 0x7f0a03dc);
       m1.a(p0, new t(this), R.id.barrage_setting_top);
       m1.a(p0, new u(this), R.id.barrage_setting_top_des);
       m1.a(p0, new v(this), R.id.barrage_setting_close);
       m1.a(p0, new w(this), R.id.barrage_setting_close_des);
       m1.a(p0, new x(this), R.id.barrage_setting_fullscreen);
       m1.a(p0, new y(this), R.id.barrage_setting_fullscreen_des);
       this.f0(m1.f(p0, R.id.barrage_setting_close), R.drawable.arg_RES_7f080ccf);
       this.f0(m1.f(p0, R.id.barrage_setting_top), R.drawable.arg_RES_7f080ccc);
       this.f0(m1.f(p0, R.id.barrage_setting_fullscreen), R.drawable.arg_RES_7f080ccd);
       return;
    }
    public void e0(){
       if (PatchProxy.applyVoid(null, this, i.class, "12")) {
          return;
       }
       this.b0(false);
       this.g0(1);
       this.q.e(1);
       this.q.g();
       e.b(1);
       return;
    }
    public final void f0(View p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "14")) {
          return;
       }
       StateListDrawable stateListDra = new StateListDrawable();
       int[] ointArray = new int[]{0x10100a1};
       stateListDra.addState(ointArray, j.n(this.u(), p1, R.color.arg_RES_7f061de2));
       stateListDra.addState(StateSet.WILD_CARD, j.n(this.u(), p1, R.color.arg_RES_7f061dc4));
       p0.setBackground(stateListDra);
       return;
    }
    public final void g0(int p0){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "7")) {
          return;
       }
       i = 0;
       i ts = this.s;
       while (i < ts.length) {
          if (i == p0) {
             boolean b = true;
             ts[i].setSelected(b);
             this.t[i].setSelected(b);
          }else {
             ts[i].setSelected(false);
             this.t[i].setSelected(false);
          }
          i = i + 1;
       }
       return;
    }
    public void h0(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "8")) {
          return;
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 != 4) {
                      return;
                   }else {
                      this.v.setText(R.string.arg_RES_7f101ea2);
                   }
                }else {
                   this.v.setText(R.string.arg_RES_7f101ea4);
                }
             }else {
                this.v.setText(R.string.arg_RES_7f101ea5);
             }
          }else {
             this.v.setText(R.string.arg_RES_7f101ea7);
          }
       }else {
          this.v.setText(R.string.arg_RES_7f101ea3);
       }
       return;
    }
}
