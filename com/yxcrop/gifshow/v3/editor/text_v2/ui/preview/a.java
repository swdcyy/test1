package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import kod.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import und.l;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.TextVideoPreviewViewBinder;
import com.yxcrop.gifshow.v3.editor.text_v2.action.TextAddedAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class a implements Runnable	// class@000b35
{
    public final TextVideoPreviewViewBinder$a b;
    public final EditDecorationBaseDrawer c;

    public void a(TextVideoPreviewViewBinder$a p0,EditDecorationBaseDrawer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.a.S().x0(this.c, false);
       a tc = this.c;
       if (tc instanceof NewEditTextElement) {
          tc.getTextDrawerLayout().setAcceptEvent(true);
       }
       this.b.a.s0().t0(new TextAddedAction(this.c.getLayerIndex()));
       this.b.a.r0();
       return;
    }
}
