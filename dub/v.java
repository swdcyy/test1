package dub.v;
import erd.g;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Integer;

public final class v implements g	// class@002580
{
    public final PublishSubject b;

    public void v(PublishSubject p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       if (!p0.intValue()) {
          tb.onNext(p0);
       }
       return;
    }
}
