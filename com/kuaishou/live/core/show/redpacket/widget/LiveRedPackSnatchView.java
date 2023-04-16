package com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView;
import ml8.d;
import gi2.f;
import yo3.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.lang.Boolean;
import pp.a;
import q87.c;
import hi2.e;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt___CollectionsKt;
import yb7.a;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;
import d61.h;
import java.lang.Integer;
import com.kwai.library.widget.progressbar.RedPacketCircleProgressBar;
import qo3.a;
import android.graphics.drawable.GradientDrawable;
import gi2.e;
import yo3.b;
import dx1.c;
import dx1.b;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.model.CDNUrl;
import ro3.g$c;
import ro3.g;
import android.os.CountDownTimer;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView$a;
import android.view.View$OnClickListener;
import java.lang.Long;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView$c;
import li2.a;
import android.widget.ProgressBar;
import com.kuaishou.live.core.show.redpacket.widget.a;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import lnc.e0;
import com.kuaishou.live.core.show.redpacket.widget.LiveRedPackSnatchView$b;
import ro3.g$d;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import java.lang.System;
import ekd.j;
import android.net.Uri;
import xkd.b;
import java.io.File;
import uo3.l;
import com.facebook.imagepipeline.request.ImageRequest;
import s0d.f;
import s0d.e;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import ro3.f;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import l12.d;
import va1.f0;
import d61.f0;

public class LiveRedPackSnatchView extends FrameLayout implements d, f, a	// class@000fc1
{
    public final String b;
    public RedPacketCircleProgressBar c;
    public KwaiImageView d;
    public TextView e;
    public TextView f;
    public View g;
    public TextView h;
    public KwaiImageView i;
    public LiveRedPackSnatchView$c j;
    public Animatable k;
    public CountDownTimer l;
    public e m;
    public b n;
    public static final int o;

    public void LiveRedPackSnatchView(Context p0){
       super(p0, null);
    }
    public void LiveRedPackSnatchView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRedPackSnatchView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = this.getClass().getSimpleName()+"@"+this.hashCode();
       this.d(p0);
       this.setClipChildren(false);
       this.setClipToPadding(false);
    }
    public void B3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoid(null, this, LiveRedPackSnatchView.class, "15")) {
          return;
       }
       if (this.m == null) {
          return;
       }
       int i = 0x7f0a250d;
       e tag = this.i.getTag(i);
       boolean b = (tag != null && tag instanceof Boolean)? tag.booleanValue(): false;
       Object[] objArray = new Object[0];
       a.C().t(this.b, "applySkinTheme-> "+this.m+" ->applyTheme:"+b, objArray);
       if (!b) {
          this.i.setTag(i, Boolean.TRUE);
          tag = this.m.d;
          if (!q.f(tag)) {
             this.y4(this.i, tag);
          }else {
             LiveRedPackSnatchView tm = this.m;
             Objects.requireNonNull(tm);
             int[] ointArray1 = PatchProxy.apply(null, tm, e.class, "5");
             if (ointArray1 != patchProxyRe) {
             }else {
                ointArray1 = CollectionsKt___CollectionsKt.F5(tm.c);
             }
             if (!a.b(ointArray1)) {
                this.i.setBackground(h.c(GradientDrawable$Orientation.TOP_BOTTOM, ointArray1));
             }
          }
          tag = this.m.a;
          if (tag != null) {
             this.c.setProgressColor(tag.intValue());
          }
          tag = this.m.b;
          if (tag != null) {
             GradientDrawable$Orientation tOP_BOTTOM = GradientDrawable$Orientation.TOP_BOTTOM;
             int[] ointArray = new int[]{tag.intValue()};
             GradientDrawable gradientDraw = PatchProxy.applyTwoRefs(tOP_BOTTOM, ointArray, null, a.class, "2");
             if (gradientDraw != patchProxyRe) {
             }else {
                gradientDraw = new GradientDrawable();
                gradientDraw.setShape(1);
                gradientDraw.setOrientation(tOP_BOTTOM);
                gradientDraw.setColor(ointArray[0]);
             }
             this.setBackground(gradientDraw);
          }
          this.b();
       }
       return;
    }
    public void I4(KwaiImageView p0,List p1){
       e.d(this, p0, p1);
    }
    public void R5(KwaiImageView p0,List p1){
       e.e(this, p0, p1);
    }
    public void R7(KwaiImageView p0,List p1,int p2){
       e.c(this, p0, p1, p2);
    }
    public void S4(KwaiImageView p0,List p1){
       e.a(this, p0, p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackSnatchView.class, "18")) {
          return;
       }
       c.a.a(this.getRedPacketSimpleExtra(), p0.a, p0.b, TextUtils.k(p0.c));
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRedPackSnatchView.class, "14")) {
          return;
       }
       if (this.m == null) {
          return;
       }
       LiveRedPackSnatchView tag = this.d.getTag(R.id.live_red_skin_snatch_btn);
       g$c uoc = null;
       boolean b = (tag != null && tag instanceof Boolean)? tag.booleanValue(): false;
       b.Z(LiveLogTag.LIVE_RED_PACKET_SKIN, "applySnatchViewSkinTheme->applyBtnTheme: "+b);
       if (!b) {
          tag = this.m;
          Objects.requireNonNull(tag);
          objArray = PatchProxy.apply(objArray, tag, e.class, "7");
          if (objArray != PatchProxyResult.class) {
          }else {
             CDNUrl[] uCDNUrlArray = new CDNUrl[uoc];
             Object[] objArray1 = tag.e.toArray(uCDNUrlArray);
             Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
             objArray = objArray1;
          }
          if (!a.c(objArray)) {
             g.a(this.d, new g$c(objArray));
             this.d.setTag(R.id.live_red_skin_snatch_btn, Boolean.TRUE);
          }
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackSnatchView.class, "10")) {
          return;
       }
       LiveRedPackSnatchView tl = this.l;
       if (tl != null) {
          tl.cancel();
          this.l = null;
       }
       return;
    }
    public void d(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackSnatchView.class, "1")) {
          return;
       }
       a.c(p0, R.layout.arg_RES_7f0d0d8f, this);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPackSnatchView.class, "7")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a24de);
       this.c = m1.f(p0, 0x7f0a24a5);
       this.e = m1.f(p0, 0x7f0a24a6);
       this.g = m1.f(p0, 0x7f0a24a2);
       this.f = m1.f(p0, 0x7f0a24a4);
       this.h = m1.f(p0, 0x7f0a24a3);
       this.i = m1.f(p0, 0x7f0a24a1);
       m1.a(p0, new LiveRedPackSnatchView$a(this), R.id.live_red_pack_snatch_image_view);
       return;
    }
    public void e(long p0,long p1){
       if (PatchProxy.isSupport(LiveRedPackSnatchView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, LiveRedPackSnatchView.class, "2")) {
          return;
       }
       LiveRedPackSnatchView liveRedPackS = null;
       if (p0 - liveRedPackS <= 0 || p1 - liveRedPackS <= 0) {
          this.f();
       }else if(PatchProxy.isSupport(LiveRedPackSnatchView.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, LiveRedPackSnatchView.class, "8")){
          liveRedPackS = this.j;
          if (liveRedPackS != null) {
             liveRedPackS.d();
          }
          this.setOnClickListener(new a(this));
          this.h();
          this.i.setVisibility(0);
          this.j(this.c, 0);
          this.j(this.d, 8);
          this.c.setMax((int)p1);
          this.c();
          a uoa = new a(this, p0, 100);
          this.l = p1;
          p1.start();
       }
       this.B3();
       return;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRedPackSnatchView.class, "11")) {
          return;
       }
       this.d.setClickable(true);
       this.setOnClickListener(objArray);
       this.c();
       this.setBackground(new ColorDrawable(a1.a(R.color.arg_RES_7f062030)));
       this.i.setVisibility(8);
       this.j(this.d, 0);
       this.j(this.e, 8);
       this.j(this.g, 8);
       this.j(this.c, 8);
       this.i();
       LiveRedPackSnatchView tj = this.j;
       if (tj != null) {
          tj.b();
       }
       return;
    }
    public void g(){
       Object[] objArray1;
       String str;
       ImageRequest imageRequest;
       String str1;
       CDNUrl[] uCDNUrlArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveRedPackSnatchView.class, "16")) {
          return;
       }
       this.d.setImageDrawable(objArray);
       LiveRedPackSnatchView tm = this.m;
       if (tm != null) {
          Objects.requireNonNull(tm);
          objArray1 = PatchProxy.apply(objArray, tm, e.class, "9");
          if (objArray1 != PatchProxyResult.class) {
          }else {
             uCDNUrlArray1 = new CDNUrl[0];
             Object[] objArray2 = tm.f.toArray(uCDNUrlArray1);
             Objects.requireNonNull(objArray2, "null cannot be cast to non-null type kotlin.Array<T>");
             objArray1 = objArray2;
          }
       }else {
          uCDNUrlArray1 = e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_RED_PACKET_SNATCH_ANIMATION.getResourcePath()));
       }
       tm = this.d;
       g$c uoc = new g$c(objArray1, -1);
       uoc.f = this;
       uoc.g(new LiveRedPackSnatchView$b(this));
       if (!PatchProxy.applyVoidTwoRefs(tm, uoc, objArray, g.class, "3")) {
          CDNUrl[] uCDNUrlArray = uoc.a();
          d uod = Fresco.newDraweeControllerBuilder();
          long l = System.currentTimeMillis();
          if (j.h(uCDNUrlArray)) {
             uod.D(b.c(uoc.c()));
             str = "placeHolder";
          }else {
             l a = g.a;
             if (a != null) {
                objArray = a.d(uCDNUrlArray);
             }
             if (objArray != null) {
                imageRequest = ImageRequest.a(objArray);
                str1 = "localCache";
             }else {
                imageRequest = f.x().r(uCDNUrlArray).v();
                str1 = "network";
             }
             uod.w(imageRequest);
             str = str1;
          }
          g.g("bindSkinLocalAnimFile start, anim from "+str+g.f("io", l, uCDNUrlArray));
          d uod1 = uod.r(uoc.b());
          uod1.y(tm.getController());
          f uof = new f(l, uCDNUrlArray, uoc, str);
          uod1.s(uod);
          uod1.q(true);
          tm.setController(uod1.e());
       }
       return;
    }
    public b getRedPacketSimpleExtra(){
       return this.n;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackSnatchView.class, "9")) {
          return;
       }
       int[] ointArray = new int[]{a1.a(0x7f060cf1)};
       this.setBackground(h.c(GradientDrawable$Orientation.BR_TL, ointArray));
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackSnatchView.class, "12")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_RED_PACKET_SKIN, "updateSnatchImage-> "+this.m);
       if (this.m == null) {
          f0.a(this.d, LiveRedPacketResourcePathConstant.LIVE_RED_PACK_SNATCH_ICON);
       }else {
          this.b();
       }
       return;
    }
    public final void j(View p0,int p1){
       if (PatchProxy.isSupport(LiveRedPackSnatchView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveRedPackSnatchView.class, "17")) {
          return;
       }
       if (p0.getVisibility() == p1) {
          return;
       }
       p0.setVisibility(p1);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackSnatchView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.c();
       this.setTag(null);
       this.setOnClickListener(null);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackSnatchView.class, "5")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       TextView[] textViewArra = new TextView[]{this.h,this.f};
       f0.h("sans-serif-medium", textViewArra);
       int[] ointArray = new int[]{a1.a(0x7f060d08),a1.a(0x7f060cf8)};
       this.i.setBackground(h.c(GradientDrawable$Orientation.TOP_BOTTOM, ointArray));
       return;
    }
    public void setOnSnatchViewListener(LiveRedPackSnatchView$c p0){
       this.j = p0;
    }
    public void y4(KwaiImageView p0,List p1){
       e.b(this, p0, p1);
    }
}
