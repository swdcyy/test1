package ar7.q;
import qp7.c;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class q extends c	// class@00035b
{
    public final PublishSubject a;
    public final PublishSubject b;
    public final PublishSubject c;
    public PublishSubject d;

    public void q(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Int>\(\)");
       this.a = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.b = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.c = publishSubje;
    }
}
