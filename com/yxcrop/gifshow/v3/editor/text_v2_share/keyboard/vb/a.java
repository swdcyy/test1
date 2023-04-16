package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;

public final class a implements Runnable	// class@000bc9
{
    public final KeyBoardPanelBaseViewBinder$a b;

    public void a(KeyBoardPanelBaseViewBinder$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.b.c0();
       return;
    }
}
