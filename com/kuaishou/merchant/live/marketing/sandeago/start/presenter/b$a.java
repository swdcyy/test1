package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.b$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import n64.i;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment;

public class b$a extends m	// class@001a71
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a tc = this.c;
       tc.s.a(tc.r);
       this.c.q.onBackPressed();
       return;
    }
}
