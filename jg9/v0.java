package jg9.v0;
import androidx.recyclerview.widget.o;
import android.content.Context;
import jg9.t0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class v0 extends o	// class@002aba
{
    public final t0 q;

    public void v0(Context p0,t0 p1){
       this.q = p1;
       super(p0);
    }
    public int s(int p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport2(v0.class, "1")) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, v0.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       PatchProxy.onMethodExit(v0.class, "1");
       return super.s(p0, p1, p2, p3, -1);
    }
}
