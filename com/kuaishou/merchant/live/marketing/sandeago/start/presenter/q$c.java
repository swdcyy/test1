package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment;

public class q$c extends m	// class@001a88
{
    public final q c;

    public void q$c(q p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$c.class, "1")) {
          return;
       }
       q$c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, q.class, "5")) {
          tc.r.onBackPressed();
       }
       return;
    }
}
