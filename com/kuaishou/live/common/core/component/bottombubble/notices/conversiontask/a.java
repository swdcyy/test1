package com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import android.view.View;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.LiveConversionTaskNoticeInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.c;

public class a implements a$a	// class@000faf
{
    public final b a;

    public void a(b p0){
       this.a = p0;
       super();
    }
    public void a(LiveGenericCommentNoticeView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0.d(a1.a(R.color.arg_RES_7f060753), a1.a(R.color.arg_RES_7f060cfd));
       return;
    }
    public void b(LiveGenericCommentNoticeInfo p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       b d = ta.d;
       if (d != null) {
          LiveGenericCommentNoticeInfo mExtraInfo = d.mExtraInfo;
          if (mExtraInfo != null) {
             ta.c.Sf(mExtraInfo.mConversionId);
          }
       }
       return;
    }
}
