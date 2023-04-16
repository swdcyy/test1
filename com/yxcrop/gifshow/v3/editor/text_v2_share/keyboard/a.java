package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment;
import ynd.d;

public final class a implements Runnable	// class@000b9c
{
    public final TextKeyboardFragment$a b;

    public void a(TextKeyboardFragment$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.b.b.sh()) {
          TextKeyboardFragment$a b = this.b.b;
          this.b.b.vh(((d.a() + b.s) - b.u));
       }
       return;
    }
}
