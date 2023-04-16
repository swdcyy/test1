package c5.b;
import java.lang.Object;
import java.util.ArrayList;
import c5.t;
import java.util.List;
import android.graphics.Path;
import m5.f;
import d5.a;
import d5.c;

public class b	// class@000ccc
{
    public List a;

    public void b(){
       super();
       this.a = new ArrayList();
    }
    public void a(t p0){
       this.a.add(p0);
    }
    public void b(Path p0){
       int i = this.a.size() - 1;
       while (i >= 0) {
          t ot = this.a.get(i);
          if (ot != null && ot.b == null) {
             float f = ot.h().m() / 100.00f;
             float f1 = ot.f().m() / 100.00f;
             float f2 = ot.g().m() / 360.00f;
             f.a(p0, f, f1, f2);
          }
          i = i - 1;
       }
       return;
    }
}
