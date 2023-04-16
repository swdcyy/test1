package cg8.c$f;
import v2.q0;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;

public class c$f extends q0	// class@00040b
{
    public final c d;

    public void c$f(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM MainPackageModel WHERE appId = ?";
    }
}
