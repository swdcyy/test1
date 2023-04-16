package at7.f;
import qp7.c;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class f extends c	// class@00036b
{
    public final PublishSubject a;

    public void f(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.a = publishSubje;
    }
}
