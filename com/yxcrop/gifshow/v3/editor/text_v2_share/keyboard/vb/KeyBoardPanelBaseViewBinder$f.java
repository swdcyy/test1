package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$f;
import wpc.w;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import cq.a;
import q87.c;
import android.view.View;

public final class KeyBoardPanelBaseViewBinder$f implements w	// class@000bc3
{
    public final KeyBoardPanelBaseViewBinder a;

    public void KeyBoardPanelBaseViewBinder$f(KeyBoardPanelBaseViewBinder p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return true;
    }
    public void b(boolean p0){
       KeyBoardPanelBaseViewBinder$f uof = KeyBoardPanelBaseViewBinder$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KeyBoardPanelBaseViewBinder", "animationCallback, set topEditMask alpha = 1f", objArray);
       KeyBoardPanelBaseViewBinder$f ta = this.a;
       KeyBoardPanelBaseViewBinder d = ta.d;
       if (d != null) {
          d.setAlpha(ta.e);
       }
       return;
    }
}
