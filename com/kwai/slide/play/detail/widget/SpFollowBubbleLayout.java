package com.kwai.slide.play.detail.widget.SpFollowBubbleLayout;
import android.widget.LinearLayout;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ct7.b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.graphics.Rect;
import android.view.ViewConfiguration;
import android.os.Vibrator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.view.View;

public class SpFollowBubbleLayout extends LinearLayout	// class@001891
{
    public final Handler b;
    public boolean c;
    public boolean d;
    public float e;
    public float f;
    public boolean g;
    public final Runnable h;

    public void SpFollowBubbleLayout(Context p0){
       super(p0);
       this.b = new Handler(Looper.getMainLooper());
       this.h = new b(this);
    }
    public void SpFollowBubbleLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Handler(Looper.getMainLooper());
       this.h = new b(this);
    }
    public void SpFollowBubbleLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Handler(Looper.getMainLooper());
       this.h = new b(this);
    }
    public static void a(SpFollowBubbleLayout p0){
       p0.c();
    }
    public final void b(MotionEvent p0){
       Rect rect;
       if (PatchProxy.applyVoidOneRefs(p0, this, SpFollowBubbleLayout.class, "3")) {
          return;
       }
       boolean i = p0.getAction() & 0x00ff;
       String str = 1;
       if (i) {
          if (i != str) {
             if (i != 2) {
                if (i == 3 || (i == 5 || i == 6)) {
                }
             }else {
                this.e = p0.getRawX();
                this.f = p0.getRawY();
                this.c();
             }
          }else {
          }
       }else {
          this.setChildPressed(str);
          this.b.removeCallbacks(this.h);
          this.b.postDelayed(this.h, (long)ViewConfiguration.getLongPressTimeout());
          this.e = p0.getRawX();
          this.f = p0.getRawY();
          this.c();
       }
    label_0095 :
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, SpFollowBubbleLayout.class, "5")) {
          return;
       }
       Rect rect = new Rect();
       this.getGlobalVisibleRect(rect);
       if (rect.contains((int)this.e, (int)this.f)) {
          this.setChildPressed(true);
          if (this.d == null) {
             Vibrator systemServic = this.getContext().getSystemService("vibrator");
             if (systemServic != null && systemServic.hasVibrator()) {
                systemServic.vibrate(20);
             }
             this.d = true;
          }
       }else {
          this.d = false;
          this.setChildPressed(false);
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SpFollowBubbleLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.g = false;
       this.b(p0);
       super.dispatchTouchEvent(p0);
       return true;
    }
    public void onAttachedToWindow(){
       this.c = true;
    }
    public void onDetachedFromWindow(){
       this.c = false;
    }
    public final void setChildPressed(boolean p0){
       if (PatchProxy.isSupport(SpFollowBubbleLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SpFollowBubbleLayout.class, "4")) {
          return;
       }
       for (int i = 0; i < this.getChildCount(); i = i + 1) {
          this.getChildAt(i).setPressed(p0);
       }
       return;
    }
}
