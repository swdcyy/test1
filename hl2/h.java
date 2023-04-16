package hl2.h;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.template.f;
import com.kuaishou.livestream.message.nano.SCLiveActivityPopup;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import t02.r1;
import t02.a0;
import z12.x;

public class h extends m	// class@002dc2
{
    public final SCLiveActivityPopup c;
    public final f d;

    public void h(f p0,SCLiveActivityPopup p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       h tc = this.c;
       Context context = this.d.getContext();
       h td = this.d;
       f s = td.s;
       f r = td.r;
       if (!PatchProxy.applyVoidFourRefs(tc, context, s, r, null, f.class, "5")) {
          if (tc == null) {
             b.Z(LiveLogTag.LIVE_ACTIVITY_TEMPLATE_IM_POPUP, "start router error : info is null");
          }else if(tc.linkType == 1){
             x.K(tc.link, context, s, r);
          }
       }
       return;
    }
}
