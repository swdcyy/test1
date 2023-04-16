package com.kuaishou.live.report.LiveReportFragment$d$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.report.LiveReportFragment$d;
import com.kuaishou.live.report.MenuInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kuaishou.live.webview.LiveWebViewActivity;
import android.content.Intent;
import android.app.Activity;
import com.kuaishou.live.report.LiveReportFragment;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.report.LiveReportFragment$c;
import wkd.b;
import l66.a;
import dda.j;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.yxcorp.gifshow.action.c;
import androidx.fragment.app.KwaiDialogFragment;

public class LiveReportFragment$d$a implements View$OnClickListener	// class@000f52
{
    public final MenuInfo b;
    public final LiveReportFragment$d c;

    public void LiveReportFragment$d$a(LiveReportFragment$d p0,MenuInfo p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveReportFragment$d$a.class, "1")) {
          return;
       }
       if (this.b.mNeedDetail.booleanValue()) {
          LiveReportFragment$d i = this.c.i;
          if (i != null) {
             this.c.i.startActivity(LiveWebViewActivity.G3(i, this.b.mJumpUrl).a());
             this.c.i.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
          label_0047 :
             Iterator iterator = this.c.j.H.iterator();
             while (iterator.hasNext()) {
                iterator.next().a(this.b.mTitle);
             }
             if (this.c.j.F != null) {
                b.a(0x6d2a4fdd).b(new j(this.c.j.F, this.b.mType));
                RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
                uExtParams.mNegativeType = 6;
                c.b(9, this.c.j.F, uExtParams);
             }
             this.c.j.dismiss();
             return;
          }
       }
       LiveReportFragment$d$a tc = this.c;
       tc.H(this.b, tc.j.F);
       goto label_0047 ;
    }
}
