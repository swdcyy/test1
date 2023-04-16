package d4b.c;
import java.util.concurrent.Callable;
import d4b.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.List;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Long;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import f4b.b;

public final class c implements Callable	// class@00242b
{
    public final b b;
    public final Ref$ObjectRef c;
    public final Ref$IntRef d;
    public final Ref$ObjectRef e;

    public void c(b p0,Ref$ObjectRef p1,Ref$IntRef p2,Ref$ObjectRef p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object call(){
       b c;
       Map map = PatchProxy.apply(null, this, c.class, "1");
       if (map != PatchProxyResult.class) {
       }else {
          c = this.b.c;
          this.c.element.addAll(c.mMagicFaces.subList(c.mLoadIndex, this.d.element));
          Iterator iterator = this.c.element.iterator();
          while (iterator.hasNext()) {
             MagicEmoji$MagicFace magicFace = iterator.next();
             SimpleMagicFace mId = magicFace.mId;
             a.o(mId, "face.mId");
             this.e.element.put(mId, Long.valueOf(magicFace.mChecksum));
          }
          Object[] objArray = new Object[0];
          b.D().w("MagicLocalRepository", "query db: "+this.b.c.mName+" size: "+this.e.element.size(), objArray);
          map = b.c(this.e.element);
       }
       return map;
    }
}
