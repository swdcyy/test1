package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.g;
import ok.h;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.LiveRedPackRainNotifyDialogFragment;
import java.lang.Object;
import java.lang.Void;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import uh2.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import uh2.c;
import erd.o;
import uh2.a;
import android.app.Activity;
import qh2.f;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.h;
import erd.g;
import crd.b;

public final class g implements h	// class@000f15
{
    public final LiveRedPackRainNotifyDialogFragment b;

    public void g(LiveRedPackRainNotifyDialogFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       g tb = this.b;
       p0 = tb.getActivity();
       LiveRedPackRainNotifyDialogFragment y = tb.y;
       t ot = PatchProxy.applyTwoRefs(p0, y, null, e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = e.c(y).map(c.b).concatMap(new a(p0));
       }
       return ot.subscribe(new f(tb), h.b);
    }
}
