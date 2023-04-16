package com.kuaishou.live.common.core.component.bottombubble.notices.merchant.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import dd1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.merchant.LiveCustomerReplyNoticeInfo;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dd1.a;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import lnc.a1;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import java.util.List;
import android.view.View;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import dd1.d;

public class a implements a$a	// class@000fe5
{
    public final LiveCustomerReplyNoticeInfo a;
    public final c b;

    public void a(c p0,LiveCustomerReplyNoticeInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(LiveGenericCommentNoticeView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0.setOnClickListener(new a(this, this.a));
       p0.d(a1.a(R.color.arg_RES_7f060753), a1.a(R.color.arg_RES_7f060cfd));
       p0.setFirstLineContent(this.b.d(this.a));
       p0.c(this.a.mContentIconUrls);
       return;
    }
    public void b(LiveGenericCommentNoticeInfo p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.b.e(this.a);
       this.b.c.Ra(this.a.mBizType);
       return;
    }
}
