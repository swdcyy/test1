package com.kuaishou.merchant.home.mall.b;
import erd.g;
import com.kuaishou.merchant.home.mall.c;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import yr3.b;
import com.kuaishou.merchant.home.mall.HomeMallLogBiz;
import p74.a;
import java.lang.String;
import o74.a;
import yw3.g;
import crd.b;

public final class b implements g	// class@0016db
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 instanceof b) {
          a.d(HomeMallLogBiz.Mall, "HomeMallTabLifecycleAwareness", "observeGlobalData after fragment real created");
          tb.f = p0.Lf(new g(tb));
       }
       return;
    }
}
