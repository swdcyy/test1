package k19.s$f;
import ub.a;
import k19.s;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yx.j0;
import android.widget.ImageView;

public class s$f extends a	// class@002a94
{
    public final s b;

    public void s$f(s p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s$f.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.c("PhotoDetailNewAdPresenter", "onFailure load image fail", objArray);
       this.b.p.setVisibility(8);
       return;
    }
}
