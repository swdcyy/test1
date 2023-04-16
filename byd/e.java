package byd.e;
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

public final class e implements a	// class@000306
{
    public final k b;

    public void e(k p0){
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
       this.b.resumeWith(Result.constructor-impl(p1));
    }
}
