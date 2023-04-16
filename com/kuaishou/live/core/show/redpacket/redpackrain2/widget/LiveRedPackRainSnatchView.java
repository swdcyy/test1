package com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView;
import ml8.d;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d61.c0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import crd.b;
import java.lang.Boolean;
import java.lang.Long;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView$b;
import wh2.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainButton;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainText;
import android.graphics.Color;
import uh2.r;
import android.widget.TextView;
import com.yxcorp.utility.f;
import brd.t;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView$a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import l12.d;
import va1.f0;
import tw1.f;
import java.lang.Math;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import lnc.a1;
import com.yxcorp.gifshow.util.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import ekd.j;
import java.lang.Integer;

public class LiveRedPackRainSnatchView extends FrameLayout implements d	// class@000f31
{
    public KwaiImageView b;
    public TextView c;
    public TextView d;
    public View e;
    public TextView f;
    public KwaiImageView g;
    public TextView h;
    public LiveRedPackRainSnatchView$b i;
    public Animation j;
    public LiveRedPackRainResource k;
    public boolean l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public b q;
    public static final int r;

    public void LiveRedPackRainSnatchView(Context p0){
       super(p0, null);
    }
    public void LiveRedPackRainSnatchView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRedPackRainSnatchView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = false;
       a.c(p0, R.layout.arg_RES_7f0d0d8c, this);
       this.setClipChildren(false);
       this.setClipToPadding(false);
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackRainSnatchView.class, "5")) {
          return;
       }
       this.b.L(c0.a.b(p0));
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainSnatchView.class, "14")) {
          return;
       }
       LiveRedPackRainSnatchView tq = this.q;
       if (tq != null) {
          tq.dispose();
       }
       return;
    }
    public void c(boolean p0,long p1,long p2){
       LiveRedPackRainResource mGrabPrepare;
       LiveRedPackRainResource$RedPackRainButton mRedPackRain;
       if (PatchProxy.isSupport(LiveRedPackRainSnatchView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, LiveRedPackRainSnatchView.class, "2")) {
          return;
       }
       this.l = p0;
       this.m = p2;
       this.n = p1;
       if (p1 - null <= 0) {
          this.d();
       }else if(PatchProxy.isSupport(LiveRedPackRainSnatchView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p1), Long.valueOf(p2), this, LiveRedPackRainSnatchView.class, "6")){
          LiveRedPackRainSnatchView ti = this.i;
          if (ti != null && this.p == null) {
             ti.d();
          }
          if (this.l != null) {
             this.setOnClickListener(new a(this));
          }else if(p1 - 0x493e0 >= 0){
             this.setOnClickListener(new b(this));
          }
          this.b();
          ti = this.l;
          if (!PatchProxy.isSupport(LiveRedPackRainSnatchView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ti), this, LiveRedPackRainSnatchView.class, "7")) {
             String str = "/udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_count_down_bg.webp";
             String str1 = "#C23D01";
             if (ti != null) {
                ti = this.k;
                if (ti != null) {
                   mGrabPrepare = ti.mGrabPrepareCountDownButton;
                   if (mGrabPrepare != null) {
                      this.g(mGrabPrepare.mImageUrls, str);
                      mRedPackRain = mGrabPrepare.mRedPackRainText;
                      if (mRedPackRain != null) {
                         this.h.setTextColor(r.b(mRedPackRain.mTextColor, Color.parseColor(str1)));
                         this.d.setTextColor(r.b(mRedPackRain.mTextColor, Color.parseColor(str1)));
                         this.f.setTextColor(r.b(mRedPackRain.mTextColor, Color.parseColor(str1)));
                      }else {
                         this.h.setTextColor(Color.parseColor(str1));
                         this.d.setTextColor(Color.parseColor(str1));
                         this.f.setTextColor(Color.parseColor(str1));
                      }
                   }
                }
                this.a(str);
                this.h.setTextColor(Color.parseColor(str1));
                this.d.setTextColor(Color.parseColor(str1));
                this.f.setTextColor(Color.parseColor(str1));
             }else {
                ti = this.k;
                int i = 0x7f10266c;
                if (ti != null) {
                   mGrabPrepare = ti.mGrabPrepareReserveButton;
                   if (mGrabPrepare != null) {
                      this.g(mGrabPrepare.mImageUrls, str);
                      mRedPackRain = mGrabPrepare.mRedPackRainText;
                      if (mRedPackRain != null) {
                         this.d.setText(i);
                         this.d.setTextColor(r.b(mRedPackRain.mTextColor, Color.parseColor(str1)));
                         this.f.setTextColor(r.b(mRedPackRain.mTextColor, Color.parseColor(str1)));
                      }else {
                         this.d.setText(i);
                         this.d.setTextColor(Color.parseColor(str1));
                         this.f.setTextColor(Color.parseColor(str1));
                      }
                   }
                }
                this.a(str);
                this.d.setText(i);
                this.d.setTextColor(Color.parseColor(str1));
                this.f.setTextColor(Color.parseColor(str1));
             }
          }
          if (!PatchProxy.isSupport(LiveRedPackRainSnatchView.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p1), Long.valueOf(p2), this, LiveRedPackRainSnatchView.class, "8")) {
             this.e(p1, p2);
             this.q = f.d().b(p1, 1000).subscribe(new a(this, p2), Functions.e);
          }
       }
       this.p = true;
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainSnatchView.class, "3")) {
          return;
       }
       LiveRedPackRainSnatchView ti = this.i;
       if (ti != null) {
          ti.b();
       }
       this.setOnClickListener(new LiveRedPackRainSnatchView$a(this));
       this.b();
       this.h(this.c, 8);
       this.h(this.e, 8);
       this.h(this.h, 8);
       ti = this.k;
       if (ti != null) {
          this.g(ti.mGrabPrepareGrabImage, "/udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_snatch_coin.webp");
       }else {
          this.a("/udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_snatch_coin.webp");
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackRainSnatchView.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a24d1);
       this.c = m1.f(p0, 0x7f0a24bb);
       this.e = m1.f(p0, 0x7f0a24b8);
       this.d = m1.f(p0, 0x7f0a24ba);
       this.f = m1.f(p0, 0x7f0a24b9);
       this.g = m1.f(p0, 0x7f0a24d2);
       this.h = m1.f(p0, 0x7f0a24bc);
       f0.a(this.g, LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_POPUP_BTN_COIN_LIGHT);
       return;
    }
    public final void e(long p0,long p1){
       float f;
       if (PatchProxy.isSupport(LiveRedPackRainSnatchView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, LiveRedPackRainSnatchView.class, "10")) {
          return;
       }
       long l = f.a();
       f = 1000.00f;
       long l1 = 0xea60;
       int i = 0;
       if (p0 - l1 < 0) {
          this.h(this.e, 8);
          this.h(this.c, i);
          this.h(this.h, 8);
          this.c.setText(String.valueOf(Math.round(((float)p0 / f))));
       }else if(p0 - 0x493e0 < 0){
          this.h(this.e, i);
          this.h(this.c, 8);
          this.h(this.h, 8);
          p1 = p0 / l1;
          p0 = (long)Math.round(((float)(p0 % l1) / f));
          StringBuilder str = "";
          StringBuilder str1 = (p1 - 10 < 0)? "0"+p1: p1+"";
          str = str+str1+":";
          StringBuilder str2 = (p0 - 10 < 0)? "0"+p0: p0+"";
          this.d.setText(str+str2);
          this.f.setText(a1.p(R.string.arg_RES_7f10266f));
       }else if(DateUtils.I(p1, l)){
          String str3 = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(p1))+a1.p(0x7f10266f);
          if (this.l != null) {
             this.h(this.h, i);
             this.h(this.e, 8);
             this.h(this.c, 8);
             this.h.setText(str3);
          }else {
             this.h(this.h, 8);
             this.h(this.e, i);
             this.h(this.c, 8);
             this.f.setText(str3);
          }
       }else {
          int i1 = 0x7f102670;
          if (this.l != null) {
             this.h(this.h, i);
             this.h(this.e, 8);
             this.h(this.c, 8);
             if (DateUtils.r(l, p1) <= 1) {
                this.h.setText(i1);
             }else {
                this.h.setText(new SimpleDateFormat("MM.dd").format(new Date(p1))+a1.p(R.string.arg_RES_7f10266f));
             }
          }else {
             this.h(this.h, 8);
             this.h(this.e, i);
             this.h(this.c, 8);
             if (DateUtils.r(l, p1) <= 1) {
                this.f.setText(i1);
             }else {
                this.f.setText(new SimpleDateFormat("MM.dd").format(new Date(p1))+a1.p(R.string.arg_RES_7f10266f));
             }
          }
       }
       return;
    }
    public void f(boolean p0){
       if (PatchProxy.isSupport(LiveRedPackRainSnatchView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveRedPackRainSnatchView.class, "13")) {
          return;
       }
       if (this.l != null) {
          return;
       }
       this.c(p0, this.n, this.m);
       return;
    }
    public final void g(CDNUrl[] p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPackRainSnatchView.class, "4")) {
          return;
       }
       if (!j.h(p0)) {
          this.b.U(p0);
       }else {
          this.a(p1);
       }
       return;
    }
    public final void h(View p0,int p1){
       if (PatchProxy.isSupport(LiveRedPackRainSnatchView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveRedPackRainSnatchView.class, "17")) {
          return;
       }
       if (p0.getVisibility() == p1) {
          return;
       }
       p0.setVisibility(p1);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainSnatchView.class, "12")) {
          return;
       }
       super.onDetachedFromWindow();
       this.p = false;
       this.b();
       this.setTag(null);
       this.setOnClickListener(null);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainSnatchView.class, "11")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public void setOnSnatchViewListener(LiveRedPackRainSnatchView$b p0){
       this.i = p0;
    }
    public void setResource(LiveRedPackRainResource p0){
       this.k = p0;
    }
}
