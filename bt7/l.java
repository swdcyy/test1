package bt7.l;
import android.view.TouchDelegate;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;

public class l extends TouchDelegate	// class@000475
{
    public final List a;
    public static final Rect b;

    static {
       l.b = new Rect();
    }
    public void l(View p0){
       super(l.b, p0);
       this.a = new ArrayList();
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       float x = p0.getX();
       float y = p0.getY();
       Iterator iterator = this.a.iterator();
       int i = 0;
    label_0022 :
       boolean b = false;
       while (iterator.hasNext()) {
          p0.setLocation(x, y);
          if (iterator.next().onTouchEvent(p0) || b) {
             b = true;
          }else {
             goto label_0022 ;
          }
       }
       return b;
    }
}
