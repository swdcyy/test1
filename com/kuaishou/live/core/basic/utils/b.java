package com.kuaishou.live.core.basic.utils.b;
import erd.o;
import com.kuaishou.live.core.basic.utils.c;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import brd.t;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kzc.d;
import u07.t$a;
import u07.f;
import lnc.a1;
import z12.g;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Runnable;

public final class b implements o	// class@0008e4
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 instanceof KwaiException) {
          KwaiException mResponse = p0.mResponse;
          if (mResponse.b() != 0x13883) {
             p0 = t.error(p0);
          }else if(TextUtils.isEmpty(mResponse.c())){
             p0 = t.error(p0);
          }else {
             Activity uActivity = ActivityContext.g().e();
             if (uActivity instanceof GifshowActivity && (uActivity.isFinishing() || uActivity.isDestroyed())) {
                p0 = t.error(p0);
             }else {
                String str = mResponse.d();
                d uod = f.e(new d(uActivity));
                uod.X0(mResponse.c());
                int i = (!TextUtils.isEmpty(str))? 0x7f105075: 0x7f1012a9;
                uod.S0(i);
                String str1 = (!TextUtils.isEmpty(str))? a1.p(R.string.cancel): "";
                uod.R0(str1);
                uod.u0(new g(str, uActivity));
                uod.z(false);
                uod.A(false);
                uod.v(true);
                uod.X();
                c b = tb.b;
                if (b != null) {
                   b.run();
                }
                p0 = t.error(p0);
             }
          }
       }else {
          p0 = t.error(p0);
       }
       return p0;
    }
}
