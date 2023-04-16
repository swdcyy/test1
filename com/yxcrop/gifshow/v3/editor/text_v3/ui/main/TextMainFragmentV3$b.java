package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3$b;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextPanelCloseActionV3;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import xld.a;
import xvc.b;

public final class TextMainFragmentV3$b implements Runnable	// class@000c41
{
    public final TextMainFragmentV3 b;

    public void TextMainFragmentV3$b(TextMainFragmentV3 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TextMainFragmentV3$b.class, "1")) {
          return;
       }
       TextMainFragmentV3 d = this.b.D;
       d.t0(new TextPanelCloseActionV3(d.o0().o()));
       return;
    }
}
