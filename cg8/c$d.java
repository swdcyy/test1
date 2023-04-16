package cg8.c$d;
import v2.q0;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;

public class c$d extends q0	// class@000409
{
    public final c d;

    public void c$d(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM BackupMiniAppPackageInfo";
    }
}
