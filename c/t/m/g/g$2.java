package c.t.m.g.g$2;
import c.t.m.g.ap;
import c.t.m.g.g;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import c.t.m.g.bt;
import java.lang.StringBuilder;

public class g$2 implements ap	// class@000c94
{
    public final File a;
    public final g b;

    public void g$2(g p0,File p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0){
       if (bt.a()) {
          bt.a("UserTrackPro", "upload succeed:"+p0);
       }
       this.a.delete();
       return;
    }
    public void b(String p0){
       if (bt.a()) {
          bt.b("UserTrackPro", "upload failed:"+p0);
       }
       return;
    }
}
