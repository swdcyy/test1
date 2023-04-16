package h5.e;
import h5.m;
import java.lang.Object;
import n5.a;
import android.graphics.PointF;
import java.util.List;
import java.util.Collections;
import d5.a;
import d5.j;
import d5.i;

public class e implements m	// class@0020f3
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
