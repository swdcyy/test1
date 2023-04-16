package ke9.b;
import com.yxcorp.gifshow.camera.record.base.b$b;
import ke9.b$a;
import nsd.u;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;

public final class b implements b$b	// class@002c77
{
    public MagicEmoji$MagicFace b;
    public int c;
    public static final b d;
    public static final b$a e;

    static {
       b.e = new b$a(null);
       b.d = new b(null, Integer.MAX_VALUE);
    }
    public void b(MagicEmoji$MagicFace p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final int a(){
       return this.c;
    }
    public final MagicEmoji$MagicFace b(){
       return this.b;
    }
    public Object d(List p0){
       b uob = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "data");
          uob = b.d;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             b uob1 = iterator.next();
             if (uob1.b != null && uob.c > uob1.c) {
                uob = uob1;
             }
          }
       }
       return uob;
    }
}
