package j0.e;
import aegon.chrome.net.impl.j$a;
import aegon.chrome.net.impl.b;
import java.lang.Object;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import aegon.chrome.net.impl.CronetUrlRequestContext$e;
import aegon.chrome.net.impl.g;
import java.lang.String;
import j0.o;
import java.lang.StringBuilder;
import android.content.Context;
import K.S;
import java.util.Iterator;
import java.util.List;
import aegon.chrome.net.impl.b$b;
import aegon.chrome.net.impl.b$a;
import java.util.Date;
import java.lang.Long;

public final class e implements j$a	// class@001995
{
    public final b a;

    public void e(b p0){
       this.a = p0;
    }
    public final Object get(){
       b g;
       String str2;
       String str3;
       b this;
       e a = this.a;
       g.o();
       g.o();
       String str = a.t();
       String str1 = a.B();
       g = a.g;
       if (g != null) {
          str2 = a.a.getPackageName();
          o.a(str2);
          str3 = str2;
       }else {
          str3 = "";
       }
       str2 = str3;
       b h = a.h;
       b i = a.i;
       b j = a.j;
       int i1 = a.u();
       b l = a.l;
       b m = a.m;
       b n = a.n;
       boolean b = a.w();
       b d = a.d;
       this = a.p;
       e uoe = a;
       int i2 = (this == 20)? 10: this;
       long this1 = S.MB3ntV7V(str, str1, g, str2, h, i, j, i1, l, m, n, b, d, i2);
       e uoe1 = uoe;
       Iterator iterator = uoe1.b.iterator();
       while (iterator.hasNext()) {
          b$b uob = iterator.next();
          g.o();
          S.MyRIv1Ij(this1, uob.a, uob.b, uob.c);
       }
       Iterator iterator1 = uoe1.c.iterator();
       while (iterator1.hasNext()) {
          b$a uoa = iterator1.next();
          g.o();
          S.Muq3ic6p(this1, uoa.a, uoa.b, uoa.c, uoa.d.getTime());
       }
       return Long.valueOf(S.M135Cu0D(this1));
    }
}
