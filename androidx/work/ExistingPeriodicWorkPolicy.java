package androidx.work.ExistingPeriodicWorkPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ExistingPeriodicWorkPolicy extends Enum	// class@000a49
{
    public static final ExistingPeriodicWorkPolicy[] $VALUES;
    public static final ExistingPeriodicWorkPolicy KEEP;
    public static final ExistingPeriodicWorkPolicy REPLACE;

    static {
       ExistingPeriodicWorkPolicy uExistingPer = new ExistingPeriodicWorkPolicy("REPLACE", 0);
       ExistingPeriodicWorkPolicy.REPLACE = uExistingPer;
       ExistingPeriodicWorkPolicy uExistingPer1 = new ExistingPeriodicWorkPolicy("KEEP", 1);
       ExistingPeriodicWorkPolicy.KEEP = uExistingPer1;
       ExistingPeriodicWorkPolicy[] uExistingPer2 = new ExistingPeriodicWorkPolicy[]{uExistingPer,uExistingPer1};
       ExistingPeriodicWorkPolicy.$VALUES = uExistingPer2;
    }
    public void ExistingPeriodicWorkPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static ExistingPeriodicWorkPolicy valueOf(String p0){
       return Enum.valueOf(ExistingPeriodicWorkPolicy.class, p0);
    }
    public static ExistingPeriodicWorkPolicy[] values(){
       return ExistingPeriodicWorkPolicy.$VALUES.clone();
    }
}
