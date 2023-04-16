package com.kwai.live.gzone.commandlottery.c;
import erd.g;
import com.kwai.live.gzone.commandlottery.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mkc.b;
import android.view.View;
import mkc.c;
import java.util.Objects;
import lnc.a1;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup;
import e17.i;
import f37.o0;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class c implements g	// class@000c92
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          b[] uobArray = new b[]{b.d};
          c.d(this.b.I, uobArray);
          c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "12") && p0 != null) {
             String str = a1.p(R.string.arg_RES_7f1038e7);
             if (p0 instanceof KwaiException) {
                p0 = p0.getMessage();
                if (!TextUtils.x(p0)) {
                   str = p0;
                }
             }
             o0.s(tb.x, str);
          }
          b.c0(LiveLogTag.GZONE, "LiveGzoneAudienceCommandLotteryPopupView", "openLotteryPrize", "failed");
       }
       return;
    }
}
