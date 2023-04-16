package com.kwai.live.gzone.turntable.h;
import com.kwai.live.gzone.widget.b;
import n77.c0;
import com.kwai.live.gzone.widget.e$a;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.kwai.live.gzone.widget.e;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import n77.i0;
import erd.g;
import brd.t;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import n77.d0;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize$TurntableType;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import lnc.a1;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import ekd.j;
import n77.b0;
import java.lang.Enum;
import n77.j0;
import n77.f0;
import java.lang.Integer;
import n77.e0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import n77.g0;
import java.util.Objects;
import n77.h0;

public class h extends b	// class@000e45
{
    public KwaiImageView A;
    public KwaiImageView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public View G;
    public b H;
    public c0 z;

    public void h(c0 p0){
       super(p0.i);
       this.z = p0;
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       h tz = this.z;
       tz.d = null;
       tz.c = null;
       tz.f = null;
       b9.a(this.H);
       super.N(p0);
       return;
    }
    public void O(Bundle p0){
       LiveGzoneTurntablePrize mName;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "2")) {
          return;
       }
       super.O(p0);
       if (this.z() == null) {
          return;
       }
       c0 j = this.z.j;
       if (j != null) {
          this.H = j.subscribe(new i0(this));
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, oh, "5")) {
          this.A = this.z().findViewById(0x7f0a40bd);
          this.B = this.z().findViewById(0x7f0a26f9);
          this.D = this.z().findViewById(0x7f0a40c2);
          this.E = this.z().findViewById(0x7f0a40bb);
          this.F = this.z().findViewById(0x7f0a40be);
          this.C = this.z().findViewById(0x7f0a40bc);
          this.G = this.z().findViewById(0x7f0a1e75);
       }
       this.G.setOnClickListener(new d0(this));
       h tz = this.z;
       c0 a = tz.a;
       boolean b = true;
       if (a != null) {
          if (a.mType == LiveGzoneTurntablePrize$TurntableType.EMPTY) {
             c0 g = tz.g;
             if (g != null) {
                g.l(objArray);
             }
             if (!PatchProxy.applyVoid(objArray, this, oh, "9")) {
                this.r0(R.string.arg_RES_7f10248b);
                this.o0(R.string.arg_RES_7f104e7c);
                this.q0();
             }
             return;
          }else if(TextUtils.isEmpty(a.mPrizeUnit)){
             mName = a.mName;
          }else {
             mName = a.mBatchSize+a.mPrizeUnit+a.mName;
          }
          this.p0(a1.r(R.string.arg_RES_7f104e72, mName));
          this.A.U(a.mPicUrls);
          this.A.setVisibility(0);
          if (this.B != null) {
             if (j.h(a.mRedDotUrls)) {
                this.B.setVisibility(8);
             }else {
                this.B.setVisibility(0);
                this.B.U(a.mRedDotUrls);
             }
          }
          switch (b0.a[a.mType.ordinal()]){
              case 1:
              case 2:
                this.s0(a, a.mForwardUrl);
                break;
              case 3:
                if (!PatchProxy.applyVoidOneRefs(a, this, oh, "6")) {
                   this.n0(a1.p(R.string.arg_RES_7f104e75));
                   this.D.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.arg_RES_7f08123a, 0);
                   this.D.setCompoundDrawablePadding(a1.e(4.00f));
                   this.D.setClickable(b);
                   this.D.setEnabled(b);
                   c0 g1 = this.z.g;
                   if (g1 != null && !PatchProxy.applyVoid(objArray, g1, LiveGzoneTurntableLogger.class, "41")) {
                      g1.j("SHOW_LIVE_TURNTABLE_TO_BACKPACK");
                   }
                   this.D.setOnClickListener(new j0(this));
                   this.q0();
                }
                break;
              case 4:
                if (!PatchProxy.applyVoidOneRefs(a, this, oh, "7")) {
                   this.n0(a1.p(R.string.arg_RES_7f104e78));
                   this.q0();
                }
                break;
              case 5:
                if (!PatchProxy.applyVoid(objArray, this, oh, "10")) {
                   this.n0(a1.p(R.string.arg_RES_7f104e76));
                   this.q0();
                }
                break;
              case 6:
                this.s0(a, a.mForwardUrl);
                if (!PatchProxy.applyVoidOneRefs(a, this, oh, "4") && !TextUtils.isEmpty(a.mPrizeDescription)) {
                   this.p0(a.mPrizeDescription);
                }
                break;
              default:
                if (!PatchProxy.applyVoid(objArray, this, oh, "11")) {
                   this.n0(a1.p(R.string.arg_RES_7f104e7b));
                   this.D.setSelected(b);
                   this.q0();
                }
          }
       label_01fc :
          j = this.z.g;
          if (j != null) {
             j.l(a);
          }
          return;
       }else if(tz.d != null){
          if (!PatchProxy.applyVoid(objArray, this, oh, "14")) {
             this.r0(R.string.arg_RES_7f104e7a);
             this.o0(R.string.arg_RES_7f104e83);
             this.E.setText(R.string.arg_RES_7f104e7d);
             this.E.setOnClickListener(new f0(this));
          }
       }else {
          j = tz.b;
          if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(j), this, oh, "13")) {
             this.r0(R.string.arg_RES_7f104e73);
             Object[] objArray1 = new Object[b];
             objArray1[0] = Integer.valueOf(j);
             this.p0(String.format(a1.p(R.string.arg_RES_7f104e7e), objArray1));
             this.E.setText(R.string.arg_RES_7f104e6f);
             this.E.setOnClickListener(new e0(this));
          }
       }
       return;
    }
    public int c0(){
       Object obj = PatchProxy.apply(null, this, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.u(a.b());
    }
    public int d0(){
       return 0x7f0d0bf7;
    }
    public int e0(){
       return -2;
    }
    public boolean j0(){
       return true;
    }
    public final h n0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.D.setText(p0);
       this.D.setVisibility(0);
       return this;
    }
    public final h o0(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.C.setText(p0);
       this.C.setVisibility(0);
       return this;
    }
    public final h p0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.C.setText(p0);
       this.C.setVisibility(0);
       return this;
    }
    public final void q0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "12")) {
          return;
       }
       this.E.setText(R.string.arg_RES_7f104e79);
       this.E.setOnClickListener(new g0(this));
       c0 g = this.z.g;
       if (g != null) {
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoid(objArray, g, LiveGzoneTurntableLogger.class, "13")) {
             g.j("LIVE_TURNTABLE_GO_AGAIN_BUTTON");
          }
       }
       return;
    }
    public final h r0(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.F.setText(p0);
       this.F.setVisibility(0);
       return this;
    }
    public final void s0(LiveGzoneTurntablePrize p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "8")) {
          return;
       }
       this.n0(a1.p(R.string.arg_RES_7f104e78));
       this.E.setText(a1.p(R.string.arg_RES_7f104e77));
       this.E.setOnClickListener(new h0(this, p1));
       c0 g = this.z.g;
       if (g != null && !PatchProxy.applyVoid(null, g, LiveGzoneTurntableLogger.class, "12")) {
          g.j("LIVE_TURNTABLE_DIALOG_EXCHANGE_BUTTON");
       }
       return;
    }
}
