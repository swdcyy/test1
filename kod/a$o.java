package kod.a$o;
import android.view.View$OnTouchListener;
import kod.a;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.widget.AbsoluteLayout;
import android.graphics.Rect;

public final class a$o implements View$OnTouchListener	// class@001806
{
    public final a b;

    public void a$o(a p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a$o.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       a.o(p1, "event");
       if (!p1.getAction()) {
          int[] ointArray = new int[2];
          this.b.S().getLocationOnScreen(ointArray);
          if (!new Rect(ointArray[0], ointArray[1], (ointArray[0] + this.b.S().getWidth()), (ointArray[1] + this.b.S().getHeight())).contains((int)p1.getRawX(), (int)p1.getRawY())) {
             boolean interceptWhe = this.b.S().getInterceptWhenTapOnBlankScreen();
             this.b.S().Q0(p1);
             if (this.b.S().getMSelectedWhenActionDown()) {
                return interceptWhe;
             }
          }
       }
       return 0;
    }
}
