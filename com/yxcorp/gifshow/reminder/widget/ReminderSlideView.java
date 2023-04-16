package com.yxcorp.gifshow.reminder.widget.ReminderSlideView;
import com.kwai.library.widget.scrollview.HorizontalSlideView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.reminder.widget.ReminderSlideView$a;
import ofc.f;
import java.lang.Runnable;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.kwai.robust.PatchProxyResult;
import ukd.a;
import mcc.b;
import java.lang.Throwable;
import q87.c;
import android.view.MotionEvent;
import android.view.View;
import com.kwai.library.widget.scrollview.HorizontalSlideView$a;

public class ReminderSlideView extends HorizontalSlideView	// class@001afc
{
    public boolean i;
    public OverScroller j;
    public HorizontalSlideView$a k;

    public void ReminderSlideView(Context p0){
       super(p0);
    }
    public void ReminderSlideView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ReminderSlideView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final void c(boolean p0){
       if (PatchProxy.isSupport(ReminderSlideView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ReminderSlideView.class, "4")) {
          return;
       }
       super.c(p0);
       if (this.k instanceof ReminderSlideView$a) {
          f uof = new f(this);
          long l = (p0)? 275: 0;
          this.postDelayed(uof, l);
       }
       return;
    }
    public final OverScroller getOverScroller(){
       Object obj = PatchProxy.apply(null, this, ReminderSlideView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i != null) {
          return this.j;
       }
       this.i = true;
       this.j = a.d(this, "mScroller");
       return this.j;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       OverScroller obj = PatchProxy.applyOneRefs(p0, this, ReminderSlideView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b()) {
          obj = this.getOverScroller();
          if (obj != null && (!obj.isFinished() && !p0.getActionMasked())) {
             View secondView = this.getSecondView();
             if (secondView != null && p0.getX() - (float)(this.getWidth() - secondView.getWidth()) >= 0) {
                obj.abortAnimation();
             }
          }
       }
       return super.onInterceptTouchEvent(p0);
    }
    public final void setOnResetListener(HorizontalSlideView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReminderSlideView.class, "3")) {
          return;
       }
       super.setOnResetListener(p0);
       this.k = p0;
       return;
    }
}
