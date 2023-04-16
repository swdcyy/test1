package com.kuaishou.gifshow.kuaishan.ui.preview.b$b;
import android.view.View$OnTouchListener;
import com.kuaishou.gifshow.kuaishan.ui.preview.b;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Math;
import com.kuaishou.gifshow.kuaishan.ui.preview.b$a;

public final class b$b implements View$OnTouchListener	// class@001ae7
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       String str = "1";
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, b$b.class, str);
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       int action = p1.getAction();
       if (action) {
          int i = 1;
          if (action == i) {
             b$b tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p1, tb, b.class, str)) {
                float f = Math.abs((p1.getX() - tb.b));
                float y = p1.getY();
                float f1 = Math.abs((y - tb.c));
                if (f1 - (float)tb.a > 0 && ((f1 * 0x3f000000) - f > 0 && y - tb.c < 0)) {
                   if (tb.f != (tb.e - i)) {
                      i = 0;
                   }
                   if (i) {
                      b h = tb.h;
                      if (h != null) {
                         h.F5();
                      }
                   }
                }
             }
          }
       }else {
          action.b = p1.getX();
          action.c = p1.getY();
       }
       return false;
    }
}
