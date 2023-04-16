package com.kwai.framework.location.d;
import java.lang.Runnable;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import s96.a;
import o56.a;
import android.content.Context;
import com.kwai.framework.location.k;
import kzc.d;
import lnc.a1;
import java.lang.CharSequence;
import u07.t$a;
import o96.b0;
import u07.u;
import o96.c0;
import v96.c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.c;

public final class d implements Runnable	// class@00162c
{
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Activity g;

    public void d(String p0,String p1,String p2,String p3,int p4,Activity p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final void run(){
       d uod = this;
       d b = uod.b;
       d f = uod.f;
       d g = uod.g;
       d uod1 = uod.c;
       d uod2 = uod.d;
       d uod3 = uod.e;
       a.d(b, "GPS", uod1, uod2, uod3, f);
       d uod4 = new d(g);
       uod4.Z0(104);
       uod4.X0(a1.p(R.string.arg_RES_7f1012b5));
       uod4.z0(a1.p(R.string.arg_RES_7f1012b3));
       uod4.x0(1);
       uod4.T0(a1.p(R.string.arg_RES_7f1012b4));
       uod4.R0(a1.p(R.string.arg_RES_7f1012b2));
       b0 uob0 = v6;
       d uod5 = b;
       b0 uob01 = v6;
       boolean b1 = k.e(a.B);
       d uod6 = f;
       uob0 = new b0(uod5, uod1, uod2, uod3, b1, uod6);
       uod4.t0(uob01);
       c0 uoc0 = new c0(uod5, uod1, uod2, uod3, b1, uod6, g);
       uod4.u0(uob01);
       uod4.L(new c());
       uod4.v(true);
       uod4.z(false);
       uod4.X();
    }
}
