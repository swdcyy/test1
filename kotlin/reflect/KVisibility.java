package kotlin.reflect.KVisibility;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KVisibility extends Enum	// class@0018b5
{
    public static final KVisibility[] $VALUES;
    public static final KVisibility INTERNAL;
    public static final KVisibility PRIVATE;
    public static final KVisibility PROTECTED;
    public static final KVisibility PUBLIC;

    static {
       KVisibility kVisibility;
       KVisibility[] kVisibilityA = new KVisibility[]{kVisibility,kVisibility,kVisibility,kVisibility};
       kVisibility = new KVisibility("PUBLIC", 0);
       KVisibility.PUBLIC = kVisibility;
       kVisibility = new KVisibility("PROTECTED", 1);
       KVisibility.PROTECTED = kVisibility;
       kVisibility = new KVisibility("INTERNAL", 2);
       KVisibility.INTERNAL = kVisibility;
       kVisibility = new KVisibility("PRIVATE", 3);
       KVisibility.PRIVATE = kVisibility;
       KVisibility.$VALUES = kVisibilityA;
    }
    public void KVisibility(String p0,int p1){
       super(p0, p1);
    }
    public static KVisibility valueOf(String p0){
       return Enum.valueOf(KVisibility.class, p0);
    }
    public static KVisibility[] values(){
       return KVisibility.$VALUES.clone();
    }
}
