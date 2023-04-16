package n1a.g$b;
import android.view.View$OnTouchListener;
import n1a.g;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;
import android.widget.EditText;
import a27.c;

public class g$b implements View$OnTouchListener	// class@0030b9
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, g$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!p1.getAction()) {
          Rect rect = new Rect();
          this.b.r.getHitRect(rect);
          if (!rect.contains((int)p1.getX(), (int)p1.getY())) {
             c.d(this.b.r);
          }
       }
       return false;
    }
}
