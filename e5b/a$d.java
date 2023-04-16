package e5b.a$d;
import java.lang.Runnable;
import e5b.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import j8c.b;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.Window;
import android.app.Dialog;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.utility.RomUtils;
import android.graphics.Point;
import java.lang.Math;
import java.lang.StringBuilder;
import java.lang.Boolean;
import msd.l;
import qrd.l1;

public final class a$d implements Runnable	// class@00261a
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       a a;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$d.class, "1")) {
          return;
       }
       a$d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(objArray, tb, a.class, "5") || (tb.c == null || (tb.d != null && tb.a != null))) {
          String str = "InputKeyboardListener";
          b.a(str, "checkKeyboardStatus");
          a = tb.a;
          a.m(a);
          float y = a.getY();
          a d = tb.d;
          a.m(d);
          Window window = d.getWindow();
          a.m(window);
          View decorView = window.getDecorView();
          a.o(decorView, "window!!.decorView");
          int height = decorView.getHeight();
          a c = tb.c;
          a.m(c);
          n.A(c);
          View view = n.g(window);
          a.o(view, "ViewUtil.getContentView\(window\)");
          int i = height - view.getHeight();
          int i1 = n.n(tb.c);
          a a1 = tb.a;
          a.m(a1);
          a a2 = tb.a;
          a.m(a2);
          float f = ((float)height - y) - (float)(a1.getBottom() - a2.getTop());
          b = false;
          if (i1 < 0 || (RomUtils.o() || (RomUtils.s() && (i1 || (f - (float)i > 0 || Math.abs((f - (float)n.r(tb.c).y)) - (float)5 < 0))))) {
             i1 = (int)f;
          }else {
             i = 0;
          }
          if (i1 <= i) {
             b = true;
          }
          b.a(str, "inputAreaTop:"+y+" displayHeight:"+height+" contentOffset:"+i+" keyboardSuspectedHeight:"+i1+' '+"maybeKeyboardAndNavHeight:"+f);
          if (b != tb.e) {
             b.a(str, "isKeyBoardStatusChange isClosed:"+b);
             tb.e = b;
             a b1 = tb.b;
             if (b1 != null) {
                b1.invoke(Boolean.valueOf(b));
             }
          }
       }
    label_011b :
       return;
    }
}
