package com.yxcorp.gifshow.follow.config.util.FollowConfigUtil$mAutoRefreshRestoreMaxCount$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class FollowConfigUtil$mAutoRefreshRestoreMaxCount$2 extends Lambda implements a	// class@0010a1
{
    public static final FollowConfigUtil$mAutoRefreshRestoreMaxCount$2 INSTANCE;

    static {
       FollowConfigUtil$mAutoRefreshRestoreMaxCount$2.INSTANCE = new FollowConfigUtil$mAutoRefreshRestoreMaxCount$2();
    }
    public void FollowConfigUtil$mAutoRefreshRestoreMaxCount$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, FollowConfigUtil$mAutoRefreshRestoreMaxCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("followAutoRefreshRestoreMaxCount", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
