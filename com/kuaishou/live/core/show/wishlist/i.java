package com.kuaishou.live.core.show.wishlist.i;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.wishlist.i$a;
import java.util.HashSet;
import java.util.ArrayList;
import nn2.o0;
import nn2.n0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.newpendant.top.helper.b;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCWishListOpened;
import lf3.g;
import java.util.Set;
import java.util.List;
import android.animation.AnimatorSet;
import com.kuaishou.live.widget.LivePkShimmerLayout;
import ekd.k1;
import android.animation.Animator;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.ValueAnimator;
import nn2.l0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.widget.ViewFlipper;
import android.view.ViewGroup$LayoutParams;
import java.util.Collection;
import ekd.q;
import d61.h;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import lnc.a1;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import nn2.m0;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.wishlist.LiveWishListResourcePathConstant;
import l12.d;
import va1.f0;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$WishListEntry;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import com.kuaishou.live.core.show.wishlist.h;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlist.k;
import java.util.Map;
import java.util.HashMap;

public abstract class i extends c implements g	// class@0012de
{
    public b A;
    public final g B;
    public m p;
    public i$b q;
    public Set r;
    public View s;
    public KwaiImageView t;
    public TextView u;
    public View v;
    public LivePkShimmerLayout w;
    public AnimatorSet x;
    public List y;
    public long z;
    public static String sLivePresenterClassName = "LiveWishCompleteResultBasePresenter";

    public void i(){
       super();
       this.q = new i$a(this);
       this.r = new HashSet();
       this.y = new ArrayList();
       this.z = 500;
       this.A = new o0(this);
       this.B = new n0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       if (b.d(this)) {
          return;
       }
       if (!this.X8()) {
          return;
       }
       this.p.u().u0(410, LiveStreamMessages$SCWishListOpened.class, this.B);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       this.R8();
       this.p.u().o(410, this.B);
       i tr = this.r;
       if (tr != null) {
          tr.clear();
          this.r = null;
       }
       tr = this.y;
       if (tr != null) {
          tr.clear();
          this.y = null;
       }
       return;
    }
    public abstract boolean P8();
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, i.class, "15")) {
          return;
       }
       i tx = this.x;
       if (tx != null) {
          tx.removeAllListeners();
          this.x.end();
          this.x = null;
       }
       tx = this.w;
       if (tx != null) {
          tx.n();
       }
       k1.n(this);
       return;
    }
    public final Animator S8(int p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float[] uofloatArray = new float[]{(float)p0,(float)p1};
       ObjectAnimator objectAnimat = j.a(this.s, uofloatArray);
       objectAnimat.setDuration(this.z);
       return objectAnimat;
    }
    public final Animator V8(int p0,int p1){
       int[] obj;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oi, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new int[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(obj);
       valueAnimato.addUpdateListener(new l0(this));
       valueAnimato.setDuration(this.z);
       return valueAnimato;
    }
    public abstract ViewFlipper W8();
    public abstract boolean X8();
    public final void Y8(View p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "13")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = p1;
       p0.setLayoutParams(layoutParams);
       return;
    }
    public abstract boolean Z8();
    public void a9(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "5")) {
          return;
       }
       ViewFlipper viewFlipper = this.W8();
       if (viewFlipper == null) {
          return;
       }
       if (!this.P8()) {
          return;
       }
       i = 1;
       if (q.f(this.y)) {
          if (!PatchProxy.applyVoid(objArray, this, oi, "14")) {
             ViewFlipper viewFlipper1 = this.W8();
             if (viewFlipper1 != null && (!viewFlipper1.isFlipping() && viewFlipper1.getChildCount() > i)) {
                viewFlipper1.startFlipping();
             }
          }
          return;
       }else {
          int i1 = 0;
          if (!PatchProxy.applyVoid(objArray, this, oi, "10") && this.s == null) {
             View view = h.f(this.m8(), R.id.live_wish_list_complete_result_view_stub, 0x7f0a2849);
             this.v = view;
             this.s = view.findViewById(0x7f0a2848);
             this.t = this.v.findViewById(0x7f0a283a);
             this.u = this.v.findViewById(0x7f0a283b);
             LivePkShimmerLayout livePkShimme = this.v.findViewById(R.id.live_wish_list_complete_shimmer_view);
             this.w = livePkShimme;
             int[] ointArray = new int[]{a1.a(0x7f0615f2),a1.a(0x7f0615f3),a1.a(0x7f0615f4),a1.a(0x7f0615f5),a1.a(0x7f0615f6)};
             livePkShimme.setGradientColors(ointArray);
             this.w.setGradientPosition(new float[5]{0x3e4ccccd,0x3f000000,0x3f266666,0x3f4ccccd,0x3f4f5c29});
             this.w.setTimeInterpolator(new DecelerateInterpolator(0x3fc00000));
             this.s.setOnClickListener(new m0(this));
             f0.a(this.t, LiveWishListResourcePathConstant.LIVE_ICON_WISH_M_NORMAL);
          }
          i tv = this.v;
          if (tv != null && tv.getVisibility() == 8) {
             LiveStreamMessages$WishListEntry wishListEntr = this.y.remove(i1);
             b.c0(LiveLogTag.WISH_LIST, "startWishCompleteResultExpandAnimation", "wishId", wishListEntr.wishId);
             if (!PatchProxy.applyVoidOneRefs(wishListEntr, this, oi, "9")) {
                Gift gift = a.a(wishListEntr.giftId);
                if (gift != null) {
                   this.t.P(gift.mImageUrl);
                   this.u.setText("x"+wishListEntr.displayExpectCount+" "+a1.p(R.string.arg_RES_7f102f23));
                   LinearGradient linearGradie = new LinearGradient(0, 0, (this.u.getPaint().getTextSize() * (float)this.u.getText().length()), 0, a1.a(0x7f0615f1), a1.a(0x7f0615f0), Shader$TileMode.CLAMP);
                   this.u.getPaint().setShader(gift);
                }
             }
             this.v.setVisibility(4);
             this.Y8(this.v, -2);
             this.Y8(this.s, -1);
             k1.p(new h(this, viewFlipper), this);
          }
          return;
       }
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i.class, new k());
       }else {
          obj.put(i.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       return;
    }
}
