package androidx.room.RoomDatabase$JournalMode;
import java.lang.Enum;
import java.lang.String;
import android.app.ActivityManager;
import java.lang.Class;
import java.lang.Object;
import android.content.Context;

public final class RoomDatabase$JournalMode extends Enum	// class@000261
{
    public static final RoomDatabase$JournalMode[] $VALUES;
    public static final RoomDatabase$JournalMode AUTOMATIC;
    public static final RoomDatabase$JournalMode TRUNCATE;
    public static final RoomDatabase$JournalMode WRITE_AHEAD_LOGGING;

    static {
       RoomDatabase$JournalMode journalMode = new RoomDatabase$JournalMode("AUTOMATIC", 0);
       RoomDatabase$JournalMode.AUTOMATIC = journalMode;
       RoomDatabase$JournalMode journalMode1 = new RoomDatabase$JournalMode("TRUNCATE", 1);
       RoomDatabase$JournalMode.TRUNCATE = journalMode1;
       RoomDatabase$JournalMode journalMode2 = new RoomDatabase$JournalMode("WRITE_AHEAD_LOGGING", 2);
       RoomDatabase$JournalMode.WRITE_AHEAD_LOGGING = journalMode2;
       RoomDatabase$JournalMode[] journalModeA = new RoomDatabase$JournalMode[]{journalMode,journalMode1,journalMode2};
       RoomDatabase$JournalMode.$VALUES = journalModeA;
    }
    public void RoomDatabase$JournalMode(String p0,int p1){
       super(p0, p1);
    }
    public static boolean isLowRamDevice(ActivityManager p0){
       return p0.isLowRamDevice();
    }
    public static RoomDatabase$JournalMode valueOf(String p0){
       return Enum.valueOf(RoomDatabase$JournalMode.class, p0);
    }
    public static RoomDatabase$JournalMode[] values(){
       return RoomDatabase$JournalMode.$VALUES.clone();
    }
    public RoomDatabase$JournalMode resolve(Context p0){
       if (this != RoomDatabase$JournalMode.AUTOMATIC) {
          return this;
       }
       ActivityManager systemServic = p0.getSystemService("activity");
       if (systemServic != null && !RoomDatabase$JournalMode.isLowRamDevice(systemServic)) {
          return RoomDatabase$JournalMode.WRITE_AHEAD_LOGGING;
       }
       return RoomDatabase$JournalMode.TRUNCATE;
    }
}
