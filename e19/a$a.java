package e19.a$a;
import g59.q$a;
import e19.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class a$a implements q$a	// class@00211a
{
    public final a a;
    public static final boolean b;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.q.setNeedRetryFreeTraffic(false);
       this.a.q.sync(p0);
       this.a.p.onNext(Boolean.TRUE);
       return;
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.a.p.onNext(Boolean.FALSE);
       return;
    }
}
