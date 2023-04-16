package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$e;
import ynd.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import wnd.j;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.KeyboardPanelFoldButtonClickedAction;
import xvc.b;

public final class KeyBoardPanelBaseViewBinder$e implements a	// class@000bc2
{
    public final KeyBoardPanelBaseViewBinder a;

    public void KeyBoardPanelBaseViewBinder$e(KeyBoardPanelBaseViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       KeyBoardPanelBaseViewBinder$e uoe = KeyBoardPanelBaseViewBinder$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "onFoldListener, onClick, isSubtitle="+this.a.Y(), objArray);
       if (p0) {
          j.a.c(this.a.L(), this.a.N().getSelectDrawer());
       }else {
          this.a.P().t0(new KeyboardPanelFoldButtonClickedAction(true));
          j.a.e(this.a.L(), this.a.N());
       }
       return;
    }
}
