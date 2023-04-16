package kotlin.Experimental$Level;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Experimental$Level extends Enum	// class@00180b
{
    public static final Experimental$Level[] $VALUES;
    public static final Experimental$Level ERROR;
    public static final Experimental$Level WARNING;

    static {
       Experimental$Level level;
       Experimental$Level[] levelArray = new Experimental$Level[]{level,level};
       level = new Experimental$Level("WARNING", 0);
       Experimental$Level.WARNING = level;
       level = new Experimental$Level("ERROR", 1);
       Experimental$Level.ERROR = level;
       Experimental$Level.$VALUES = levelArray;
    }
    public void Experimental$Level(String p0,int p1){
       super(p0, p1);
    }
    public static Experimental$Level valueOf(String p0){
       return Enum.valueOf(Experimental$Level.class, p0);
    }
    public static Experimental$Level[] values(){
       return Experimental$Level.$VALUES.clone();
    }
}
