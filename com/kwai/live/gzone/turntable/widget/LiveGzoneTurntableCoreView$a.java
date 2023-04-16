package com.kwai.live.gzone.turntable.widget.LiveGzoneTurntableCoreView$a;
import erd.g;
import com.kwai.live.gzone.turntable.widget.LiveGzoneTurntableCoreView;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.live.gzone.turntable.widget.a$a;

public class LiveGzoneTurntableCoreView$a implements g	// class@000e6e
{
    public final LiveGzoneTurntableCoreView b;

    public void LiveGzoneTurntableCoreView$a(LiveGzoneTurntableCoreView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableCoreView$a.class, "1")) {
       }else {
          LiveGzoneTurntableCoreView$a tb = this.b;
          tb.h = false;
          b[] uobArray = new b[]{b.d};
          c.d(tb.b, uobArray);
          LiveGzoneTurntableCoreView i = this.b.i;
          if (i != null) {
             i.c(p0);
             this.b.i.a(false);
          }
       }
       return;
    }
}
