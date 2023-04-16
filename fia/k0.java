package fia.k0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vga.b;
import cha.a;
import bia.j;
import bia.c;
import dha.l;
import dha.e;
import hia.a;

public final class k0 extends PresenterV2	// class@002917
{
    public a p;
    public j q;
    public c r;
    public l s;
    public e t;
    public a u;

    public void k0(){
       super();
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "2")) {
          return;
       }
       b[] uobArray = new b[]{this.p,this.q,this.r,this.s,this.t,this.u};
       int i = 0;
       while (i < 6) {
          object oobject = uobArray[i];
          if (oobject != null) {
             oobject.a();
          }
          i = i + 1;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k0.class, "1")) {
          return;
       }
       this.p = this.r8("NIRVANA_FOLLOW_VIEW_PAGER_STATE");
       this.q = this.r8("NIRVANA_FOLLOW_SCREEN_STATE");
       this.r = this.r8("NIRVANA_SELECTED_ITEM");
       this.s = this.t8("FOLLOW_FEEDS_STATE_USER_LOGIN");
       this.t = this.t8("LIVE_ENDS_STATUS");
       this.u = this.t8("FOLLOW_SWIPE_GUIDE_STATE_OBSERVABLE");
       return;
    }
}
