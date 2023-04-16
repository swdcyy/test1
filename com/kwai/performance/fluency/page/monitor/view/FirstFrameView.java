package com.kwai.performance.fluency.page.monitor.view.FirstFrameView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import hf7.a;
import com.kwai.performance.fluency.page.monitor.view.FirstFrameView$b;
import java.util.Objects;
import com.kwai.performance.fluency.page.monitor.utils.ChoreographerExt$runOnNextPreFrame$1;
import java.lang.Runnable;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import msd.l;
import com.kwai.performance.fluency.page.monitor.view.FirstFrameView$c;

public final class FirstFrameView extends View	// class@0010d5
{
    public FirstFrameView$a b;
    public HashMap c;

    public void FirstFrameView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void FirstFrameView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void FirstFrameView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setLayoutParams(new ViewGroup$LayoutParams(1, 1));
       this.setBackgroundColor(0);
    }
    public void FirstFrameView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       Objects.requireNonNull(a.d);
       Monitor_ThreadKt.f(new ChoreographerExt$runOnNextPreFrame$1(new FirstFrameView$b(this)));
    }
    public final void setOnFirstFrameListener(l p0){
       a.p(p0, "block");
       this.b = new FirstFrameView$c(p0);
    }
}
