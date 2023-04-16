package ow1.a$a;
import erd.g;
import ow1.a;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im3.c;
import im3.b;
import wl3.a;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse$LivePullRequestInfo;
import java.lang.Long;

public final class a$a implements g	// class@0035b2
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          p0 = p0.mLivePullRequestInfo;
          if (p0 != null) {
             c uoc = this.b.a();
             if (uoc != null) {
                uoc.a(new a(Long.valueOf(p0.mRequestLatestTimestamp), p0.mBizInfo), "USER_IO_STATUS");
             }
          }
       }
       return;
    }
}
