package com.yxcorp.gifshow.magic.ui.magicemoji.similar.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter$c;
import com.yxcorp.gifshow.magic.ui.magicemoji.similar.e;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import h5b.g;
import java.lang.Runnable;

public final class b implements MagicFaceAdapter$c	// class@001c12
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void k6(View p0,MagicEmoji$MagicFace p1){
       b tb = this.b;
       e u = tb.u;
       if (u != null) {
          u.k6(p0, p1);
       }
       if (p0 != null) {
          p0.post(new g(tb, p1));
       }
       return;
    }
}
