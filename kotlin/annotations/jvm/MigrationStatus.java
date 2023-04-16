package kotlin.annotations.jvm.MigrationStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MigrationStatus extends Enum	// class@001823
{
    public static final MigrationStatus[] $VALUES;
    public static final MigrationStatus IGNORE;
    public static final MigrationStatus STRICT;
    public static final MigrationStatus WARN;

    static {
       MigrationStatus migrationSta = new MigrationStatus("IGNORE", 0);
       MigrationStatus.IGNORE = migrationSta;
       MigrationStatus migrationSta1 = new MigrationStatus("WARN", 1);
       MigrationStatus.WARN = migrationSta1;
       MigrationStatus migrationSta2 = new MigrationStatus("STRICT", 2);
       MigrationStatus.STRICT = migrationSta2;
       MigrationStatus[] migrationSta3 = new MigrationStatus[]{migrationSta,migrationSta1,migrationSta2};
       MigrationStatus.$VALUES = migrationSta3;
    }
    public void MigrationStatus(String p0,int p1){
       super(p0, p1);
    }
    public static MigrationStatus valueOf(String p0){
       return Enum.valueOf(MigrationStatus.class, p0);
    }
    public static MigrationStatus[] values(){
       return MigrationStatus.$VALUES.clone();
    }
}
