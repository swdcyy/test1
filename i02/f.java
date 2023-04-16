package i02.f;
import zd1.g;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.follow.cache.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import t45.d;
import brd.z;
import i02.e;
import erd.g;
import crd.b;
import com.kwai.framework.model.user.User;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import jga.c;
import wca.b;
import y41.i$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y41.i;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import lp3.c;
import lp3.b;
import zd1.a;
import lnc.b9;

public class f implements g	// class@0027ee
{
    public final Activity b;
    public final String c;
    public a d;
    public final String e;
    public LiveStreamFeedWrapper f;
    public b g;

    public void f(LiveStreamFeedWrapper p0,String p1,Activity p2,String p3){
       super();
       this.f = p0;
       this.b = p2;
       this.c = p1;
       this.e = p3;
    }
    public void Di(String p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "5")) {
          return;
       }
       c.b().f(p0, p1);
       return;
    }
    public void Pf(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       if (this.g == null) {
          this.g = RxBus.f.f(n.class).observeOn(d.a).subscribe(new e(this));
       }
       return;
    }
    public void Sn(User p0,g p1,g p2,int p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, f.class, "1")) {
          return;
       }
       LiveStreamFeedWrapper liveStreamFe = null;
       f tf = this.f;
       if (tf != null) {
          liveStreamFe = b.c(tf.mEntity);
       }
       i$a uoa = new i$a(this.b, this.e);
       uoa.o(p0);
       uoa.m(this.c);
       uoa.n(p3);
       uoa.r(true);
       uoa.j(p1);
       i$a uoa1 = uoa.i(p2);
       if (liveStreamFe != null) {
          uoa1.f(liveStreamFe);
       }
       if (p3 == 116) {
          uoa1.k(159);
       }
       uoa1.a().c();
       return;
    }
    public t Zg(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b().d(p0).take(1);
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void hg(a p0){
       this.d = p0;
    }
    public void onEventMainThread(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       f td = this.d;
       if (td != null) {
          td.a(p0.d, p0.c, p0.b);
       }
       return;
    }
    public void qd(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       b9.a(this.g);
       this.g = null;
       return;
    }
}
