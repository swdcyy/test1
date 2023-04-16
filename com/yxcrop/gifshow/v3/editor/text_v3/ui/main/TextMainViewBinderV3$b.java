package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$b;
import rod.b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import yod.k;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import qod.a;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextAlignTypeChangeActionV3;
import xld.c;
import nsd.u;
import xvc.b;

public final class TextMainViewBinderV3$b implements b	// class@000c45
{
    public final TextMainViewBinderV3 a;

    public void TextMainViewBinderV3$b(TextMainViewBinderV3 p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       int i = p1.intValue();
       p1 = TextMainViewBinderV3$b.class;
       if (!PatchProxy.isSupport(p1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(i), this, p1, "1")) {
          TextAlignTypeChangeActionV3 textAlignTyp = new TextAlignTypeChangeActionV3(i, this.a.a0().o0().o(), false, 0, this.a.a0().o0().w(), 8, null);
          this.a.a0().t0(p1);
       }
       return;
    }
}
