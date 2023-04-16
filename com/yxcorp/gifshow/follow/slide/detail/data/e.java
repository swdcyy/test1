package com.yxcorp.gifshow.follow.slide.detail.data.e;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import bia.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kp.y1;

public final class e implements g	// class@001109
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, k.class, "3")) {
       }else {
          a.p(p0, "response");
          List items = p0.getItems();
          if (!q.f(items) && !TextUtils.x(p0.mLlsid)) {
             y1.g(items, 6, p0.mLlsid);
             y1.b(items, 1);
          }
       }
       return;
    }
}
