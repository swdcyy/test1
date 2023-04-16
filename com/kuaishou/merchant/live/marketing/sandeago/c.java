package com.kuaishou.merchant.live.marketing.sandeago.c;
import io.reactivex.g;
import com.kuaishou.merchant.live.marketing.sandeago.e;
import android.app.Activity;
import java.lang.String;
import com.kuaishou.merchant.api.live.basic.model.SwitchToolParams;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import tkd.b;
import tkd.d;
import fs3.g;
import is3.b;
import brd.t;
import n64.h;
import n64.f;
import erd.g;
import crd.b;

public final class c implements g	// class@001a39
{
    public final e b;
    public final Activity c;
    public final String d;
    public final SwitchToolParams e;

    public void c(e p0,Activity p1,String p2,SwitchToolParams p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void subscribe(v p0){
       c tb = this.b;
       c te = this.e;
       Objects.requireNonNull(tb);
       d.a(-1695065466).x30().h(this.c, this.d).subscribe(new h(tb, te, p0), new f(tb, te, p0));
    }
}
