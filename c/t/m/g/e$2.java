package c.t.m.g.e$2;
import java.lang.Runnable;
import c.t.m.g.e;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import c.t.m.g.bm;
import c.t.m.g.by;
import c.t.m.g.bt;
import java.lang.StringBuilder;
import c.t.m.g.j;
import c.t.m.g.e$2$1;
import c.t.m.g.ap;
import android.os.Bundle;
import c.t.m.g.aq;
import java.lang.Throwable;

public class e$2 implements Runnable	// class@000c60
{
    public final File a;
    public final String b;
    public final e c;

    public void e$2(e p0,File p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       byte[] uobyteArray = bm.a(this.a);
       if (by.a(uobyteArray)) {
          this.a.delete();
          if (bt.a()) {
             bt.a("DC_Pro", "file "+this.a.getName()+" is empty, then delete.");
          }
          return;
       }else {
          j.k.a(this.b, uobyteArray, new e$2$1(this));
          return;
       }
    }
}
