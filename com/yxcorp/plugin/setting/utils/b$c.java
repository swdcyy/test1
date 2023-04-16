package com.yxcorp.plugin.setting.utils.b$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sgd.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.e0;
import java.lang.Integer;
import o07.o;

public class b$c implements PopupInterface$h	// class@000932
{
    public final GifshowActivity b;
    public final PopupInterface$h c;
    public final PopupInterface$h d;

    public void b$c(GifshowActivity p0,PopupInterface$h p1,PopupInterface$h p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       b$c tb = this.b;
       String str = "";
       if (!PatchProxy.applyVoidTwoRefs(tb, str, null, a.class, "3")) {
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.elementPackage = a.b("CLOSELIMIT_CONFIRM_POPUP", str);
          b.a(0x4b316083).W0("3330854", showEvent, tb);
       }
       tb = this.c;
       if (tb != null) {
          tb.B(p0);
       }
       return;
    }
    public void H(c p0,int p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          return;
       }
       uoc = this.c;
       if (uoc != null) {
          uoc.H(p0, p1);
       }
       uoc = this.d;
       if (uoc != null && p1 != 3) {
          uoc.H(p0, p1);
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
