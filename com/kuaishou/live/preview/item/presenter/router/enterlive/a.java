package com.kuaishou.live.preview.item.presenter.router.enterlive.a;
import dk3.a;
import vq5.f;
import hl3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.router.LivePreviewRouterHost;
import hl3.a;
import vq5.b;

public class a extends a	// class@000e3f
{
    public final f e;
    public final b f;

    public void a(f p0,b p1){
       super();
       this.e = p0;
       this.f = p1;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.e.K6(LivePreviewRouterHost.ENTER_CURRENT_LIVE, new a(this));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.e.ti(LivePreviewRouterHost.ENTER_CURRENT_LIVE);
       return;
    }
}
