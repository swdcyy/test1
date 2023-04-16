package com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$b$b;
import bj1.c$a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager$b;
import cj1.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.LiveDiyGiftManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import aj1.d;
import java.util.Objects;
import aj1.d$a;
import d61.l0;

public final class LiveDiyGiftManager$b$b implements c$a	// class@001236
{
    public final LiveDiyGiftManager$b a;
    public final b b;

    public void LiveDiyGiftManager$b$b(LiveDiyGiftManager$b p0,b p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public boolean onError(Throwable p0){
       c obj = PatchProxy.applyOneRefs(p0, this, LiveDiyGiftManager$b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "error");
       b.I(this.a.a.c, "onSendGiftButtonClick send gift error", p0);
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       String str = obj.a().getString(R.string.arg_RES_7f101fa4);
       a.o(str, "AppEnv.get\(\).appContext.¡­ombo_gift_send_fail_tips\)");
       if (p0 instanceof KwaiException) {
          str = p0.mErrorMessage;
          a.o(str, "it");
       }
       i.d(R.style.arg_RES_7f110668, str);
       return true;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveDiyGiftManager$b$b.class, "1")) {
       }else {
          b.Z(this.a.a.c, "onSendGiftButtonClick send gift success");
          p0 = this.b;
          if (p0.i != null) {
             d$a j = d.j;
             p0 = p0.e();
             Objects.requireNonNull(j);
             if (!PatchProxy.applyVoidOneRefs(p0, j, d$a.class, "2")) {
                d.i.i(p0);
             }
          }
       }
       return;
    }
}
