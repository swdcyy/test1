package com.loc.bq$a;
import com.loc.ck;
import android.content.Context;
import com.loc.bp;
import com.loc.bq;
import java.lang.System;
import java.lang.String;
import java.lang.Long;
import java.lang.ref.WeakReference;
import com.loc.bn;
import com.loc.bt;
import com.loc.al;
import com.loc.ay;
import com.loc.ba;
import com.loc.bb;
import com.loc.az;
import com.loc.bo;
import java.lang.Throwable;
import com.loc.an;
import com.loc.bx;
import com.loc.bw;
import com.loc.cb;
import com.loc.ag;
import java.lang.Object;
import com.loc.l;
import com.loc.o;
import android.os.Build;
import android.os.Build$VERSION;
import com.loc.ca;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.cf;
import com.loc.cd;
import com.loc.cg;

public final class bq$a extends ck	// class@0013a5
{
    public int a;
    public Context b;
    public bp c;

    public void bq$a(Context p0,int p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public void bq$a(Context p0,bp p1){
       this.c = p1;
    }
    public final void a(){
       bq$a ta = this.a;
       long l = 1;
       if (ta == l) {
          _monitor_enter(bq.class);
          String str = Long.toString(System.currentTimeMillis());
          bn uobn = bt.a(bq.a());
          bt.a(this.b, uobn, al.i, bq.a, 0x200000, "6");
          if (uobn.e == null) {
             uobn.e = new ay(new ba(new bb(new ba())));
          }
          bo.a(str, this.c.a(), uobn);
          _monitor_exit(bq.class);
          return;
       }else {
          int i = 2;
          if (ta != i) {
             return;
          }
          bn uobn1 = bt.a(bq.a());
          bt.a(this.b, uobn1, al.i, bq.a, 0x200000, "6");
          uobn1.h = 0xdbba00;
          if (uobn1.g == null) {
             Object[] objArray = new Object[15];
             objArray[0] = l.f(this.b);
             objArray[l] = o.v(this.b);
             objArray[i] = o.k(this.b);
             objArray[3] = o.h(this.b);
             objArray[4] = o.a();
             objArray[5] = Build.MANUFACTURER;
             objArray[6] = Build.DEVICE;
             objArray[7] = o.y(this.b);
             objArray[8] = l.c(this.b);
             objArray[9] = Build.MODEL;
             objArray[10] = l.d(this.b);
             objArray[11] = l.b(this.b);
             objArray[12] = o.g(this.b);
             objArray[13] = o.a(this.b);
             objArray[14] = String.valueOf(Build$VERSION.SDK_INT);
             bw uobw = new bw(this.b, new cb(), new ay(new ba(new bb())), new String(ag.a(10)), objArray);
             uobn1.g = new bx(v10);
          }
          if (TextUtils.isEmpty(uobn1.i)) {
             uobn1.i = "fKey";
          }
          bq$a tb = this.b;
          cd uocd = new cd(tb, bq.b, (bq.b() * 1024), (bq.c * 1024), "offLocKey", (bq.d * 1024));
          uobn1.f = new cf(tb, uobn1.h, uobn1.i, v12);
          bo.a(uobn1);
          return;
       }
    }
}
