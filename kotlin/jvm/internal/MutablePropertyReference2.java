package kotlin.jvm.internal.MutablePropertyReference2;
import vsd.m;
import kotlin.jvm.internal.MutablePropertyReference;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import vsd.c;
import nsd.m0;
import vsd.n;
import kotlin.jvm.internal.PropertyReference;
import vsd.q;
import vsd.n$c;
import vsd.q$a;
import vsd.j$a;
import vsd.m$a;

public abstract class MutablePropertyReference2 extends MutablePropertyReference implements m	// class@001898
{

    public void MutablePropertyReference2(){
       super();
    }
    public void MutablePropertyReference2(Class p0,String p1,String p2,int p3){
       super(CallableReference.NO_RECEIVER, p0, p1, p2, p3);
    }
    public c computeReflected(){
       return m0.k(this);
    }
    public Object getDelegate(Object p0,Object p1){
       return this.getReflected().getDelegate(p0, p1);
    }
    public n$c getGetter(){
       return this.getGetter();
    }
    public q$a getGetter(){
       return this.getReflected().getGetter();
    }
    public j$a getSetter(){
       return this.getSetter();
    }
    public m$a getSetter(){
       return this.getReflected().getSetter();
    }
    public Object invoke(Object p0,Object p1){
       return this.get(p0, p1);
    }
}
