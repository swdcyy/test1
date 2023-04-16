package kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class CoroutineSingletons extends Enum	// class@001c7d
{
    public static final CoroutineSingletons[] $VALUES;
    public static final CoroutineSingletons COROUTINE_SUSPENDED;
    public static final CoroutineSingletons RESUMED;
    public static final CoroutineSingletons UNDECIDED;

    static {
       CoroutineSingletons uCoroutineSi1;
       CoroutineSingletons[] uCoroutineSi = new CoroutineSingletons[]{uCoroutineSi1,uCoroutineSi1,uCoroutineSi1};
       uCoroutineSi1 = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
       CoroutineSingletons.COROUTINE_SUSPENDED = uCoroutineSi1;
       uCoroutineSi1 = new CoroutineSingletons("UNDECIDED", 1);
       CoroutineSingletons.UNDECIDED = uCoroutineSi1;
       uCoroutineSi1 = new CoroutineSingletons("RESUMED", 2);
       CoroutineSingletons.RESUMED = uCoroutineSi1;
       CoroutineSingletons.$VALUES = uCoroutineSi;
    }
    public void CoroutineSingletons(String p0,int p1){
       super(p0, p1);
    }
    public static CoroutineSingletons valueOf(String p0){
       return Enum.valueOf(CoroutineSingletons.class, p0);
    }
    public static CoroutineSingletons[] values(){
       return CoroutineSingletons.$VALUES.clone();
    }
}
