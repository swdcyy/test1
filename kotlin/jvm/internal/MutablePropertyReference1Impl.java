package kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.MutablePropertyReference1;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import vsd.h;
import nsd.r;
import vsd.d;
import vsd.p$a;
import vsd.c;
import vsd.l$a;

public class MutablePropertyReference1Impl extends MutablePropertyReference1	// class@001897
{

    public void MutablePropertyReference1Impl(Class p0,String p1,String p2,int p3){
       super(CallableReference.NO_RECEIVER, p0, p1, p2, p3);
    }
    public void MutablePropertyReference1Impl(Object p0,Class p1,String p2,String p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public void MutablePropertyReference1Impl(h p0,String p1,String p2){
       super(CallableReference.NO_RECEIVER, p0.j(), p1, p2, (p0 instanceof d ^ 0x01));
    }
    public Object get(Object p0){
       Object[] objArray = new Object[]{p0};
       return this.getGetter().call(objArray);
    }
    public void set(Object p0,Object p1){
       Object[] objArray = new Object[]{p0,p1};
       this.getSetter().call(objArray);
    }
}
