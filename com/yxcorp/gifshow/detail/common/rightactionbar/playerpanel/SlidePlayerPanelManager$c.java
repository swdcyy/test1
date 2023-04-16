package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$c;
import ok.h;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import androidx.fragment.app.FragmentActivity;
import e17.s$a;
import java.lang.Object;
import java.lang.Void;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import sz9.a;
import java.lang.Boolean;
import v6a.m0;
import xx9.a;
import brd.t;
import xy5.j;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.a;
import io.reactivex.internal.functions.Functions;
import erd.g;

public final class SlidePlayerPanelManager$c implements h	// class@0014c5
{
    public final SlidePlayerPanelManager b;
    public final FragmentActivity c;
    public final s$a d;

    public void SlidePlayerPanelManager$c(SlidePlayerPanelManager p0,FragmentActivity p1,s$a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       p0 = PatchProxy.applyOneRefs(p0, this, SlidePlayerPanelManager$c.class, str);
       if (p0 != patchProxyRe) {
       }else {
          p0 = this.b;
          SlidePlayerPanelManager m = p0.m;
          SlidePlayerPanelManager$c tc = this.c;
          SlidePlayerPanelManager$c td = this.d;
          p0 = p0.u;
          Objects.requireNonNull(p0);
          Object obj = PatchProxy.apply(null, p0, a.class, str);
          boolean b = (obj != patchProxyRe)? obj.booleanValue(): p0.a.r.c();
          b = m.b(tc, "PLAYER_PANEL", td, b);
          if (b != null) {
             b = b.subscribe(a.b, Functions.e);
          }else {
             b = null;
          }
       }
       return p0;
    }
}
