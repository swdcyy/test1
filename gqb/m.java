package gqb.m;
import erd.a;
import gqb.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.Boolean;
import brd.y;

public final class m implements a	// class@002b7f
{
    public final k b;

    public void m(k p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       k.P8(this.b).setVisibility(8);
       k s = this.b.s;
       if (s != null) {
          s.onNext(Boolean.TRUE);
       }
       return;
    }
}
