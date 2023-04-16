package cg8.c$p;
import v2.q0;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;

public class c$p extends q0	// class@000415
{
    public final c d;

    public void c$p(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM SubPackageModel WHERE appId = ? AND releaseCode = ? AND buildEnv = ?";
    }
}
