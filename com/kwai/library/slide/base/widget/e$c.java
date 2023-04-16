package com.kwai.library.slide.base.widget.e$c;
import xtd.g$e;
import com.kwai.library.slide.base.widget.e;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;

public class e$c extends g$e	// class@000900
{
    public final e d;

    public void e$c(e p0){
       this.d = p0;
       super();
    }
    public boolean a(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, e$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       boolean b = false;
       if (!p1.getHistorySize()) {
          return b;
       }
       float f = p1.getY(b) - p1.getHistoricalY(b, b);
       if (Math.abs((p1.getX(b) - p1.getHistoricalX(b, b))) - Math.abs(f) > 0) {
          return b;
       }
       this.a = this.d.l;
       this.b = f;
       if (f > 0) {
          b = true;
       }
       this.c = b;
       return true;
    }
}
