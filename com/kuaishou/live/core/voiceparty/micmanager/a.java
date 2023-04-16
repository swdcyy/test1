package com.kuaishou.live.core.voiceparty.micmanager.a;
import k51.c;
import au2.b;
import com.kuaishou.live.core.voiceparty.micmanager.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends c	// class@00155e
{
    public RecyclerFragment p;
    public View q;
    public b r;
    public final q s;
    public static String sLivePresenterClassName = "VoicePartyMicManagerInviteMorePresenter";

    public void a(b p0){
       super();
       this.s = new a$a(this);
       this.r = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.p.q().h(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.p.q().f(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
