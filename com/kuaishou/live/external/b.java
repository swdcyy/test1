package com.kuaishou.live.external.b;
import erd.g;
import com.kuaishou.live.external.a$a;
import java.lang.Object;
import com.kuaishou.live.core.show.model.LiveQueryAnchorWeeklyReportSubscribeResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.external.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b implements g	// class@001b6f
{
    public final a$a b;

    public void b(a$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          b tb = this.b;
          tb.t.d = p0.mSubscribed;
          p0 = tb.m8();
          p0.setVisibility(0);
          this.b.r.setVisibility(0);
          p0 = this.b;
          p0.R8(p0.t.d);
       }
       return;
    }
}
