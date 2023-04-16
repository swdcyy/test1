package com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$c;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import bi2.e;
import bi2.c;
import ai2.b;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$f;
import java.lang.reflect.Type;
import el.a;
import d61.l0;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$1;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import ah1.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.gift.base.model.Model$b;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$a;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$b;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import msd.a;
import ci2.b;
import ci2.b$a;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$d;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$e;
import pp.c;
import java.util.HashSet;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;

public final class LiveRichCardStateManager	// class@000f6f
{
    public static final c a;
    public static final boolean b;
    public static final e c;
    public static final c d;
    public static final b e;
    public static b f;
    public static final l0 g;
    public static final LiveRichCardStateManager h;

    static {
       LiveRichCardStateManager.h = new LiveRichCardStateManager();
       LiveRichCardStateManager.a = LiveRichCardStateManager$c.b;
       LiveRichCardStateManager.b = a.t().u("SOURCE_LIVE").d("disableRichDialogOptimize", false) ^ 0x01;
       LiveRichCardStateManager.c = new e();
       c uoc = new c();
       LiveRichCardStateManager.d = uoc;
       LiveRichCardStateManager.e = new b();
       LiveRichCardStateManager.g = l0.g("LiveRichCardEffectHasShown", new LiveRichCardStateManager$f().getType());
       LiveRichCardStateManager$1 u1 = new LiveRichCardStateManager$1();
       Objects.requireNonNull(uoc);
       if (PatchProxy.applyVoidOneRefs(u1, uoc, Model.class, "2")) {
       }else {
          a.p(u1, "observer");
          if (!uoc.c.containsKey(u1)) {
             b uob = new b(u1);
             uoc.d.observeForever(uob);
             uoc.c.put(u1, new Model$b(null, uob));
          }
       }
       RxBus.f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(LiveRichCardStateManager$a.b, LiveRichCardStateManager$b.b);
    }
    public void LiveRichCardStateManager(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveRichCardStateManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableReportAutoGrabProperty", true);
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, LiveRichCardStateManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableRichCardBussiness", false);
    }
    public final b c(String p0,String p1,String p2,Long p3,Integer p4,a p5){
       b obj;
       LiveRichCardStateManager liveRichCard = LiveRichCardStateManager.class;
       if (PatchProxy.isSupport(liveRichCard)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, liveRichCard, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activityBiz");
       a.p(p1, "visitorId");
       a.p(p2, "liveStreamId");
       a.p(p5, "onNext");
       obj = b.a.a();
       long l = (p3 != null)? p3.longValue(): 0;
       b uob = obj.a(p0, p2, l, p4).map(new e()).subscribe(new LiveRichCardStateManager$d(p5), LiveRichCardStateManager$e.b);
       a.o(uob, "LiveRichCardApiService.g¡­wFailToast\(it\)\n        }\)");
       return uob;
    }
    public final boolean d(){
       return LiveRichCardStateManager.b;
    }
    public final e e(){
       return LiveRichCardStateManager.c;
    }
    public final c f(){
       return LiveRichCardStateManager.a;
    }
    public final void g(long p0,boolean p1){
       LiveRichCardStateManager liveRichCard = LiveRichCardStateManager.class;
       if (PatchProxy.isSupport(liveRichCard) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), this, liveRichCard, "8")) {
          return;
       }
       l0 g = LiveRichCardStateManager.g;
       HashSet hashSet = g.b(new HashSet());
       if (p1) {
          hashSet.add(Long.valueOf(p0));
       }else {
          hashSet.remove(Long.valueOf(p0));
       }
       g.i(hashSet);
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, LiveRichCardStateManager.class, "2")) {
          return;
       }
       b f = LiveRichCardStateManager.f;
       if (f != null) {
          f.dispose();
       }
       return;
    }
    public final void i(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardStateManager.class, "12")) {
          return;
       }
       a.p(p0, "t");
       if (p0 instanceof KwaiException && !TextUtils.x(p0.mErrorMessage)) {
          i.d(R.style.arg_RES_7f110668, p0.mErrorMessage);
       }
       return;
    }
}
