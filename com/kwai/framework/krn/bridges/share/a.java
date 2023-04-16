package com.kwai.framework.krn.bridges.share.a;
import mhc.o0$a;
import com.kwai.framework.krn.bridges.share.b;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import o56.a;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import mhc.j2;
import com.kwai.framework.krn.bridges.share.b$a;

public class a extends o0$a	// class@0015d8
{
    public final b b;

    public void a(b p0,BaseFeed p1){
       this.b = p0;
       super(null);
    }
    public void a(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       p0 = new ClientEvent$ElementPackage();
       String str = "SHARE_PANEL_POPUP";
       p0.action2 = str;
       i3 oi3 = i3.f();
       oi3.d("kpn", a.x);
       oi3.d("share_content", this.b.b.mShareContent);
       oi3.d("sub_biz", this.b.b.mSubBiz);
       oi3.d("share_content_id", this.b.b.mShareObjectId);
       p0.params = oi3.e();
       j2.g(3, str, p0);
       if (this.b.c != null) {
          p0 = i3.f();
          p0.d("eventId", "panel_show");
          p0.d("kpn", a.x);
          this.b.c.a(p0.e());
       }
       return;
    }
    public void c(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (this.b.c != null) {
          p0 = i3.f();
          p0.d("eventId", "panel_dismiss");
          p0.d("kpn", a.x);
          this.b.c.a(p0.e());
       }
       return;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (this.b.c != null) {
          p0 = i3.f();
          p0.d("eventId", "panel_cancel");
          p0.d("kpn", a.x);
          this.b.c.a(p0.e());
       }
       return;
    }
}
