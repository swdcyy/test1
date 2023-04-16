package a99.g$a;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$d;
import a99.g;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.Set;
import vd5.c;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;

public class g$a extends PhotosScaleHelpView$d	// class@000060
{
    public MotionEvent a;
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onDoubleTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       if (!this.b.S8(p0)) {
          return;
       }
       this.b.z.onNext(Boolean.TRUE);
       Iterator iterator = this.b.A.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "4")) {
          return;
       }
       if (this.b.S8(p0) && !this.b.I.getScrollState()) {
          g$a ta = this.a;
          if (ta != null && (ta.getActionMasked() == 1 || this.a.getActionMasked() == 3)) {
             return;
          }else {
             Iterator iterator = this.b.A.iterator();
             while (iterator.hasNext()) {
                iterator.next().onLongPress(p0);
             }
          }
       }
       return;
    }
    public void onSingleTapConfirmed(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "2")) {
          return;
       }
       g$a tb = this.b;
       if (tb.J == null) {
          return;
       }
       Iterator iterator = tb.A.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSingleTapConfirmed(p0);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       g$a obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a = p0;
       if (!p0.getAction()) {
          obj = this.b;
          obj.J = obj.S8(p0);
       }
       obj = this.b;
       boolean b = false;
       if (obj.J == null) {
          return b;
       }else {
          Iterator iterator = obj.A.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().onTouchEvent(p0)) {
                   return true;
                }
                continue ;
             }else if(this.b.I.getScrollState()){
                b = true;
                break ;
             }
             break ;
          }
          return b;
       }
    }
}
