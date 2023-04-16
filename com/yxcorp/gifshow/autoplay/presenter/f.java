package com.yxcorp.gifshow.autoplay.presenter.f;
import erd.g;
import com.yxcorp.gifshow.autoplay.presenter.l;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.util.HashMap;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import u99.d;
import com.yxcorp.gifshow.autoplay.presenter.g;
import w99.d$a;
import w99.d;
import x99.r0;

public final class f implements g	// class@001c2e
{
    public final l b;

    public void f(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       HashMap hashMap = new HashMap();
       hashMap.put("fragment", tb.p.o());
       hashMap.put("fragmentActive", String.valueOf(p0));
       d.h("AutoPlayCardPlayPresenter", "fragmentActiveChanged", hashMap);
       if (p0.booleanValue()) {
          tb.q.a(g.a);
       }else {
          tb.q.a(new r0(tb));
          tb.P8();
       }
       return;
    }
}
