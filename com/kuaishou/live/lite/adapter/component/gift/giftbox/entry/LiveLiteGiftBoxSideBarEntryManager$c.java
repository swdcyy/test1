package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.model.LiveGiftSendWarningConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Number;
import d61.n;
import q73.a;
import d61.n$a;
import e17.i$b;
import e17.i;
import o73.c;
import qm1.d;

public final class LiveLiteGiftBoxSideBarEntryManager$c extends m	// class@001dc3
{
    public final LiveLiteGiftBoxSideBarEntryManager c;

    public void LiveLiteGiftBoxSideBarEntryManager$c(LiveLiteGiftBoxSideBarEntryManager p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       int i;
       n$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarEntryManager$c.class, "1")) {
          return;
       }
       a.p(p0, "v");
       LiveLiteGiftBoxSideBarEntryManager$c tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, LiveLiteGiftBoxSideBarEntryManager.class, "5")) {
          LiveLiteGiftBoxSideBarEntryManager c = tc.c;
          if (c == null) {
             b.Z(LiveLogTag.GIFT, "[LiveGiftBoxManager] [tryShowSendGiftToast]: mLiveGiftPanelWarningConfig is null");
          }else if(TextUtils.x(c.getWarningToast())){
             b.c0(LiveLogTag.GIFT, "[LiveGiftBoxManager] [tryShowSendGiftToast]: mLiveGiftPanelWarningConfig is error", "mLiveGiftPanelWarningConfig", tc.c);
          }else {
             c = tc.c;
             if (c != null) {
                Integer toastLimitDa = c.getToastLimitDay();
                if (toastLimitDa != null) {
                   i = toastLimitDa.intValue();
                   LiveLiteGiftBoxSideBarEntryManager c1 = tc.c;
                   if (c1 != null) {
                      Integer toastLimitCo = c1.getToastLimitCount();
                      if (toastLimitCo != null) {
                         a = n.a;
                         objArray = a.a(a.c(tc.h.a()), i, toastLimitCo.intValue());
                      }
                   }
                }
             }
             if (objArray != null && objArray.c()) {
                c = tc.c;
                if (c != null) {
                   String warningToast = c.getWarningToast();
                   if (warningToast != null) {
                      i$b uob = i.m();
                      uob.y(warningToast);
                      uob.o(tc.h.b());
                      uob.l(true);
                      i.c(R.style.arg_RES_7f11066a, uob);
                   }
                }
                objArray.b();
             }
          }
       }
       this.c.c().a();
       LiveLiteGiftBoxSideBarEntryManager d = this.c.d;
       if (d != null) {
          d.d();
       }
       return;
    }
}
