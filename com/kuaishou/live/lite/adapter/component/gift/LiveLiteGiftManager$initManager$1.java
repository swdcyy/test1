package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initManager$1;
import msd.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import kotlin.jvm.internal.a;
import l73.c0;
import l73.d0;
import l73.e0;
import l73.f0;
import l73.g0;
import l73.h0;
import l73.i0;
import l73.j0;
import l73.k0;
import z1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import vq5.d;
import aq5.d;
import v51.a;
import zg1.g;
import zg1.l;
import zg1.e;
import zg1.d;
import zg1.b;
import pi1.a;
import om1.e;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import ih1.l;
import yi1.a;
import ni1.d;

public final class LiveLiteGiftManager$initManager$1 extends FunctionReferenceImpl implements a	// class@001da8
{

    public void LiveLiteGiftManager$initManager$1(LiveLiteGiftManager p0){
       super(0, p0, LiveLiteGiftManager.class, "tryInitGiftBoxManager", "tryInitGiftBoxManager\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       LiveLiteGiftManager obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, LiveLiteGiftManager$initManager$1.class, "1")) {
          return;
       }
       CallableReference receiver = obj.receiver;
       Objects.requireNonNull(receiver);
       if (!PatchProxy.applyVoid(objArray, receiver, LiveLiteGiftManager.class, "9") && receiver.q == null) {
          LifecycleOwner lifecycleOwn = receiver.a();
          LiveLiteGiftManager s = receiver.S;
          LiveLiteGiftManager n = receiver.N;
          LiveLiteGiftManager i = receiver.I;
          LiveLiteGiftManager f = receiver.f;
          if (f == null) {
             a.S("fragmentServiceAdapter");
          }
          LiveLiteGiftManager h = receiver.h;
          if (h == null) {
             a.S("userStatusServiceAdapter");
          }
          LiveLiteGiftManager c = receiver.c;
          if (c == null) {
             a.S("dialogServiceAdapter");
          }
          LiveLiteGiftManager d = receiver.d;
          if (d == null) {
             a.S("dialogNotifyServiceAdapter");
          }
          c0 b = c0.b;
          LiveLiteGiftManager g = receiver.g;
          if (g == null) {
             a.S("backPressedDispatcherAdapter");
          }
          d0 uod0 = new d0(receiver);
          e0 uoe0 = new e0(receiver);
          f0 uof0 = new f0(receiver);
          h0 b1 = h0.b;
          i0 b2 = i0.b;
          g0 og0 = new g0(receiver);
          LiveLiteGiftManager liveLiteGift = receiver.e1;
          obj = receiver.j;
          if (obj == null) {
             a.S("giftSendModel");
          }
          LiveLiteGiftManager liveLiteGift1 = obj;
          k0 b3 = k0.b;
          j0 oj0 = new j0(receiver);
          k ok = receiver.d();
          LiveLiteGiftManager liveLiteGift2 = receiver.m;
          obj = receiver.i;
          if (obj == null) {
             a.S("giftBoxDisableModel");
          }
          LiveGiftBoxManager liveGiftBoxM = new LiveGiftBoxManager(lifecycleOwn, s, n, i, f, h, c, d, b, g, uoe0, uof0, og0, b1, b2, uod0, liveLiteGift, liveLiteGift1, oj0, b3, liveLiteGift2, obj, ok, receiver.h1, receiver.i1.invoke());
          receiver.q = objArray;
       }
       return;
    }
}
