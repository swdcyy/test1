package bh9.k;
import com.yxcorp.gifshow.camera.record.base.b$a;
import bh9.r;
import java.lang.Object;
import oc9.d0;
import bh9.s;
import android.widget.TextView;
import java.util.BitSet;

public final class k implements b$a	// class@0004a0
{
    public final r a;

    public void k(r p0){
       this.a = p0;
    }
    public final Object getData(){
       s os;
       k ta = this.a;
       if (ta.f2()) {
          r r = ta.r;
          r o = ta.o;
          boolean b = (o != null && (o.isSelected() && ta.t.isEmpty()))? true: false;
          os = new s(r, b);
       }else {
          os = null;
       }
       return os;
    }
}
