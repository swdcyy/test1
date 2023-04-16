package ou1.c$a;
import java.lang.Runnable;
import ou1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMultiPkConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Boolean;
import java.lang.System;
import android.animation.Animator;
import java.lang.StringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import lnc.a1;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.a;
import ou1.a;
import android.animation.Animator$AnimatorListener;
import android.graphics.Color;
import android.animation.AnimatorSet;
import qrd.l1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.basic.tools.l;
import android.widget.ImageView;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkResourceTypes;
import ou1.d;
import pu1.d;
import hc.b;
import ht1.a;
import ou1.b;

public final class c$a implements Runnable	// class@00358e
{
    public final c b;
    public final long c;

    public void c$a(c p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       c obj1;
       boolean b1;
       c a;
       int[] obj2;
       float[] uofloatArray;
       ObjectAnimator objectAnimat1;
       PropertyValuesHolder[] obj3;
       boolean b2;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, c$a.class, "1")) {
          return;
       }
       c$a b = obj.b;
       c$a c = obj.c;
       c h = b.h;
       c i = b.i;
       Objects.requireNonNull(b);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(c), h, i, b, c.class, "3")) {
          LiveConfigStartupResponse$LiveMultiPkConfig liveMultiPkC = a.R(LiveConfigStartupResponse$LiveMultiPkConfig.class);
          if (liveMultiPkC != null) {
             if (PatchProxy.isSupport(c.class)) {
                obj1 = PatchProxy.applyTwoRefs(Long.valueOf(c), liveMultiPkC, b, c.class, "4");
                if (obj1 != PatchProxyResult.class) {
                   b1 = obj1.booleanValue();
                }else if((System.currentTimeMillis() - b.f) - liveMultiPkC.mPkExcitingMomentAnimationIntervalMs >= 0 && c - liveMultiPkC.mPkExcitingMomentAnimationThresholdScore >= 0){
                   b1 = true;
                }else {
                   b1 = false;
                }
             }else {
                goto label_005a ;
             }
             String str = "ObjectAnimator.ofPropert¡­leX, scaleY, transY\n    \)";
             char c1 = '+';
             l1 ol1 = 4;
             if (b1) {
                b.a(b.c);
                b.a(b.d);
                obj1 = b.b;
                if (obj1 != null) {
                   c uoc = obj1;
                   String str1 = str;
                   b.e(h, i, c1+c, b.j, uoc);
                   obj1 = uoc;
                   AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(obj1, b, c.class, "10");
                   if (uAnimatorSet != PatchProxyResult.class) {
                   }else {
                      obj1.setVisibility(0);
                      uofloatArray = new float[]{0,- (float)a1.e(50.00f)};
                      PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[ol1]{0x3f800000,0x3fc00000,0x3fc00000,0}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[ol1]{0x3f800000,0x3fc00000,0x3fc00000,0}),PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray)};
                      ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(obj1, propertyValu);
                      a.o(objectAnimat, str1);
                      objectAnimat.setDuration(1020);
                      objectAnimat.addListener(new a(obj1));
                      obj2 = new int[]{Color.parseColor("#FF7248"),Color.parseColor("#FFFFFF")};
                      objectAnimat1 = ObjectAnimator.ofInt(obj1, "textColor", obj2);
                      a.o(objectAnimat1, "colorAnim");
                      objectAnimat1.setDuration(340);
                      objectAnimat1.setStartDelay(340);
                      AnimatorSet uAnimatorSet1 = new AnimatorSet();
                      Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
                      uAnimatorSet1.playTogether(uAnimatorArr);
                      uAnimatorSet = uAnimatorSet1;
                   }
                   b.f = System.currentTimeMillis();
                   uAnimatorSet.start();
                   b.d = uAnimatorSet;
                }
                a = b.a;
                if (a != null) {
                   b.d(h, i, b.j, a);
                   l.j(a);
                   obj2 = PatchProxy.applyOneRefs(a, b, c.class, "8");
                   if (obj2 != PatchProxyResult.class) {
                      obj2.booleanValue();
                   }else {
                      a.setVisibility(0);
                      b.Z(LiveCommonLogTag.MULTI_PK, "showParticleAnimView");
                      b.l.c(a, LiveMultiPkResourceTypes.ANIM_FILE_WEBP, new d(a), null);
                   }
                }
             }else {
                String str2 = str;
                if (PatchProxy.isSupport(c.class)) {
                   obj3 = PatchProxy.applyTwoRefs(Long.valueOf(c), liveMultiPkC, b, c.class, "5");
                   if (obj3 != PatchProxyResult.class) {
                      b2 = obj3.booleanValue();
                   }else if((System.currentTimeMillis() - b.e) - liveMultiPkC.mPkScoreTagAnimationIntervalMs >= 0 && c - liveMultiPkC.mPkScoreTagAnimationThresholdScore >= 0){
                      c d = b.d;
                      Object obj4 = PatchProxy.applyOneRefs(d, b, c.class, "12");
                      if (obj4 != PatchProxyResult.class) {
                         b2 = obj4.booleanValue();
                      }else if(d != null && d.isRunning()){
                         b2 = true;
                      }else {
                         b2 = false;
                      }
                      if (!b2) {
                         b2 = true;
                      }
                   }
                label_01c6 :
                   b2 = false;
                }else {
                   goto label_0192 ;
                }
                if (b2) {
                   b.a(b.c);
                   c b3 = b.b;
                   if (b3 != null) {
                      i = b3;
                      String str3 = str2;
                      b.e(h, i, '+'+c, b.j, i);
                      objectAnimat1 = PatchProxy.applyOneRefs(i, b, c.class, "9");
                      if (objectAnimat1 != PatchProxyResult.class) {
                      }else {
                         uofloatArray = new float[]{(float)a1.e(6.00f),- (float)a1.e(19.00f)};
                         obj3 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[ol1]{0x3f800000,0x3fc00000,0x3fc00000,0}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[ol1]{0x3f800000,0x3fc00000,0x3fc00000,0}),PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray)};
                         objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(i, obj3);
                         a.o(objectAnimat1, str3);
                         objectAnimat1.addListener(new b(i));
                         objectAnimat1.setDuration(600);
                      }
                      b.e = System.currentTimeMillis();
                      objectAnimat1.start();
                      b.c = objectAnimat1;
                   }
                }
             }
          }
       }
    label_0257 :
       return;
    }
}
