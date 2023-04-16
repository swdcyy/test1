package kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import vsd.h;
import nsd.r;
import vsd.d;
import vsd.o$a;
import vsd.c;

public class PropertyReference0Impl extends PropertyReference0	// class@00189c
{

    public void PropertyReference0Impl(Class p0,String p1,String p2,int p3){
       super(CallableReference.NO_RECEIVER, p0, p1, p2, p3);
    }
    public void PropertyReference0Impl(Object p0,Class p1,String p2,String p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public void PropertyReference0Impl(h p0,String p1,String p2){
       super(CallableReference.NO_RECEIVER, p0.j(), p1, p2, (p0 instanceof d ^ 0x01));
    }
    public Object get(){
       Object[] objArray = new Object[0];
       return this.getGetter().call(objArray);
    }
}
