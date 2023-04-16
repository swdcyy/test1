package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$d;
import wpc.w;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import cq.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;

public final class KeyBoardPanelBaseViewBinder$d implements w	// class@000bc1
{
    public final KeyBoardPanelBaseViewBinder a;

    public void KeyBoardPanelBaseViewBinder$d(KeyBoardPanelBaseViewBinder p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return true;
    }
    public void b(boolean p0){
       KeyBoardPanelBaseViewBinder$d uod = KeyBoardPanelBaseViewBinder$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "animationCallback", objArray);
       KeyBoardPanelBaseViewBinder$d ta = this.a;
       ta.R(ta.N().K0());
       return;
    }
}
