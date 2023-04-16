package com.kuaishou.live.core.basic.activity.a0;
import msd.l;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import m02.c1;
import k51.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import k51.b;
import n12.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import n12.c;
import t45.c;

public final class a0 implements l	// class@00182a
{
    public final LivePlayLoader b;
    public final boolean c;
    public final LiveAudienceParam d;
    public final boolean e;

    public void a0(LivePlayLoader p0,boolean p1,LiveAudienceParam p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object invoke(Object p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       b.d(new c1(tb, p0, this.c, this.d), a.e());
       if (this.e == null) {
          LivePlayLoader j = tb.j;
          if (!PatchProxy.applyVoidTwoRefs(j, p0, null, d.class, "1")) {
             a.p(p0, "taskRunInfos");
             if (TextUtils.n(j, d.b)) {
                int c = d.c;
                if (c <= 10) {
                   d.c = c + 1;
                label_004d :
                   c.a(new c(p0));
                }
             }
             d.a.clear();
             d.b = j;
             d.c = 1;
             goto label_004d ;
          }
       }
       return null;
    }
}
