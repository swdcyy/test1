package ey0.j;
import q96.d;
import ey0.k;
import z1.a;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import q96.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import e93.f;
import o96.u;
import ey0.i;
import java.lang.Runnable;

public class j implements d	// class@002222
{
    public final a a;
    public final k b;

    public void j(k p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oj, "2")) {
          return;
       }
       c.d(this, p0, p1);
       this.a.accept(p1);
       b.c0(LiveLogTag.LIVE_AUDIENCE_LOCATION, "Location Success", "cityInfo", p1.toString());
       return;
    }
    public void onError(int p0,String p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oj, "3")) {
          return;
       }
       c.a(this, p0, p1);
       this.a.accept(null);
       b.d0(LiveLogTag.LIVE_AUDIENCE_LOCATION, "Location Error", "errorCode", Integer.valueOf(p0), "reason", p1);
       return;
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, j.class, "4")) {
          return;
       }
       c.b(this);
       f.g(this);
       u.q(this.b.c, "live_audience");
       b.Z(LiveLogTag.LIVE_AUDIENCE_LOCATION, "Location Finish");
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       c.c(this);
       f.k("getLocationStateListener", new i(this.a), this, k.f);
       b.Z(LiveLogTag.LIVE_AUDIENCE_LOCATION, "Location Start");
       return;
    }
}
