package com.kuaishou.merchant.live.marketing.sandeago.g;
import u07.u;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import android.app.Activity;
import java.lang.String;
import brd.v;
import java.lang.Object;
import u07.t;
import android.view.View;
import brd.t;
import n64.n;
import n64.o;
import erd.g;
import crd.b;

public final class g implements u	// class@001a3d
{
    public final o b;
    public final Activity c;
    public final String d;
    public final v e;

    public void g(o p0,Activity p1,String p2,v p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void a(t p0,View p1){
       g te = this.e;
       this.b.E(this.c, this.d).subscribe(new n(te), new o(te));
    }
}
