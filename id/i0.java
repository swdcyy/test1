package id.i0;
import ya.h;
import id.i;
import id.e0;
import id.c0;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import java.lang.Exception;
import java.lang.Throwable;

public abstract class i0 extends h	// class@0021af
{
    public final i c;
    public final e0 d;
    public final String e;
    public final c0 f;

    public void i0(i p0,e0 p1,c0 p2,String p3){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p3;
       this.f = p2;
       p1.onProducerStart(p2, p3);
    }
    public abstract void b(Object p0);
    public void d(){
       i0 td = this.d;
       i0 tf = this.f;
       i0 te = this.e;
       td.requiresExtraMap(tf, te);
       td.onProducerFinishWithCancellation(tf, te, null);
       this.c.b();
    }
    public void e(Exception p0){
       i0 td = this.d;
       i0 tf = this.f;
       i0 te = this.e;
       td.requiresExtraMap(tf, te);
       td.onProducerFinishWithFailure(tf, te, p0, null);
       this.c.onFailure(p0);
    }
    public void f(Object p0){
       i0 td = this.d;
       i0 tf = this.f;
       i0 te = this.e;
       Map map = (td.requiresExtraMap(tf, te))? this.g(p0): null;
       td.onProducerFinishWithSuccess(tf, te, map);
       this.c.d(p0, 1);
       return;
    }
    public Map g(Object p0){
       return null;
    }
}
