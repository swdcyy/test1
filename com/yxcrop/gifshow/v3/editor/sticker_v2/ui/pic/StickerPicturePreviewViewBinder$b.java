package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$b;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import nmd.v;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import ooc.c1;

public final class StickerPicturePreviewViewBinder$b implements EditorManager$b	// class@000ac0
{
    public final StickerPicturePreviewViewBinder a;

    public void StickerPicturePreviewViewBinder$b(StickerPicturePreviewViewBinder p0){
       this.a = p0;
       super();
    }
    public void d(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerPicturePreviewViewBinder$b.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PicturePreviewViewBinder", "onEditorShow: func = "+p0, objArray);
       if (p0 != EditorItemFunc.DECORATION && (p0 != EditorItemFunc.CROP && (p0 != EditorItemFunc.FINE_TUNING && (p0 != EditorItemFunc.REORDER && (p0 == EditorItemFunc.COVER_PHOTO || p0 == EditorItemFunc.PIC_TEMPLATE_V2))))) {
          i = 1;
       }
       if (i) {
          if (p0 == EditorItemFunc.COVER_PHOTO) {
             this.a.P().setVisibility(8);
          }else {
             this.a.t0(p0);
          }
       }
       if (p0 != EditorItemFunc.STICKER_V2) {
          this.a.P().C(true);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, StickerPicturePreviewViewBinder$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PicturePreviewViewBinder", "onEditorHide:", objArray);
       this.a.t0(null);
       this.a.P().C(0);
       return;
    }
    public void f(){
       c1.a(this);
    }
}
