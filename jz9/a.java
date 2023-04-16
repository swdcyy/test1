package jz9.a;
import erd.g;
import jz9.c;
import java.lang.Object;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class a implements g	// class@002b8a
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p0 = this.b.q;
       if (p0 != null) {
          p0.onNext(Boolean.TRUE);
       }
       return;
    }
}
