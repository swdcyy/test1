package com.loc.ao$1;
import com.loc.ck;
import android.content.Context;
import java.lang.String;
import com.loc.cg;
import com.loc.ao;
import java.lang.ref.WeakReference;
import com.loc.bn;
import com.loc.bt;
import com.loc.bx;
import com.loc.bw;
import com.loc.cb;
import com.loc.ay;
import com.loc.ba;
import com.loc.bb;
import com.loc.az;
import java.lang.Object;
import com.loc.l;
import com.loc.o;
import android.os.Build;
import android.os.Build$VERSION;
import com.loc.ca;
import com.loc.bo;
import java.lang.Throwable;
import com.loc.an;

public final class ao$1 extends ck	// class@001372
{
    public final Context a;
    public final String b;
    public final cg c;

    public void ao$1(Context p0,String p1,cg p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void a(){
       _monitor_enter(ao.class);
       bn uobn = bt.a(ao.a());
       bt.a(this.a, uobn, this.b, 1000, 0x3e8000, "1");
       uobn.f = this.c;
       if (uobn.g == null) {
          Object[] objArray = new Object[]{l.f(this.a),o.v(this.a),o.u(this.a),l.c(this.a),Build.MODEL,l.b(this.a),l.d(this.a),Build$VERSION.RELEASE};
          bw uobw = new bw(this.a, new cb(), new ay(new ba(new bb())), "QImtleSI6IiVzIiwicGxhdGZvcm0iOiJhbmRyb2lkIiwiZGl1IjoiJXMiLCJhZGl1IjoiJXMiLCJwa2ciOiIlcyIsIm1vZGVsIjoiJXMiLCJhcHBuYW1lIjoiJXMiLCJhcHB2ZXJzaW9uIjoiJXMiLCJzeXN2ZXJzaW9uIjoiJXMi", objArray);
          uobn.g = new bx(v9);
       }
       uobn.h = 0x36ee80;
       bo.a(uobn);
       _monitor_exit(ao.class);
       return;
    }
}
