package com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$d;
import ynd.c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder;
import java.lang.Object;
import bod.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextTemplateChangeAction;
import xld.c;
import xvc.b;

public final class TextKeyBoardPanelViewBinder$d implements c	// class@000b24
{
    public final TextKeyBoardPanelViewBinder a;

    public void TextKeyBoardPanelViewBinder$d(TextKeyBoardPanelViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       TextKeyBoardPanelViewBinder$d uod = TextKeyBoardPanelViewBinder$d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "1")) {
          a.p(p1, "item");
          this.a.g0().t0(new TextTemplateChangeAction(this.a.g0().o0().o(), false, p1, this.a.g0().o0().w()));
       }
       return;
    }
}
