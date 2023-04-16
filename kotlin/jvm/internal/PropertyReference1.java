package kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import kotlin.jvm.internal.PropertyReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import vsd.c;
import nsd.m0;
import vsd.n;
import vsd.n$c;
import vsd.p$a;

public abstract class PropertyReference1 extends PropertyReference implements p	// class@00189d
{

    public void PropertyReference1(){
       super();
    }
    public void PropertyReference1(Object p0){
       super(p0);
    }
    public void PropertyReference1(Object p0,Class p1,String p2,String p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public c computeReflected(){
       return m0.r(this);
    }
    public Object getDelegate(Object p0){
       return this.getReflected().getDelegate(p0);
    }
    public n$c getGetter(){
       return this.getGetter();
    }
    public p$a getGetter(){
       return this.getReflected().getGetter();
    }
    public Object invoke(Object p0){
       return this.get(p0);
    }
}
