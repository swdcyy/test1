package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$e;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import qwc.i;

public final class PicturesViewBinder$e implements Observer	// class@0015f0
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$e(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesViewBinder$e.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b;
             p0.w.Y0(true, p0.J.q0());
             p0 = this.b;
             p0.I(true, p0.J.q0());
          }else {
             p0 = this.b;
             p0.w.Y0(false, p0.J.q0());
             p0 = this.b;
             p0.I(p0.G(), this.b.J.q0());
             p0 = this.b;
             p0.L(p0.G(), this.b.J.q0());
          }
       }
       return;
    }
}
