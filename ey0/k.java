package ey0.k;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Intent;
import java.lang.Throwable;
import z1.a;
import q96.d;
import o96.u;
import com.kwai.robust.PatchProxyResult;
import ey0.j;

public class k	// class@002223
{
    public final Activity a;
    public final ClientContent$LiveStreamPackage b;
    public d c;
    public a d;
    public boolean e;
    public static final long f;

    static {
       k.f = a.t().u("SOURCE_LIVE").b("liveAudienceFloatEditorRequestLocationLimitTimeMs", 1000);
    }
    public void k(Activity p0,ClientContent$LiveStreamPackage p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(Activity p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "13")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_AUDIENCE_LOCATION, "openGPSSettings");
       b = false;
       try{
          this.e = b;
          p0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
       }catch(android.content.ActivityNotFoundException e4){
          b.I(LiveLogTag.LIVE_AUDIENCE_LOCATION, "openGPSSettings", e4);
       }
       return;
    }
    public final void b(a p0){
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "10")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_AUDIENCE_LOCATION, "requestLocationWithTimeLimit");
       u.q(this.c, "live_audience");
       j oj = PatchProxy.applyOneRefs(p0, this, ok, "11");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j(this, p0);
       }
       this.c = oj;
       u.i(oj, "live_audience");
       u.j(false, "live_audience", "live_audience", "live_audience");
       return;
    }
}
