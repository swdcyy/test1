package f79.a$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import f79.a;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.drawee.view.DraweeView;
import android.view.View;
import android.view.View$OnLongClickListener;

public class a$a extends GestureDetector$SimpleOnGestureListener	// class@0022d1
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       super.onLongPress(p0);
       a$a tb = this.b;
       a w = tb.w;
       if (w != null) {
          w.onLongClick(tb.p());
       }
       return;
    }
}
