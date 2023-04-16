package nmd.q$e;
import qmd.b;
import nmd.q;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class q$e implements b	// class@001e6e
{
    public final q a;

    public void q$e(q p0){
       this.a = p0;
       super();
    }
    public void a(NewRelayStickerDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$e.class, "1")) {
          return;
       }
       a.p(p0, "drawer");
       this.a.j0(p0);
       return;
    }
}
