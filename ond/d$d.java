package ond.d$d;
import android.view.View$OnTouchListener;
import ond.d;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.widget.AbsoluteLayout;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;

public final class d$d implements View$OnTouchListener	// class@002029
{
    public final d b;

    public void d$d(d p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, d$d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       if (!p1.getAction()) {
          int[] ointArray = new int[2];
          this.b.e.getLocationOnScreen(ointArray);
          if (!new Rect(ointArray[0], ointArray[1], (ointArray[0] + this.b.e.getWidth()), (ointArray[1] + this.b.e.getHeight())).contains((int)p1.getRawX(), (int)p1.getRawY())) {
             this.b.e.Q0(p1);
          }
       }
       return 0;
    }
}
