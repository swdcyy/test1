package ou1.g;
import ju1.a;
import zs1.b;
import java.lang.String;
import du1.d;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import ut1.f;
import java.util.Map;
import cu1.d;
import ou1.g$a;
import z0.a;
import androidx.lifecycle.Transformations;
import ou1.g$b;
import ou1.g$c;
import ou1.g$d;
import ou1.g$e;
import ou1.g$f;
import ou1.g$g;
import ou1.g$h;
import ou1.g$i;
import ou1.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ou1.v$a;
import ut1.k;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import p63.a;
import p63.a$a;
import p63.a$b;
import o63.d;
import java.util.ArrayList;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import gu1.a;
import java.lang.Integer;
import gu1.g;
import java.util.List;
import java.lang.Runnable;
import java.util.concurrent.Future;
import pu1.g;

public final class g extends a	// class@00359c
{
    public final String g;
    public final LiveData h;
    public final LiveData i;
    public final LiveData j;
    public final LiveData k;
    public final LiveData l;
    public final LiveData m;
    public final LiveData n;
    public long o;
    public final LiveData p;
    public final LiveData q;
    public final d r;

    public void g(b p0,String p1,d p2){
       a.p(p0, "pkCoreModel");
       a.p(p1, "viewKey");
       a.p(p2, "renderDelegate");
       super(p0, p1);
       this.r = p2;
       f value = this.v0().getValue();
       Map map = (value != null)? value.l(): null;
       this.g = d.f(p1, map);
       LiveData liveData = Transformations.map(d.a(this.v0()), new g$a(this, p1));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(d.a(liveData));
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.h = liveData;
       liveData = Transformations.map(d.a(this.v0()), new g$b(p1));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.i = liveData;
       liveData = Transformations.map(d.a(this.v0()), new g$c(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(d.a(liveData));
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.j = liveData;
       liveData = Transformations.map(d.a(this.v0()), new g$d(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(d.a(liveData));
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.k = liveData;
       liveData = Transformations.map(d.a(this.v0()), new g$e(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.l = liveData;
       liveData = Transformations.map(d.a(this.w0()), new g$f(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.m = d.a(liveData);
       liveData = Transformations.map(d.a(this.w0()), new g$g(this, p1));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(d.a(liveData));
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.n = liveData;
       liveData = Transformations.map(d.a(this.v0()), new g$h(this, p1));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.p = liveData;
       liveData = Transformations.map(d.a(this.v0()), new g$i(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.q = liveData;
       return;
    }
    public final LiveData A0(){
       return this.p;
    }
    public final LiveData C0(){
       return this.q;
    }
    public void D0(v p0){
       boolean b;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "3")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof v$a) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, og, "4")) {
             f value = this.v0().getValue();
             if (value != null) {
                Map map = value.l();
                if (map != null) {
                   k ok = map.get(this.g);
                   if (ok != null) {
                      b = ok.c();
                   label_0041 :
                      b.Z(LiveCommonLogTag.MULTI_PK, "openContributePanelIntent "+b);
                      if (b) {
                         value = this.v0().getValue();
                         g tg = this.g;
                         String str = this.x0();
                         String str1 = this.r.j1();
                         Object obj = PatchProxy.applyFourRefs(value, tg, str, str1, null, d.class, "11");
                         if (obj != PatchProxyResult.class) {
                            objArray = obj;
                         }else {
                            a.p(str, "userId");
                            a.p(str1, "userInfo");
                            if (value != null) {
                               int i1 = 1;
                               if (value.h() != i1) {
                                  i1 = 2;
                               }
                               a$a uoa = a.b.a().a("multiPkId", value.e());
                               if (tg == null) {
                                  tg = "";
                               }
                               objArray = uoa.a("teamId", tg).a("authorId", str).a("pkMode", String.valueOf(i1)).a("currentUser", str1).b();
                            }
                         }
                         if (objArray != null) {
                            this.r.r1(objArray);
                            f value1 = this.v0().getValue();
                            if (value1 != null) {
                               ArrayList uArrayList = new ArrayList();
                               uArrayList.add(this.x0());
                               int i = value1.h();
                               e0 uoe0 = this.r.i();
                               ClientContent$LiveStreamPackage liveStreamPa = this.r.a();
                               if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i), uoe0, liveStreamPa, uArrayList, null, a.class, "15")) {
                                  a.p(uoe0, "logPage");
                                  a.p(liveStreamPa, "liveStreamPackage");
                                  a.p(uArrayList, "userList");
                                  g.a(new g(i, uoe0, liveStreamPa, uArrayList));
                               }
                            }
                         }
                      }
                   }
                }
             }
             b = false;
             goto label_0041 ;
          }
       }
    label_012f :
       return;
    }
    public final LiveData z0(){
       return this.i;
    }
}
