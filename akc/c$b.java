package akc.c$b;
import v2.p;
import akc.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import akc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a3.d;

public class c$b extends p	// class@00014d
{
    public final c d;

    public void c$b(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM `FolUserSearch` WHERE `id` = ?";
    }
    public void g(f p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "1")) {
       }else {
          p0.bindLong(1, p1.b());
       }
       return;
    }
}
