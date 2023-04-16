package nmd.v$h;
import umd.c;
import nmd.v;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import cq.a;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawerData;
import java.util.List;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.StringBuilder;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.NewRelayStickerDrawer;
import fmd.a;
import qmd.i;
import lwc.h;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawer;
import umd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileRenderViewData;
import rmd.c;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.Long;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileRenderViewDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileImageViewDrawer;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import smd.d;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public final class v$h implements c	// class@001e80
{
    public final v a;

    public void v$h(v p0){
       this.a = p0;
       super();
    }
    public NewEditStickerBaseDrawer a(NewStickerElementData p0){
       Object[] objArray1;
       NewRelayStickerDrawer newRelayStic;
       Size size;
       Object[] objArray3;
       NewVoteStickerDrawer newVoteStick1;
       NewRelayStickerDrawerData obj = PatchProxy.applyOneRefs(p0, this, v$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("StickerPreviewBaseViewBinder", "elementCreatorFactory createInstance: ", objArray);
       List list = null;
       if (p0 instanceof NewRelayStickerDrawerData) {
          obj = p0;
          obj.c1(this.a.g0());
          if (!this.a.g0()) {
             objArray1 = new Object[i];
             a.D().w("StickerPreviewBaseViewBinder", "NewRelayStickerDrawerData: videoSize = "+this.a.N(list), objArray1);
             newRelayStic = new NewRelayStickerDrawer(obj, this.a.Y(), new i());
          }else {
             objArray1 = new Object[i];
             a.D().w("StickerPreviewBaseViewBinder", "NewRelayStickerDrawerData: pictureSize = "+this.a.X().w0().get(i), objArray1);
             newRelayStic = new NewRelayStickerDrawer(obj, this.a.Y(), new i());
          }
       }else if(p0 instanceof NewVoteStickerDrawerData){
          NewVoteStickerDrawerData newVoteStick = p0;
          newVoteStick.a1(this.a.g0());
          if (!this.a.g0()) {
             size = this.a.N(list);
             objArray3 = new Object[i];
             a.D().w("StickerPreviewBaseViewBinder", "NewVoteStickerDrawerData: videoSize = "+size, objArray3);
             newVoteStick1 = new NewVoteStickerDrawer(newVoteStick, this.a.B, ((float)size.b / (float)size.c));
          }else {
             size = this.a.X().w0().get(i);
             objArray3 = new Object[i];
             a.D().w("StickerPreviewBaseViewBinder", "NewVoteStickerDrawerData: pictureSize = "+size, objArray3);
             newVoteStick1 = new NewVoteStickerDrawer(newVoteStick, this.a.B, ((float)size.b / (float)size.c));
          }
          newRelayStic = newVoteStick1;
       }else if(p0 instanceof NewTagStickerElementData){
          int i1 = this.a.M(p0.A0());
          if (this.a.g0() && i1 >= 0) {
             NewTagStickerElementData newTagSticke = p0;
             newTagSticke.U0(this.a.X().u0(i1));
             Object[] objArray4 = new Object[i];
             a.D().w("StickerPreviewBaseViewBinder", "NewTagStickerElementData: segmentFinalSize = "+newTagSticke.T0(), objArray4);
          }
          NewTagStickerElementData newTagSticke1 = p0;
          newTagSticke1.T = this.a.g0();
          newRelayStic = new NewTagStickerElement(newTagSticke1, this.a.B);
       }else if(p0 instanceof NewOriginFileRenderViewData){
          Fragment uFragment = this.a.W();
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment");
          VideoSDKPlayerView videoSDKPlay = uFragment.Rh();
          a.o(videoSDKPlay, "\(previewFragment as Vide¡­agment\).previewPlayerView");
          p0.T0(c.a.c(videoSDKPlay, p0.l0()));
          NewOriginFileRenderViewData newOriginFil = p0;
          objArray1 = new Object[i];
          a.D().w("StickerPreviewBaseViewBinder", "NewOriginFileRenderViewData: assetId = "+newOriginFil.S0(), objArray1);
          newRelayStic = new NewOriginFileRenderViewDrawer(newOriginFil);
       }else {
          newRelayStic = new NewOriginFileImageViewDrawer(p0);
       }
       if (this.a.g0()) {
          newRelayStic.setNeedGenerateBitmap(true);
       }
       if (p0.n0() && (this.a.H.H() == null && this.a.H.getType() != Workspace$Type.SINGLE_PICTURE)) {
          Object[] objArray2 = new Object[i];
          a.D().w("StickerPreviewBaseViewBinder", "disable picTempalte sticker: "+p0, objArray2);
          newRelayStic.disableAction(0x1000000);
       }
    label_0227 :
       newRelayStic.setInitFromDraft(this.a.b0().o0().z);
       return newRelayStic;
    }
}
