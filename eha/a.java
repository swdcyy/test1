package eha.a;
import erd.g;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import cx5.a;

public final class a implements g	// class@00267d
{
    public final PublishSubject b;

    public void a(PublishSubject p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onNext(p0);
    }
}
