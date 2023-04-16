package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initManager$18;
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
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bar.vipgrade.LiveVipGradeNavigationManager;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import kotlin.jvm.internal.a;
import l73.l0;
import l73.m0;
import v51.a;
import zg1.l;
import zg1.e;
import z1.k;

public final class LiveLiteGiftManager$initManager$18 extends FunctionReferenceImpl implements a	// class@001da7
{

    public void LiveLiteGiftManager$initManager$18(LiveLiteGiftManager p0){
       super(0, p0, LiveLiteGiftManager.class, "tryInitVipGradeNavigationManager", "tryInitVipGradeNavigationManager\(\)V", 0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteGiftManager$initManager$18.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoid(objArray, treceiver, LiveLiteGiftManager.class, "12") && treceiver.C == null) {
          LifecycleOwner lifecycleOwn = treceiver.a();
          LiveLiteGiftManager i = treceiver.I;
          LiveLiteGiftManager h = treceiver.h;
          if (h == null) {
             a.S("userStatusServiceAdapter");
          }
          LiveLiteGiftManager c = treceiver.c;
          if (c == null) {
             a.S("dialogServiceAdapter");
          }
          LiveVipGradeNavigationManager liveVipGrade = new LiveVipGradeNavigationManager(lifecycleOwn, i, h, c, new l0(treceiver), new m0(treceiver));
          treceiver.C = objArray;
       }
       return;
    }
}
