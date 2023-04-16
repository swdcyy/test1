package q5.e;
import q5.m;
import java.lang.Object;
import w5.a;
import android.graphics.PointF;
import java.util.List;
import java.util.Collections;
import z4.a;
import z4.j;
import z4.i;

public class e implements m	// class@002965
{
    public final List a;

    public void e(){
       super();
       this.a = Collections.singletonList(new a(new PointF(0, 0)));
    }
    public void e(List p0){
       super();
       this.a = p0;
    }
    public a a(){
       if (this.a.get(0).d()) {
          return new j(this.a);
       }
       return new i(this.a);
    }
    public List b(){
       return this.a;
    }
    public boolean c(){
       int i = 0;
       if (this.a.size() == 1 && this.a.get(i).d()) {
          i = true;
       }
       return i;
    }
}
