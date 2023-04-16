package com.kwai.live.gzone.accompanyplay.anchor.y$e;
import u07.u;
import com.kwai.live.gzone.accompanyplay.anchor.y;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;

public class y$e implements u	// class@000b43
{
    public final boolean b;
    public final y c;

    public void y$e(y p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, y$e.class, "1")) {
          return;
       }
       if (this.b != null) {
          Activity activity = this.c.getActivity();
          if (a1.i(activity)) {
             this.c.P8(activity, false, true);
          }
       }
       return;
    }
}
