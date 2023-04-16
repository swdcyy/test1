package com.kwai.slide.play.detail.traffic.SaveTrafficReminderAnimView;
import android.widget.FrameLayout;
import com.kwai.slide.play.detail.traffic.SaveTrafficReminderAnimView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Path;
import android.graphics.RectF;
import lnc.a1;
import android.graphics.Canvas;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Path$Direction;
import android.view.ViewGroup;

public final class SaveTrafficReminderAnimView extends FrameLayout	// class@00187b
{
    public final Path b;
    public final RectF c;
    public final float d;
    public final Animator e;
    public HashMap f;
    public static final SaveTrafficReminderAnimView$a g;

    static {
       SaveTrafficReminderAnimView.g = new SaveTrafficReminderAnimView$a(null);
    }
    public void SaveTrafficReminderAnimView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.b = new Path();
       this.c = new RectF();
       this.d = (float)a1.e(4.00f);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SaveTrafficReminderAnimView.class, "3")) {
          return;
       }
       this.b.reset();
       this.b.addRoundRect(this.c, this.d, this.d, Path$Direction.CCW);
       if (p0 != null) {
          p0.clipPath(this.b);
       }
       super.dispatchDraw(p0);
       return;
    }
}
