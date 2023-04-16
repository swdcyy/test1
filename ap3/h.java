package ap3.h;
import erd.g;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Throwable;

public final class h implements g	// class@000297
{
    public final PublishSubject b;

    public void h(PublishSubject p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onError(p0);
    }
}
