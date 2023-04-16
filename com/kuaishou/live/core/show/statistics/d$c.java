package com.kuaishou.live.core.show.statistics.d$c;
import xq5.c;
import com.kuaishou.live.core.show.statistics.d;
import java.lang.Object;
import xq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import mq5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yt5.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class d$c implements c	// class@00109a
{
    public final d b;

    public void d$c(d p0){
       this.b = p0;
       super();
    }
    public void P(){
       b.a(this);
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "1")) {
          return;
       }
       if (this.b.p.D2.U0()) {
          d$c tb = this.b;
          tb.s.b(tb.getActivity());
       }
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
