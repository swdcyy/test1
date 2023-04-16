package cg8.c$b;
import v2.q0;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;

public class c$b extends q0	// class@000407
{
    public final c d;

    public void c$b(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM FrameworkModel WHERE versionCode = ?";
    }
}
