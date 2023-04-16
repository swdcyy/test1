package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$c;
import erd.r;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextV3Element;

public final class KeyBoardPanelBaseViewBinder$c implements r	// class@000bc0
{
    public static final KeyBoardPanelBaseViewBinder$c b;

    static {
       KeyBoardPanelBaseViewBinder$c.b = new KeyBoardPanelBaseViewBinder$c();
    }
    public void KeyBoardPanelBaseViewBinder$c(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, KeyBoardPanelBaseViewBinder$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = (!p0 instanceof NewEditStickerBaseDrawer && (p0 instanceof NewEditTextElement || p0 instanceof NewEditTextV3Element))? true: false;
       }
       return b;
    }
}
