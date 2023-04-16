package brb.c;
import hka.g;
import brb.e;
import java.lang.Object;
import android.content.res.Configuration;
import arb.a;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class c implements g	// class@00043b
{
    public final e a;

    public void c(e p0){
       this.a = p0;
    }
    public final void a(boolean p0,Configuration p1){
       this.a.h.b.onNext(Boolean.valueOf(p0));
    }
}
