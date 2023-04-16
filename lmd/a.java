package lmd.a;
import com.yxcorp.gifshow.v3.editor.sticker.RecordStickerInputPresenter;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lmd.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;

public final class a extends RecordStickerInputPresenter	// class@001c54
{
    public final a$a E;

    public void a(EditDecorationContainerViewV2 p0,Fragment p1){
       a.p(p0, "containerView");
       a.p(p1, "fragment");
       super(p0, p1);
       this.E = new a$a();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.E8();
       this.P8().d(this.E);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       super.J8();
       this.P8().M(this.E);
       return;
    }
    public boolean W8(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!p0 instanceof NewEditStickerBaseDrawer || p0.getEditStickerSubType() != b) {
          b = false;
       }
       return b;
    }
    public void a9(EditDecorationBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "decorationDrawer");
       if (p0 instanceof NewRelayStickerDrawer) {
          NewRelayStickerDrawer newRelayStic = p0;
          if (!newRelayStic.broughtFromFeed() && !newRelayStic.isInitFromDraft()) {
             super.a9(p0);
          }
       }
       return;
    }
}
