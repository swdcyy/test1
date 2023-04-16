package com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeView;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveSubscribeAnchorNoticeView$a extends m	// class@001008
{
    public final View$OnClickListener c;
    public final LiveSubscribeAnchorNoticeView d;

    public void LiveSubscribeAnchorNoticeView$a(LiveSubscribeAnchorNoticeView p0,View$OnClickListener p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeAnchorNoticeView$a.class, "1")) {
          return;
       }
       this.c.onClick(p0);
       return;
    }
}
