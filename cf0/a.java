package cf0.a;
import yt5.j;
import java.lang.Object;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import wkd.b;
import hf0.a;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import java.lang.CharSequence;
import zsd.u;
import ig0.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import ff0.f;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import brd.t;
import t45.d;
import brd.z;
import ff0.c;
import erd.g;
import crd.b;
import dg0.b;
import ff0.d;
import ff0.b;
import dg0.a;
import ff0.a;
import ff0.i;
import zt5.d;
import ff0.g;
import zt5.c;
import ff0.h;
import android.app.Application;
import o56.a;
import ff0.e;
import android.content.ComponentCallbacks;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yf0.b;
import hg0.b;
import hg0.a;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import kf0.r;

public class a implements j	// class@0004a8
{

    public void a(){
       super();
    }
    public void B3(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       b.a(0x7fa4717b).B3(p0, p1);
       return;
    }
    public void Fb(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (!uActivity instanceof GifshowActivity) {
          uActivity = null;
       }
       if (uActivity != null) {
          int page = uActivity.getPage();
          String str = uActivity.o();
          c uoc = (str == null || u.S1(str))? 1: null;
          if (uoc) {
             ClientEvent$UrlPackage urlPackage = c.a.a(uActivity);
             if (urlPackage != null) {
                page = urlPackage.page;
                str = urlPackage.page2;
             }
          }
          this.mg(uActivity, page, str, null);
       }
       return;
    }
    public void OK(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       if (!p0 instanceof GifshowActivity) {
          return;
       }
       b.a(0x7fa4717b).C3(p0);
       return;
    }
    public void P0(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       b.a(0x7fa4717b).P0(p0, p1);
       return;
    }
    public void W1(){
       RxBus f;
       z a;
       i c;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       f b = f.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoid(objArray, b, f.class, "1")) {
          f = RxBus.f;
          a = d.a;
          f.f(e.class).observeOn(a).subscribe(c.b);
          f.f(b.class).observeOn(a).subscribe(d.b);
          b b1 = b.b;
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoid(objArray, b1, b.class, "1")) {
             f.f(a.class).observeOn(a).subscribe(a.b);
          }
          c = i.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoid(objArray, c, i.class, "1")) {
             f.f(d.class).observeOn(a).subscribe(g.b);
             f.f(c.class).observeOn(a).subscribe(h.b);
          }
          a.b().registerComponentCallbacks(new e());
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean mg(GifshowActivity p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "activity");
       return b.a(0x7fa4717b).D3(p0, p1, p2, p3, false);
    }
    public boolean ql(Activity p0,int p1,String p2){
       b obj;
       boolean b;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "activity");
       obj = b.a(0x686d9295).D();
       b = (obj instanceof a && r.a(p0, obj.g(), p1, p2, null))? true: false;
       return b;
    }
}
