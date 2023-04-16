package nfd.g1;
import erd.g;
import mrd.a;
import java.lang.Object;
import nfd.k1$a;
import java.util.Collection;
import ekd.q;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public final class g1 implements g	// class@001dac
{
    public final a b;

    public void g1(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g1 tb = this.b;
       if (p0 == null || q.f(p0.b)) {
          tb.onError(new Exception("fetch cdn is error"));
       }
       return;
    }
}
