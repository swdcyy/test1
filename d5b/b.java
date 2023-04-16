package d5b.b;
import com.yxcorp.gifshow.widget.m;
import d5b.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import b5b.b;

public final class b extends m	// class@00243d
{
    public final a c;

    public void b(a p0,boolean p1,long p2){
       this.c = p0;
       super(p1, p2);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.c.S8().onNext(new b(true, false));
       return;
    }
}
