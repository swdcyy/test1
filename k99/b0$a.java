package k99.b0$a;
import com.kwai.library.widget.imageview.scale.PhotosScaleHelpView$d;
import k99.b0;
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
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.yxcorp.gifshow.entity.QPhoto;
import jd5.a;
import com.kwai.robust.PatchProxyResult;

public class b0$a extends PhotosScaleHelpView$d	// class@002b68
{
    public long a;
    public final b0 b;

    public void b0$a(b0 p0){
       this.b = p0;
       super();
    }
    public void onDoubleTap(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$a.class, "1")) {
          return;
       }
       this.a = System.currentTimeMillis();
       this.b.u.onNext(Boolean.TRUE);
       Iterator iterator = this.b.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this.b.P8(p0));
       }
       return;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$a.class, "4")) {
          return;
       }
       Iterator iterator = this.b.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().onLongPress(this.b.P8(p0));
       }
       return;
    }
    public void onSingleTapConfirmed(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$a.class, "2")) {
          return;
       }
       Iterator iterator = this.b.v.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSingleTapConfirmed(this.b.P8(p0));
       }
       if ((System.currentTimeMillis() - this.a) - 500 > 0 && this.b.s.enableSlidePlay()) {
          b0$a tb = this.b;
          b0 w = tb.w;
          if (w != null) {
             w.onNext(new ChangeScreenVisibleEvent(tb.r));
          }
       }
       this.b.x.onNext(new a(false, 3, -1));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b0$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.v.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (obj.next().onTouchEvent(this.b.P8(p0))) {
             break ;
          }
       }
       return true;
    }
}
