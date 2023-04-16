package kotlin.jvm.internal.PropertyReference0;
import vsd.o;
import kotlin.jvm.internal.PropertyReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import vsd.c;
import nsd.m0;
import vsd.n;
import vsd.n$c;
import vsd.o$a;

public abstract class PropertyReference0 extends PropertyReference implements o	// class@00189b
{

    public void PropertyReference0(){
       super();
    }
    public void PropertyReference0(Object p0){
       super(p0);
    }
    public void PropertyReference0(Object p0,Class p1,String p2,String p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public c computeReflected(){
       return m0.q(this);
    }
    public Object getDelegate(){
       return this.getReflected().getDelegate();
    }
    public n$c getGetter(){
       return this.getGetter();
    }
    public o$a getGetter(){
       return this.getReflected().getGetter();
    }
    public Object invoke(){
       return this.get();
    }
}
