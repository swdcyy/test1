package esa.j;
import erd.g;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Boolean;

public final class j implements g	// class@0027ca
{
    public final PublishSubject b;

    public void j(PublishSubject p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onNext(p0);
    }
}
