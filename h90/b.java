package h90.b;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import h90.e;
import java.lang.StringBuilder;

public class b	// class@00210f
{
    public final int a;
    public final long b;
    public final List c;

    public void b(int p0,long p1){
       super();
       this.c = new LinkedList();
       this.a = p0;
       this.b = p1;
    }
    public String a(){
       e uoe;
       Object[] obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.c.isEmpty())? null: this.c.get(0);
       if (obj != null) {
          return obj.b();
       }else {
          return null;
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KuaiShanKeyFrame mIndex="+this.a+" mTimestamp="+this.b+" mAreas="+this.c;
    }
}
