package com.kuaishou.merchant.live.marketing.sandeago.n;
import io.reactivex.g;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import u07.t$a;
import java.lang.CharSequence;
import com.kuaishou.merchant.live.marketing.sandeago.g;
import u07.u;
import n64.t;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public final class n implements g	// class@001a58
{
    public final o b;
    public final Activity c;
    public final String d;
    public final String e;
    public final String f;

    public void n(o p0,Activity p1,String p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       Objects.requireNonNull(tb);
       t$a uoa = new t$a(tc);
       Object[] objArray = new Object[]{td,this.e,td};
       uoa.X0(String.format("%s和%s不能同时进行，确定关闭%s吗？", objArray));
       uoa.Q0(R.string.cancel);
       uoa.S0(R.string.arg_RES_7f104389);
       uoa.u0(new g(tb, tc, this.f, p0));
       uoa.t0(new t(p0));
       uoa.z(0);
       uoa.v(1);
       uoa.A(0);
       j.d(uoa);
    }
}
