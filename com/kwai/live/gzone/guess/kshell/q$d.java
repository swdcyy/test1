package com.kwai.live.gzone.guess.kshell.q$d;
import com.kwai.live.gzone.widget.f;
import com.kwai.live.gzone.guess.kshell.q;
import com.kwai.live.gzone.widget.f$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j47.c;
import com.kwai.live.gzone.widget.e;

public class q$d extends f	// class@000d5f
{
    public final q G;

    public void q$d(q p0,f$b p1){
       this.G = p0;
       super(p1);
    }
    public int e0(){
       q$d obj = PatchProxy.apply(null, this, q$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.G;
       q j = obj.J;
       if (j != null) {
          return j.e3(obj.getActivity());
       }
       return super.e0();
    }
}
