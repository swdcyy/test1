package kotlin.DeprecationLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class DeprecationLevel extends Enum	// class@00180a
{
    public static final DeprecationLevel[] $VALUES;
    public static final DeprecationLevel ERROR;
    public static final DeprecationLevel HIDDEN;
    public static final DeprecationLevel WARNING;

    static {
       DeprecationLevel uDeprecation1;
       DeprecationLevel[] uDeprecation = new DeprecationLevel[]{uDeprecation1,uDeprecation1,uDeprecation1};
       uDeprecation1 = new DeprecationLevel("WARNING", 0);
       DeprecationLevel.WARNING = uDeprecation1;
       uDeprecation1 = new DeprecationLevel("ERROR", 1);
       DeprecationLevel.ERROR = uDeprecation1;
       uDeprecation1 = new DeprecationLevel("HIDDEN", 2);
       DeprecationLevel.HIDDEN = uDeprecation1;
       DeprecationLevel.$VALUES = uDeprecation;
    }
    public void DeprecationLevel(String p0,int p1){
       super(p0, p1);
    }
    public static DeprecationLevel valueOf(String p0){
       return Enum.valueOf(DeprecationLevel.class, p0);
    }
    public static DeprecationLevel[] values(){
       return DeprecationLevel.$VALUES.clone();
    }
}
