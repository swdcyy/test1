package kotlin.reflect.KVariance;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KVariance extends Enum	// class@0018b4
{
    public static final KVariance[] $VALUES;
    public static final KVariance IN;
    public static final KVariance INVARIANT;
    public static final KVariance OUT;

    static {
       KVariance kVariance;
       KVariance[] kVarianceArr = new KVariance[]{kVariance,kVariance,kVariance};
       kVariance = new KVariance("INVARIANT", 0);
       KVariance.INVARIANT = kVariance;
       kVariance = new KVariance("IN", 1);
       KVariance.IN = kVariance;
       kVariance = new KVariance("OUT", 2);
       KVariance.OUT = kVariance;
       KVariance.$VALUES = kVarianceArr;
    }
    public void KVariance(String p0,int p1){
       super(p0, p1);
    }
    public static KVariance valueOf(String p0){
       return Enum.valueOf(KVariance.class, p0);
    }
    public static KVariance[] values(){
       return KVariance.$VALUES.clone();
    }
}
