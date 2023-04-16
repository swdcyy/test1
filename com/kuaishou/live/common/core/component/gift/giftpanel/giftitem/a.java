package com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.a;
import androidx.collection.ArrayMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftTagView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIMarkLabel;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIDynamicTextLabel;
import java.lang.Long;
import androidx.collection.SimpleArrayMap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveClipBoundTextView;
import android.text.TextPaint;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import android.widget.TextView;
import zi1.e;
import android.animation.ValueAnimator;
import vl1.r;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import vl1.s;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.a$a;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet$Builder;

public class a	// class@0012d9
{
    public boolean a;
    public a$b b;
    public Animator c;
    public final LiveGiftTagView d;
    public final View e;
    public static final ArrayMap f;

    static {
       a.f = new ArrayMap();
    }
    public void a(LiveGiftTagView p0,View p1){
       super();
       this.a = false;
       this.d = p0;
       this.e = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       a tc = this.c;
       if (tc != null) {
          tc.cancel();
          this.c.removeAllListeners();
       }
       this.d.a();
       return;
    }
    public void b(String p0,UIMarkLabel p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "6")) {
          return;
       }
       if (p1 == null || (p1.c() != null && this.c != null)) {
          if (p2) {
             a.f.put(p0, Long.valueOf((this.c() + p1.a())));
          }
          this.c.cancel();
          this.c.removeAllListeners();
       }
    label_0045 :
       return;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return System.currentTimeMillis();
    }
    public Animator d(LiveGiftTagView p0,boolean p1){
       LiveClipBoundTextView obj;
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "10");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = p0.getDynamicView();
       UIMarkLabel dynamicData = p0.getDynamicData();
       Animator uAnimator = null;
       if (dynamicData != null) {
          int i = 1;
          if (dynamicData.e() == i) {
             TextPaint textPaint = p0.getTextPaint();
             String str = dynamicData.b();
             String str1 = PatchProxy.apply(uAnimator, dynamicData, UIMarkLabel.class, "2");
             if (str1 != patchProxyRe) {
             }else {
                UIMarkLabel dynamicTextL = dynamicData.dynamicTextLabel;
                if (dynamicTextL != null) {
                   UIDynamicTextLabel expandText = dynamicTextL.expandText;
                   if (expandText != null) {
                      str2 = expandText.b();
                      if (str2 != null) {
                      label_0053 :
                         str1 = str2;
                      }
                   }
                }
                str2 = "";
                goto label_0053 ;
             }
             str2 = (p1)? str1: str;
             if (!p1) {
                str = str1;
             }
             float f = (float)(obj.getPaddingLeft() + obj.getPaddingRight());
             e uoe = new e(0x3ea8f5c3, 0, 0x3f2b851f, 0x3f800000);
             int[] ointArray = new int[]{(int)(textPaint.measureText(str) + f),(int)(textPaint.measureText(str2) + f)};
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray).setDuration(400);
             valueAnimato.addUpdateListener(new r(obj));
             valueAnimato.setInterpolator(new e(0x3f800000, 0, 0x3f2b851f, 0x3f800000));
             s os = new s(obj);
             ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0x3f800000,0}).setDuration(133);
             valueAnimato1.addListener(new a$a(this, obj, str2));
             valueAnimato1.addUpdateListener(os);
             valueAnimato1.setInterpolator(uoe);
             ValueAnimator valueAnimato2 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(133);
             valueAnimato2.addUpdateListener(os);
             valueAnimato2.setInterpolator(uoe);
             AnimatorSet uAnimatorSet = new AnimatorSet();
             uAnimatorSet.play(valueAnimato1).before(valueAnimato2).with(valueAnimato);
             return uAnimatorSet;
          }
       }
       return uAnimator;
    }
}
