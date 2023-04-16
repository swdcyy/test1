package com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxComboTextAnimationView;
import android.widget.LinearLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import java.util.LinkedList;
import ph1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.basic.tools.l;
import e93.f;
import java.util.List;
import android.view.animation.Animation;
import android.view.View;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Runnable;
import hc.a;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import com.kuaishou.live.core.show.gift.LiveGiftResourcePathConstant;
import l12.d;
import va1.f0;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import java.util.Map;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.ValueAnimator;
import ph1.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.a;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collections;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;

public class LiveGiftBoxComboTextAnimationView extends LinearLayout	// class@001171
{
    public final SparseArray b;
    public final List c;
    public final List d;
    public LinearLayout e;
    public KwaiImageView f;
    public KwaiImageView g;
    public KwaiImageView h;
    public int i;
    public a j;
    public boolean k;
    public final Runnable l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int[] q;

    static {
       LiveGiftBoxComboTextAnimationView.m = a1.e(0x41f80000);
       LiveGiftBoxComboTextAnimationView.n = - a1.e(75.00f);
       LiveGiftBoxComboTextAnimationView.o = a1.e(25.00f);
       LiveGiftBoxComboTextAnimationView.p = - a1.e(25.00f);
       LiveGiftBoxComboTextAnimationView.q = new int[10]{0x7f0804b0,0x7f0804b1,0x7f0804b2,0x7f0804b3,0x7f0804b4,0x7f0804b5,0x7f0804b6,0x7f0804b7,0x7f0804b8,0x7f0804b9};
    }
    public void LiveGiftBoxComboTextAnimationView(Context p0){
       super(p0, null, 0);
    }
    public void LiveGiftBoxComboTextAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftBoxComboTextAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new SparseArray(10);
       this.c = new LinkedList();
       this.d = new LinkedList();
       this.l = new b(this);
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxComboTextAnimationView.class, "5")) {
          return;
       }
       this.i = -1;
       this.setVisibility(8);
       l.j(this.f);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxComboTextAnimationView.class, "3")) {
          return;
       }
       f.g(this);
       this.a();
       this.d.clear();
       this.c.clear();
       this.b.clear();
       this.e.removeAllViews();
       Animation animation = this.getAnimation();
       if (animation != null) {
          animation.cancel();
       }
       return;
    }
    public void c(int p0,View p1,boolean p2,boolean p3){
       int i1;
       int i2;
       int i3;
       RelativeLayout$LayoutParams layoutParams;
       int i4;
       LiveGiftResourcePathConstant lIVE_GIFT_BO;
       ValueAnimator lIVE_GIFT_BO1;
       AnimatorSet uAnimatorSet;
       Animator[] uAnimatorArr;
       LiveGiftBoxComboTextAnimationView liveGiftBoxC = this;
       int i = p0;
       if (PatchProxy.isSupport(LiveGiftBoxComboTextAnimationView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, LiveGiftBoxComboTextAnimationView.class, "2")) {
          return;
       }
       LiveGiftBoxComboTextAnimationView liveGiftBoxC1 = 2;
       LiveGiftBoxComboTextAnimationView liveGiftBoxC2 = 1;
       LiveGiftBoxComboTextAnimationView liveGiftBoxC3 = (p2)? 1: 2;
       if (i < liveGiftBoxC3) {
          this.a();
          return;
       }else {
          long l = 150;
          if (i == liveGiftBoxC.i) {
             f.f(liveGiftBoxC.l);
             f.k("hideComboView", liveGiftBoxC.l, liveGiftBoxC, l);
             return;
          }else {
             liveGiftBoxC.i = i;
             if (p3) {
                LiveGiftBoxComboTextAnimationView j = liveGiftBoxC.j;
                if (j == null || !j.isRunning()) {
                   if (PatchProxy.isSupport(LiveGiftBoxComboTextAnimationView.class)) {
                      if (!PatchProxy.applyVoidTwoRefs(p1, Boolean.valueOf(p2), liveGiftBoxC, LiveGiftBoxComboTextAnimationView.class, "4")) {
                      }
                   }else {
                      int b = p1;
                   }
                }
             }
          label_0181 :
             if (!PatchProxy.isSupport(LiveGiftBoxComboTextAnimationView.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p2), Integer.valueOf(p0), liveGiftBoxC, LiveGiftBoxComboTextAnimationView.class, "7")) {
                if (!p2) {
                   liveGiftBoxC.d(false, i);
                }else if(PatchProxy.isSupport(LiveGiftBoxComboTextAnimationView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), liveGiftBoxC, LiveGiftBoxComboTextAnimationView.class, "8")){
                   if (LiveGiftComboButtonAnimationUtils.h.c().containsKey(Integer.valueOf(p0))) {
                      if (!PatchProxy.isSupport(LiveGiftBoxComboTextAnimationView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), liveGiftBoxC, LiveGiftBoxComboTextAnimationView.class, "9")) {
                         l.j(liveGiftBoxC.f);
                         liveGiftBoxC.setComboTextVisibility(8);
                         liveGiftBoxC.f.setVisibility(false);
                         liveGiftBoxC.f.post(new a(liveGiftBoxC, i));
                      }
                   }else {
                      liveGiftBoxC1 = liveGiftBoxC.j;
                      if (liveGiftBoxC1 == null || !liveGiftBoxC1.isRunning()) {
                         liveGiftBoxC.d(liveGiftBoxC2, i);
                      }
                   }
                }
             }
             f.f(liveGiftBoxC.l);
             l = (p2)? 1000: 150;
             f.k("hideComboView", liveGiftBoxC.l, liveGiftBoxC, l);
             return;
          }
       }
    }
    public final void d(boolean p0,int p1){
       ArrayList uArrayList;
       int i;
       ImageView imageView;
       Bitmap uBitmap;
       if (PatchProxy.isSupport(LiveGiftBoxComboTextAnimationView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, LiveGiftBoxComboTextAnimationView.class, "10")) {
          return;
       }
       this.setComboTextVisibility(0);
       if (p1 <= 0) {
          return;
       }
       if (PatchProxy.isSupport(LiveGiftBoxComboTextAnimationView.class)) {
          uArrayList = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, LiveGiftBoxComboTextAnimationView.class, "11");
          if (uArrayList != PatchProxyResult.class) {
          label_0053 :
             if (uArrayList.size() > this.c.size()) {
                p1 = uArrayList.size() - this.c.size();
                for (i = 0; i < p1; i = i + 1) {
                   this.c.add(this.getComboNumberImageView());
                }
             }else if(uArrayList.size() < this.c.size()){
                p1 = this.c.size() - 1;
                i = uArrayList.size() - 1;
                while (p1 > i) {
                   imageView = this.c.remove(p1);
                   this.e.removeView(imageView);
                   this.d.add(imageView);
                   p1--;
                }
             }
             for (p1 = 0; p1 < uArrayList.size(); p1++) {
                imageView = this.c.get(p1);
                int i1 = LiveGiftBoxComboTextAnimationView.q[uArrayList.get(p1).intValue()];
                if (PatchProxy.isSupport(LiveGiftBoxComboTextAnimationView.class)) {
                   uBitmap = PatchProxy.applyOneRefs(Integer.valueOf(i1), this, LiveGiftBoxComboTextAnimationView.class, "14");
                   if (uBitmap != PatchProxyResult.class) {
                   }else {
                   label_00e0 :
                      uBitmap = this.b.get(i1);
                      if (uBitmap == null) {
                         uBitmap = BitmapFactory.decodeResource(a1.m(), i1);
                         int m = LiveGiftBoxComboTextAnimationView.m;
                         if (uBitmap.getHeight() != m && uBitmap.getHeight()) {
                            int i2 = uBitmap.getWidth() * m;
                            float f = (float)i2 * 0x3f800000;
                            f = f / (float)uBitmap.getHeight();
                            uBitmap = BitmapUtil.U(uBitmap, (int)f, m, Bitmap$Config.ARGB_8888, 0);
                         }
                         this.b.put(i1, uBitmap);
                      }
                   }
                }else {
                   goto label_00e0 ;
                }
                imageView.setImageBitmap(uBitmap);
             }
             return;
          }
       }
       uArrayList = new ArrayList();
       while (p1 > 0) {
          i = p1 % 10;
          uArrayList.add(Integer.valueOf(i));
          p1 = p1 / 10;
       }
       Collections.reverse(uArrayList);
       goto label_0053 ;
    }
    public final ImageView getComboNumberImageView(){
       ImageView obj = PatchProxy.apply(null, this, LiveGiftBoxComboTextAnimationView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (!this.d.isEmpty())? this.d.remove(0): new ImageView(this.getContext());
       this.e.addView(obj, -2, -2);
       return obj;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxComboTextAnimationView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.e = this.findViewById(0x7f0a1d1c);
       this.f = this.findViewById(0x7f0a1d1d);
       this.g = this.findViewById(0x7f0a1d2b);
       this.h = this.findViewById(0x7f0a1d2e);
       LiveGiftResourcePathConstant lIVE_GIFT_BO = LiveGiftResourcePathConstant.LIVE_GIFT_BOX_COMBO_SEND_ANIMATION_TEXT;
       f0.a(this.g, lIVE_GIFT_BO);
       f0.a(this.h, lIVE_GIFT_BO);
       return;
    }
    public void setComboTextVisibility(int p0){
       LiveGiftBoxComboTextAnimationView tg;
       if (PatchProxy.isSupport(LiveGiftBoxComboTextAnimationView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftBoxComboTextAnimationView.class, "6")) {
          return;
       }
       if (this.k != null) {
          tg = this.g;
          if (tg != null) {
             tg.setVisibility(p0);
          }else {
          label_0023 :
             tg = this.h;
             if (tg != null) {
                tg.setVisibility(p0);
             }
          }
       }else {
          goto label_0023 ;
       }
       tg = this.e;
       if (tg != null) {
          tg.setVisibility(p0);
       }
       return;
    }
}
