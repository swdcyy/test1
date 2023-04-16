package nmd.g0;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerTimelineFragment$a;
import nmd.f0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import yld.a;

public final class g0 implements StickerTimelineFragment$a	// class@001e58
{
    public final f0 a;

    public void g0(f0 p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og0, "1")) {
          return;
       }
       this.a.I().V0((p0 ^ 0x01));
       return;
    }
}
