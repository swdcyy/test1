package d89.a;
import u07.u;
import d89.k;
import android.app.Activity;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import u07.t;
import android.view.View;

public final class a implements u	// class@001486
{
    public final k b;
    public final Activity c;
    public final String d;
    public final PublishSubject e;
    public final String f;

    public void a(k p0,Activity p1,String p2,PublishSubject p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void a(t p0,View p1){
       this.b.a(this.c, this.d, this.e, this.f);
    }
}
