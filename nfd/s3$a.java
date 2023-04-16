package nfd.s3$a;
import android.view.View$OnAttachStateChangeListener;
import nfd.s3;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class s3$a implements View$OnAttachStateChangeListener	// class@001e07
{
    public final s3 b;

    public void s3$a(s3 p0){
       this.b = p0;
       super();
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s3$a.class, "1")) {
          return;
       }
       s3 f = this.b.F;
       if (f != null) {
          f.removeOnAttachStateChangeListener(this);
       }
       this.b.M(0);
       return;
    }
    public void onViewDetachedFromWindow(View p0){
    }
}
