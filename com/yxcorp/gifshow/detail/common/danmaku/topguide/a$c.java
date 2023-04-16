package com.yxcorp.gifshow.detail.common.danmaku.topguide.a$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import sm5.a;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import oe6.g;
import java.lang.System;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.DanmakuCloseGuideElement$onBecomesAttached$2$1;
import k2b.e0;
import msd.l;
import sx9.t;

public final class a$c implements g	// class@0013fb
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       SharedPreferences a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.E = p0.booleanValue();
          p0 = this.b;
          if (p0.E != null) {
             if (p0.D == null) {
                p0 = a.b;
                Objects.requireNonNull(p0);
                boolean b = true;
                if (!PatchProxy.applyVoid(null, p0, a.class, "3")) {
                   QCurrentUser mE = QCurrentUser.ME;
                   String str = "QCurrentUser.ME";
                   a.o(mE, str);
                   if (mE.isLogined()) {
                      a = a.a;
                      QCurrentUser mE1 = QCurrentUser.ME;
                      a.o(mE1, str);
                      g.a(a.edit().putInt("DANMAKU_CLOSE_GUIDE_COUNT"+mE1.getId(), (p0.b() + b)));
                      p0 = a.edit();
                      QCurrentUser mE2 = QCurrentUser.ME;
                      a.o(mE2, str);
                      g.a(p0.putLong("DANMAKU_CLOSE_GUIDE_LAST_SHOW_TIMESTAMP"+mE2.getId(), System.currentTimeMillis()));
                   }
                }
                p0.D = b;
             }
             t.d(this.b.p0(), this.b.q0(), "DAMAKU_OPEN_GUIDE_TOAST", DanmakuCloseGuideElement$onBecomesAttached$2$1.INSTANCE);
          }
       }
       return;
    }
}
