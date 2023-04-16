package kotlin.contracts.InvocationKind;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class InvocationKind extends Enum	// class@00185d
{
    public static final InvocationKind[] $VALUES;
    public static final InvocationKind AT_LEAST_ONCE;
    public static final InvocationKind AT_MOST_ONCE;
    public static final InvocationKind EXACTLY_ONCE;
    public static final InvocationKind UNKNOWN;

    static {
       InvocationKind invocationKi1;
       InvocationKind[] invocationKi = new InvocationKind[]{invocationKi1,invocationKi1,invocationKi1,invocationKi1};
       invocationKi1 = new InvocationKind("AT_MOST_ONCE", 0);
       InvocationKind.AT_MOST_ONCE = invocationKi1;
       invocationKi1 = new InvocationKind("AT_LEAST_ONCE", 1);
       InvocationKind.AT_LEAST_ONCE = invocationKi1;
       invocationKi1 = new InvocationKind("EXACTLY_ONCE", 2);
       InvocationKind.EXACTLY_ONCE = invocationKi1;
       invocationKi1 = new InvocationKind("UNKNOWN", 3);
       InvocationKind.UNKNOWN = invocationKi1;
       InvocationKind.$VALUES = invocationKi;
    }
    public void InvocationKind(String p0,int p1){
       super(p0, p1);
    }
    public static InvocationKind valueOf(String p0){
       return Enum.valueOf(InvocationKind.class, p0);
    }
    public static InvocationKind[] values(){
       return InvocationKind.$VALUES.clone();
    }
}
