package gn2.e;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;
import gn2.c;
import com.kuaishou.live.core.basic.model.LiveWishLightGiftGuideConfig;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lnc.e0;
import java.util.List;
import com.kuaishou.android.live.log.b;
import t45.d;
import gn2.d;
import java.lang.Runnable;
import crd.b;
import brd.z;

public class e implements a$a	// class@002b51
{
    public final LiveWishLightGiftGuideConfig a;
    public final CDNUrl[] b;
    public final c c;

    public void e(c p0,LiveWishLightGiftGuideConfig p1,CDNUrl[] p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(LiveAvatarFailType p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "2")) {
          return;
       }
       b.P(c.U, "download icon fail, failType = "+p0+" errorMsg = "+p1+" cdnUrlArray = "+e0.d(this.b));
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       d.c.d(new d(this, p0, this.a));
       return;
    }
}
