package com.kuaishou.merchant.live.marketing.sandeago.b;
import io.reactivex.g;
import com.kuaishou.merchant.live.marketing.sandeago.e;
import android.app.Activity;
import q14.i;
import com.kuaishou.merchant.api.live.sandeabiz.LiveAnchorSandeaBizService;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import u07.t$a;
import java.lang.String;
import java.lang.CharSequence;
import com.kuaishou.merchant.live.marketing.sandeago.a;
import u07.u;
import n64.c;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;

public final class b implements g	// class@001a38
{
    public final e b;
    public final Activity c;
    public final i d;
    public final LiveAnchorSandeaBizService e;

    public void b(e p0,Activity p1,i p2,LiveAnchorSandeaBizService p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       t$a uoa = new t$a(this.c);
       Object[] objArray = new Object[]{tb.g(),this.d.g(),tb.g()};
       uoa.X0(String.format("%s和%s不能同时进行，确定关闭%s吗？", objArray));
       uoa.Q0(R.string.cancel);
       uoa.S0(R.string.arg_RES_7f104389);
       uoa.u0(new a(tb, this.e, p0));
       uoa.t0(new c(tb, p0));
       uoa.z(0);
       uoa.A(0);
       j.d(uoa);
    }
}
