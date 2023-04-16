package com.kuaishou.live.lite.square.notice.d;
import com.kuaishou.live.lite.square.e$a;
import com.kuaishou.live.lite.square.notice.LiveNewSquareNoticePresenter;
import java.lang.Object;
import kd3.a;
import java.util.Objects;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel;
import com.kuaishou.live.lite.square.notice.c;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel$a;

public final class d implements e$a	// class@000b71
{
    public final LiveNewSquareNoticePresenter a;

    public void d(LiveNewSquareNoticePresenter p0){
       this.a = p0;
    }
    public final void a(a p0){
       boolean b;
       d ta = this.a;
       Objects.requireNonNull(ta);
       LiveLiteLogTag sQUARE = LiveLiteLogTag.SQUARE;
       b.Z(sQUARE, "liveSide is ready");
       Object obj = PatchProxy.applyOneRefs(p0, ta, LiveNewSquareNoticePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && p0.a == 5){
          b = true;
       }else {
          b = false;
       }
       if (b && ta.x.j0() != null) {
          b.Z(sQUARE, "can show notice");
          ta.A = new LiveNewNoticeEntryDataModel(ta, ta.x.j0(), new c(ta));
       }
       return;
    }
}
