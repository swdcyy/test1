package com.yxcorp.gifshow.profile.presenter.profile.page.dialog.d;
import oj0.a;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.q;

public final class d implements a	// class@00157a
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void W(Map p0){
       if (p0 != null) {
          RxBus.f.b(new q(p0));
       }
       return;
    }
}
