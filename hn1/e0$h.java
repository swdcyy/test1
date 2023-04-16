package hn1.e0$h;
import im8.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.Number;

public final class e0$h implements f	// class@002726
{
    public long b;

    public void e0$h(){
       super();
    }
    public Object get(){
       Long longx = PatchProxy.apply(null, this, e0$h.class, "1");
       if (longx != PatchProxyResult.class) {
       }else {
          longx = Long.valueOf(this.b);
       }
       return longx;
    }
    public void set(Object p0){
       this.b = p0.longValue();
    }
}
