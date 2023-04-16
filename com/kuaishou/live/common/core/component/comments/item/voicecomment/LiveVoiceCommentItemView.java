package com.kuaishou.live.common.core.component.comments.item.voicecomment.LiveVoiceCommentItemView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable$Callback;
import w4.h;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.LiveVoiceCommentItemView$a;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.view.View;
import java.lang.Boolean;

public class LiveVoiceCommentItemView extends TextView	// class@0010a4
{

    public void LiveVoiceCommentItemView(Context p0){
       super(p0, null);
    }
    public void LiveVoiceCommentItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveVoiceCommentItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveVoiceCommentItemView.class, "8")) {
          return;
       }
       Iterator iterator = this.getTextAnimationDrawableList().iterator();
       while (iterator.hasNext()) {
          AnimationDrawable uAnimationDr = iterator.next();
          uAnimationDr.setCallback(this);
          uAnimationDr.start();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveVoiceCommentItemView.class, "5")) {
          return;
       }
       Iterator iterator = this.getTextLottieDrawableList().iterator();
       while (iterator.hasNext()) {
          h oh = iterator.next();
          oh.setCallback(new LiveVoiceCommentItemView$a(this));
          oh.start();
       }
       return;
    }
    public final List getTextAnimationDrawableList(){
       ArrayList obj = PatchProxy.apply(null, this, LiveVoiceCommentItemView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       CharSequence text = this.getText();
       if (text instanceof Spannable) {
          int i = 0;
          ImageSpan[] spans = text.getSpans(i, text.length(), ImageSpan.class);
          int len = spans.length;
          while (i < len) {
             Drawable drawable = spans[i].getDrawable();
             if (drawable instanceof AnimationDrawable) {
                obj.add(drawable);
             }
             i = i + 1;
          }
       }
       return obj;
    }
    public final List getTextLottieDrawableList(){
       ArrayList obj = PatchProxy.apply(null, this, LiveVoiceCommentItemView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       CharSequence text = this.getText();
       if (text instanceof Spannable) {
          int i = 0;
          ImageSpan[] spans = text.getSpans(i, text.length(), ImageSpan.class);
          int len = spans.length;
          while (i < len) {
             Drawable drawable = spans[i].getDrawable();
             if (drawable instanceof h) {
                obj.add(drawable);
             }
             i = i + 1;
          }
       }
       return obj;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveVoiceCommentItemView.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       this.b();
       this.a();
       return;
    }
    public void onDetachedFromWindow(){
       Iterator iterator;
       if (PatchProxy.applyVoid(null, this, LiveVoiceCommentItemView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       if (!PatchProxy.applyVoid(null, this, LiveVoiceCommentItemView.class, "6")) {
          iterator = this.getTextLottieDrawableList().iterator();
          while (iterator.hasNext()) {
             h oh = iterator.next();
             oh.stop();
             oh.setCallback(null);
          }
       }
       if (!PatchProxy.applyVoid(null, this, LiveVoiceCommentItemView.class, "9")) {
          iterator = this.getTextAnimationDrawableList().iterator();
          while (iterator.hasNext()) {
             AnimationDrawable uAnimationDr = iterator.next();
             uAnimationDr.stop();
             uAnimationDr.setCallback(null);
          }
       }
       return;
    }
    public void setVoiceCommentText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoiceCommentItemView.class, "1")) {
          return;
       }
       this.setText(p0);
       this.b();
       this.a();
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoiceCommentItemView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.verifyDrawable(p0) || p0 instanceof AnimationDrawable)? true: false;
       return b;
    }
}
