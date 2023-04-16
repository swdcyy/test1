package c.t.m.g.h$1;
import c.t.m.g.ap;
import c.t.m.g.h;
import java.io.File;
import java.lang.Object;
import java.lang.String;
import c.t.m.g.bt;
import java.lang.StringBuilder;

public class h$1 implements ap	// class@000c96
{
    public final File a;
    public final h b;

    public void h$1(h p0,File p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0){
       this.a.delete();
       if (bt.a()) {
          bt.a("WifiInfoPro", "upload suc & del:"+p0);
       }
       return;
    }
    public void b(String p0){
       if (bt.a()) {
          bt.a("WifiInfoPro", "upload failed:"+p0);
       }
       return;
    }
}
