package k99.g$a;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$d;
import k99.g;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.Set;
import vd5.c;
import java.util.Objects;
import e1a.e;
import com.kwai.robust.PatchProxyResult;

public class g$a extends PhotosScaleHelpView$d	// class@002b79
{
    public long a;
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onDoubleTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.a = System.currentTimeMillis();
       this.b.u.onNext(Boolean.TRUE);
       Iterator iterator = this.b.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "4")) {
          return;
       }
       g x = this.b.x;
       Objects.requireNonNull(x);
       if (x.a(4)) {
          Iterator iterator = this.b.v.iterator();
          while (iterator.hasNext()) {
             iterator.next().onLongPress(p0);
          }
       }
       return;
    }
    public void onSingleTapConfirmed(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "2")) {
          return;
       }
       Iterator iterator = this.b.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSingleTapConfirmed(p0);
       }
       iterator = this.b.w.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSingleTapConfirmed(p0);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.v.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().onTouchEvent(p0)) {
             break ;
          }
       }
       return true;
    }
}
