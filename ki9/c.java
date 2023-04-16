package ki9.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;

public final class c implements View$OnClickListener	// class@002c90
{
    public final CameraView b;

    public void c(CameraView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, CameraView.class, "3")) {
       }else if(!q.f(tb.r)){
          Iterator iterator = new ArrayList(tb.r).iterator();
          while (iterator.hasNext()) {
             iterator.next().onClick(p0);
          }
       }
       return;
    }
}
