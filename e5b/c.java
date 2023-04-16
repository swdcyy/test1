package e5b.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import a5b.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import t5b.a;
import ixc.c;

public final class c	// class@00261d
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final List a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             if (uob != null) {
                obj.add(uob.a());
             }
          }
       }
       return obj;
    }
    public final boolean b(CameraPageType p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "pageType");
       if (p0 != CameraPageType.VIDEO && (p0 == CameraPageType.PHOTO || p0 == CameraPageType.LIVE_COVER)) {
          b uob = d.a(0x3bf0d115);
          a.o(uob, "PluginManager.get\(MagicEmojiPlugin::class.java\)");
          if (uob.XQ()) {
             b = true;
          label_003b :
             return b;
          }
       }
       b = false;
       goto label_003b ;
    }
}
