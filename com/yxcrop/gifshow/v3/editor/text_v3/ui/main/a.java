package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3;
import rod.k;

public final class a implements Runnable	// class@000c53
{
    public final TextMainFragmentV3$a b;

    public void a(TextMainFragmentV3$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.b.b.th()) {
          TextMainFragmentV3$a b = this.b.b;
          this.b.b.Ch((((k.a() + b.C) - b.E) + b.w));
       }
       return;
    }
}
