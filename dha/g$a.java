package dha.g$a;
import dha.g;
import java.lang.Object;
import dda.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m66.a;
import com.kwai.framework.model.feed.BaseFeed;
import io.reactivex.subjects.PublishSubject;

public final class g$a	// class@0024a6
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.a.a.onNext(p0.a);
       return;
    }
}
