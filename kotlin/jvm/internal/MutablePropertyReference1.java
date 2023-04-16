package kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import kotlin.jvm.internal.MutablePropertyReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import vsd.c;
import nsd.m0;
import vsd.n;
import kotlin.jvm.internal.PropertyReference;
import vsd.p;
import vsd.n$c;
import vsd.p$a;
import vsd.j$a;
import vsd.l$a;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements l	// class@001896
{

    public void MutablePropertyReference1(){
       super();
    }
    public void MutablePropertyReference1(Object p0){
       super(p0);
    }
    public void MutablePropertyReference1(Object p0,Class p1,String p2,String p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public c computeReflected(){
       return m0.j(this);
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
    public j$a getSetter(){
       return this.getSetter();
    }
    public l$a getSetter(){
       return this.getReflected().getSetter();
    }
    public Object invoke(Object p0){
       return this.get(p0);
    }
}
