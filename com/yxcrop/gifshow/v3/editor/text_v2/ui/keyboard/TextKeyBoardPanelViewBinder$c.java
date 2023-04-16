package com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$c;
import ynd.c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextStyleChangeAction;
import xld.c;
import xvc.b;

public final class TextKeyBoardPanelViewBinder$c implements c	// class@000b23
{
    public final TextKeyBoardPanelViewBinder a;

    public void TextKeyBoardPanelViewBinder$c(TextKeyBoardPanelViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       TextKeyBoardPanelViewBinder$c uoc = TextKeyBoardPanelViewBinder$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1")) {
          this.a.g0().t0(new TextStyleChangeAction(this.a.g0().o0().o(), false, p1, this.a.g0().o0().w()));
       }
       return;
    }
}
