package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q$d;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.n$a;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import r14.k;

public class q$d implements n$a	// class@001a89
{
    public final q a;

    public void q$d(q p0){
       this.a = p0;
       super();
    }
    public void onFail(){
       if (PatchProxy.applyVoid(null, this, q$d.class, "2")) {
          return;
       }
       this.a.S8();
       String str = a1.p(R.string.arg_RES_7f103427);
       i.d(R.style.arg_RES_7f110668, str);
       k.f(this.a.E, false, str);
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, q$d.class, "1")) {
          return;
       }
       this.a.V8();
       return;
    }
}
