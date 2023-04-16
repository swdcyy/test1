package com.kuaishou.live.core.show.subscribe.profile.b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.subscribe.profile.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import dx5.h$a;
import xk2.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.t;
import com.kuaishou.live.core.show.subscribe.dosubscribe.j;
import al2.c;
import sfc.a;
import erd.g;

public final class b implements Runnable	// class@001163
{
    public final c b;
    public final GifshowActivity c;
    public final ProfileTemplateCard d;
    public final h$a e;
    public final a f;

    public void b(c p0,GifshowActivity p1,ProfileTemplateCard p2,h$a p3,a p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       b te = this.e;
       b tf = this.f;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyFourRefs(tc, td, te, tf, tb, c.class, "6") != PatchProxyResult.class) {
       }else {
          j.p(tf, tc).subscribe(new c(tb, td, te), new a());
       }
       return;
    }
}
