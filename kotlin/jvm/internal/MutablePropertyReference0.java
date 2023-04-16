package kotlin.jvm.internal.MutablePropertyReference0;
import vsd.k;
import kotlin.jvm.internal.MutablePropertyReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import vsd.c;
import nsd.m0;
import vsd.n;
import kotlin.jvm.internal.PropertyReference;
import vsd.o;
import vsd.n$c;
import vsd.o$a;
import vsd.j$a;
import vsd.k$a;

public abstract class MutablePropertyReference0 extends MutablePropertyReference implements k	// class@001894
{

    public void MutablePropertyReference0(){
       super();
    }
    public void MutablePropertyReference0(Object p0){
       super(p0);
    }
    public void MutablePropertyReference0(Object p0,Class p1,String p2,String p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public c computeReflected(){
       return m0.i(this);
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
    public j$a getSetter(){
       return this.getSetter();
    }
    public k$a getSetter(){
       return this.getReflected().getSetter();
    }
    public Object invoke(){
       return this.get();
    }
}
