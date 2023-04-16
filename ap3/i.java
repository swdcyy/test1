package ap3.i;
import erd.g;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;

public final class i implements g	// class@000298
{
    public final PublishSubject b;

    public void i(PublishSubject p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onNext(p0);
    }
}
