package com.kwai.framework.location.locationupload.k;
import com.kwai.framework.location.locationupload.k$b;
import java.lang.Object;
import ekd.e0;
import android.content.Context;
import java.lang.String;
import android.content.SharedPreferences;
import vid.b;
import com.kwai.framework.location.locationupload.d;
import com.kwai.framework.location.locationupload.k$a;
import com.kwai.framework.location.locationupload.d$a;
import r96.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import p96.a;
import q87.c;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import r96.n;
import com.kwai.framework.location.locationupload.j;
import erd.g;
import qe6.b;
import java.util.Objects;
import hyb.d;
import sid.e0;
import tkd.b;
import tkd.d;
import com.kwai.framework.location.locationupload.a;
import com.kwai.framework.location.locationupload.c;
import com.kwai.framework.location.locationupload.a$a;
import java.lang.Integer;
import java.lang.Boolean;
import t45.d;
import brd.z;
import com.kwai.framework.location.locationupload.i;

public class k	// class@001649
{
    public boolean a;
    public String b;
    public String c;
    public long d;
    public final k$b e;
    public String f;
    public final SharedPreferences g;
    public b h;
    public b i;
    public boolean j;
    public c$c k;
    public int l;
    public final d m;
    public static final String n = "k";

    public void k(k$b p0){
       super();
       this.j = true;
       this.e = p0;
       SharedPreferences sharedPrefer = b.c(e0.b, "LOCATION_UPLOAD_QUERY_SP_NAME", 0);
       this.g = sharedPrefer;
       this.c = sharedPrefer.getString("location_upload_last_query_info", "");
       this.f = sharedPrefer.getString("location_upload_action_last_query_info", "");
       this.m = new d(new k$a(this));
    }
    public final void a(e p0){
       e nextQueryInt;
       long l = this;
       e obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, l, k.class, "6")) {
          return;
       }
       if (!ActivityContext.g().h()) {
          return;
       }
       k ok = null;
       if (obj != null && obj.result == 1) {
          nextQueryInt = obj.nextQueryInterval;
          if (nextQueryInt - ok > 0) {
             l.d = nextQueryInt;
          label_003d :
             if (nextQueryInt - ok <= 0) {
                nextQueryInt = 15;
             }
             if (l.h != null && !l.h.isDisposed()) {
                l.h.dispose();
             }
             l.h = t.timer(nextQueryInt, TimeUnit.SECONDS).subscribe(new n(l), j.b);
             if (!b.a()) {
                return;
             }else if(obj != null && obj.collect != null){
                ok = l.e;
                if (ok != null) {
                   ok.a();
                }
             }
             k m = l.m;
             Objects.requireNonNull(m);
             if (!PatchProxy.applyVoidOneRefs(obj, m, d.class, "1") && obj != null) {
                obj = obj.actionType;
                if (obj == null || (obj == 1 && !PatchProxy.applyVoid(null, m, d.class, "2"))) {
                   d uod = e0.d();
                   if (uod == null) {
                      m.a(0, 0, 1, null, "30002");
                   }else {
                      double latitude = uod.getLatitude();
                      double longitude = uod.getLongitude();
                      c uoc = new c(m, latitude, longitude);
                      d.a(0x7561d443).X5(latitude, longitude, v18);
                   }
                }
             }
             return;
          }
       }
       Object[] objArray = new Object[0];
       a.C().w(k.n, "locationQueryInfo invalid", objArray);
       nextQueryInt = l.d;
       goto label_003d ;
    }
    public void b(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "5")) {
          return;
       }
       String n = k.n;
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       a.C().w(n, "start requestQueryInfo", objArray);
       if (this.a == null) {
          Object[] objArray1 = new Object[0];
          a.C().w(n, "mShouldQuery is false", objArray1);
          return;
       }else if(this.i != null && !this.i.isDisposed()){
          this.i.dispose();
       }
       t.just(Boolean.TRUE).observeOn(d.c).subscribe(new i(this, p0));
       return;
    }
}
