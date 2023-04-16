package ked.i;
import w4.j;
import ked.h;
import java.lang.Object;
import w4.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jed.h;

public class i implements j	// class@001772
{
    public final h a;

    public void i(h p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          h q = this.a.q;
          if (q != null) {
             q.w = p0;
          }
       }
       return;
    }
}
