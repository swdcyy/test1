package d89.k$a;
import du5.g;
import d89.k;
import android.app.Activity;
import java.lang.String;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import d89.i;
import java.lang.Runnable;
import ekd.k1;
import du5.d;
import d89.k$a$a;
import du5.c;

public class k$a implements g	// class@00208e
{
    public final Activity a;
    public final String b;
    public final String c;
    public final PublishSubject d;
    public final k e;

    public void k$a(k p0,Activity p1,String p2,String p3,PublishSubject p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void a(int p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       k1.o(new i(this.d, p0));
       return;
    }
    public void b(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       p0.Dc(this.a, this.b, new k$a$a(this));
       return;
    }
}
