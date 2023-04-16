package com.kuaishou.live.core.show.statistics.d$b;
import wq5.b;
import com.kuaishou.live.core.show.statistics.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import yt5.e;

public class d$b extends b	// class@001099
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void b(float p0,int p1){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       d$b ta = this.a;
       d s = ta.s;
       Activity activity = ta.getActivity();
       String userId = this.a.p.c.getUserId();
       boolean b = (!p0)? true: false;
       s.a(activity, userId, b);
       return;
    }
}
