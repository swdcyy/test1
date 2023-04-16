package com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import aq5.d;
import zg1.l;
import zg1.e;
import z1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import om1.e;
import th1.b;
import xh1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import oh1.a;
import sh1.a;
import nsd.u;
import yh1.a;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$c;
import uh1.a;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$1;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$2;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$3;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$4;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$a;
import msd.p;
import msd.l;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$6;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$7;
import com.kuaishou.live.common.core.component.gift.base.inject.LiveDialogAdapterType;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$b;
import zg1.a;
import zg1.c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import n2.a;
import java.util.Objects;
import qi1.b;
import th1.a;
import zca.s;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager$d;
import erd.g;
import crd.b;
import eoc.f;

public final class LiveComboManager implements DefaultLifecycleObserver	// class@001170
{
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public b f;
    public final LiveComboManager$c g;
    public final LifecycleOwner h;
    public final d i;
    public final l j;
    public final e k;
    public final k l;
    public final k m;
    public final k n;
    public final k o;
    public final LiveGiftSendModel p;
    public final e q;
    public final b r;
    public final a s;

    public void LiveComboManager(LifecycleOwner p0,d p1,l p2,e p3,k p4,k p5,k p6,k p7,LiveGiftSendModel p8,e p9,b p10,a p11){
       LiveComboManager liveComboMan = this;
       Object obj = p0;
       a obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       Object obj4 = p4;
       Object obj5 = p5;
       Object obj6 = p6;
       Object obj7 = p7;
       Object obj8 = p8;
       Object obj9 = p9;
       Object obj10 = p10;
       Object obj11 = p11;
       a.p(obj, "lifecycleOwner");
       a.p(obj1, "liveBizRelationManager");
       a.p(obj2, "userStatusServiceAdapter");
       a.p(obj3, "dialogServiceAdapter");
       a.p(obj4, "liveModel");
       a.p(obj5, "liveStreamId");
       a.p(obj6, "isLandscape");
       a.p(obj7, "slotView");
       a.p(obj8, "giftSendModel");
       a.p(obj9, "sendGiftTracer");
       a.p(obj10, "comboManagerDependency");
       a.p(obj11, "giftBoxComboStateManager");
       super();
       liveComboMan.h = obj;
       liveComboMan.i = obj1;
       liveComboMan.j = obj2;
       liveComboMan.k = obj3;
       liveComboMan.l = obj4;
       liveComboMan.m = obj5;
       liveComboMan.n = obj6;
       liveComboMan.o = obj7;
       liveComboMan.p = obj8;
       liveComboMan.q = obj9;
       liveComboMan.r = obj10;
       liveComboMan.s = obj11;
       liveComboMan.b = new a();
       a uoa = new a(false, 0, 0, 0, 15, null);
       liveComboMan.d = obj1;
       uoa = new a(obj2);
       liveComboMan.e = uoa;
       liveComboMan.g = new LiveComboManager$c(liveComboMan);
       obj1 = new a(p10, p3, p9, new LiveComboManager$a(liveComboMan), obj4, new LiveComboManager$1(liveComboMan), new LiveComboManager$2(liveComboMan), new LiveComboManager$3(liveComboMan), new LiveComboManager$4(liveComboMan));
       liveComboMan.c = v15;
       uoa.b(obj, new LiveComboManager$6(liveComboMan));
       obj8.b(obj, new LiveComboManager$7(liveComboMan));
       obj3.b(LiveDialogAdapterType.SendGiftButtonPanel, new LiveComboManager$b(liveComboMan));
       p0.getLifecycle().addObserver(liveComboMan);
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboManager.class, "8")) {
          return;
       }
       a.p(p0, "source");
       LiveDialogAdapterType sendGiftButt = LiveDialogAdapterType.SendGiftButtonPanel;
       if (this.k.c(sendGiftButt)) {
          this.k.e(sendGiftButt);
          b.Z(LiveGiftTag.COMBO, "[LiveComboManager][hideComboView] "+p0);
       }else {
          b.Z(LiveGiftTag.COMBO, "[LiveComboManager][hideComboView] failed dialog not showing, "+p0);
       }
       return;
    }
    public void onCreate(LifecycleOwner p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboManager.class, str)) {
          return;
       }
       a.p(p0, "owner");
       a.a(this, p0);
       LiveComboManager tc = this.c;
       Objects.requireNonNull(tc);
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, uoa, str) && !PatchProxy.applyVoid(objArray, tc, uoa, "3")) {
          tc.e.b(LiveDialogAdapterType.SendGiftButtonPanel, tc.a);
          tc.d.a(tc.b);
          tc.d.h(tc.c);
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboManager.class, str)) {
          return;
       }
       a.p(p0, "owner");
       a.b(this, p0);
       LiveComboManager tc = this.c;
       Objects.requireNonNull(tc);
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, uoa, str) && !PatchProxy.applyVoid(objArray, tc, uoa, "4")) {
          tc.e.d(LiveDialogAdapterType.SendGiftButtonPanel, tc.a);
          tc.d.b(tc.b);
          tc.d.k(tc.c);
       }
       this.h.getLifecycle().removeObserver(this);
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboManager.class, "5")) {
          return;
       }
       a.p(p0, "owner");
       a.d(this, p0);
       this.a("onResume");
       return;
    }
    public void onStart(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboManager.class, "3")) {
          return;
       }
       a.p(p0, "owner");
       a.e(this, p0);
       this.f = f.a(s.class, new LiveComboManager$d(this));
       return;
    }
    public void onStop(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveComboManager.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       a.f(this, p0);
       this.a("onStop");
       LiveComboManager tf = this.f;
       if (tf != null) {
          tf.dispose();
       }
       return;
    }
}
