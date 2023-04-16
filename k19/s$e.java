package k19.s$e;
import com.yxcorp.gifshow.widget.m;
import k19.s;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;

public class s$e extends m	// class@002a93
{
    public final s c;

    public void s$e(s p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$e.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.a("PhotoDetailNewAdPresenter", "purchase root", objArray);
       this.c.w.onNext(Integer.valueOf(8));
       return;
    }
}
