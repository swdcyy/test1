package ff.h;
import ff.a;
import android.view.View;
import android.view.animation.Animation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ff.j;

public class h extends a	// class@001ff9
{

    public void h(){
       super();
    }
    public Animation b(View p0,int p1,int p2,int p3,int p4){
       j obj;
       h oh = h.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = (p0.getX() - (float)p1 || p0.getY() - (float)p2)? 1: 0;
       if (p0.getWidth() == p3 && p0.getHeight() == p4) {
          i = 0;
       }
       if (!obj && !i) {
          return null;
       }else {
          obj = new j(p0, p1, p2, p3, p4);
          return v6;
       }
    }
    public boolean d(){
       boolean b = (this.d > null)? true: false;
       return b;
    }
}
