package b3a.a;
import b3a.a$a;
import nsd.u;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class a	// class@00035a
{
    public boolean a;
    public boolean b;
    public boolean c;
    public final PublishSubject d;
    public static final a$a e;

    static {
       a.e = new a$a(null);
    }
    public void a(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Int>\(\)");
       this.d = publishSubje;
    }
}
