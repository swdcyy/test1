package com.yxcorp.gifshow.detail.player.panel.smallwindow.widget.SmallWindowLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yxcorp.gifshow.detail.player.panel.smallwindow.widget.SmallWindowLayout$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.utility.Log;
import java.lang.Integer;
import android.view.View;
import java.lang.StringBuilder;
import android.graphics.Point;
import com.yxcorp.utility.n;
import rd5.a;
import java.util.Objects;
import android.app.Activity;
import rd5.a$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import rd5.h;

public final class SmallWindowLayout extends ConstraintLayout	// class@001648
{
    public boolean B;
    public static final SmallWindowLayout$a C;

    static {
       SmallWindowLayout.C = new SmallWindowLayout$a(null);
    }
    public void SmallWindowLayout(Context p0){
       super(p0, null);
    }
    public void SmallWindowLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SmallWindowLayout.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       Log.b("SmallWindowLayout", "onDetachedFromWindow");
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SmallWindowLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SmallWindowLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       Log.b("SmallWindowLayout", "onSizeChanged: w "+p0+", h "+p1+", oldw "+p2+", oldh "+p3);
       float f = (float)n.s(this.getContext()).x * 0x3f733333;
       if (this.B != null) {
          if ((float)p0 - f >= 0) {
             this.B = false;
             Context context = this.getContext();
             Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
             a.c.c(context);
             RxBus.f.b(new h());
          }
       }else if((float)p0 - f <= 0){
          this.B = true;
       }
       return;
    }
}
