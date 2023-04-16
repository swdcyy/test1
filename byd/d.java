package byd.d;
import byd.a;
import ftd.k;
import java.lang.Object;
import retrofit2.a;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.Result;
import qrd.j0;
import asd.c;
import retrofit2.p;
import retrofit2.HttpException;

public final class d implements a	// class@000305
{
    public final k b;

    public void d(k p0){
       this.b = p0;
       super();
    }
    public void onFailure(a p0,Throwable p1){
       a.q(p0, "call");
       a.q(p1, "t");
       this.b.resumeWith(Result.constructor-impl(j0.a(p1)));
    }
    public void onResponse(a p0,p p1){
       a.q(p0, "call");
       a.q(p1, "response");
       if (p1.e()) {
          this.b.resumeWith(Result.constructor-impl(p1.a()));
       }else {
          this.b.resumeWith(Result.constructor-impl(j0.a(new HttpException(p1))));
       }
       return;
    }
}
