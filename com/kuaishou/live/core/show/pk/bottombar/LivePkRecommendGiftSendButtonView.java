package com.kuaishou.live.core.show.pk.bottombar.LivePkRecommendGiftSendButtonView;
import androidx.constraintlayout.widget.ConstraintLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.animation.AnimatorSet;
import java.lang.Float;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.yxcorp.utility.n;
import z12.x;
import com.kuaishou.live.common.core.basic.tools.l;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import hc.b;
import android.graphics.Bitmap;
import cm1.a;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import id2.n;
import erd.g;
import io.reactivex.internal.functions.Functions;
import sw1.c;
import java.util.Locale;
import com.yxcorp.utility.TextUtils;
import java.math.BigDecimal;
import java.lang.StringBuilder;
import java.lang.Double;
import java.lang.CharSequence;
import id2.u;

public class LivePkRecommendGiftSendButtonView extends ConstraintLayout	// class@000d7a
{
    public KwaiImageView B;
    public KwaiImageView C;
    public View D;
    public TextView E;
    public TextView F;
    public u G;
    public b H;
    public AnimatorSet I;
    public static final int J;
    public static final int K;

    static {
       LivePkRecommendGiftSendButtonView.J = a1.e(33.00f);
       LivePkRecommendGiftSendButtonView.K = a1.e(27.00f);
    }
    public void LivePkRecommendGiftSendButtonView(Context p0){
       super(p0, null);
    }
    public void LivePkRecommendGiftSendButtonView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePkRecommendGiftSendButtonView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.k(this, R.layout.arg_RES_7f0d0d01, true);
       if (PatchProxy.applyVoidOneRefs(this, this, LivePkRecommendGiftSendButtonView.class, "7")) {
       }else {
          this.B = m1.f(this, 0x7f0a1925);
          this.C = m1.f(this, 0x7f0a1924);
          this.D = m1.f(this, 0x7f0a1927);
          this.E = m1.f(this, 0x7f0a1928);
          this.F = m1.f(this, 0x7f0a1926);
       }
       return;
    }
    public final AnimatorSet L(float p0,float p1,long p2){
       ObjectAnimator obj;
       if (PatchProxy.isSupport(LivePkRecommendGiftSendButtonView.class)) {
          obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Long.valueOf(p2), this, LivePkRecommendGiftSendButtonView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float[] uofloatArray = new float[]{p0,p1};
       obj = ObjectAnimator.ofFloat(this.C, View.SCALE_X, uofloatArray);
       float[] uofloatArray1 = new float[]{p0,p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.C, View.SCALE_Y, uofloatArray1);
       obj.setRepeatMode(2);
       obj.setRepeatCount(-1);
       objectAnimat.setRepeatMode(2);
       objectAnimat.setRepeatCount(-1);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{obj,objectAnimat};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(500);
       uAnimatorSet.setStartDelay(p2);
       return uAnimatorSet;
    }
    public void M(){
       if (PatchProxy.applyVoid(null, this, LivePkRecommendGiftSendButtonView.class, "4")) {
          return;
       }
       this.setVisibility(8);
       View[] viewArray = new View[]{this.B};
       n.Z(8, viewArray);
       viewArray = new View[]{this.C};
       n.Z(8, viewArray);
       View[] viewArray1 = new View[]{this.D};
       n.Z(8, viewArray1);
       x.I(this.I);
       l.j(this.B);
       b9.a(this.H);
       return;
    }
    public void N(CDNUrl[] p0,int p1,int p2){
       if (PatchProxy.isSupport(LivePkRecommendGiftSendButtonView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LivePkRecommendGiftSendButtonView.class, "1")) {
          return;
       }
       int i = 0;
       this.setVisibility(i);
       View[] viewArray = new View[]{this.B};
       n.Z(i, viewArray);
       viewArray = new View[]{this.C};
       n.Z(i, viewArray);
       viewArray = new View[]{this.D};
       n.Z(i, viewArray);
       if (!PatchProxy.isSupport(LivePkRecommendGiftSendButtonView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), this, LivePkRecommendGiftSendButtonView.class, "8")) {
          ViewGroup$LayoutParams layoutParams = this.C.getLayoutParams();
          if (!p2) {
             p2 = LivePkRecommendGiftSendButtonView.J;
             layoutParams.width = p2;
             layoutParams.height = p2;
          }else if(p2 == 1){
             layoutParams.width = LivePkRecommendGiftSendButtonView.K;
             layoutParams.height = LivePkRecommendGiftSendButtonView.J;
          }
          this.C.setLayoutParams(layoutParams);
       }
       if (!PatchProxy.applyVoid(null, this, LivePkRecommendGiftSendButtonView.class, "9")) {
          x.I(this.I);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          this.I = uAnimatorSet;
          Animator[] uAnimatorArr = new Animator[]{this.L(0x3f800000, 0x3f666666, 0),this.L(0x3f666666, 0x3f800000, 500)};
          uAnimatorSet.playTogether(uAnimatorArr);
          this.I.start();
       }
       l.c(this.B, p0, Integer.MAX_VALUE, null);
       this.C.setImageBitmap(a.b(p1));
       return;
    }
    public void O(long p0){
       if (PatchProxy.isSupport(LivePkRecommendGiftSendButtonView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LivePkRecommendGiftSendButtonView.class, "6")) {
          return;
       }
       b9.a(this.H);
       long l = 0;
       if (p0 - l < 0) {
          return;
       }
       this.H = t.interval(l, 1, TimeUnit.SECONDS).take((1 + p0)).observeOn(d.a).subscribe(new n(this, p0), Functions.d());
       return;
    }
    public void setGiftValue(long p0){
       String[] stringArray;
       double d1;
       String[] stringArray1;
       Object[] objArray;
       Object obj = this;
       long l = p0;
       String str = "5";
       if (PatchProxy.isSupport(LivePkRecommendGiftSendButtonView.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), obj, LivePkRecommendGiftSendButtonView.class, str)) {
          return;
       }
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          stringArray = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uoc, str);
          if (stringArray != PatchProxyResult.class) {
          }else {
          label_0036 :
             Locale default = Locale.getDefault();
             String str1 = "%.0f";
             double d = 10.00f;
             if ((TextUtils.L(default.getLanguage())).equals("zh") && (TextUtils.L(default.getCountry())).equals("cn")) {
                if (l - 9999 <= 0) {
                   stringArray = new String[]{String.valueOf(p0),""};
                }else {
                   d1 = new BigDecimal(((float)l / 10000.00f)+"").setScale(1, 4).doubleValue();
                   if (d1 - 0x40c3878000000000 <= 0) {
                      stringArray1 = new String[2];
                      if ((int)(d * d1) % 10) {
                         str1 = "%.1f";
                      }
                      objArray = new Object[]{Double.valueOf(d1)};
                      stringArray1[0] = String.format(str1, objArray);
                      stringArray1[1] = "Íò";
                   }else {
                      d1 = new BigDecimal((d1 / 10000.00f)+"").setScale(1, 4).doubleValue();
                      stringArray1 = new String[2];
                      if ((int)(d * d1) % 10) {
                         str1 = "%.1f";
                      }
                      objArray = new Object[]{Double.valueOf(d1)};
                      stringArray1[0] = String.format(str1, objArray);
                      stringArray1[1] = "ÒÚ";
                   }
                }
             }else if(l - 999 <= 0){
                stringArray = new String[]{String.valueOf(p0),""};
             }else {
                d1 = new BigDecimal(((float)l / 1000.00f)+"").setScale(1, 4).doubleValue();
                int i = 0x408f380000000000;
                if (d1 - i <= 0) {
                   stringArray1 = new String[2];
                   if ((int)(d * d1) % 10) {
                      str1 = "%.1f";
                   }
                   objArray = new Object[]{Double.valueOf(d1)};
                   stringArray1[0] = String.format(str1, objArray);
                   stringArray1[1] = "k";
                }else {
                   d1 = new BigDecimal((d1 / 0x408f400000000000)+"").setScale(1, 4).doubleValue();
                   if (d1 - i < 0) {
                      stringArray1 = new String[2];
                      if ((int)(d * d1) % 10) {
                         str1 = "%.1f";
                      }
                      objArray = new Object[]{Double.valueOf(d1)};
                      stringArray1[0] = String.format(str1, objArray);
                      stringArray1[1] = "m";
                   }else {
                      d1 = new BigDecimal((d1 / 0x408f400000000000)+"").setScale(1, 4).doubleValue();
                      stringArray1 = new String[2];
                      if ((int)(d * d1) % 10) {
                         str1 = "%.1f";
                      }
                      objArray = new Object[]{Double.valueOf(d1)};
                      stringArray1[0] = String.format(str1, objArray);
                      stringArray1[1] = "b";
                   }
                }
             }
             stringArray = stringArray1;
          }
       }else {
          goto label_0036 ;
       }
       obj.E.setText(stringArray[0]);
       obj.F.setText(stringArray[1]+"·Ö");
       return;
    }
    public void setPkRecommendGiftViewDelegate(u p0){
       this.G = p0;
    }
}
