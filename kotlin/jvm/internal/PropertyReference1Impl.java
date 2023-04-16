package kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import vsd.h;
import nsd.r;
import vsd.d;
import vsd.p$a;
import vsd.c;

public class PropertyReference1Impl extends PropertyReference1	// class@00189e
{

    public void PropertyReference1Impl(Class p0,String p1,String p2,int p3){
       super(CallableReference.NO_RECEIVER, p0, p1, p2, p3);
    }
    public void PropertyReference1Impl(Object p0,Class p1,String p2,String p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public void PropertyReference1Impl(h p0,String p1,String p2){
       super(CallableReference.NO_RECEIVER, p0.j(), p1, p2, (p0 instanceof d ^ 0x01));
    }
    public Object get(Object p0){
       Object[] objArray = new Object[]{p0};
       return this.getGetter().call(objArray);
    }
}
