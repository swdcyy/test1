package akc.c$d;
import v2.q0;
import akc.c;
import androidx.room.RoomDatabase;
import java.lang.String;

public class c$d extends q0	// class@00014f
{
    public final c d;

    public void c$d(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM FolUserSearch WHERE source_user_id = ?";
    }
}
