package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yod.k;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import qod.a;
import xld.b;
import xld.c;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;

public final class TextMainViewBinderV3$a extends DecorationContainerView$e	// class@000c44
{
    public final TextMainViewBinderV3 a;

    public void TextMainViewBinderV3$a(TextMainViewBinderV3 p0){
       this.a = p0;
       super();
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMainViewBinderV3$a.class, "1")) {
       }else {
          a.p(p0, "decorationDrawer");
          super.v(p0);
          if (!this.a.a0().o0().E().d()) {
             this.a.E();
          }
       }
       return;
    }
}
