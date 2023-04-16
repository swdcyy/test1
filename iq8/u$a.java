package iq8.u$a;
import android.util.LruCache;
import iq8.u;
import java.lang.Object;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class u$a extends LruCache	// class@002721
{
    public final u a;

    public void u$a(u p0,int p1){
       this.a = p0;
       super(p1);
    }
    public int sizeOf(Object p0,Object p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, u$a.class, "1");
       int i = (p0 != PatchProxyResult.class)? p0.intValue(): p1.getByteCount();
       return i;
    }
}
