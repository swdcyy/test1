package com.yxcorp.gifshow.growth.halfscreenfollow.k;
import java.lang.Runnable;
import qoa.b;
import java.lang.String;
import java.lang.Object;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import tna.l;
import ekd.k1;

public final class k implements Runnable	// class@001391
{
    public final b b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;

    public void k(b p0,boolean p1,int p2,String p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       q.b(a.a().a());
       l ol = new l(this.b, this.c, this.d, this.e, this.f);
       k1.o(v6);
    }
}
