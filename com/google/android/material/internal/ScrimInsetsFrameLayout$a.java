package com.google.android.material.internal.ScrimInsetsFrameLayout$a;
import a2.z;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import java.lang.Object;
import android.view.View;
import a2.u0;
import android.graphics.Rect;
import android.widget.FrameLayout;
import a2.i0;

public class ScrimInsetsFrameLayout$a implements z	// class@0016a2
{
    public final ScrimInsetsFrameLayout a;

    public void ScrimInsetsFrameLayout$a(ScrimInsetsFrameLayout p0){
       this.a = p0;
       super();
    }
    public u0 a(View p0,u0 p1){
       ScrimInsetsFrameLayout$a ta = this.a;
       if (ta.c == null) {
          ta.c = new Rect();
       }
       this.a.c.set(p1.i(), p1.k(), p1.j(), p1.h());
       this.a.a(p1);
       ta = this.a;
       boolean b = (!p1.l() || this.a.b == null)? true: false;
       ta.setWillNotDraw(b);
       i0.j0(this.a);
       return p1.c();
    }
}
