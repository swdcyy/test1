package nmd.v$m;
import umd.b;
import nmd.v;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import smd.d;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateStickerTextAction;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import xvc.b;

public final class v$m implements b	// class@001e85
{
    public final v a;

    public void v$m(v p0){
       this.a = p0;
       super();
    }
    public void a(String p0,List p1,String p2,int p3){
       if (PatchProxy.isSupport(v$m.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, v$m.class, "1")) {
          return;
       }
       a.p(p1, "voteOptionList");
       UpdateStickerTextAction updateSticke = new UpdateStickerTextAction(p0, p1, p2, p3, this.a.b0().o0().w());
       this.a.b0().t0(v7);
       return;
    }
}
