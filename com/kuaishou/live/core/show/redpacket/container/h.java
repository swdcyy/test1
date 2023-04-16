package com.kuaishou.live.core.show.redpacket.container.h;
import com.kuaishou.live.core.show.redpacket.container.b$a;
import com.kuaishou.live.core.show.redpacket.container.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import p91.m;
import uw1.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class h implements b$a	// class@000e7a
{
    public final f a;

    public void h(f p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       f obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.A;
       boolean b = (obj != null && obj.a())? true: false;
       return b;
    }
    public m b(){
       return this.a.w;
    }
    public m c(){
       return this.a.O;
    }
    public Activity getActivity(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getActivity();
    }
}
