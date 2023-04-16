package com.yxcorp.gifshow.camera.record.assistant.widget.AssistantViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.yxcorp.gifshow.camera.record.assistant.widget.AssistantViewPager$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.assistant.widget.AssistantViewPager$b;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.assistant.widget.AssistantViewPager$c;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import android.view.MotionEvent;

public final class AssistantViewPager extends VerticalViewPager	// class@001d2d
{
    public final Runnable l1;
    public static final AssistantViewPager$a m1;

    static {
       AssistantViewPager.m1 = new AssistantViewPager$a(null);
    }
    public void AssistantViewPager(Context p0){
       a.p(p0, "context");
       super(p0);
       this.l1 = new AssistantViewPager$b(this);
    }
    public void AssistantViewPager(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
       this.l1 = new AssistantViewPager$b(this);
    }
    public void S(int p0,int p1){
       if (PatchProxy.isSupport(AssistantViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AssistantViewPager.class, "2")) {
          return;
       }
       this.x = false;
       this.L(p0, true, false, p1);
       return;
    }
    public final void T(){
       if (PatchProxy.applyVoid(null, this, AssistantViewPager.class, "3")) {
          return;
       }
       this.b(new AssistantViewPager$c(this));
       k1.m(this.l1);
       k1.r(this.l1, 1500);
       return;
    }
    public final Runnable getDisplayNextRunnable(){
       return this.l1;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, AssistantViewPager.class, "5")) {
          return;
       }
       this.T();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, AssistantViewPager.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.setOffscreenPageLimit(1);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
}
