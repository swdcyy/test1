package com.kwai.live.gzone.accompanyplay.anchor.y$c;
import java.lang.Runnable;
import com.kwai.live.gzone.accompanyplay.anchor.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import e17.i;

public class y$c implements Runnable	// class@000b41
{
    public final y b;

    public void y$c(y p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, y$c.class, "1")) {
          return;
       }
       if (a1.i(this.b.getActivity())) {
          i.a(R.style.arg_RES_7f11066a, 0x7f10238c);
       }
       return;
    }
}
