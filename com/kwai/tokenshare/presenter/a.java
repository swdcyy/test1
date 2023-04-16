package com.kwai.tokenshare.presenter.a;
import io.reactivex.g;
import fu7.c;
import java.lang.Object;
import brd.v;
import java.lang.Boolean;
import brd.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jga.f;
import jga.f$a;
import fu7.a;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;

public final class a implements g	// class@00193c
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       if (tb.V8()) {
          p0.onNext(Boolean.TRUE);
          p0.onComplete();
       }else {
          f uof = PatchProxy.apply(null, tb, c.class, "4");
          if (uof != PatchProxyResult.class) {
          }else {
             f$a uoa = new f$a(tb.S8(), tb.R8());
             uoa.l(tb.R8());
             uoa.q(true);
             tb.P8(uoa);
             uof = uoa.b();
          }
          FollowHelper.c(uof, new a(p0));
       }
       return;
    }
}
