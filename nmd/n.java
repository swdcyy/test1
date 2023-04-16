package nmd.n;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder$a;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.StickerFrameChangeViewBinder;
import androidx.fragment.app.Fragment;
import smd.d;
import rmd.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.CenterTagStickerAction;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import faa.a;
import w46.b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.f;
import lwc.h;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import rmd.c;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import tmd.a;
import java.lang.StringBuilder;
import q87.c;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class n implements Runnable	// class@001e67
{
    public final EditDecorationBaseDrawer b;
    public final StickerFrameChangeViewBinder$a c;
    public final int d;
    public final Size e;

    public void n(EditDecorationBaseDrawer p0,StickerFrameChangeViewBinder$a p1,int p2,Size p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       float f;
       Object obj = this;
       if (PatchProxy.applyVoidWithListener(null, obj, n.class, "1")) {
          return;
       }
       d uod = g.a(obj.c.b.i);
       n b = obj.b;
       a.o(b, "it");
       int layerIndex = b.getLayerIndex();
       StickerFrameChangeViewBinder$a b1 = obj.c.b;
       n b2 = obj.b;
       Objects.requireNonNull(b1);
       Object obj1 = PatchProxy.applyOneRefs(b2, b1, StickerFrameChangeViewBinder.class, "3");
       if (obj1 != PatchProxyResult.class) {
          f = obj1.floatValue();
       }else {
          int i = b1.D(b2.getAttachIdentifierList());
          int i1 = 0;
          if (i < 0) {
             Object[] objArray = new Object[i1];
             a.D().t("StickerFrameChangeViewBinder", "getInitTagStickerDraftScale: tag sticker attachIdentifierList not found", objArray);
          }
          Size size = (f.E(b1.j.getType()))? b1.d.w0().get(i): b1.d.C0(i);
          f = a.a(0x3f800000, f.E(b1.j.getType()), (float)c.d(b2.getElementData(), c.a.b(b2.getEditStickerType(), b2.getEditStickerSubType()), (float)b1.e.getEditorRect().width()).b, b2.getStickerOriginWidth(), size.b, (float)b1.e.getEditorRect().width(), b1.d.p0(i));
          Object[] objArray1 = new Object[i1];
          a.D().w("StickerFrameChangeViewBinder", "getInitTagStickerDraftScale: draftScale = "+f, objArray1);
       }
       uod.t0(new CenterTagStickerAction(layerIndex, f));
       PatchProxy.onMethodExit(n.class, "1");
       return;
    }
}
