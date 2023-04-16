package com.yxcorp.gifshow.camera.record.magic.sticker.b$c;
import ekd.f$i;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.ViewGroup;
import android.view.View;

public class b$c extends f$i	// class@000e5d
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       b$c tb = this.b;
       d l = tb.l;
       if (l != null) {
          l.removeView(tb.u);
          tb.u = null;
       }
       return;
    }
}
