package com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketPendantContainerView;
import android.widget.FrameLayout;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import java.lang.Boolean;
import java.lang.StringBuilder;
import po3.h;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import java.util.Collection;
import ekd.q;
import ng2.r;
import vw1.b;
import java.lang.Number;
import java.util.Iterator;
import java.lang.Integer;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import lnc.a1;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.AnimatorSet;
import dh2.j;
import android.animation.Animator$AnimatorListener;
import z1.a;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.CharSequence;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import dh2.k;
import dh2.l;
import dh2.m;
import dh2.i;

public class LiveRedPacketPendantContainerView extends FrameLayout	// class@000ee9
{
    public boolean b;
    public AnimatorSet c;
    public AnimatorSet d;
    public Runnable e;
    public boolean f;
    public a g;
    public static final List h;

    static {
       LiveRedPacketPendantContainerView.h = LiveLogTag.LIVE_LEEE.appendTag("LiveRedPacketPendantContainerView");
    }
    public void LiveRedPacketPendantContainerView(Context p0){
       super(p0, null);
    }
    public void LiveRedPacketPendantContainerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRedPacketPendantContainerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
       this.f = false;
       this.setClipChildren(false);
       this.setClipToPadding(false);
    }
    public static void a(ViewGroup p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LiveRedPacketPendantContainerView.class, "11")) {
          return;
       }
       ViewParent parent = p1.getParent();
       if (parent == p0) {
          return;
       }
       if (parent != null) {
          parent.removeView(p1);
       }
       p0.addView(p1);
       return;
    }
    public static String b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPacketPendantContainerView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       p0 = p0.getTag(R.id.live_red_packet_pendant_view_log_msg);
       if (p0 instanceof String) {
          return p0;
       }
       return "";
    }
    public static boolean c(Animator p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPacketPendantContainerView.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.isRunning())? true: false;
       return b;
    }
    public void d(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPacketPendantContainerView.class, "8")) {
          return;
       }
       List h = LiveRedPacketPendantContainerView.h;
       b.P(h, "switchAnimator add,topView viewInfo = "+h.c(p0)+" logMsg = "+LiveRedPacketPendantContainerView.b(p0));
       b.P(h, "switchAnimator add,nextView viewInfo = "+h.c(p1)+" logMsg = "+LiveRedPacketPendantContainerView.b(p1));
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketPendantContainerView.class, "9")) {
          return;
       }
       LiveRedPacketPendantContainerView te = this.e;
       if (te != null) {
          te.run();
       }
       this.e = null;
       return;
    }
    public final void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketPendantContainerView.class, "2")) {
          return;
       }
       List h = LiveRedPacketPendantContainerView.h;
       b.P(h, "refreshViewIfNecessary");
       if (q.f(p0)) {
          b.P(h, "refreshViewIfNecessary£¬ itemList is empty");
          return;
       }else {
          View view = p0.get(0).f();
          View topView = this.getTopView();
          if (topView == view) {
             this.g(topView, p0);
          }else if(topView != null){
             this.removeView(topView);
          }
          LiveRedPacketPendantContainerView.a(this, view);
          this.g(view, p0);
          return;
       }
    }
    public void g(View p0,List p1){
       int i;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRedPacketPendantContainerView.class, "3")) {
          return;
       }
       if (p0 instanceof b) {
          String obj = PatchProxy.applyOneRefs(p1, this, LiveRedPacketPendantContainerView.class, "5");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else {
             int i1 = 0;
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                i1 = i1 + iterator.next().d;
             }
             i = i1;
          }
          if (PatchProxy.isSupport(LiveRedPacketPendantContainerView.class)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, LiveRedPacketPendantContainerView.class, "4");
             if (obj != patchProxyRe) {
             label_0066 :
                p0.g(obj);
             }
          }
          if (i < 2) {
             str = "";
          }else if(i > 99){
             str = "99+";
          }else {
             str = String.valueOf(i);
          }
          obj = str;
          goto label_0066 ;
       }
       return;
    }
    public View getTopView(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, LiveRedPacketPendantContainerView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getChildCount() <= 0) {
          return objArray;
       }
       int i = 0;
       obj = (this.getChildAt(i) instanceof LiveMediumTextView)? this.getChildAt(1): this.getChildAt(i);
       return obj;
    }
    public void h(List p0,boolean p1){
       ObjectAnimator objectAnimat;
       ObjectAnimator objectAnimat1;
       float[] this;
       Runnable runnable = this;
       AnimatorSet obj = p0;
       if (PatchProxy.isSupport(LiveRedPacketPendantContainerView.class) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), runnable, LiveRedPacketPendantContainerView.class, "1")) {
          return;
       }
       if (q.f(p0)) {
          b.P(LiveRedPacketPendantContainerView.h, "updateRedPacketList, case 1: no red packet -> hide");
          this.removeAllViews();
          return;
       }else if(LiveRedPacketPendantContainerView.c(runnable.c) || LiveRedPacketPendantContainerView.c(runnable.d)){
          b.P(LiveRedPacketPendantContainerView.h, "updateRedPacketList, case 2: animating -> refresh onAnimatorEnd");
          runnable.e = new i(runnable, obj);
          return;
       }else {
          runnable.e = null;
          int childCount = this.getChildCount();
          int i = 3;
          int i1 = 0;
          long l = 200;
          int i2 = 4;
          int i3 = 2;
          if (runnable.f == null && (runnable.b == null && !childCount)) {
             List h = LiveRedPacketPendantContainerView.h;
             b.P(h, "updateRedPacketList, case 3: play first add animator");
             runnable.b = true;
             View view = obj.get(0).f();
             if (!PatchProxy.applyVoidTwoRefs(view, obj, runnable, LiveRedPacketPendantContainerView.class, "6")) {
                view.setVisibility(i2);
                runnable.g(view, obj);
                LiveRedPacketPendantContainerView.a(runnable, view);
                int i4 = a1.e(14.00f);
                view.setScaleX(2.00f);
                view.setScaleY(2.00f);
                float f = (float)a1.e(88.00f);
                view.setTranslationY(f);
                float[] uofloatArray = new float[i3];
                uofloatArray[0] = (float)i4;
                float f1 = (float)(- i4);
                uofloatArray[1] = f1;
                objectAnimat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, uofloatArray);
                objectAnimat.setDuration(l);
                float[] uofloatArray1 = new float[i3];
                uofloatArray1[0] = f;
                uofloatArray1[1] = i1;
                uofloatArray1 = new float[i3];
                uofloatArray1[0] = f1;
                uofloatArray1[1] = i1;
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i2];
                propertyValu[0] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i3]{0x40000000,0x3f800000});
                propertyValu[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i3]{0x40000000,0x3f800000});
                propertyValu[i3] = PropertyValuesHolder.ofFloat(FrameLayout.TRANSLATION_Y, uofloatArray1);
                propertyValu[i] = PropertyValuesHolder.ofFloat(FrameLayout.TRANSLATION_X, uofloatArray1);
                objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(view, propertyValu);
                objectAnimat1.setDuration(400);
                objectAnimat1.setStartDelay(1380);
                AnimatorSet uAnimatorSet = new AnimatorSet();
                runnable.c = uAnimatorSet;
                Animator[] uAnimatorArr = new Animator[i3];
                uAnimatorArr[0] = objectAnimat;
                uAnimatorArr[1] = objectAnimat1;
                uAnimatorSet.playSequentially(uAnimatorArr);
                runnable.c.addListener(new j(runnable, view));
                b.P(h, "firstAddAnimator add, viewInfo = "+h.c(view)+" logMsg = "+LiveRedPacketPendantContainerView.b(view));
                LiveRedPacketPendantContainerView g = runnable.g;
                if (g != null) {
                   g.accept(runnable.c);
                }else {
                   runnable.c.start();
                }
             }
             return;
          }else {
             View topView = this.getTopView();
             View view1 = obj.get(0).f();
             if (topView != null && (topView != view1 && p1)) {
                b.P(LiveRedPacketPendantContainerView.h, "updateRedPacketList, case 4: play switch animator");
                View view2 = view1;
                View view3 = topView;
                if (!PatchProxy.applyVoidThreeRefs(topView, view1, p0, this, LiveRedPacketPendantContainerView.class, "7")) {
                   LiveRedPacketPendantContainerView.a(runnable, view2);
                   ObjectAnimator objectAnimat2 = j.a(view3, new float[i2]{0x3f19999a,0x3f800000,0x3f4ccccd,0x3e99999a});
                   this = new float[i3];
                   this[0] = (float)a1.e(48.00f);
                   this[1] = i1;
                   ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, this);
                   objectAnimat1 = j.a(view2, new float[i]{0x3f19999a,0x3f4ccccd,0x3f800000});
                   super(this.getContext());
                   this.setGravity(17);
                   this.setTextColor(a1.a(R.color.arg_RES_7f061567));
                   this.setTextSize(true, 9.00f);
                   this.setText("+1");
                   this.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
                   this.setVisibility(8);
                   runnable.addView(this);
                   FrameLayout$LayoutParams layoutParams = this.getLayoutParams();
                   layoutParams.gravity = 53;
                   layoutParams.topMargin = - a1.e(6.00f);
                   this.setLayoutParams(layoutParams);
                   float[] uofloatArray2 = new float[i3];
                   uofloatArray2[0] = i1;
                   uofloatArray2[1] = (float)(- a1.e(15.00f));
                   objectAnimat = ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, uofloatArray2);
                   objectAnimat.setStartDelay(200);
                   long l1 = 500;
                   objectAnimat.setDuration(l1);
                   ObjectAnimator objectAnimat4 = j.a(this, new float[i2]{0x3f19999a,0x3f800000,0x3f4ccccd,0});
                   if (view2 instanceof b) {
                      view2.g("");
                   }
                   objectAnimat4.addListener(new k(runnable, view2, obj));
                   objectAnimat4.setStartDelay(200);
                   objectAnimat4.setDuration(l1);
                   obj = new AnimatorSet();
                   runnable.d = obj;
                   Animator[] uAnimatorArr1 = new Animator[]{objectAnimat2,objectAnimat3,objectAnimat1};
                   obj.playTogether(uAnimatorArr1);
                   runnable.d.addListener(new l(runnable, view3));
                   runnable.d.start();
                   AnimatorSet uAnimatorSet1 = new AnimatorSet();
                   Animator[] uAnimatorArr2 = new Animator[]{objectAnimat,objectAnimat4};
                   uAnimatorSet1.playTogether(uAnimatorArr2);
                   uAnimatorSet1.addListener(new m(runnable, this, view3, view2));
                   uAnimatorSet1.start();
                   runnable.d(view3, view2);
                }
                return;
             }else {
                b.P(LiveRedPacketPendantContainerView.h, "updateRedPacketList, case 5: refresh directly");
                this.f(p0);
                return;
             }
          }
       }
    }
    public void setLiveTopPendantEnterAnimationService(a p0){
       this.g = p0;
    }
    public void setShouldDisableEnterAnimation(boolean p0){
       this.f = p0;
    }
}
