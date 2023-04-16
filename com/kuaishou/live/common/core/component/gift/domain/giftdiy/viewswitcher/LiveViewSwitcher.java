package com.kuaishou.live.common.core.component.gift.domain.giftdiy.viewswitcher.LiveViewSwitcher;
import android.widget.ViewSwitcher;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.viewswitcher.LiveViewSwitcher$a;
import android.widget.ViewSwitcher$ViewFactory;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.lang.Boolean;
import java.util.List;
import java.util.Collection;

public final class LiveViewSwitcher extends ViewSwitcher	// class@00124b
{
    public List b;
    public int c;
    public String d;
    public final String e;
    public final float f;
    public final long g;
    public HashMap h;

    public void LiveViewSwitcher(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new ArrayList();
       this.e = "innerText";
       this.f = 14.00f;
       this.g = 1000;
       this.setFactory(new LiveViewSwitcher$a(this, p0));
       AnimationSet uAnimationSe = new AnimationSet(true);
       uAnimationSe.addAnimation(this.b(0, 0xbf800000, 1000));
       uAnimationSe.addAnimation(this.a(0x3f800000, 0, 1000));
       this.setOutAnimation(uAnimationSe);
       uAnimationSe = new AnimationSet(true);
       uAnimationSe.addAnimation(this.b(0x3f800000, 0, 1000));
       uAnimationSe.addAnimation(this.a(0, 0x3f800000, 1000));
       this.setInAnimation(uAnimationSe);
    }
    public final Animation a(float p0,float p1,long p2){
       AlphaAnimation obj;
       if (PatchProxy.isSupport(LiveViewSwitcher.class)) {
          obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Long.valueOf(p2), this, LiveViewSwitcher.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new AlphaAnimation(p0, p1);
       obj.setDuration(p2);
       return obj;
    }
    public final Animation b(float p0,float p1,long p2){
       Object obj;
       if (PatchProxy.isSupport(LiveViewSwitcher.class)) {
          obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Long.valueOf(p2), this, LiveViewSwitcher.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       TranslateAnimation translateAni = new TranslateAnimation(1, 0, 1, 0, 1, p0, 1, p1);
       obj.setDuration(p2);
       return obj;
    }
    public final void c(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveViewSwitcher.class, "6")) {
          return;
       }
       TextView textView = p0.findViewWithTag(this.e);
       a.o(textView, "titleView");
       textView.setText(p1);
       p0.setVisibility(0);
       return;
    }
    public final void d(boolean p0){
       if (PatchProxy.isSupport(LiveViewSwitcher.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveViewSwitcher.class, "3")) {
          return;
       }
       String str = this.b.get(this.c);
       this.d = str;
       if (p0) {
          this.setText(str);
       }else {
          this.setCurrentText(str);
       }
       return;
    }
    public final String getCurTrendingItem(){
       return this.d;
    }
    public final String getKeywordHint(){
       LiveViewSwitcher td = this.d;
       if (td != null) {
       }else {
          td = "";
       }
       return td;
    }
    public final void setCurrentText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewSwitcher.class, "5")) {
          return;
       }
       View childAt = this.getChildAt(0);
       a.o(childAt, "getChildAt\(0\)");
       this.c(childAt, p0);
       return;
    }
    public final void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewSwitcher.class, "4")) {
          return;
       }
       View nextView = this.getNextView();
       a.o(nextView, "nextView");
       this.c(nextView, p0);
       this.showNext();
       return;
    }
    public final void setTexts(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewSwitcher.class, "2")) {
          return;
       }
       a.p(p0, "presetWords");
       if (p0.isEmpty() ^ 0x01) {
          this.b = p0;
          this.c = 0;
       }
       this.reset();
       this.d(0);
       return;
    }
}
