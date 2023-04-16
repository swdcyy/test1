package com.kuaishou.live.core.show.fansgroupv2.share.fragment.a$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.fansgroup.net.LiveFansGroupSharePanelInfoV3;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import kg1.i;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.c$a;
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.c;

public class a$c extends m	// class@000b5a
{
    public final boolean c;
    public final a d;

    public void a$c(a p0,boolean p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       a$c td = this.d;
       i.g("WECHAT_TIMELINE", td.s.mSource, td.p.Z2.a(), this.c);
       td = this.d;
       td.P8(td.q.a("WECHAT_MOMENTS_CHANNEL"), "WECHAT_MOMENTS_CHANNEL");
       return;
    }
}
