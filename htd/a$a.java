package htd.a$a;
import kotlinx.coroutines.channels.ChannelIterator;
import htd.a;
import java.lang.Object;
import htd.b;
import asd.c;
import java.lang.Boolean;
import dsd.a;
import kotlinx.coroutines.channels.ChannelIterator$DefaultImpls;
import htd.p;
import java.lang.Throwable;
import ltd.d0;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ftd.l;
import ftd.n;
import htd.a$c;
import ftd.k;
import htd.x;
import kotlin.Result;
import qrd.j0;
import csd.b;
import dsd.e;
import java.lang.IllegalStateException;
import java.lang.String;

public final class a$a implements ChannelIterator	// class@000faa
{
    public Object a;
    public final a b;

    public void a$a(a p0){
       super();
       this.b = p0;
       this.a = b.c;
    }
    public Object a(c p0){
       a$a ta = this.a;
       Object c = b.c;
       if (ta != c) {
          return a.a(this.e(ta));
       }
       Object obj = this.b.b0();
       this.a = obj;
       if (obj != c) {
          return a.a(this.e(obj));
       }
       return this.f(p0);
    }
    public Object b(c p0){
       return ChannelIterator$DefaultImpls.a(this, p0);
    }
    public final a c(){
       return this.b;
    }
    public final Object d(){
       return this.a;
    }
    public final boolean e(Object p0){
       if (!p0 instanceof p) {
          return true;
       }
       if (p0.e == null) {
          return false;
       }
       throw d0.o(p0.h0());
    }
    public final Object f(c p0){
       l ol = n.b(IntrinsicsKt__IntrinsicsJvmKt.d(p0));
       a$c uoc = new a$c(this, ol);
       while (true) {
          if (this.c().Q(uoc)) {
             this.c().g0(ol, uoc);
             break ;
          }else {
             Object obj1 = this.c().b0();
             this.g(obj1);
             if (obj1 instanceof p) {
                if (obj1.e == null) {
                   ol.resumeWith(Result.constructor-impl(a.a(false)));
                   break ;
                }else {
                   ol.resumeWith(Result.constructor-impl(j0.a(obj1.h0())));
                   break ;
                }
             }else {
                if (obj1 != b.c) {
                   ol.resumeWith(Result.constructor-impl(a.a(true)));
                   break ;
                }
             }
          }
       }
       Object obj = ol.r();
       if (obj == b.h()) {
          e.c(p0);
       }
       return obj;
    }
    public final void g(Object p0){
       this.a = p0;
    }
    public Object next(){
       a$a ta = this.a;
       if (ta instanceof p) {
          throw d0.o(ta.h0());
       }
       Object c = b.c;
       if (ta == c) {
          throw new IllegalStateException("\'hasNext\' should be called prior to \'next\' invocation");
       }
       this.a = c;
       return ta;
    }
}
