package br.c$a;
import v2.q;
import br.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import com.kuaishou.android.vader.persistent.LogRecord;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a3.d;
import com.kuaishou.android.vader.Channel;
import tq.b;

public class c$a extends q	// class@000330
{
    public final c d;

    public void c$a(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "INSERT OR ABORT INTO `LogRecord`\(`seqId`,`channelType`,`channelSeqId`,`customType`,`customSeqId`,`clientTimestamp`,`payload`,`compressAlgorithm`\) VALUES \(?,?,?,?,?,?,?,?\)";
    }
    public void g(f p0,Object p1){
       this.n(p0, p1);
    }
    public void n(f p0,LogRecord p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "1")) {
          return;
       }
       p0.bindLong(1, (long)p1.seqId());
       p0.bindLong(2, (long)b.b(p1.channelType()));
       p0.bindLong(3, (long)p1.channelSeqId());
       int i = 4;
       if (p1.customType() == null) {
          p0.bindNull(i);
       }else {
          p0.bindString(i, p1.customType());
       }
       p0.bindLong(5, (long)p1.customSeqId());
       p0.bindLong(6, p1.clientTimestamp());
       i = 7;
       if (p1.payload() == null) {
          p0.bindNull(i);
       }else {
          p0.bindBlob(i, p1.payload());
       }
       p0.bindLong(8, (long)p1.compressAlgorithm());
       return;
    }
}
