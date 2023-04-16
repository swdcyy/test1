package com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.b;
import xld.c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;

public final class TextKeyBoardPanelViewBinder$a extends DecorationContainerView$e	// class@000b21
{
    public final TextKeyBoardPanelViewBinder a;

    public void TextKeyBoardPanelViewBinder$a(TextKeyBoardPanelViewBinder p0){
       this.a = p0;
       super();
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextKeyBoardPanelViewBinder$a.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.v(p0);
          if (!this.a.g0().o0().E().d()) {
             this.a.D();
          }
       }
       return;
    }
}
