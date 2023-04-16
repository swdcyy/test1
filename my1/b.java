package my1.b;
import my1.e;
import iy1.l;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class b extends e	// class@00324e
{
    public final TopDistrictRank d;

    public void b(l p0,TopDistrictRank p1){
       super(p0);
       this.d = p1;
    }
    public long a(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return Math.max(super.a(), 3000);
    }
}
