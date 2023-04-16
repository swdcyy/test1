package com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder$e;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.keyboard.TextKeyBoardPanelViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextElement;
import und.l;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import xld.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import e17.i$b;
import e17.i;
import com.kwai.library.widget.popup.common.f;
import com.yxcrop.gifshow.v3.editor.text_v2.action.RecoTextBtnClickActionV3;
import xvc.b;

public final class TextKeyBoardPanelViewBinder$e implements View$OnClickListener	// class@000b25
{
    public final TextKeyBoardPanelViewBinder b;

    public void TextKeyBoardPanelViewBinder$e(TextKeyBoardPanelViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextKeyBoardPanelViewBinder$e.class, "1")) {
          return;
       }
       EditDecorationBaseDrawer selectDrawer = this.b.N().getSelectDrawer();
       if (selectDrawer instanceof NewEditTextElement) {
          String str = this.b.g0().o0().B();
          if (selectDrawer.getLayerIndex() == -1 || TextUtils.x(str)) {
             i$b uob = i.m();
             uob.y(f.o(R.string.arg_RES_7f104c33));
             i.z(uob);
             return;
          }else {
             a.m(str);
             selectDrawer.updateText(str);
          }
       }
       this.b.g0().t0(new RecoTextBtnClickActionV3());
       return;
    }
}
