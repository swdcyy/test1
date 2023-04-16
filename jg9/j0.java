package jg9.j0;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$c;
import jg9.i0;
import java.util.Comparator;
import trd.x;

public final class j0 implements o	// class@002a9e
{
    public static final j0 b;

    static {
       j0.b = new j0();
    }
    public void j0(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j0.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "items");
          int i = 0;
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             obj1.c = i;
             i = i1;
          }
          if (p0.size() > 1) {
             x.p0(p0, new i0());
          }
       }
       return p0;
    }
}
