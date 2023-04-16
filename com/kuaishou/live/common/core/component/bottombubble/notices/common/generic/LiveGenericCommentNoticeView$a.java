package com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveGenericCommentNoticeView$a extends m	// class@000f90
{
    public final View$OnClickListener c;
    public final LiveGenericCommentNoticeView d;

    public void LiveGenericCommentNoticeView$a(LiveGenericCommentNoticeView p0,View$OnClickListener p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGenericCommentNoticeView$a.class, "1")) {
          return;
       }
       this.c.onClick(p0);
       return;
    }
}
