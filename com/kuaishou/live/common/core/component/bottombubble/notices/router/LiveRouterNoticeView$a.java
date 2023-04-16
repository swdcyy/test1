package com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeView;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveRouterNoticeView$a extends m	// class@000fef
{
    public final View$OnClickListener c;
    public final LiveRouterNoticeView d;

    public void LiveRouterNoticeView$a(LiveRouterNoticeView p0,View$OnClickListener p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRouterNoticeView$a.class, "1")) {
          return;
       }
       LiveRouterNoticeView$a tc = this.c;
       if (tc != null) {
          tc.onClick(p0);
       }
       return;
    }
}
