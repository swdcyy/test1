package com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton$ApplyStatus;
import android.content.res.Configuration;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.view.View;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.core.graphics.drawable.a;
import java.lang.Boolean;
import android.graphics.drawable.GradientDrawable;
import android.os.Build$VERSION;
import lnc.a1;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton$b;
import com.kuaishou.live.common.core.component.chat.widget.LiveChatApplyButton$c;
import android.animation.Animator$AnimatorListener;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;

public class LiveChatApplyButton extends AppCompatTextView	// class@001052
{
    public LiveChatApplyButton$ApplyStatus f;
    public boolean g;
    public boolean h;
    public ValueAnimator i;

    public void LiveChatApplyButton(Context p0){
       super(p0, null);
    }
    public void LiveChatApplyButton(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveChatApplyButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.g = false;
       this.h = false;
       this.p();
    }
    public LiveChatApplyButton$ApplyStatus getApplyStatus(){
       return this.f;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveChatApplyButton.class, "4")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (p0.orientation == 2 && this.g != null) {
          this.setBackgroundResource(R.drawable.arg_RES_7f0802a2);
       }else {
          this.p();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveChatApplyButton.class, "8")) {
          return;
       }
       super.onDetachedFromWindow();
       LiveChatApplyButton ti = this.i;
       if (ti != null && ti.isRunning()) {
          this.i.cancel();
       }
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, LiveChatApplyButton.class, "5")) {
          return;
       }
       int i = (this.g != null)? 0x7f08115e: 0x7f0802a2;
       this.setBackgroundResource(i);
       return;
    }
    public void setApplyStatus(LiveChatApplyButton$ApplyStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveChatApplyButton.class, "2")) {
          return;
       }
       this.f = p0;
       int i = (p0 == LiveChatApplyButton$ApplyStatus.APPLYING)? 0x7f101f72: 0x7f101de3;
       this.setText(i);
       return;
    }
    public void setBackground(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveChatApplyButton.class, "6")) {
          return;
       }
       LiveChatApplyButton ti = this.i;
       if (ti != null && ti.isRunning()) {
          this.i.cancel();
       }
       if (this.getBackground() != null) {
          a.o(this.getBackground(), null);
       }
       this.h = false;
       super.setBackground(a.r(p0));
       return;
    }
    public void setGZoneNewLive(boolean p0){
       if (PatchProxy.isSupport(LiveChatApplyButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveChatApplyButton.class, "1")) {
          return;
       }
       this.g = p0;
       this.p();
       return;
    }
    public void setHighlightWithAnimation(boolean p0){
       int[] ointArray;
       ValueAnimator valueAnimato;
       if (PatchProxy.isSupport(LiveChatApplyButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveChatApplyButton.class, "7")) {
          return;
       }
       if (!this.getBackground() instanceof GradientDrawable) {
          return;
       }
       if (Build$VERSION.SDK_INT < 24) {
          return;
       }
       GradientDrawable background = this.getBackground();
       if (background.getColor() == null) {
          return;
       }
       this.h = p0;
       LiveChatApplyButton ti = this.i;
       if (ti != null && ti.isRunning()) {
          this.i.cancel();
       }
       int i = 1;
       int i1 = 0x7f060752;
       int i2 = 2;
       if (p0) {
          ointArray = new int[i2];
          ointArray[0] = background.getColor().getDefaultColor();
          ointArray[i] = a1.a(i1);
          valueAnimato = ObjectAnimator.ofInt(ointArray);
          this.i = valueAnimato;
          valueAnimato.addUpdateListener(new LiveChatApplyButton$a(this, background));
       }else {
          ointArray = new int[i2];
          ointArray[0] = a1.a(i1);
          ointArray[i] = background.getColor().getDefaultColor();
          valueAnimato = ObjectAnimator.ofInt(ointArray);
          this.i = valueAnimato;
          valueAnimato.addUpdateListener(new LiveChatApplyButton$b(this, background));
       }
       this.i.addListener(new LiveChatApplyButton$c(this, background));
       this.i.setDuration(250);
       this.i.setEvaluator(new ArgbEvaluator());
       this.i.start();
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(LiveChatApplyButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveChatApplyButton.class, "3")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
