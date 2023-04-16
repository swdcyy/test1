package com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar;
import android.view.View$OnTouchListener;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.q4;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar$a;
import java.lang.Float;
import android.view.View;
import ekd.m1;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;
import java.lang.Boolean;

public class LiveClipLyricsBar extends RelativeLayout implements View$OnTouchListener, d	// class@00137b
{
    public View b;
    public float c;
    public float d;
    public boolean e;
    public int f;
    public int g;
    public LiveVoicePartyLyricClipView h;
    public LiveClipLyricsBar$a i;

    public void LiveClipLyricsBar(Context p0){
       super(p0);
       this.e = true;
    }
    public void LiveClipLyricsBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = true;
    }
    public void LiveClipLyricsBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = true;
    }
    public final void a(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveClipLyricsBar.class, "5")) {
          return;
       }
       this.setTranslationY(q4.a((this.d + (p0.getRawY() - this.c)), (float)this.f, (float)(this.g - this.getHeight())));
       LiveClipLyricsBar ti = this.i;
       if (ti != null) {
          ti.a(this.getCenterY());
       }
       return;
    }
    public void b(float p0){
       if (PatchProxy.isSupport(LiveClipLyricsBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveClipLyricsBar.class, "8")) {
          return;
       }
       this.setTranslationY(p0);
       return;
    }
    public void c(float p0){
       if (PatchProxy.isSupport(LiveClipLyricsBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveClipLyricsBar.class, "7")) {
          return;
       }
       if (this.e != null) {
          this.setTranslationY((this.getTranslationY() - p0));
       }
       return;
    }
    public void d(int p0,int p1){
       this.f = p0;
       this.g = p1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveClipLyricsBar.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a1237);
       return;
    }
    public void e(float p0){
       if (PatchProxy.isSupport(LiveClipLyricsBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveClipLyricsBar.class, "9")) {
          return;
       }
       this.animate().translationY(p0).setInterpolator(new DecelerateInterpolator()).setDuration(200);
       return;
    }
    public int getBottomEdge(){
       return this.g;
    }
    public float getCenterY(){
       Object obj = PatchProxy.apply(null, this, LiveClipLyricsBar.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (((float)this.h.k + this.getTranslationY()) + (float)(this.getHeight() / 2));
    }
    public int getTopEdge(){
       return this.f;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveClipLyricsBar.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.setOnTouchListener(this);
       return;
    }
    public boolean onTouch(View p0,MotionEvent p1){
       LiveClipLyricsBar ti;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, LiveClipLyricsBar.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       int action = p1.getAction();
       boolean b = false;
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                }
             }else {
                this.e = b;
                this.a(p1);
             }
          }else {
          }
       }else {
          this.e = b;
          this.c = p1.getRawY();
          this.d = this.getTranslationY();
       }
    label_0045 :
       return true;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveClipLyricsBar.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.onTouchEvent(p0);
    }
    public void setClipView(LiveVoicePartyLyricClipView p0){
       this.h = p0;
    }
    public void setNeedScrollWithLyric(boolean p0){
       this.e = p0;
    }
    public void setOnDragHandleListener(LiveClipLyricsBar$a p0){
       this.i = p0;
    }
}
