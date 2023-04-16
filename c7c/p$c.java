package c7c.p$c;
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

public class p$c extends m	// class@00054f
{
    public final p c;

    public void p$c(p p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$c.class, "1")) {
          return;
       }
       this.c.p.n().onNext(Boolean.TRUE);
       return;
    }
}
