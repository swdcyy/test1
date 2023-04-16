package com.kwai.live.gzone.turntable.widget.LiveGzoneTurntableCoreView;
import com.kwai.live.gzone.turntable.widget.a;
import ml8.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import com.yxcorp.utility.TextUtils;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import mkc.b;
import mkc.c;
import u37.h;
import u37.e;
import brd.t;
import cjd.e;
import erd.o;
import p77.b;
import com.kwai.live.gzone.turntable.widget.LiveGzoneTurntableCoreView$a;
import erd.g;
import crd.b;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrizeSnapResponse;
import android.widget.ImageView;
import com.kwai.live.gzone.turntable.bean.LiveGzoneTurntablePrize;
import com.kwai.live.gzone.turntable.widget.a$a;
import lnc.a1;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.DraweeView;
import android.widget.TextView;
import p77.a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import lnc.b9;
import ekd.k1;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public class LiveGzoneTurntableCoreView extends LinearLayout implements a, d	// class@000e6f
{
    public ViewGroup b;
    public KwaiImageView c;
    public KwaiImageView d;
    public TextView e;
    public KwaiImageView f;
    public b g;
    public boolean h;
    public a$a i;
    public ObjectAnimator j;
    public static final int k;

    public void LiveGzoneTurntableCoreView(Context p0){
       super(p0, null);
    }
    public void LiveGzoneTurntableCoreView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneTurntableCoreView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableCoreView.class, "2")) {
       }else {
          this.doBindView(a.d(p0, R.layout.arg_RES_7f0d0bf6, this, true));
          d0.c(this.c, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_gzone_audience_turntable_panel_center_icon_v2.png", true);
          d0.c(this.f, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_gzone_audience_turntable_go_background.webp", true);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableCoreView.class, "13")) {
          return;
       }
       this.b("startSnapPrizeMethod");
       return;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableCoreView.class, "4")) {
          return;
       }
       String[] stringArray = new String[]{"source",TextUtils.k(p0),"mPrizeIsSnapping",String.valueOf(this.h)};
       int i = 1;
       LiveGzoneTurntableLogger.f("innerStartPrizeSnap", stringArray);
       if (this.h != null) {
          return;
       }
       this.h = i;
       c.h(this.b, b.d);
       this.g = e.d().d(this.getLiveStreamId()).map(new e()).subscribe(new b(this), new LiveGzoneTurntableCoreView$a(this));
       return;
    }
    public void c(LiveGzoneTurntablePrizeSnapResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableCoreView.class, "8")) {
          return;
       }
       this.h = false;
       this.d.setVisibility(8);
       this.c.setVisibility(false);
       LiveGzoneTurntableCoreView ti = this.i;
       if (ti != null) {
          ti.b(p0.mPrize, p0.mAvailableDrawCount, p0.mServerTime, p0.mKshell);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableCoreView.class, "9")) {
          return;
       }
       if (this.j == null) {
          float[] uofloatArray = new float[]{0,(float)a1.e(5.00f)};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.c, "translationY", uofloatArray);
          this.j = objectAnimat;
          objectAnimat.setRepeatMode(2);
          this.j.setRepeatCount(-1);
          this.j.setInterpolator(new LinearInterpolator());
          this.j.setDuration(1000);
       }
       this.j.start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableCoreView.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a26f8);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.live_gzone_audience_turntable_explode_image_view);
       this.d = kwaiImageVie;
       kwaiImageVie.setAspectRatio(0x3f800000);
       this.e = m1.f(p0, 0x7f0a1e80);
       this.b = m1.f(p0, 0x7f0a1e84);
       this.f = m1.f(p0, 0x7f0a1e7d);
       m1.a(p0, new a(this), R.id.live_gzone_audience_turntable_prize_snap_layout);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableCoreView.class, "10")) {
          return;
       }
       LiveGzoneTurntableCoreView tj = this.j;
       if (tj != null) {
          tj.cancel();
       }
       return;
    }
    public final String getLiveStreamId(){
       LiveGzoneTurntableCoreView obj = PatchProxy.apply(null, this, LiveGzoneTurntableCoreView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj != null) {
          return obj.getLiveStreamId();
       }
       return "";
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableCoreView.class, "14")) {
          return;
       }
       b9.a(this.g);
       k1.n(this);
       this.e();
       return;
    }
    public void setListener(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableCoreView.class, "12")) {
          return;
       }
       String[] stringArray = new String[]{"liveTurntableCallback",String.valueOf(p0.hashCode())};
       LiveGzoneTurntableLogger.f("setListener", stringArray);
       this.i = p0;
       return;
    }
    public void setOpportunityCount(int p0){
       if (PatchProxy.isSupport(LiveGzoneTurntableCoreView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGzoneTurntableCoreView.class, "11")) {
          return;
       }
       if (p0 > 0) {
          this.e.setText("\("+p0+"\)");
       }else {
          this.e.setText("");
       }
       return;
    }
}
