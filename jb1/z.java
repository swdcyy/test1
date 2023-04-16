package jb1.z;
import y8c.g;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import jb1.z$a;
import ml8.c;

public class z extends g	// class@002b2b
{

    public void z(){
       super();
    }
    public f h1(ViewGroup p0,int p1){
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oz, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0925), new z$a(this));
    }
}
