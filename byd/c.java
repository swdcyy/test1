package byd.c;
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
import okhttp3.Request;
import byd.b;
import java.lang.Class;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import java.lang.StringBuilder;
import retrofit2.HttpException;

public final class c implements a	// class@000304
{
    public final k b;

    public void c(k p0){
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
          p1 = p1.a();
          if (p1 == null) {
             p0 = p0.request().tag(b.class);
             if (p0 == null) {
                a.L();
             }
             a.h(p0, "call.request\(\).tag\(Invocation::class.java\)!!");
             Method method = p0.a();
             a.h(method, "method");
             Class declaringCla = method.getDeclaringClass();
             a.h(declaringCla, "method.declaringClass");
             this.b.resumeWith(Result.constructor-impl(j0.a(new KotlinNullPointerException("Response from "+declaringCla.getName()+'.'+method.getName()+" was null but response body type was declared as non-null"))));
          }else {
             this.b.resumeWith(Result.constructor-impl(p1));
          }
       }else {
          this.b.resumeWith(Result.constructor-impl(j0.a(new HttpException(p1))));
       }
       return;
    }
}
