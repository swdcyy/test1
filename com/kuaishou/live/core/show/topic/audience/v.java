package com.kuaishou.live.core.show.topic.audience.v;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.topic.audience.w;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCLiveTagUpdate;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.topic.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import ql2.e0;
import java.lang.Runnable;
import ekd.k1;

public class v extends m	// class@00121e
{
    public final w c;

    public void v(w p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       v tc = this.c;
       w q = tc.q;
       a.d(q.tagId, q.tagName, tc.u.a());
       if (y.d(this.c.getActivity())) {
          this.c.getActivity().setRequestedOrientation(1);
          k1.p(new e0(this), this.c);
       }else {
          this.c.R8();
       }
       return;
    }
}
