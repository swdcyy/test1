package com.kuaishou.live.audience.component.comments.send.e$c;
import androidx.fragment.app.c$b;
import com.kuaishou.live.audience.component.comments.send.e;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.core.basic.activity.x;
import ft5.b;
import java.lang.CharSequence;
import gq5.f;

public class e$c extends c$b	// class@000abc
{
    public final e a;

    public void e$c(e p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$c.class, "1")) {
          return;
       }
       e$c ta = this.a;
       e r = ta.r;
       if (r.o != null) {
          e q = ta.q;
          if (q != null && (q.mOpenPanelType == true && r.R().v0())) {
             ta = this.a;
             r.mOpenPanelType = 0;
             if (ta.P.M()) {
                return;
             }else {
                ta = this.a;
                r = ta.r;
                r.i = false;
                r.j = false;
                ta.V8(ta.G, true, 0, ta.L);
                ta = this.a;
                ta.G = "";
                ta.r.g2.t();
             }
          }
       }
       return;
    }
}
