package com.kuaishou.live.core.show.guestactivity.b;
import k51.c;
import com.kuaishou.live.core.show.guestactivity.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.core.show.guestactivity.b$a;
import android.view.View$OnClickListener;
import n92.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b extends c	// class@000bd1
{
    public View p;
    public j q;
    public a0 r;
    public b$b s;
    public static String sLivePresenterClassName = "LiveAudienceGuestActivityTopListMoreInfoItemPresenter";

    public void b(b$b p0){
       super();
       this.s = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (this.r.r != null) {
          this.p.setBackgroundResource(R.drawable.arg_RES_7f080d83);
       }else {
          this.p.setBackgroundResource(R.drawable.arg_RES_7f080211);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1d9e);
       p0.setOnClickListener(new b$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(j.class);
       this.r = this.r8("ACCESS_ID_LIVE_PLAY_CALLER_CONTEXT");
       return;
    }
}
