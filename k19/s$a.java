package k19.s$a;
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

public class s$a extends m	// class@002a8f
{
    public final s c;

    public void s$a(s p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.a("PhotoDetailNewAdPresenter", "icon", objArray);
       this.c.w.onNext(Integer.valueOf(6));
       return;
    }
}
