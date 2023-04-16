package com.yxcorp.gifshow.relation.util.f$a;
import sfc.a;
import android.content.Context;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.q;

public class f$a extends a	// class@001a57
{
    public final User c;

    public void f$a(Context p0,User p1){
       this.c = p1;
       super(p0);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       super.b(p0);
       RxBus.f.b(q.a(this.c, 1));
       return;
    }
}
