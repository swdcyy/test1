package com.kuaishou.live.ad.fanstop.h$a;
import ds5.c;
import com.kuaishou.live.ad.fanstop.h;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import mxb.f0;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Throwable;

public class h$a implements c	// class@0009a4
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       if (this.b.q != null) {
          h$a tb = this.b;
          b.a(-762347696).r1(tb.q.mPhoto, "key_enteraction", Integer.valueOf(tb.r));
       }
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
