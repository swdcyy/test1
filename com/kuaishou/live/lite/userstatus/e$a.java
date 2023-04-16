package com.kuaishou.live.lite.userstatus.e$a;
import ds5.c;
import com.kuaishou.live.lite.userstatus.e;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ds5.b;
import java.lang.Throwable;

public class e$a implements c	// class@000b95
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return "UserStatus";
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "1")) {
          return;
       }
       if (!TextUtils.n(p0.mLiveStreamId, p1.mLiveStreamId)) {
          b.d0(LiveLiteLogTag.USER_STATUS, "LiteUserStatusObtainController.onAfterConfigUpdated -- liveStreamId Changed", "last", p1.mLiveStreamId, "new", p0.mLiveStreamId);
          this.b.j(p0.mLiveStreamId, true);
       }else {
          this.b.i(true);
          this.b.i(2);
       }
       return;
    }
    public void ff(QLivePlayConfig p0){
       b.b(this, p0);
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
