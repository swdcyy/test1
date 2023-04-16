package e61.a;
import android.util.LruCache;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;

public class a extends LruCache	// class@0020a6
{

    public void a(int p0){
       super(p0);
    }
    public int sizeOf(Object p0,Object p1){
       int i;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          i = p0.intValue();
       }else {
          p0 = PatchProxy.applyOneRefs(p1, this, a.class, "2");
          if (p0 != PatchProxyResult.class) {
             i = p0.intValue();
          }else if(p1 == null){
             i = 0;
          }else {
             i = p1.getAllocationByteCount();
          }
       }
       return i;
    }
}
