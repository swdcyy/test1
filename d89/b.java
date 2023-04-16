package d89.b;
import u07.u;
import io.reactivex.subjects.PublishSubject;
import java.lang.Throwable;
import java.lang.Object;
import u07.t;
import android.view.View;

public final class b implements u	// class@002085
{
    public final PublishSubject b;
    public final Throwable c;

    public void b(PublishSubject p0,Throwable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       this.b.onError(this.c);
    }
}
