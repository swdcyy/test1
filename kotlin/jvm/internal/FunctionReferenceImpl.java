package kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.FunctionReference;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.CallableReference;
import java.lang.Object;
import vsd.h;
import nsd.r;
import vsd.d;

public class FunctionReferenceImpl extends FunctionReference	// class@001c9c
{

    public void FunctionReferenceImpl(int p0,Class p1,String p2,String p3,int p4){
       super(p0, CallableReference.NO_RECEIVER, p1, p2, p3, p4);
    }
    public void FunctionReferenceImpl(int p0,Object p1,Class p2,String p3,String p4,int p5){
       super(p0, p1, p2, p3, p4, p5);
    }
    public void FunctionReferenceImpl(int p0,h p1,String p2,String p3){
       super(p0, CallableReference.NO_RECEIVER, p1.j(), p2, p3, (p1 instanceof d ^ 0x01));
    }
}
