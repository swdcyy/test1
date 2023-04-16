package bm5.h;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import ok.x;

public final class h	// class@0004ef
{
    public PublishSubject a;
    public PublishSubject b;
    public PublishSubject c;
    public x d;
    public PublishSubject e;
    public PublishSubject f;
    public PublishSubject g;

    public void h(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.a = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.b = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.c = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.e = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.f = publishSubje;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.g = publishSubje;
    }
    public final PublishSubject a(){
       return this.g;
    }
    public final PublishSubject b(){
       return this.a;
    }
    public final PublishSubject c(){
       return this.e;
    }
    public final PublishSubject d(){
       return this.c;
    }
    public final x e(){
       return this.d;
    }
    public final PublishSubject f(){
       return this.f;
    }
    public final PublishSubject g(){
       return this.b;
    }
    public final void h(x p0){
       this.d = p0;
    }
}
