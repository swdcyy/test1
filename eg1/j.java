package eg1.j;
import eg1.e;
import lp3.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.util.Set;
import com.google.common.collect.o;
import eg1.j$b;
import eg1.j$a;
import lz2.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import iy2.v;
import pz2.e;
import pz2.c;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import eg1.o;
import java.lang.StringBuilder;
import pz2.a;
import com.kuaishou.android.live.log.b;
import xy2.a;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import trd.u;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$a;
import zf1.d;
import qrd.l1;
import iy2.f;
import com.kuaishou.live.common.core.component.effect.multieffect.LiveMultiMagicEffectManager$addEffectTask$3;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Boolean;
import lp3.e;
import xp5.g;
import lp3.c;
import rp5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import va1.g;
import eg1.n;
import va1.g$a;
import iy2.f$a;
import nz2.h;
import java.lang.Long;
import w51.a;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchInfo;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchContainer;
import eg1.b;
import pz2.g;
import uy2.a;
import eg1.k;
import eg1.l;
import eg1.m;
import uy2.a$a;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$MagicFaceConfig;
import s81.a;
import rz2.f$a;
import cg1.b;
import rz2.e;
import rz2.f;
import iy2.d;
import zf1.b;
import java.util.Objects;
import java.util.Collection;
import java.lang.Number;
import iy2.v$c;
import java.lang.Integer;
import eg1.i;
import lnc.c3$a;
import lnc.c3;
import eg1.h;
import eg1.g;
import java.util.Collections;
import m56.f;
import m56.g;
import java.util.Map;
import pz2.j;
import eg1.f;
import eg1.d;
import ixc.c;
import lnc.pa;
import lnc.qa;

public class j extends a implements e	// class@002154
{
    public e d;
    public v e;
    public boolean f;
    public final Set g;
    public final Set h;
    public final Set i;
    public long j;
    public LiveMultiMagicEffectManager k;
    public b l;
    public final Set m;
    public final Set n;
    public final j$b o;
    public b p;
    public static final List q;

    static {
       j.q = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectServiceImpl");
    }
    public void j(){
       super();
       this.f = false;
       this.g = o.g();
       this.h = o.g();
       this.i = o.g();
       this.m = o.g();
       this.n = o.g();
       this.o = new j$b(null);
    }
    public void B0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "11")) {
          return;
       }
       this.g.add(p0);
       return;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       j te = this.e;
       if (te != null) {
          te.d();
       }
       return;
    }
    public void Em(e p0){
       this.d = p0;
    }
    public c H(){
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          objArray = obj.e();
       }
       return objArray;
    }
    public void H0(List p0){
       j oj1;
       Object obj = this;
       Iterator obj1 = p0;
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, oj, "4")) {
          return;
       }
       ArrayList obj2 = PatchProxy.applyOneRefs(obj1, obj, oj, "17");
       if (obj2 != PatchProxyResult.class) {
          obj1 = obj2;
       }else if(obj.i.isEmpty()){
          obj2 = new ArrayList();
          obj1 = p0.iterator();
          while (obj1.hasNext()) {
             c uoc1 = obj1.next();
             Iterator iterator3 = obj.i.iterator();
             while (true) {
                if (iterator3.hasNext()) {
                   o oo = iterator3.next();
                   if (!oo.a(uoc1)) {
                      b.Z(LiveLogTag.LIVE_EFFECT, "magicFace:"+uoc1.b()+" has been filtered by "+oo.getName());
                      oj1 = null;
                   }
                }else {
                   oj1 = 1;
                }
                if (oj1) {
                   obj2.add(uoc1);
                }else {
                   continue ;
                }
             }
          }
          obj1 = obj2;
       }
       obj2 = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       obj1 = obj1.iterator();
       while (obj1.hasNext()) {
          c uoc = obj1.next();
          if (uoc instanceof a) {
             uArrayList.add(uoc);
          }else {
             obj2.add(uoc);
          }
       }
       v ov = this.So();
       if (ov != null && !obj2.isEmpty()) {
          ov.b(obj2);
       }
       LiveMultiMagicEffectManager liveMultiMag = this.To();
       if (liveMultiMag == null || (!uArrayList.isEmpty() && !PatchProxy.applyVoidOneRefs(uArrayList, liveMultiMag, LiveMultiMagicEffectManager.class, "1"))) {
          a.p(uArrayList, "taskList");
          ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (!PatchProxy.applyVoidOneRefs(uoa, liveMultiMag, LiveMultiMagicEffectManager.class, "2")) {
                a.p(uoa, "task");
                LiveMultiMagicEffectManager.k.b("[addEffectTask]taskId:"+uoa.N()+",magicFaceId:"+uoa.b());
                LiveMultiMagicEffectManager d = liveMultiMag.d;
                ArrayList uArrayList2 = new ArrayList(u.Y(d, 10));
                Iterator iterator1 = d.iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().g(uoa);
                   uArrayList2.add(l1.a);
                }
                if (liveMultiMag.b(uoa, liveMultiMag.c)) {
                   String str = "[addEffectTask]banned magicFaceId:"+uoa.b()+",hit:"+liveMultiMag.c.b((long)0xdb9ff);
                   LiveMultiMagicEffectManager.k.b(str);
                   LiveMultiMagicEffectManager d1 = liveMultiMag.d;
                   ArrayList uArrayList3 = new ArrayList(u.Y(d1, 10));
                   Iterator iterator2 = d1.iterator();
                   while (iterator2.hasNext()) {
                      iterator2.next().f(uoa, true, true, str);
                      uArrayList3.add(l1.a);
                   }
                }else {
                   a.f(liveMultiMag.f, null, null, new LiveMultiMagicEffectManager$addEffectTask$3(liveMultiMag, uoa, null), 3, null);
                }
             }
             uArrayList1.add(l1.a);
          }
       }
       return;
    }
    public void Mj(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!this.i.remove(p0)) {
          b.B(LiveLogTag.LIVE_EFFECT, "removeEffectTaskFilter error! filter do not exist!");
       }
       return;
    }
    public void Qo(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "1")) {
          return;
       }
       LiveConfigStartupResponse$LiveAudienceGiftConfig liveAudience = a.s(LiveConfigStartupResponse$LiveAudienceGiftConfig.class);
       if (liveAudience != null) {
          this.f = liveAudience.mDisableGiftEffect;
       }
       b.c0(LiveLogTag.LIVE_EFFECT, "setIsEffectDisabled", "mIsEffectDisabled", Boolean.valueOf(this.f));
       if (!PatchProxy.applyVoid(objArray, this, oj, "30") && !this.Po().a(g.class).e()) {
          g og = new g(new n(this), this.Po().a(a.class).t().getLifecycle(), this.Po().c(LiveSlidePlayService.class));
       }
       this.B0(this.o);
       return;
    }
    public void R2(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "13")) {
          return;
       }
       this.h.add(p0);
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       j te = this.e;
       if (te != null) {
          te.h();
       }
       te = this.k;
       if (te != null) {
          te.c();
          this.k = null;
       }
       h.a();
       this.g1(this.o);
       return;
    }
    public void S0(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "8")) {
          return;
       }
       this.j = this.j | p0;
       v ov = this.So();
       if (ov != null) {
          ov.a(p0);
       }
       LiveMultiMagicEffectManager liveMultiMag = this.To();
       if (liveMultiMag != null) {
          liveMultiMag.a(p0);
       }
       return;
    }
    public final v So(){
       LiveEffectDownloadSwitchInfo enableFetchR;
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object[] objArray = null;
       LiveEffectDownloadSwitchInfo obj = PatchProxy.apply(objArray, this, oj, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (a.E()) {
          return objArray;
       }
       if (this.f != null) {
          return objArray;
       }
       if (this.e == null && this.d != null) {
          j tp = this.p;
          obj = PatchProxy.applyOneRefs(tp, this, oj, "19");
          if (obj != patchProxyRe) {
          }else {
             g og = this.Po().a(g.class);
             LiveEffectDownloadSwitchInfo dEFAULT = LiveEffectDownloadSwitchInfo.DEFAULT;
             if (!og.e()) {
                if (tp == null) {
                   enableFetchR = LiveEffectDownloadSwitchContainer.getMatchedSwitchInfo();
                   b.c0(LiveLogTag.LIVE_EFFECT, "[getLiveEffectSwitchInfo]: configService is null", "switchInfo", enableFetchR);
                }else {
                   enableFetchR = this.p.a(og.getLiveStreamId());
                }
                obj = enableFetchR;
             }else {
                obj = dEFAULT;
             }
          }
          enableFetchR = obj.enableFetchResourceWhenEnqueue;
          if (PatchProxy.isSupport(oj)) {
             uoa = PatchProxy.applyOneRefs(Boolean.valueOf(enableFetchR), this, oj, "20");
             if (uoa != patchProxyRe) {
             label_008d :
                LiveCommonConfigResponse$MagicFaceConfig magicFaceCon = a.x(LiveCommonConfigResponse$MagicFaceConfig.class);
                f$a uoa1 = new f$a();
                uoa1.e((long)magicFaceCon.surviveTimeoutMs);
                uoa1.c(magicFaceCon.maxSurvivePoolSize);
                uoa1.b(obj.enableSurviveEffectTaskWhenDequeue);
                uoa1.d(b.b());
                f uof = uoa1.a();
                v ov = new v(this.d, uoa, uof, new j$a(this));
                this.e = ov;
                j tj = this.j;
                if (tj) {
                   ov.a(tj);
                }
             }
          }
          uoa = new a(new k(this), new l(this), new m(this), enableFetchR);
          goto label_008d ;
       }
    label_00cc :
       return this.e;
    }
    public final LiveMultiMagicEffectManager To(){
       Object[] objArray = null;
       LiveMultiMagicEffectManager obj = PatchProxy.apply(objArray, this, j.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.E()) {
          return objArray;
       }
       if (this.f != null) {
          return objArray;
       }
       if (this.l == null) {
          return objArray;
       }
       if (this.k == null) {
          obj = new LiveMultiMagicEffectManager(this.l);
          this.k = obj;
          obj.a(this.j);
          j tk = this.k;
          j tm = this.m;
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoidOneRefs(tm, tk, LiveMultiMagicEffectManager.class, "4")) {
             a.p(tm, "listeners");
             tk.d.addAll(tm);
          }
       }
       return this.k;
    }
    public void X5(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "14")) {
          return;
       }
       this.h.remove(p0);
       return;
    }
    public void cj(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "22")) {
          return;
       }
       this.m.remove(p0);
       j tk = this.k;
       if (tk != null) {
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoidOneRefs(p0, tk, LiveMultiMagicEffectManager.class, "5")) {
             a.p(p0, "listener");
             tk.d.remove(p0);
          }
       }
       return;
    }
    public long e3(long p0){
       v obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, oj, "15");
          if (obj != patchProxyRe) {
             return obj.longValue();
          }
       }
       obj = this.So();
       if (obj != null) {
          v ov = v.class;
          if (PatchProxy.isSupport(ov)) {
             Object obj1 = PatchProxy.applyOneRefs(Long.valueOf(p0), obj, ov, "6");
             if (obj1 != patchProxyRe) {
                p0 = obj1.longValue();
             label_0044 :
                return p0;
             }
          }
          p0 = obj.a.b(p0);
          goto label_0044 ;
       }else {
          return 0;
       }
    }
    public void g1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "12")) {
          return;
       }
       this.g.remove(p0);
       return;
    }
    public void g7(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "5")) {
          return;
       }
       if (p0 != null) {
          this.i.add(p0);
       }
       return;
    }
    public void gg(v$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "26")) {
          return;
       }
       j te = this.e;
       if (te != null) {
          te.l(p0);
       }else {
          p0.a(null);
       }
       return;
    }
    public void hd(int p0,c p1,String p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, j.class, "23")) {
          return;
       }
       if (p0 == 2) {
          c3.c(this.d, new i(p2));
       }else if(p0 == 1){
          c3.c(this.d, new h(p1, p2));
       }
       return;
    }
    public void j1(long p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oj, "9")) {
          return;
       }
       this.j = this.j & (~ p0);
       oj = this.e;
       if (oj != null) {
          oj.i(p0);
       }
       oj = this.k;
       if (oj != null) {
          Objects.requireNonNull(oj);
          LiveMultiMagicEffectManager liveMultiMag = LiveMultiMagicEffectManager.class;
          if (!PatchProxy.isSupport(liveMultiMag) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), oj, liveMultiMag, "8")) {
             LiveMultiMagicEffectManager.k.b("removeEffectBannedBizBit:"+p0);
             oj.c.c(p0);
          }
       }
       return;
    }
    public void k6(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "21")) {
          return;
       }
       this.m.add(p0);
       j tk = this.k;
       if (tk != null) {
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoidOneRefs(p0, tk, LiveMultiMagicEffectManager.class, "3")) {
             a.p(p0, "listener");
             tk.d.add(p0);
          }
       }
       return;
    }
    public void n5(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "25")) {
          return;
       }
       c3.c(this.d, new g(p0));
       return;
    }
    public void o1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       this.H0(Collections.singletonList(p0));
       return;
    }
    public long of(){
       return this.j;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "28")) {
          return;
       }
       this.S0(2048);
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "29")) {
          return;
       }
       this.j1(2048);
       return;
    }
    public void tm(int p0,c p1,int p2,Map p3,j p4){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oj, "24")) {
             return;
          }
       }
       if (p2 == 2) {
          c3.c(this.d, new f(p0, p2, p3, p4));
       }
       return;
    }
    public void xg(b p0){
       this.l = p0;
    }
    public d yo(){
       c obj = PatchProxy.apply(null, this, j.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = qa.r(c.class);
       int i = -1;
       if (obj != null) {
          i = obj.s9();
       }
       return new d(i);
    }
}
