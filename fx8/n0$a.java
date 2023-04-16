package fx8.n0$a;
import com.yxcorp.gifshow.widget.m;
import fx8.n0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import io.reactivex.subjects.PublishSubject;

public class n0$a extends m	// class@00238b
{
    public final n0 c;

    public void n0$a(n0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("TopicItemPresenter", "click "+this.c.k, objArray);
       n0$a tc = this.c;
       tc.i.onNext(tc.k);
       return;
    }
}
