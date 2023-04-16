package b62.m;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.Object;
import java.lang.Throwable;
import mkc.b;
import android.view.View;
import mkc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class m implements g	// class@00034a
{
    public final i b;

    public void m(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b d;
       m tb = this.b;
       b[] uobArray = new b[]{d};
       d = b.d;
       c.d(tb.z, uobArray);
       if (PatchProxy.applyVoid(null, tb, i.class, "14")) {
       }else {
          tb.a9(0);
          tb.A.setVisibility(0);
          tb.y.setVisibility(8);
          b[] uobArray1 = new b[]{d};
          c.d(tb.z, uobArray1);
       }
       return;
    }
}
