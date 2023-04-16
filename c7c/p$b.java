package c7c.p$b;
import com.yxcorp.gifshow.widget.m;
import c7c.p;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import a7c.h;
import java.lang.Boolean;

public class p$b extends m	// class@00054e
{
    public final p c;

    public void p$b(p p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$b.class, "1")) {
          return;
       }
       this.c.p.n().onNext(Boolean.TRUE);
       return;
    }
}
