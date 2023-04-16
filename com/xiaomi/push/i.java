package com.xiaomi.push.i;
import android.content.Context;
import com.xiaomi.push.id;
import java.lang.String;
import com.xiaomi.push.g$b;
import com.xiaomi.push.g;
import ws8.j;
import ys8.n;
import com.xiaomi.push.is;
import com.xiaomi.push.j;
import com.xiaomi.push.jj$a;
import com.xiaomi.push.jf;
import com.xiaomi.push.ix;
import com.xiaomi.push.k;
import com.xiaomi.push.iz$a;
import java.lang.Throwable;
import rs8.c;

public class i	// class@001123
{

    public static short a(Context p0,id p1){
       return i.b(p0, p1.b);
    }
    public static short b(Context p0,String p1){
       boolean b = false;
       int i = g.f(p0, p1, b).a() + b;
       int i1 = (j.b(p0))? 4: 0;
       i = i + i1;
       i1 = (j.a(p0))? 8: 0;
       i = i + i1;
       if (n.t(p0)) {
          b = 16;
       }
       return (short)(i + b);
    }
    public static void c(is p0,byte[] p1){
       if (p1 == null) {
          throw new ix("the message byte is empty.");
       }
       new j(new jj$a(true, true, p1.length)).a(p0, p1);
       return;
    }
    public static byte[] d(is p0){
       if (p0 == null) {
          return null;
       }
       try{
          return new k(new iz$a()).a(p0);
       }catch(com.xiaomi.push.ix e3){
          c.n("convertThriftObjectToBytes catch TException.", e3);
          return v0;
       }
    }
}
