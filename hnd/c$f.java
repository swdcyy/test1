package hnd.c$f;
import erd.g;
import hnd.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleRecFailedAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.state.SubtitleStatus;
import tvc.a;
import vmd.c;

public final class c$f implements g	// class@000f96
{
    public final c b;

    public void c$f(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$f.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, c.class, "2")) {
             KSStore kSStore = p0.a();
             if (kSStore != null) {
                kSStore.a(new SubtitleRecFailedAction(SubtitleStatus.ERROR));
             }
             c.a.g(8, p0.f);
          }
       }
       return;
    }
}
