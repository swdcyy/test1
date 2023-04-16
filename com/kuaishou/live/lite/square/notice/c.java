package com.kuaishou.live.lite.square.notice.c;
import com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel$a;
import com.kuaishou.live.lite.square.notice.LiveNewSquareNoticePresenter;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.square.notice.f;
import ld3.h;
import e93.b;
import xp5.i;
import z1.a;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;

public final class c implements LiveNewNoticeEntryDataModel$a	// class@000b70
{
    public final LiveNewSquareNoticePresenter a;

    public void c(LiveNewSquareNoticePresenter p0){
       this.a = p0;
    }
    public final void a(LiveStreamFeed p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, LiveNewSquareNoticePresenter.class, "8")) {
       }else {
          b.Z(LiveLiteLogTag.SQUARE, "add notice vc");
          ta.v.c(LayoutViewType.SquareNoticeArea, new f(p0, ta.y, ta.z, new h(ta)));
       }
       return;
    }
}
