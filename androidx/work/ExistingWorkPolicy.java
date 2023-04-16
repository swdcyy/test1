package androidx.work.ExistingWorkPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ExistingWorkPolicy extends Enum	// class@000a4a
{
    public static final ExistingWorkPolicy[] $VALUES;
    public static final ExistingWorkPolicy APPEND;
    public static final ExistingWorkPolicy APPEND_OR_REPLACE;
    public static final ExistingWorkPolicy KEEP;
    public static final ExistingWorkPolicy REPLACE;

    static {
       ExistingWorkPolicy uExistingWor = new ExistingWorkPolicy("REPLACE", 0);
       ExistingWorkPolicy.REPLACE = uExistingWor;
       ExistingWorkPolicy uExistingWor1 = new ExistingWorkPolicy("KEEP", 1);
       ExistingWorkPolicy.KEEP = uExistingWor1;
       ExistingWorkPolicy uExistingWor2 = new ExistingWorkPolicy("APPEND", 2);
       ExistingWorkPolicy.APPEND = uExistingWor2;
       ExistingWorkPolicy uExistingWor3 = new ExistingWorkPolicy("APPEND_OR_REPLACE", 3);
       ExistingWorkPolicy.APPEND_OR_REPLACE = uExistingWor3;
       ExistingWorkPolicy[] uExistingWor4 = new ExistingWorkPolicy[]{uExistingWor,uExistingWor1,uExistingWor2,uExistingWor3};
       ExistingWorkPolicy.$VALUES = uExistingWor4;
    }
    public void ExistingWorkPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static ExistingWorkPolicy valueOf(String p0){
       return Enum.valueOf(ExistingWorkPolicy.class, p0);
    }
    public static ExistingWorkPolicy[] values(){
       return ExistingWorkPolicy.$VALUES.clone();
    }
}
