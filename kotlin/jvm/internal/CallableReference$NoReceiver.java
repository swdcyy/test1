package kotlin.jvm.internal.CallableReference$NoReceiver;
import java.io.Serializable;
import java.lang.Object;

public class CallableReference$NoReceiver implements Serializable	// class@001c99
{
    public static final CallableReference$NoReceiver INSTANCE;

    static {
       CallableReference$NoReceiver.INSTANCE = new CallableReference$NoReceiver();
    }
    public void CallableReference$NoReceiver(){
       super();
    }
    public final Object readResolve(){
       return CallableReference$NoReceiver.INSTANCE;
    }
}
