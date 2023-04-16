package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$b;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import und.l;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.UpdateProjectAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import ooc.c1;

public final class TextVideoPreviewViewBinder$b implements EditorManager$b	// class@000b29
{
    public boolean a;
    public final TextVideoPreviewViewBinder b;

    public void TextVideoPreviewViewBinder$b(TextVideoPreviewViewBinder p0){
       this.b = p0;
       super();
    }
    public void d(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextVideoPreviewViewBinder$b.class, "1")) {
          return;
       }
       if (p0 == EditorItemFunc.COVER_VIDEO) {
          this.b.S().setVisibility(8);
          this.a = true;
       }
       if (p0 != EditorItemFunc.TEXT_V2 && (p0 != EditorItemFunc.SUBTITLE_V2 && p0 != EditorItemFunc.STICKER_V2)) {
          this.b.S().C(true);
       }
    label_0032 :
       this.b.e0();
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, TextVideoPreviewViewBinder$b.class, "2")) {
          return;
       }
       if (this.a != null) {
          this.b.s0().t0(new UpdateProjectAction(false));
          this.b.S().setVisibility(false);
          this.a = false;
       }
       this.b.S().C(false);
       return;
    }
    public void f(){
       c1.a(this);
    }
}
