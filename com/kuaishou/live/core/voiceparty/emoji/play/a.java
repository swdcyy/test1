package com.kuaishou.live.core.voiceparty.emoji.play.a;
import ub.a;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo;
import zu2.e;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo$PlayStatus;
import android.graphics.drawable.Animatable;
import bd.f;
import hc.a;
import android.view.View;
import com.kuaishou.live.core.voiceparty.emoji.play.d;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.animation.AnimatorSet;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Math;
import android.content.Context;
import lnc.a1;
import com.yxcorp.utility.n;
import android.animation.Animator;
import java.lang.Float;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import vr2.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import vr2.d;
import com.kuaishou.live.core.voiceparty.emoji.play.c;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import com.kuaishou.live.core.voiceparty.emoji.play.b;

public class a extends a	// class@0014e0
{
    public final VoicePartyEmojiPlayInfo b;
    public final e c;
    public final KwaiImageView d;

    public void a(VoicePartyEmojiPlayInfo p0,e p1,KwaiImageView p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.b.advancePlayStatus(VoicePartyEmojiPlayInfo$PlayStatus.Finished);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       int this;
       a c;
       a d;
       d uod1;
       long l;
       a uoa2;
       d uod2;
       ObjectAnimator obj2;
       ValueAnimator valueAnimato;
       a uoa3;
       a uoa = this;
       int i = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "2")) {
       }else if(!i instanceof a){
          uoa.b.advancePlayStatus(VoicePartyEmojiPlayInfo$PlayStatus.Finished);
       }else {
          boolean i1 = 1;
          this = 0;
          if (uoa.b.isGuestEmoji()) {
             c = uoa.c;
             if (c != null) {
                View view = c.Q1(uoa.b);
                if (view != null) {
                   d = uoa.d;
                   a uoa1 = i;
                   a b = uoa.b;
                   d uod = d.class;
                   if (!PatchProxy.applyVoidFourRefs(d, uoa1, b, view, null, d.class, "5")) {
                      b.Z(LiveVoicePartyLogTag.OTHER, "VoicePartyEmojiPlayHelper startFlyIn");
                      int[] ointArray = d.a(view);
                      int[] ointArray1 = d.a(d);
                      int i2 = ointArray[this] - ointArray1[this];
                      int i3 = ointArray[i1] - ointArray1[i1];
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      Object obj = null;
                      if (PatchProxy.isSupport(uod)) {
                         uod1 = uod;
                         Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i2), Integer.valueOf(i3), obj, uod1, "7");
                         if (obj1 != PatchProxyResult.class) {
                            l = obj1.longValue();
                            uoa2 = d;
                         label_00c5 :
                            uAnimatorSet.setDuration(l);
                            Animator[] uAnimatorArr = new Animator[2];
                            float f = (float)i2;
                            float f1 = (float)i3;
                            if (PatchProxy.isSupport(uod1)) {
                               uod2 = uod1;
                               obj2 = obj;
                               valueAnimato = PatchProxy.applyThreeRefs(uoa2, Float.valueOf(f), Float.valueOf(f1), null, d.class, "8");
                               if (valueAnimato != PatchProxyResult.class) {
                                  uoa3 = uoa2;
                                  i1 = 0;
                               label_013d :
                                  uAnimatorArr[i1] = valueAnimato;
                                  ValueAnimator valueAnimato1 = PatchProxy.applyOneRefs(uoa3, obj2, uod2, "9");
                                  if (valueAnimato1 != PatchProxyResult.class) {
                                  }else {
                                     valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0x3f4ccccd,0x3f800000});
                                     valueAnimato1.addUpdateListener(new d(uoa3));
                                     valueAnimato1.setInterpolator(new LinearInterpolator());
                                  }
                                  uAnimatorArr[1] = valueAnimato1;
                                  uAnimatorSet.playTogether(uAnimatorArr);
                                  uAnimatorSet.addListener(new c(uoa1, b, uoa3));
                                  uAnimatorSet.start();
                               }
                            }else {
                               uod2 = uod1;
                               obj2 = obj;
                            }
                            float f2 = f / 2.00f;
                            float f3 = f1 / 2.00f;
                            if (Math.abs(f) - Math.abs(f1) > 0) {
                               f3 = f3 - d.a;
                            }else {
                               f2 = f2 + d.a;
                            }
                            Path path = new Path();
                            path.moveTo(0, 0);
                            path.quadTo(f2, f3, f, f1);
                            i1 = false;
                            PathMeasure pathMeasure = new PathMeasure(path, i1);
                            valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
                            uoa3 = uoa2;
                            valueAnimato.addUpdateListener(new c(pathMeasure, uoa3));
                            valueAnimato.setInterpolator(new LinearInterpolator());
                            goto label_013d ;
                         }
                      }else {
                         uod1 = uod;
                      }
                      uoa2 = d;
                      l = (long)((Math.sqrt((Math.pow((double)i2, 2.00f) + Math.pow((double)i3, 2.00f))) / 0x3fd6666666666666) / (double)n.i(a1.c()));
                      goto label_00c5 ;
                   }
                }
             }
          }
          c = uoa.d;
          a uoa4 = i;
          a b1 = uoa.b;
          if (!PatchProxy.applyVoidThreeRefs(c, uoa4, b1, null, d.class, "4")) {
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3e4ccccd,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3e4ccccd,0x3f800000})};
             obj2 = ObjectAnimator.ofPropertyValuesHolder(c, propertyValu);
             obj2.setDuration(150);
             obj2.addListener(new b(uoa4, b1, c));
             obj2.start();
          }
       }
       return;
    }
}
