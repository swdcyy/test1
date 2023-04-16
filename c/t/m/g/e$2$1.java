package c.t.m.g.e$2$1;
import c.t.m.g.ap;
import c.t.m.g.e$2;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import c.t.m.g.bt;
import java.lang.StringBuilder;

public class e$2$1 implements ap	// class@000c5f
{
    public final e$2 a;

    public void e$2$1(e$2 p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       this.a.a.delete();
       if (bt.a()) {
          bt.a("DC_Pro", "upload "+this.a.a.getName()+" succeed, then delete.");
       }
       return;
    }
    public void b(String p0){
       bt.b("DC_Pro", "upload error,"+p0);
    }
}
