package kotlin.RequiresOptIn$Level;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RequiresOptIn$Level extends Enum	// class@001814
{
    public static final RequiresOptIn$Level[] $VALUES;
    public static final RequiresOptIn$Level ERROR;
    public static final RequiresOptIn$Level WARNING;

    static {
       RequiresOptIn$Level level;
       RequiresOptIn$Level[] levelArray = new RequiresOptIn$Level[]{level,level};
       level = new RequiresOptIn$Level("WARNING", 0);
       RequiresOptIn$Level.WARNING = level;
       level = new RequiresOptIn$Level("ERROR", 1);
       RequiresOptIn$Level.ERROR = level;
       RequiresOptIn$Level.$VALUES = levelArray;
    }
    public void RequiresOptIn$Level(String p0,int p1){
       super(p0, p1);
    }
    public static RequiresOptIn$Level valueOf(String p0){
       return Enum.valueOf(RequiresOptIn$Level.class, p0);
    }
    public static RequiresOptIn$Level[] values(){
       return RequiresOptIn$Level.$VALUES.clone();
    }
}
