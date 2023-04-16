package kotlin.jvm.internal.PropertyReference2;
import vsd.q;
import kotlin.jvm.internal.PropertyReference;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import vsd.c;
import nsd.m0;
import vsd.n;
import vsd.n$c;
import vsd.q$a;

public abstract class PropertyReference2 extends PropertyReference implements q	// class@00189f
{

    public void PropertyReference2(){
       super();
    }
    public void PropertyReference2(Class p0,String p1,String p2,int p3){
       super(CallableReference.NO_RECEIVER, p0, p1, p2, p3);
    }
    public c computeReflected(){
       return m0.s(this);
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
    public Object invoke(Object p0,Object p1){
       return this.get(p0, p1);
    }
}
