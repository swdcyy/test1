package df.i;
import java.lang.Object;
import android.util.SparseIntArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;

public class i	// class@001e56
{
    public final SparseIntArray a;

    public void i(){
       super();
       this.a = new SparseIntArray();
    }
    public void a(long p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oi, "4")) {
          return;
       }
       this.a.delete((int)p0);
       return;
    }
}
