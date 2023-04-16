package kotlin.LazyThreadSafetyMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LazyThreadSafetyMode extends Enum	// class@001810
{
    public static final LazyThreadSafetyMode[] $VALUES;
    public static final LazyThreadSafetyMode NONE;
    public static final LazyThreadSafetyMode PUBLICATION;
    public static final LazyThreadSafetyMode SYNCHRONIZED;

    static {
       LazyThreadSafetyMode lazyThreadSa1;
       LazyThreadSafetyMode[] lazyThreadSa = new LazyThreadSafetyMode[]{lazyThreadSa1,lazyThreadSa1,lazyThreadSa1};
       lazyThreadSa1 = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
       LazyThreadSafetyMode.SYNCHRONIZED = lazyThreadSa1;
       lazyThreadSa1 = new LazyThreadSafetyMode("PUBLICATION", 1);
       LazyThreadSafetyMode.PUBLICATION = lazyThreadSa1;
       lazyThreadSa1 = new LazyThreadSafetyMode("NONE", 2);
       LazyThreadSafetyMode.NONE = lazyThreadSa1;
       LazyThreadSafetyMode.$VALUES = lazyThreadSa;
    }
    public void LazyThreadSafetyMode(String p0,int p1){
       super(p0, p1);
    }
    public static LazyThreadSafetyMode valueOf(String p0){
       return Enum.valueOf(LazyThreadSafetyMode.class, p0);
    }
    public static LazyThreadSafetyMode[] values(){
       return LazyThreadSafetyMode.$VALUES.clone();
    }
}
