package ey0.g;
import u07.u;
import ey0.k;
import z1.a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import o96.u;
import com.kwai.framework.location.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.app.Activity;
import brd.t;
import ey0.h;
import erd.g;
import crd.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ey0.b;

public final class g implements u	// class@00221f
{
    public final k b;
    public final a c;

    public void g(k p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       boolean b;
       g tb = this.b;
       g tc = this.c;
       Objects.requireNonNull(tb);
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(tc, tb, ok, "8")) {
       }else {
          LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_LOCATION;
          b.Z(lIVE_AUDIENC, "onLocationBizPermissionStateGranted");
          u.t("live_audience", "live_audience", "live_audience", true);
          k.g("live_audience", true);
          k a = tb.a;
          Object obj = PatchProxy.applyOneRefs(a, tb, ok, "5");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(PermissionUtils.a(a, "android.permission.ACCESS_FINE_LOCATION") || PermissionUtils.a(a, "android.permission.ACCESS_COARSE_LOCATION")){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             if (!PatchProxy.applyVoidOneRefs(tc, tb, ok, "9")) {
                b.Z(lIVE_AUDIENC, "requestSystemLocationPermission");
                PermissionUtils.f(tb.a, "android.permission.ACCESS_FINE_LOCATION").subscribe(new h(tb, tc));
             }
          }else if(k.f()){
             tb.b(tc);
          }else {
             tb.a(tb.a);
          }
       }
       b.c(tb.b, true);
       return;
    }
}
