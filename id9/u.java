package id9.u;
import com.yxcorp.gifshow.camera.record.base.b$a;
import id9.z;
import java.lang.Object;
import oh9.a;
import com.yxcorp.gifshow.camera.record.base.d;
import od9.c;
import com.yxcorp.gifshow.camera.record.base.b;

public final class u implements b$a	// class@0027fb
{
    public final z a;

    public void u(z p0){
       this.a = p0;
    }
    public final Object getData(){
       u ta = this.a;
       z w = ta.w;
       boolean b = true;
       boolean b1 = (w != null)? true: false;
       if (w != null && ta.d.d(c.b).a == null) {
          b = false;
       }
       return new a(b1, b);
    }
}
