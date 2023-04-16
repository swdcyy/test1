package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$g;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qwc.i;

public final class PicturesViewBinder$g implements Observer	// class@0015f3
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$g(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder$g.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.w.X0();
          }
       }
       return;
    }
}
