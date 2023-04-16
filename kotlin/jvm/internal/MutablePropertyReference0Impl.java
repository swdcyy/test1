package kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference0;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import vsd.h;
import nsd.r;
import vsd.d;
import vsd.o$a;
import vsd.c;
import vsd.k$a;

public class MutablePropertyReference0Impl extends MutablePropertyReference0	// class@001895
{

    public void MutablePropertyReference0Impl(Class p0,String p1,String p2,int p3){
       super(CallableReference.NO_RECEIVER, p0, p1, p2, p3);
    }
    public void MutablePropertyReference0Impl(Object p0,Class p1,String p2,String p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public void MutablePropertyReference0Impl(h p0,String p1,String p2){
       super(CallableReference.NO_RECEIVER, p0.j(), p1, p2, (p0 instanceof d ^ 0x01));
    }
    public Object get(){
       Object[] objArray = new Object[0];
       return this.getGetter().call(objArray);
    }
    public void set(Object p0){
       Object[] objArray = new Object[]{p0};
       this.getSetter().call(objArray);
    }
}
