package com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$b;
import ynd.c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder;
import java.lang.Object;
import bod.a;
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
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextFontChangeAction;
import xld.c;
import xvc.b;

public final class TextKeyBoardPanelViewBinder$b implements c	// class@000b22
{
    public final TextKeyBoardPanelViewBinder a;

    public void TextKeyBoardPanelViewBinder$b(TextKeyBoardPanelViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       TextKeyBoardPanelViewBinder$b uob = TextKeyBoardPanelViewBinder$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "1")) {
          a.p(p1, "item");
          this.a.g0().t0(new TextFontChangeAction(this.a.g0().o0().o(), false, p1, this.a.g0().o0().w()));
       }
       return;
    }
}
