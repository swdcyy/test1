package dn2.e;
import dn2.a;
import android.database.Observable;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.lang.String;
import java.io.File;
import dn2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import en2.i;
import lnc.a1;
import com.kuaishou.live.core.show.wishlight.download.base.a;
import en2.a;
import dn2.e$a;
import dn2.c;
import dn2.c$b;
import dn2.c$e;
import dn2.a$a;
import com.yxcorp.gifshow.model.CDNUrl;
import dn2.g;
import java.util.List;
import dn2.e$b;
import com.kuaishou.live.core.show.wishlight.download.base.a$a;
import com.kuaishou.live.core.show.wishlight.download.base.LiveAvatarFailType;
import java.lang.Throwable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class e extends Observable implements a	// class@00255c
{
    public a a;
    public a b;
    public final c c;
    public final c$e d;
    public static final String e;

    static {
       e.e = b.a(-1504323719).c("wish_light_avatar_cache").getAbsolutePath();
    }
    public void e(long p0){
       super();
       d uod = new d(this);
       this.d = uod;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "1")) {
       }else {
          i oi = new i(e.e);
          oi.f(false);
          oi.e(false);
          float f = (float)a.t().u("SOURCE_LIVE").b("liveWishLightAvatarImageSize", 70);
          int i = a1.e(f);
          oi.g(i, a1.e(f));
          oi.b = 5000;
          this.a = oi.a();
       }
       if (!PatchProxy.applyVoid(objArray, this, e.class, "2")) {
          a uoa = b.a(0x6a944c7d);
          this.b = uoa;
          uoa.a(e.e);
       }
       this.c = new c(p0, new e$a(this), uod);
       return;
    }
    public void a(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       this.unregisterObserver(p0);
       return;
    }
    public void b(CDNUrl[] p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       g og = new g(p1, p0);
       e tc = this.c;
       _monitor_enter(tc);
       if (PatchProxy.applyVoidOneRefs(og, tc, c.class, "1")) {
          _monitor_exit(tc);
       }else {
          tc.a.add(og);
          if ((long)tc.a.size() - tc.b > 0) {
             tc.f.a(tc.a.remove(0));
          }
          tc.b();
          _monitor_exit(tc);
       }
       return;
    }
    public void c(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.registerObserver(p0);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       e tc = this.c;
       _monitor_enter(tc);
       if (PatchProxy.applyVoid(null, tc, c.class, "4")) {
          _monitor_exit(tc);
       }else {
          tc.a.clear();
          _monitor_exit(tc);
       }
       this.a.clear();
       this.b.clear();
       return;
    }
    public void d(CDNUrl[] p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "7")) {
          return;
       }
       this.a.a(p0, new e$b(this, new g(p1, p0)));
       return;
    }
    public void e(g p0,LiveAvatarFailType p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e.class, "10")) {
          return;
       }
       Observable tmObservers = this.mObservers;
       _monitor_enter(tmObservers);
       _monitor_exit(tmObservers);
       Iterator iterator = new ArrayList(this.mObservers).iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1, p2, p3);
       }
       return;
    }
    public void f(g p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "9")) {
          return;
       }
       Observable tmObservers = this.mObservers;
       _monitor_enter(tmObservers);
       _monitor_exit(tmObservers);
       Iterator iterator = new ArrayList(this.mObservers).iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
}
