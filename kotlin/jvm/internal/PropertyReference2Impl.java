package kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.PropertyReference2;
import java.lang.Class;
import java.lang.String;
import vsd.h;
import nsd.r;
import vsd.d;
import java.lang.Object;
import vsd.q$a;
import vsd.c;

public class PropertyReference2Impl extends PropertyReference2	// class@0018a0
{

    public void PropertyReference2Impl(Class p0,String p1,String p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void PropertyReference2Impl(h p0,String p1,String p2){
       super(p0.j(), p1, p2, (p0 instanceof d ^ 0x01));
    }
    public Object get(Object p0,Object p1){
       Object[] objArray = new Object[]{p0,p1};
       return this.getGetter().call(objArray);
    }
}
