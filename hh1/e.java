package hh1.e;
import hh1.j;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hh1.d;
import yg1.e;
import yg1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dh1.f;
import dh1.e;
import eh1.c;
import brd.t;
import kotlin.jvm.internal.Ref$BooleanRef;
import rm1.g;
import crd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import yg1.f;
import java.lang.Long;
import java.lang.Boolean;
import java.util.concurrent.TimeUnit;
import brd.z;
import hh1.e$a;
import erd.o;
import t45.d;
import hh1.e$b;
import hh1.e$c;
import erd.g;

public final class e extends j	// class@0026b5
{
    public b b;
    public final d c;
    public f d;
    public final LiveGiftPanelConfig e;

    public void e(LiveGiftPanelConfig p0){
       a.p(p0, "config");
       super();
       this.e = p0;
       this.c = new d(p0);
    }
    public void a(String p0,e p1,a p2){
       e b1;
       Ref$BooleanRef uBooleanRef1;
       Object uBooleanRef2;
       b obj2;
       e uoe = this;
       Object obj = p0;
       Object obj1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "1")) {
          return;
       }
       String str = "source";
       a.p(obj, str);
       a.p(p1, "request");
       a.p(obj1, "callback");
       t ot = e.b().a(p1.a().c, p1.a().a(), p1.a().d);
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       boolean b = false;
       uBooleanRef.element = b;
       if (g.a()) {
          if (p1.a().e != null) {
             b1 = uoe.b;
             if (b1 != null) {
                a.m(b1);
                if (!b1.isDisposed()) {
                   b.c0(LiveLogTag.GIFT, "[GiftOpt][LiveGiftPanelNormalPagerNetworkDataSource] isPrefetch and disposable isn`t null", str, obj);
                   return;
                }
             }
          }
          e b2 = uoe.b;
          if (b2 != null) {
             b2.dispose();
          }
          int i = 1;
          boolean b3 = (uoe.e.e("NormalGift") == 2)? true: false;
          if (b3) {
             b1 = uoe.d;
             if (b1 != null && b1.e() == i) {
                b = true;
             }
          }
          uBooleanRef.element = b;
          long l = (b)? g.e(): g.d();
          uBooleanRef1 = uBooleanRef;
          uBooleanRef2 = obj1;
          obj2 = obj;
          b.f0(LiveLogTag.GIFT, "[GiftOpt][LiveGiftPanelNormalPagerNetworkDataSource]", "timeout", Long.valueOf(l), "isSyncModeAndCacheAvailable", Boolean.valueOf(uBooleanRef.element), "isSyncMode", Boolean.valueOf(b3), "source", p0);
          ot = ot.timeout(l, TimeUnit.MILLISECONDS);
       }else {
          uBooleanRef1 = uBooleanRef;
          uBooleanRef2 = obj1;
          obj2 = obj;
       }
       obj2 = ot.observeOn(uoe.e.a()).map(new e$a(uoe)).observeOn(d.a).subscribe(new e$b(uoe, uBooleanRef2, obj2), new e$c(uoe, uBooleanRef1, uBooleanRef2, obj2));
       uoe.b = obj2;
       if (obj2 != null) {
          uoe.b(obj2);
       }
       return;
    }
}
