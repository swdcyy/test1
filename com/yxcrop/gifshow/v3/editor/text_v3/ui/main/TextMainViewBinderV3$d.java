package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$d;
import rod.b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3;
import java.lang.Object;
import bod.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import yod.k;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import qod.a;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextFontChangeActionV3;
import xld.c;
import nsd.u;
import xvc.b;

public final class TextMainViewBinderV3$d implements b	// class@000c47
{
    public final TextMainViewBinderV3 a;

    public void TextMainViewBinderV3$d(TextMainViewBinderV3 p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       Object obj = p1;
       p1 = TextMainViewBinderV3$d.class;
       if (!PatchProxy.isSupport(p1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj, this, p1, "1")) {
          a.p(obj, "item");
          TextFontChangeActionV3 textFontChan = new TextFontChangeActionV3(this.a.a0().o0().o(), false, 0, obj, this.a.a0().o0().w(), 4, null);
          this.a.a0().t0(p1);
       }
       return;
    }
}
