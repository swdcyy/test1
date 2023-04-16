package gpb.i$c;
import com.kwai.feature.post.api.music.widget.DragScrollContainerLayout$b;
import gpb.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hka.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;

public final class i$c implements DragScrollContainerLayout$b	// class@002b5f
{
    public final i a;

    public void i$c(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i$c.class, "1")) {
          return;
       }
       this.a.w.onBackPressed();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$c.class, "2")) {
          return;
       }
       if (this.a.getActivity() != null) {
          n.C(this.a.getActivity());
       }
       return;
    }
}
