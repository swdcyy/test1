package k19.s$c;
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

public class s$c extends m	// class@002a91
{
    public final s c;

    public void s$c(s p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.a("PhotoDetailNewAdPresenter", "icon name subtile", objArray);
       this.c.w.onNext(Integer.valueOf(7));
       return;
    }
}
