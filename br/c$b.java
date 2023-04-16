package br.c$b;
import v2.p;
import br.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import com.kuaishou.android.vader.persistent.LogRecord;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a3.d;

public class c$b extends p	// class@000331
{
    public final c d;

    public void c$b(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM `LogRecord` WHERE `seqId` = ?";
    }
    public void g(f p0,Object p1){
       this.j(p0, p1);
    }
    public void j(f p0,LogRecord p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "1")) {
          return;
       }
       p0.bindLong(1, (long)p1.seqId());
       return;
    }
}
