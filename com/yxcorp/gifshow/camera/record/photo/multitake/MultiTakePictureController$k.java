package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$k;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import kd9.l0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.View;
import jg9.f;

public final class MultiTakePictureController$k implements g	// class@000ed7
{
    public final MultiTakePictureController b;

    public void MultiTakePictureController$k(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$k.class, "1")) {
       }else {
          MultiTakePictureController$k tb = this.b;
          if (tb.v != null && p0.a == 2) {
             p0 = tb.J;
             d l = tb.l;
             View view = (l != null)? l.findViewById(R.id.side_bar_right_shader): null;
             p0.d(view, true);
          }
       }
       return;
    }
}
