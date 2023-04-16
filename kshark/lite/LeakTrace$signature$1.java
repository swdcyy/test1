package kshark.lite.LeakTrace$signature$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kshark.lite.LeakTraceReference;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import kshark.lite.LeakTraceObject;

public final class LeakTrace$signature$1 extends Lambda implements l	// class@001ba7
{
    public static final LeakTrace$signature$1 INSTANCE;

    static {
       LeakTrace$signature$1.INSTANCE = new LeakTrace$signature$1();
    }
    public void LeakTrace$signature$1(){
       super(1);
    }
    public final CharSequence invoke(LeakTraceReference p0){
       a.p(p0, "element");
       return p0.getOriginObject().getClassName()+p0.getReferenceGenericName();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
