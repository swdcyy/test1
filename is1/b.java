package is1.b;
import ekd.t;
import is1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import androidx.lifecycle.MutableLiveData;
import java.lang.Integer;

public final class b extends t	// class@00298b
{
    public final a g;
    public final long h;

    public void b(a p0,long p1,int p2,int p3){
       this.g = p0;
       this.h = p1;
       super(p2, p3);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b.Z(a.h, "countdownCounter time out");
       this.g.c.setValue(Long.valueOf(0));
       return;
    }
    public void e(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.g.c.setValue(Long.valueOf(((long)p0 * 1000)));
       return;
    }
}
