package com.kuaishou.live.audience.component.follow.card.e;
import qy0.c;
import com.kuaishou.live.audience.component.follow.card.d;
import java.lang.Object;
import java.util.List;
import com.kuaishou.live.audience.component.follow.LiveAudienceFollowCardUser;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import qy0.j;
import qy0.i;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class e implements c	// class@000ace
{
    public final int a;
    public final d b;

    public void e(d p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public List a(){
       return this.b.q;
    }
    public void b(LiveAudienceFollowCardUser p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.b.W8(p0);
       this.b.X7(t.timer((long)(Math.random() * (double)this.b.t), TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new j(this, p0, this.a), new i(this)));
       return;
    }
}
