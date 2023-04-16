package com.kuaishou.live.audience.component.chat.apply.g$a;
import sd1.a;
import com.kuaishou.live.audience.component.chat.apply.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import lp3.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xp5.i;
import com.kuaishou.live.audience.component.chat.apply.d;

public class g$a implements a	// class@000a6c
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void Qh(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "3")) {
          return;
       }
       this.t7("CHAT_BUTTON");
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void o9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "2")) {
          return;
       }
       g$a tb = this.b;
       if (tb.u != null) {
          g$a tb1 = this.b;
          tb.p.a(LiveAudienceApplyChatService.class).Ec(this.b.getActivity(), tb1.t, tb1.S8(), p0);
       }
       return;
    }
    public void t7(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "4")) {
          return;
       }
       g u = this.b.u;
       if (u != null) {
          u.f(p0);
       }
       return;
    }
    public void zf(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       this.o9("BOTTOM");
       return;
    }
}
