package com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import ja3.a;
import k93.m;
import k93.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem$emptyAction$1;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarItem$switcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import android.content.Context;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarContainerLayout;
import msd.l;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.google.gson.JsonObject;
import i93.j;
import k93.n;
import java.util.Objects;
import android.view.ViewParent;
import android.animation.Animator;
import k93.p;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet$Builder;
import lnc.a1;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import k93.n$c;
import android.animation.Animator$AnimatorListener;
import k93.n$d;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import k93.n$a;
import k93.n$b;

public final class CommentsBottomBarItem implements LiveLiteBottomBarService$a, a	// class@001ebd
{
    public final l a;
    public CommentsBottomBarContainerLayout b;
    public l c;
    public final p d;
    public final LiveLiteBottomBarService$BottomBarType e;
    public final m f;
    public final l g;

    public void CommentsBottomBarItem(m p0,l p1){
       a.p(p0, "emojiModeSelector");
       a.p(p1, "commentViewDelegate");
       super();
       this.f = p0;
       this.g = p1;
       CommentsBottomBarItem$emptyAction$1 iNSTANCE = CommentsBottomBarItem$emptyAction$1.INSTANCE;
       this.a = iNSTANCE;
       this.c = iNSTANCE;
       this.d = s.c(CommentsBottomBarItem$switcher$2.INSTANCE);
       this.e = LiveLiteBottomBarService$BottomBarType.COMMENT;
    }
    public View a(Context p0){
       CommentsBottomBarContainerLayout uCommentsBot;
       CommentsBottomBarItem obj = PatchProxy.applyOneRefs(p0, this, CommentsBottomBarItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = this.b;
       if (obj == null) {
          uCommentsBot = new CommentsBottomBarContainerLayout(p0);
          uCommentsBot.setEmojiModeSelector(this.f);
          uCommentsBot.setCommentViewDelegate(this.g);
          this.c.invoke(uCommentsBot);
          this.c = this.a;
          uCommentsBot.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
          uCommentsBot.setClickable(true);
          this.b = uCommentsBot;
       }else {
          a.m(obj);
       }
       return uCommentsBot;
    }
    public JsonObject b(){
       return j.a(this);
    }
    public boolean c(){
       return j.e(this);
    }
    public JsonObject d(){
       return j.b(this);
    }
    public void e(View p0,a p1){
       n a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentsBottomBarItem.class, "2")) {
          return;
       }
       String str = "followGuideView";
       a.p(p0, str);
       a.p(p1, "finishCallback");
       CommentsBottomBarItem tb = this.b;
       if (tb != null) {
          n on = this.j();
          Objects.requireNonNull(on);
          if (!PatchProxy.applyVoidThreeRefs(tb, p0, p1, on, n.class, "2")) {
             a.p(tb, "commentsView");
             a.p(p0, str);
             a.p(p1, "switchFinishCallback");
             if (tb.getParent() != null) {
                a = on.a;
                if (a != null && a.isRunning()) {
                   a.end();
                }
                FrameLayout uFrameLayout = p.b(tb);
                AnimatorSet uAnimatorSet = new AnimatorSet();
                p.a(uFrameLayout, tb);
                uAnimatorSet.play(on.d(tb));
                p0.setVisibility(4);
                p.a(uFrameLayout, p0);
                ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(p0, on, n.class, "3");
                if (objectAnimat != PatchProxyResult.class) {
                }else {
                   float[] uofloatArray = new float[]{(float)a1.e(40.00f),0};
                   objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
                   objectAnimat.setDuration(300);
                   objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
                }
                objectAnimat.setStartDelay(200);
                uAnimatorSet.play(objectAnimat);
                objectAnimat = on.c(p0);
                objectAnimat.setStartDelay(200);
                uAnimatorSet.play(objectAnimat);
                objectAnimat.addListener(new n$c(p0, on, uFrameLayout, uAnimatorSet));
                uAnimatorSet.addListener(new n$d(uFrameLayout, p0, p1));
                on.a = uAnimatorSet;
                uAnimatorSet.start();
             }
          }
       }
       return;
    }
    public void f(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       j.d(this, p0);
    }
    public void g(LiveLiteBottomBarService$BottomBarItemChangeReason p0){
       j.c(this, p0);
    }
    public LiveLiteBottomBarService$BottomBarType getType(){
       return this.e;
    }
    public void h(View p0,a p1){
       n a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentsBottomBarItem.class, "3")) {
          return;
       }
       String str = "followGuideView";
       a.p(p0, str);
       a.p(p1, "finishCallback");
       CommentsBottomBarItem tb = this.b;
       if (tb != null) {
          n on = this.j();
          Objects.requireNonNull(on);
          if (!PatchProxy.applyVoidThreeRefs(tb, p0, p1, on, n.class, "1")) {
             a.p(tb, "commentsView");
             a.p(p0, str);
             a.p(p1, "switchFinishCallback");
             if (p0.getParent() != null) {
                a = on.a;
                if (a != null && a.isRunning()) {
                   a.end();
                }
                float f = 0;
                int i = 0;
                if (p0.getWidth() <= a1.e(0x42f00000)) {
                   ViewParent viewParent = null;
                   if (!PatchProxy.applyVoidTwoRefs(tb, p0, viewParent, p.class, "4")) {
                      ViewParent parent = p0.getParent();
                      if (parent instanceof ViewGroup) {
                         viewParent = parent;
                      }
                      if (viewParent != null) {
                         int i1 = viewParent.indexOfChild(p0);
                         viewParent.removeViewAt(i1);
                         tb.setAlpha(0x3f800000);
                         tb.setTranslationY(f);
                         tb.setVisibility(i);
                         viewParent.addView(tb, i1);
                      }
                   }
                }else {
                   FrameLayout uFrameLayout = p.b(p0);
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   p.a(uFrameLayout, p0);
                   ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(p0, on, n.class, "5");
                   if (objectAnimat != PatchProxyResult.class) {
                   }else {
                      float[] uofloatArray = new float[]{f,(float)a1.e(40.00f)};
                      objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
                      objectAnimat.setDuration(300);
                      objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
                   }
                   uAnimatorSet.play(objectAnimat);
                   uAnimatorSet.play(on.d(p0));
                   tb.setVisibility(4);
                   p.a(uFrameLayout, tb);
                   ObjectAnimator objectAnimat1 = on.c(tb);
                   objectAnimat1.setStartDelay(200);
                   uAnimatorSet.play(objectAnimat1);
                   objectAnimat1.addListener(new n$a(tb, on, uFrameLayout, uAnimatorSet));
                   uAnimatorSet.addListener(new n$b(uFrameLayout, tb, p1));
                   on.a = uAnimatorSet;
                   uAnimatorSet.start();
                }
             }
          }
       }
       return;
    }
    public boolean i(){
       return true;
    }
    public final n j(){
       Object obj = PatchProxy.apply(null, this, CommentsBottomBarItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
}
