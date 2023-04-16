package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$c;
import rod.b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import yod.k;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import qod.a;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextColorChangeActionV3;
import nsd.u;
import xvc.b;

public final class TextMainViewBinderV3$c implements b	// class@000c46
{
    public final TextMainViewBinderV3 a;

    public void TextMainViewBinderV3$c(TextMainViewBinderV3 p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       Object obj = p1;
       p1 = TextMainViewBinderV3$c.class;
       if (!PatchProxy.isSupport(p1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj, this, p1, "1")) {
          TextColorChangeActionV3 textColorCha = new TextColorChangeActionV3(this.a.a0().o0().o(), false, obj, 0, false, 24, null);
          this.a.a0().t0(p1);
       }
       return;
    }
}
