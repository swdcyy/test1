package com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import android.widget.RelativeLayout;
import o79.i;
import android.content.Context;
import android.util.AttributeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g79.a;
import w69.y0;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import c79.c$a;
import c79.c;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.moved.utility.AlbumEnv;
import kotlin.jvm.internal.a;
import zsd.u;
import android.view.GestureDetector;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView$b;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector$OnGestureListener;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.widget.preview.a;
import ekd.y0;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView$a;
import java.lang.Runnable;
import android.view.MotionEvent;
import java.util.Map;
import java.lang.Double;
import java.lang.Number;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View$MeasureSpec;

public class KsAlbumVideoPlayerView extends RelativeLayout	// class@001b23
{
    public a b;
    public CompatImageView c;
    public c d;
    public ImageView e;
    public TextView f;
    public y0 g;
    public final Map h;
    public GestureDetector i;
    public float j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final String t;

    static {
       KsAlbumVideoPlayerView.p = i.d(80.00f);
       KsAlbumVideoPlayerView.q = i.d(60.00f);
       KsAlbumVideoPlayerView.r = i.d(40.00f);
       KsAlbumVideoPlayerView.s = i.d(153.00f);
       KsAlbumVideoPlayerView.t = "KsAlbumVideoPlayerView";
    }
    public void KsAlbumVideoPlayerView(Context p0){
       super(p0, null, 0);
    }
    public void KsAlbumVideoPlayerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void KsAlbumVideoPlayerView(Context p0,AttributeSet p1,int p2){
       boolean b2;
       Boolean a;
       super(p0, p1, p2);
       a uoa = null;
       this.b = uoa;
       this.h = new ConcurrentHashMap();
       boolean b = false;
       this.l = b;
       this.m = b;
       boolean b1 = true;
       this.n = b1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsAlbumVideoPlayerView.class, "1")) {
       }else {
          this.removeAllViews();
          a.c.d().b();
          View view = i.n(p0, R.layout.arg_RES_7f0d070a, this, b1);
          this.c = view.findViewById(0x7f0a31e5);
          c$a uoa1 = new c$a();
          uoa1.h(b1);
          this.d = uoa1.a();
          this.e = view.findViewById(0x7f0a1569);
          this.c.setActualImageScaleType(b1);
          this.h(R.drawable.arg_RES_7f080f9f, KsAlbumVideoPlayerView.p, KsAlbumVideoPlayerView.p);
          this.f = this.findViewById(0x7f0a43f9);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          uoa1 = PatchProxy.apply(uoa, this, KsAlbumVideoPlayerView.class, "8");
          if (uoa1 != patchProxyRe) {
             b2 = uoa1.booleanValue();
          }else {
             uoa1 = PatchProxy.apply(uoa, uoa, AlbumEnv.class, "12");
             if (uoa1 != patchProxyRe) {
                b2 = uoa1.booleanValue();
             }else if(AlbumEnv.a != null){
                a = AlbumEnv.a;
                if (a == null) {
                   a.L();
                }
                b2 = a.booleanValue();
             }else if(a.g("UNKNOWN", AlbumEnv.d)){
                b2 = false;
             }else if(!u.I1(AlbumEnv.d, "test", b1) && (u.I1(AlbumEnv.d, "test_google_play", b1) || u.I1(AlbumEnv.d, "auto_test", b1))){
                b1 = false;
             }
          label_00d2 :
             AlbumEnv.a = Boolean.valueOf(b1);
             a = AlbumEnv.a;
             if (a == null) {
                a.L();
             }
             b2 = a.booleanValue();
          }
          if (b2) {
             this.f.setVisibility(b);
          }
          this.i = new GestureDetector(this.getContext(), new KsAlbumVideoPlayerView$b(this), new Handler(Looper.getMainLooper()));
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoPlayerView.class, "4")) {
          return;
       }
       Log.b(KsAlbumVideoPlayerView.t, "initialize "+this);
       KsAlbumVideoPlayerView tb = this.b;
       if (tb != null) {
          tb.d();
       }
       this.g = new y0(Looper.getMainLooper(), 60, new KsAlbumVideoPlayerView$a(this));
       return;
    }
    public boolean b(){
       KsAlbumVideoPlayerView obj = PatchProxy.apply(null, this, KsAlbumVideoPlayerView.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       if (obj != null) {
          return obj.e();
       }
       return false;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoPlayerView.class, "19")) {
          return;
       }
       Log.b(KsAlbumVideoPlayerView.t, "onResume TextureView "+this);
       KsAlbumVideoPlayerView tb = this.b;
       if (tb != null) {
          tb.j();
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoPlayerView.class, "18")) {
          return;
       }
       this.i(false, this.o);
       KsAlbumVideoPlayerView tb = this.b;
       if (tb != null) {
          tb.k();
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsAlbumVideoPlayerView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.h.size()) {
          return super.dispatchTouchEvent(p0);
       }
       this.i.onTouchEvent(p0);
       return true;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoPlayerView.class, "16")) {
          return;
       }
       Log.b(KsAlbumVideoPlayerView.t, "call play "+this);
       this.i(true, this.o);
       KsAlbumVideoPlayerView tb = this.b;
       if (tb != null) {
          tb.l();
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoPlayerView.class, "12")) {
          return;
       }
       Log.b(KsAlbumVideoPlayerView.t, "call release "+this);
       KsAlbumVideoPlayerView tb = this.b;
       if (tb != null) {
          tb.m();
       }
       return;
    }
    public void g(double p0){
       if (PatchProxy.isSupport(KsAlbumVideoPlayerView.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, KsAlbumVideoPlayerView.class, "23")) {
          return;
       }
       Log.b(KsAlbumVideoPlayerView.t, "seekTo :"+p0);
       KsAlbumVideoPlayerView tb = this.b;
       if (tb != null) {
          tb.n(p0);
       }
       return;
    }
    public CompatImageView getCoverView(){
       return this.c;
    }
    public a getPlayerController(){
       return this.b;
    }
    public ImageView getPlayerStatusView(){
       return this.e;
    }
    public double getVideoLength(){
       KsAlbumVideoPlayerView obj = PatchProxy.apply(null, this, KsAlbumVideoPlayerView.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.b;
       if (obj != null) {
          return obj.c();
       }
       return 0;
    }
    public void h(int p0,int p1,int p2){
       if (PatchProxy.isSupport(KsAlbumVideoPlayerView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, KsAlbumVideoPlayerView.class, "6")) {
          return;
       }
       this.e.setImageResource(p0);
       RelativeLayout$LayoutParams layoutParams = this.e.getLayoutParams();
       layoutParams.width = p1;
       layoutParams.height = p2;
       this.e.setLayoutParams(layoutParams);
       return;
    }
    public void i(boolean p0,boolean p1){
       if (PatchProxy.isSupport(KsAlbumVideoPlayerView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, KsAlbumVideoPlayerView.class, "26")) {
          return;
       }
       if (this.m == null) {
          return;
       }
       if (p0) {
          if (p1) {
             this.h(R.drawable.arg_RES_7f080f9d, KsAlbumVideoPlayerView.q, KsAlbumVideoPlayerView.r);
          }else {
             this.e.setVisibility(8);
          }
       }else if(p1){
          this.h(R.drawable.arg_RES_7f080f9e, KsAlbumVideoPlayerView.q, KsAlbumVideoPlayerView.r);
       }else {
          this.e.setVisibility(0);
       }
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoPlayerView.class, "9")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.g != null && !this.f.getVisibility()) {
          this.g.d();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, KsAlbumVideoPlayerView.class, "10")) {
          return;
       }
       KsAlbumVideoPlayerView tg = this.g;
       if (tg != null) {
          tg.e();
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(KsAlbumVideoPlayerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KsAlbumVideoPlayerView.class, "24")) {
          return;
       }
       if (!this.j) {
          super.onMeasure(p0, p1);
          return;
       }else {
          int mode = View$MeasureSpec.getMode(p1);
          int mode1 = View$MeasureSpec.getMode(p0);
          p1 = RelativeLayout.getDefaultSize(this.getSuggestedMinimumHeight(), p1);
          p0 = RelativeLayout.getDefaultSize(this.getSuggestedMinimumWidth(), p0);
          if (mode != 0x40000000 || mode1 != 0x40000000) {
             if (mode == 0x40000000) {
                p0 = (int)((this.j * (float)p1) + 0x3f000000);
             }else if(mode1 == 0x40000000){
                p1 = (int)(((float)p0 / this.j) + 0x3f000000);
             }else {
                float f = (float)p0;
                float f1 = (float)p1;
                KsAlbumVideoPlayerView tj = this.j;
                if (f - (f1 * tj) > 0) {
                   p0 = (int)((tj * f1) + 0x3f000000);
                }else {
                   p1 = (int)((f / tj) + 0x3f000000);
                }
             }
          }
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec(p1, 0x40000000));
          return;
       }
    }
    public void setEnableFling(boolean p0){
       this.n = p0;
    }
    public void setEnablePlayerStatusChanged(boolean p0){
       this.m = p0;
    }
    public void setHideCoverWhenPlay(boolean p0){
       this.l = p0;
    }
    public void setLoop(boolean p0){
       if (PatchProxy.isSupport(KsAlbumVideoPlayerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KsAlbumVideoPlayerView.class, "21")) {
          return;
       }
       this.k = p0;
       KsAlbumVideoPlayerView tb = this.b;
       if (tb != null) {
          tb.o(p0);
       }
       return;
    }
    public void setPlayerController(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumVideoPlayerView.class, "2")) {
          return;
       }
       this.b = p0;
       if (!PatchProxy.applyVoidOneRefs(this, this, KsAlbumVideoPlayerView.class, "3")) {
          KsAlbumVideoPlayerView tb = this.b;
          if (tb != null) {
             RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -1);
             layoutParams.addRule(13, -1);
             this.addView(tb.h(this), 0, layoutParams);
          }
       }
       return;
    }
    public void setRatio(float p0){
       this.j = p0;
    }
    public void setUseBottomIcon(boolean p0){
       this.o = p0;
    }
}
