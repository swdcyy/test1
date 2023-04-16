package iy9.e;
import qp7.c;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class e extends c	// class@0028c1
{
    public final PublishSubject a;

    public void e(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Boolean>\(\)");
       this.a = publishSubje;
    }
}
