package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.o$b;
import up.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.o;
import java.lang.Object;
import com.kuaishou.android.model.actionreport.PhotoActionReportParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public class o$b implements a	// class@00182a
{
    public final o a;

    public void o$b(o p0){
       this.a = p0;
       super();
    }
    public PhotoActionReportParams a(){
       Object obj = PatchProxy.applyWithListener(null, this, o$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       o$b ta = this.a;
       PatchProxy.onMethodExit(o$b.class, "1");
       return new PhotoActionReportParams(ta.p, ta.q.getPlayer().getCurrentPosition());
    }
}
