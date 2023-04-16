package com.yxcorp.plugin.tag.common.view.VideoDoubleTapLikeView;
import android.widget.RelativeLayout;
import android.content.Context;
import java.util.Random;
import java.util.LinkedList;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import lnc.a1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Float;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import wkd.b;
import com.kwai.component.bifrost.BifrostActivityManager;
import com.yxcorp.gifshow.util.cdnresource.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import rhd.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.cdnresource.f;
import com.yxcorp.plugin.tag.common.view.VideoDoubleTapLikeView$a;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;

public class VideoDoubleTapLikeView extends RelativeLayout	// class@000945
{
    public final Random b;
    public int c;
    public int d;
    public LinkedList e;
    public static final int f;

    public void VideoDoubleTapLikeView(Context p0){
       super(p0);
       this.b = new Random();
       this.e = new LinkedList();
       this.a(p0, null);
    }
    public void VideoDoubleTapLikeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Random();
       this.e = new LinkedList();
       this.a(p0, p1);
    }
    public void VideoDoubleTapLikeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Random();
       this.e = new LinkedList();
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoDoubleTapLikeView.class, "1")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.W5);
       this.c = typedArray.getDimensionPixelSize(0, a1.e(200.00f));
       this.d = typedArray.getResourceId(1, 0x7f0f0054);
       typedArray.recycle();
       return;
    }
    public void b(float p0,float p1,QPhoto p2){
       boolean b;
       String this;
       if (PatchProxy.isSupport(VideoDoubleTapLikeView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), p2, this, VideoDoubleTapLikeView.class, "3")) {
          return;
       }
       LottieAnimationView lottieAnimat = this.e.pollFirst();
       if (lottieAnimat == null) {
          lottieAnimat = new LottieAnimationView(this.getContext());
          lottieAnimat.setRenderMode(RenderMode.HARDWARE);
          lottieAnimat.k(true);
          this.addView(lottieAnimat, new RelativeLayout$LayoutParams(this.c, this.c));
       }
       LottieAnimationView lottieAnimat1 = lottieAnimat;
       lottieAnimat1.setTranslationX((p0 - ((float)this.c / 2.00f)));
       VideoDoubleTapLikeView tc = this.c;
       lottieAnimat1.setTranslationY(((p1 - ((float)tc / 2.00f)) - ((float)tc / 3.00f)));
       lottieAnimat1.setRotation((float)((this.b.nextInt(30) + true) - 15));
       String likeActivity = p2.getLikeActivityResourceId();
       String str = b.a(-1568263472).c("PHOTO_LIKE_ANIMATION", p2);
       b = a.a("PHOTO_LIKE_ANIMATION", str);
       this = (b)? str: likeActivity;
       if (TextUtils.isEmpty(likeActivity) && !b) {
          lottieAnimat1.setAnimation(this.d);
          this.c(lottieAnimat1);
       }else {
          lottieAnimat1.f();
          lottieAnimat1.setVisibility(4);
          f.g(this, lottieAnimat1, CdnResource$ResourceKey.bt_detail_center_like, this.d, new c(this, lottieAnimat1), b);
       }
       return;
    }
    public final void c(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoDoubleTapLikeView.class, "4")) {
          return;
       }
       p0.f();
       p0.setVisibility(4);
       p0.setSpeed(2.00f);
       p0.a(new VideoDoubleTapLikeView$a(this, p0));
       p0.s();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, VideoDoubleTapLikeView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeAllViews();
       this.e.clear();
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoDoubleTapLikeView.class, "2")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, VideoDoubleTapLikeView.class, "5")) {
          int i = 0;
          while (i < this.getChildCount()) {
             View childAt = this.getChildAt(i);
             if (childAt instanceof LottieAnimationView && childAt.p()) {
                childAt.f();
             }
             i = i + 1;
          }
          this.removeAllViews();
       }
       return;
    }
    public void setLikeImageResId(int p0){
       this.d = p0;
    }
    public void setLikeImageSize(int p0){
       this.c = p0;
    }
}
