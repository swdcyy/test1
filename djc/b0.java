package djc.b0;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import zsd.u;
import android.graphics.Color;
import java.lang.Exception;
import djc.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import djc.l;
import s0d.f;
import s0d.e;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class b0	// class@0021d2
{

    public static final Integer a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p0 != null && !u.S1(p0)) {
          label_0019 :
             return Integer.valueOf(Color.parseColor(p0));
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return null;
    }
    public static final void b(y p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b0.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       List list = p0.b();
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             uArrayList.addAll(iterator.next());
          }
       }
       list = p0.d();
       if (list != null) {
          uArrayList.addAll(list);
       }
       Iterator iterator1 = uArrayList.iterator();
       while (iterator1.hasNext()) {
          e uoe = f.x().q(iterator1.next().a()).v();
          if (uoe != null) {
             Fresco.getImagePipeline().prefetchToBitmapCache(uoe, null);
          }
       }
       String[] stringArray = new String[]{p0.e(),p0.a()};
       Iterator iterator2 = CollectionsKt__CollectionsKt.r(stringArray).iterator();
       while (iterator2.hasNext()) {
          e uoe1 = f.x().t(iterator2.next()).v();
          if (uoe1 != null) {
             Fresco.getImagePipeline().prefetchToBitmapCache(uoe1, null);
          }
       }
       return;
    }
}
