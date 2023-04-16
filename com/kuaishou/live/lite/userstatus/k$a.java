package com.kuaishou.live.lite.userstatus.k$a;
import ds5.c;
import com.kuaishou.live.lite.userstatus.k;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ds5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;

public class k$a implements c	// class@000b9c
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return "UserStatus";
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "2")) {
          return;
       }
       k$a tb = this.b;
       tb.d = true;
       if (!TextUtils.n(p0.mLiveStreamId, tb.g)) {
          b.d0(LiveLiteLogTag.USER_STATUS, "LiteUserStatusObtainController.onAfterConfigUpdated -- liveStreamId Changed", "last", this.b.g, "new", p0.mLiveStreamId);
          this.b.d(true);
       }else {
          this.b.a();
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       b.d(this, p0);
       k$a tb = this.b;
       tb.d = true;
       tb.a();
       return;
    }
    public boolean xi(){
       return b.e(this);
    }
}
