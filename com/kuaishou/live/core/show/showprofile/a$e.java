package com.kuaishou.live.core.show.showprofile.a$e;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.show.showprofile.a;
import tx1.d;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService;
import t02.a0;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$AudienceWidget;
import com.kuaishou.live.core.basic.utils.LiveWidgetVisibilityStatusService$a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class a$e implements DialogInterface$OnDismissListener	// class@00101d
{
    public final d b;
    public final a c;

    public void a$e(a p0,d p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
          return;
       }
       a$e tc = this.c;
       tc.s.remove(tc.w);
       tc = this.b;
       if (tc != null) {
          tc.e();
       }
       this.c.p.S().b(LiveWidgetVisibilityStatusService$AudienceWidget.PROFILE_CARD_DETAIL);
       tc.w = null;
       b.Z(LiveVoicePartyLogTag.AUDIENCE, "LiveAudienceProfilePresenter showLiveProfile mLiveProfileFragment dismissed");
       return;
    }
}
