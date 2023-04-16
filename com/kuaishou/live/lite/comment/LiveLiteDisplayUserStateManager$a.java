package com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager$a;
import ds5.c;
import com.kuaishou.live.lite.comment.LiveLiteDisplayUserStateManager;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ds5.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import z1.a;
import java.lang.Throwable;

public final class LiveLiteDisplayUserStateManager$a implements c	// class@0007ee
{
    public final LiveLiteDisplayUserStateManager b;

    public void LiveLiteDisplayUserStateManager$a(LiveLiteDisplayUserStateManager p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return "DisplayUserState";
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteDisplayUserStateManager$a.class, "1")) {
          return;
       }
       a.p(p0, "newConfig");
       a.p(p1, "oldConfig");
       b.c(this, p0, p1);
       if (!TextUtils.equals(p0.getLiveStreamId(), p1.getLiveStreamId())) {
          this.b.a(p0.mLiveStreamId, null);
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
