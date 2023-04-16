package androidx.work.BackoffPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class BackoffPolicy extends Enum	// class@000a45
{
    public static final BackoffPolicy[] $VALUES;
    public static final BackoffPolicy EXPONENTIAL;
    public static final BackoffPolicy LINEAR;

    static {
       BackoffPolicy uBackoffPoli = new BackoffPolicy("EXPONENTIAL", 0);
       BackoffPolicy.EXPONENTIAL = uBackoffPoli;
       BackoffPolicy uBackoffPoli1 = new BackoffPolicy("LINEAR", 1);
       BackoffPolicy.LINEAR = uBackoffPoli1;
       BackoffPolicy[] uBackoffPoli2 = new BackoffPolicy[]{uBackoffPoli,uBackoffPoli1};
       BackoffPolicy.$VALUES = uBackoffPoli2;
    }
    public void BackoffPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static BackoffPolicy valueOf(String p0){
       return Enum.valueOf(BackoffPolicy.class, p0);
    }
    public static BackoffPolicy[] values(){
       return BackoffPolicy.$VALUES.clone();
    }
}
