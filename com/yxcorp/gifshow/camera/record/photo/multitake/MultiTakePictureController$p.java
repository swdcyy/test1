package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$p;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import jg9.b1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.d0;
import android.view.View;
import com.yxcorp.utility.n;

public final class MultiTakePictureController$p implements g	// class@000ee4
{
    public final MultiTakePictureController b;

    public void MultiTakePictureController$p(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$p.class, "1")) {
       }else if(!this.b.f2()){
          MultiTakePictureController$p tb = this.b;
          if (tb.v != null) {
             if (p0.a != null) {
                n.Y(tb.t, 0, true);
             }else {
                n.Y(tb.t, 4, true);
             }
          }
       }
       return;
    }
}
