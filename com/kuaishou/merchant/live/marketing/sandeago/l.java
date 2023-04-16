package com.kuaishou.merchant.live.marketing.sandeago.l;
import u07.u;
import com.kuaishou.merchant.live.marketing.sandeago.o;
import android.app.Activity;
import java.lang.String;
import mrd.c;
import java.lang.Object;
import u07.t;
import android.view.View;
import brd.t;
import n64.p;
import n64.q;
import erd.g;
import crd.b;

public final class l implements u	// class@001a42
{
    public final o b;
    public final Activity c;
    public final String d;
    public final c e;

    public void l(o p0,Activity p1,String p2,c p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void a(t p0,View p1){
       l te = this.e;
       this.b.E(this.c, this.d).subscribe(new p(te), new q(te));
    }
}
