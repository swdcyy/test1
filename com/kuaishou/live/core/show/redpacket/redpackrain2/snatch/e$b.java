package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e$b;
import ub.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;

public class e$b extends a	// class@000f24
{
    public final boolean b;
    public final e c;

    public void e$b(e p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$b.class, "1")) {
          return;
       }
       e$b tc = this.c;
       tc.d.setImageURI(tc.d(this.b));
       this.c.d.setImageURI(c0.a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_lucky_user_bg.webp"));
       tc = this.c;
       tc.f.setImageURI(tc.e(this.b));
       return;
    }
}
