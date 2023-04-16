package com.kwai.live.gzone.guess.kshell.j0$d;
import com.kwai.live.gzone.widget.f;
import com.kwai.live.gzone.guess.kshell.j0;
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

public class j0$d extends f	// class@000d44
{
    public final j0 G;

    public void j0$d(j0 p0,f$b p1){
       this.G = p0;
       super(p1);
    }
    public int e0(){
       j0$d obj = PatchProxy.apply(null, this, j0$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.G;
       j0 s = obj.s;
       if (s != null) {
          return s.e3(obj.getActivity());
       }
       return super.e0();
    }
}
