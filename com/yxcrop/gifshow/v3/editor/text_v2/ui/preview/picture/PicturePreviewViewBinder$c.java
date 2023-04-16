package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder$c;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.PicturePreviewViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import ooc.c1;

public final class PicturePreviewViewBinder$c implements EditorManager$b	// class@000b48
{
    public final PicturePreviewViewBinder a;

    public void PicturePreviewViewBinder$c(PicturePreviewViewBinder p0){
       this.a = p0;
       super();
    }
    public void d(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturePreviewViewBinder$c.class, "1")) {
          return;
       }
       this.a.x0(true, p0);
       EditorItemFunc uEditorItemF = (p0 != EditorItemFunc.DECORATION && (p0 != EditorItemFunc.CROP && (p0 != EditorItemFunc.FINE_TUNING && (p0 != EditorItemFunc.REORDER && (p0 == EditorItemFunc.COVER_PHOTO || p0 == EditorItemFunc.PIC_TEMPLATE_V2)))))? 1: null;
       if (uEditorItemF) {
          if (p0 == EditorItemFunc.COVER_PHOTO) {
             PicturePreviewViewBinder$c ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, PicturePreviewViewBinder.class, "8")) {
                ta.S().setVisibility(8);
             }
          }else {
             this.a.y0(p0);
          }
       }
       if (p0 != EditorItemFunc.TEXT_V2) {
          this.a.S().C(true);
       }
       this.a.e0();
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PicturePreviewViewBinder$c.class, "2")) {
          return;
       }
       this.a.y0(objArray);
       PicturePreviewViewBinder$c ta = this.a;
       ta.x0(false, ta.P.H());
       this.a.S().C(false);
       return;
    }
    public void f(){
       c1.a(this);
    }
}
