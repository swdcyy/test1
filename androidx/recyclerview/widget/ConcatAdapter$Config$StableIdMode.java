package androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ConcatAdapter$Config$StableIdMode extends Enum	// class@000869
{
    public static final ConcatAdapter$Config$StableIdMode[] $VALUES;
    public static final ConcatAdapter$Config$StableIdMode ISOLATED_STABLE_IDS;
    public static final ConcatAdapter$Config$StableIdMode NO_STABLE_IDS;
    public static final ConcatAdapter$Config$StableIdMode SHARED_STABLE_IDS;

    static {
       ConcatAdapter$Config$StableIdMode uConfig$Stab = new ConcatAdapter$Config$StableIdMode("NO_STABLE_IDS", 0);
       ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS = uConfig$Stab;
       ConcatAdapter$Config$StableIdMode uConfig$Stab1 = new ConcatAdapter$Config$StableIdMode("ISOLATED_STABLE_IDS", 1);
       ConcatAdapter$Config$StableIdMode.ISOLATED_STABLE_IDS = uConfig$Stab1;
       ConcatAdapter$Config$StableIdMode uConfig$Stab2 = new ConcatAdapter$Config$StableIdMode("SHARED_STABLE_IDS", 2);
       ConcatAdapter$Config$StableIdMode.SHARED_STABLE_IDS = uConfig$Stab2;
       ConcatAdapter$Config$StableIdMode[] uConfig$Stab3 = new ConcatAdapter$Config$StableIdMode[]{uConfig$Stab,uConfig$Stab1,uConfig$Stab2};
       ConcatAdapter$Config$StableIdMode.$VALUES = uConfig$Stab3;
    }
    public void ConcatAdapter$Config$StableIdMode(String p0,int p1){
       super(p0, p1);
    }
    public static ConcatAdapter$Config$StableIdMode valueOf(String p0){
       return Enum.valueOf(ConcatAdapter$Config$StableIdMode.class, p0);
    }
    public static ConcatAdapter$Config$StableIdMode[] values(){
       return ConcatAdapter$Config$StableIdMode.$VALUES.clone();
    }
}
