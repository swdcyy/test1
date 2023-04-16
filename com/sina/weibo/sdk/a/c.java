package com.sina.weibo.sdk.a.c;
import java.lang.Object;
import com.sina.weibo.sdk.a.c$b;
import com.sina.weibo.sdk.a.c$1;
import android.os.Looper;
import com.sina.weibo.sdk.a.c$2;
import com.sina.weibo.sdk.a.c$3;
import com.sina.weibo.sdk.a.c$d;

public abstract class c	// class@000b97
{
    public int L;
    public final c$d M;
    public final FutureTask N;
    public int O;
    public Object[] P;
    public Handler x;

    public void c(){
       super();
       this.L = c$b.U;
       this.O = 5;
       this.x = new c$1(this, Looper.getMainLooper());
       c$2 u2 = new c$2(this);
       this.M = u2;
       this.N = new c$3(this, u2);
    }
    public static void a(c p0,Object p1){
       p0.onPostExecute(p1);
       p0.L = c$b.W;
    }
    public abstract Object l();
    public void onPostExecute(Object p0){
    }
}
