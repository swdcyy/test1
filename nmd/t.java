package nmd.t;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;

public final class t implements r	// class@001e76
{
    public static final t b;

    static {
       t.b = new t();
    }
    public void t(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = p0 instanceof NewRelayStickerDrawer;
       }
       return b;
    }
}
