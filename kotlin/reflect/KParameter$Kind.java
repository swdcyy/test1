package kotlin.reflect.KParameter$Kind;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KParameter$Kind extends Enum	// class@0018b1
{
    public static final KParameter$Kind[] $VALUES;
    public static final KParameter$Kind EXTENSION_RECEIVER;
    public static final KParameter$Kind INSTANCE;
    public static final KParameter$Kind VALUE;

    static {
       KParameter$Kind kind;
       KParameter$Kind[] kindArray = new KParameter$Kind[]{kind,kind,kind};
       kind = new KParameter$Kind("INSTANCE", 0);
       KParameter$Kind.INSTANCE = kind;
       kind = new KParameter$Kind("EXTENSION_RECEIVER", 1);
       KParameter$Kind.EXTENSION_RECEIVER = kind;
       kind = new KParameter$Kind("VALUE", 2);
       KParameter$Kind.VALUE = kind;
       KParameter$Kind.$VALUES = kindArray;
    }
    public void KParameter$Kind(String p0,int p1){
       super(p0, p1);
    }
    public static KParameter$Kind valueOf(String p0){
       return Enum.valueOf(KParameter$Kind.class, p0);
    }
    public static KParameter$Kind[] values(){
       return KParameter$Kind.$VALUES.clone();
    }
}
