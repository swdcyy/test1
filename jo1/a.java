package jo1.a;
import java.lang.Object;
import java.util.ArrayList;
import androidx.core.util.Pools$SimplePool;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jo1.e;
import java.lang.Float;
import java.lang.Boolean;
import jo1.f;
import java.util.List;
import java.lang.Math;
import com.yxcorp.gifshow.image.KwaiImageView;
import z1.f;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import jo1.b;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.Animator$AnimatorListener;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import jo1.d;
import x51.b;
import com.kuaishou.live.common.core.component.like.count.LiveLikeCountAnimationTextView;
import java.lang.StringBuilder;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.like.particle.a;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.image.request.a;
import s0d.e;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import jo1.a$a;
import com.facebook.imagepipeline.request.ImageRequest;
import dd.d;
import kb.c;
import com.kuaishou.live.core.basic.model.LiveLikeNewStyleConfig;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;

public class a	// class@002bdb
{
    public final List a;
    public final f b;
    public final f c;
    public Context d;
    public ViewGroup e;
    public int f;
    public long g;

    public void a(){
       super();
       this.a = new ArrayList();
       this.b = new Pools$SimplePool(30);
       this.c = new Pools$SimplePool(15);
       this.f = 0;
       this.g = 0;
    }
    public final int[] a(View p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2];
       if (p0 != null) {
          p0.getLocationOnScreen(obj);
       }
       return obj;
    }
    public void b(float p0,float p1,boolean p2){
       int i1;
       Animator[] obj2;
       int i2;
       int i3;
       PropertyValuesHolder[] propertyValu;
       b obj3;
       int a;
       int[] ointArray;
       float f3;
       ObjectAnimator obj4;
       Object obj5;
       int i4;
       PropertyValuesHolder[] propertyValu1;
       a this;
       int i = this;
       e uoe = e.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, a.class, "5")) {
          return;
       }
       Object[] objArray = null;
       String str = "7";
       f uof = PatchProxy.apply(objArray, i, uoa, str);
       if (uof != patchProxyRe) {
       }else if(i.a.size() > 0){
          uof = i.a.get((int)(Math.random() * (double)i.a.size()));
       }else {
          uof = objArray;
       }
       String obj = uof;
       KwaiImageView kwaiImageVie = PatchProxy.apply(objArray, i, uoa, "6");
       if (kwaiImageVie != patchProxyRe) {
       }else {
          kwaiImageVie = i.b.q();
          if (kwaiImageVie == null) {
             kwaiImageVie = new KwaiImageView(i.d);
          }
       }
       Object obj1 = kwaiImageVie;
       if (PatchProxy.isSupport(uoa)) {
          i1 = 0;
          if (PatchProxy.applyVoidFourRefs(obj, Float.valueOf(p0), Float.valueOf(p1), obj1, this, a.class, "8")) {
             obj2 = obj1;
          label_00fa :
             i2 = 3;
          label_0226 :
             if (obj != null && !TextUtils.x(obj.b())) {
                obj = obj.b();
                if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(obj, Float.valueOf(p0), Float.valueOf(p1), this, a.class, "11")) {
                   LiveLottieAnimationView liveLottieAn = PatchProxy.apply(null, i, uoa, "12");
                   if (liveLottieAn != patchProxyRe) {
                   }else {
                      liveLottieAn = i.c.q();
                      if (liveLottieAn == null) {
                         liveLottieAn = new LiveLottieAnimationView(i.d);
                         liveLottieAn.setRenderMode(RenderMode.HARDWARE);
                         liveLottieAn.k(true);
                         liveLottieAn.setSpeed(0x3fa66666);
                      }
                   }
                   obj3 = liveLottieAn;
                   a = e.a;
                   i.e.addView(obj3, new FrameLayout$LayoutParams(a, a));
                   if (PatchProxy.isSupport(uoa)) {
                      i1 = a;
                      if (PatchProxy.applyVoidThreeRefs(obj3, Float.valueOf(p0), Float.valueOf(p1), this, a.class, "13")) {
                      label_02cb :
                         obj3.setAnimationFromUrl(obj);
                         obj3.a(new d(i, obj3));
                         obj3.s();
                      }
                   }else {
                      i1 = a;
                   }
                   ointArray = i.a(i.e);
                   f3 = (float)i1;
                   obj3.setTranslationX(((p0 - (f3 * 0x3f000000)) - (float)ointArray[0]));
                   obj3.setTranslationY(((p1 - (f3 * 0x3f7ae148)) - (float)ointArray[1]));
                   goto label_02cb ;
                }
             }
             if (p2) {
                String str1 = "9";
                if (!PatchProxy.applyVoidOneRefs(obj2, i, uoa, str1)) {
                   i.f = i.f + 1;
                   long l = 300;
                   if ((b.b().a() - i.g) - l >= 0 && !PatchProxy.applyVoidOneRefs(obj2, i, uoa, "10")) {
                      LiveLikeCountAnimationTextView liveLikeCoun = new LiveLikeCountAnimationTextView(i.d);
                      liveLikeCoun.setText(" x"+i.f+" ");
                      i.e.addView(liveLikeCoun, new FrameLayout$LayoutParams(-2, -2));
                      float f = (float)e.a * 0x3f000000;
                      float f1 = obj2.getTranslationX() + f;
                      float f2 = obj2.getTranslationY() + f;
                      a uoa1 = new a(i, liveLikeCoun);
                      if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidFourRefs(Float.valueOf(f1), Float.valueOf(f2), liveLikeCoun, uoa1, null, e.class, "6")) {
                         if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidThreeRefs(liveLikeCoun, Float.valueOf(f1), Float.valueOf(f2), null, e.class, "11")) {
                            liveLikeCoun.measure(0, 0);
                            liveLikeCoun.setTranslationX((f1 - ((float)liveLikeCoun.getMeasuredWidth() * 0x3f000000)));
                            liveLikeCoun.setTranslationY((f2 - (float)e.d));
                         }
                         AnimatorSet uAnimatorSet = new AnimatorSet();
                         obj2 = new Animator[i2];
                         ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(liveLikeCoun, null, uoe, str);
                         if (objectAnimat != patchProxyRe) {
                            i3 = 0;
                         }else {
                            float[] uofloatArray1 = new float[]{liveLikeCoun.getTranslationY(),e.a(liveLikeCoun)};
                            i3 = 0;
                            propertyValu = new PropertyValuesHolder[i2];
                            propertyValu[i3] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000});
                            propertyValu[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000});
                            propertyValu[2] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray1);
                            objectAnimat = ObjectAnimator.ofPropertyValuesHolder(liveLikeCoun, propertyValu);
                            long l2 = 200;
                            objectAnimat.setDuration(l2);
                            objectAnimat.setInterpolator(new LinearInterpolator());
                         }
                         obj2[i3] = objectAnimat;
                         ObjectAnimator objectAnimat1 = PatchProxy.applyOneRefs(liveLikeCoun, null, uoe, "8");
                         if (objectAnimat1 != patchProxyRe) {
                            i1 = 1;
                         }else {
                            i1 = 1;
                            propertyValu = new PropertyValuesHolder[i1];
                            propertyValu[i3] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0});
                            objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(liveLikeCoun, propertyValu);
                            objectAnimat1.setDuration(400);
                            objectAnimat1.setInterpolator(new LinearInterpolator());
                            objectAnimat1.setStartDelay(l);
                         }
                         obj2[i1] = objectAnimat1;
                         ObjectAnimator objectAnimat2 = PatchProxy.applyOneRefs(liveLikeCoun, null, uoe, str1);
                         if (objectAnimat2 != patchProxyRe) {
                         }else {
                            float[] uofloatArray = new float[]{e.a(liveLikeCoun),e.a(liveLikeCoun) - (float)e.c};
                            PropertyValuesHolder[] l1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray)};
                            objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(liveLikeCoun, l1);
                            objectAnimat2.setInterpolator(new LinearInterpolator());
                            objectAnimat2.setDuration(500);
                            objectAnimat2.setStartDelay(200);
                         }
                         obj2[2] = objectAnimat2;
                         uAnimatorSet.playTogether(obj2);
                         uAnimatorSet.addListener(uoa1);
                         uAnimatorSet.start();
                      }
                   }
                }
             }
             return;
          }
       }else {
          i1 = 0;
       }
       int a1 = e.a;
       i.e.addView(obj1, new FrameLayout$LayoutParams(a1, a1));
       if (obj != null) {
          obj1.L(obj.a());
       }else {
          obj1.setActualImageResource(R.drawable.arg_RES_7f081348);
       }
       ointArray = i.a(i.e);
       float f4 = p0 - (float)ointArray[i1];
       float f5 = p1 - (float)ointArray[1];
       b uob = new b(i, obj1);
       if (PatchProxy.isSupport(uoe)) {
          obj4 = obj1;
          if (PatchProxy.applyVoidFourRefs(Float.valueOf(f4), Float.valueOf(f5), obj4, uob, null, e.class, "1")) {
             obj2 = obj4;
             goto label_00fa ;
          }
       }else {
          obj4 = obj1;
          this = 2;
       }
       if (PatchProxy.isSupport(uoe)) {
          obj5 = obj4;
          i1 = 2;
          obj3 = uob;
          i2 = a1;
          if (PatchProxy.applyVoidThreeRefs(Float.valueOf(f4), Float.valueOf(f5), obj4, null, e.class, "5")) {
             obj2 = obj5;
          label_014b :
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             i2 = 3;
             Animator[] uAnimatorArr = new Animator[i2];
             ObjectAnimator objectAnimat3 = PatchProxy.applyOneRefs(obj2, null, uoe, "2");
             if (objectAnimat3 != patchProxyRe) {
                a = 0;
             }else {
                PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[i1];
                a = 0;
                propertyValu2[a] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i1]{0,0x3f970a3d});
                propertyValu2[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i1]{0,0x3f970a3d});
                objectAnimat3 = ObjectAnimator.ofPropertyValuesHolder(obj2, propertyValu2);
                objectAnimat3.setDuration(200);
             }
             uAnimatorArr[a] = objectAnimat3;
             Object obj6 = PatchProxy.applyOneRefs(obj2, null, uoe, "3");
             if (obj6 != patchProxyRe) {
                obj4 = obj6;
                i4 = 1;
             }else {
                propertyValu1 = new PropertyValuesHolder[i2];
                propertyValu1[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i1]{0x3f970a3d,0x3f800000});
                i4 = 1;
                propertyValu1[i4] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i1]{0x3f970a3d,0x3f800000});
                propertyValu1[i1] = PropertyValuesHolder.ofFloat(View.ROTATION, new float[i1]{0x41200000,0});
                obj4 = ObjectAnimator.ofPropertyValuesHolder(obj2, propertyValu1);
                obj4.setDuration(150);
                obj4.setStartDelay(200);
             }
             uAnimatorArr[i4] = obj4;
             objectAnimat3 = PatchProxy.applyOneRefs(obj2, null, uoe, "4");
             if (objectAnimat3 != patchProxyRe) {
             }else {
                propertyValu1 = new PropertyValuesHolder[i2];
                propertyValu1[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i1]{0x3f800000,0x3f000000});
                propertyValu1[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i1]{0x3f800000,0x3f000000});
                propertyValu1[i1] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[i1]{0x3f800000,0});
                objectAnimat3 = ObjectAnimator.ofPropertyValuesHolder(obj2, propertyValu1);
                objectAnimat3.setDuration(200);
                objectAnimat3.setStartDelay(1000);
             }
             uAnimatorArr[i1] = objectAnimat3;
             uAnimatorSet1.playTogether(uAnimatorArr);
             uAnimatorSet1.addListener(obj3);
             uAnimatorSet1.start();
             goto label_0226 ;
          }
       }else {
          obj5 = obj4;
          obj3 = uob;
          i2 = a1;
          i1 = 2;
       }
       obj2 = obj5;
       obj2.setRotation(10.00f);
       obj2.setAlpha(0x3f800000);
       obj2.setScaleX(0);
       obj2.setScaleY(0);
       f3 = (float)i2;
       obj2.setTranslationX((f4 - (f3 * 0x3f000000)));
       obj2.setTranslationY((f5 - (f3 * 0x3f7ae148)));
       goto label_014b ;
    }
    public final void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          Fresco.getImagePipeline().prefetchToDiskCache(a.u(p0).q(), null, new a$a(this, p0, p1));
       }
       return;
    }
    public void d(LiveLikeNewStyleConfig p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       this.c(p0.mLiveLikeThumbUpImageWithLottieUrl, p0.mLiveLikeThumbUpLottieUrl);
       LiveLikeNewStyleConfig mLiveLikeThu = p0.mLiveLikeThumbUpLottieUrl;
       if (!PatchProxy.applyVoidOneRefs(mLiveLikeThu, this, uoa, "4") && !TextUtils.x(mLiveLikeThu)) {
          a.i(this.d, mLiveLikeThu);
       }
       p0 = p0.mLiveLikeThumbUpImageUrls;
       if (p0 != null) {
          int len = p0.length;
          for (int i = 0; i < len; i = i + 1) {
             this.c(p0[i], null);
          }
       }
       return;
    }
    public void e(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.e = p0;
       this.d = p0.getContext();
       return;
    }
}
