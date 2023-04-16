package com.kuaishou.live.longconnection.connector.i;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.k;
import java.lang.Object;
import android.os.Handler;
import com.kuaishou.live.longconnection.connector.j;

public final class i implements Runnable	// class@000c6f
{
    public final k b;
    public final int c;
    public final byte[] d;
    public final boolean e;
    public final boolean f;

    public void i(k p0,int p1,byte[] p2,boolean p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       i tb = this.b;
       j oj = new j(tb, this.c, this.d, this.e, this.f);
       tb.k().post(v7);
    }
}
