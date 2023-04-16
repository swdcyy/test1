package io.netty.buffer.PoolArena$c;
import io.netty.buffer.PoolArena;
import io.netty.buffer.j;
import java.lang.Object;
import java.lang.System;
import kqd.q;
import kqd.r;
import io.netty.util.Recycler;
import io.netty.buffer.l;
import kqd.k;

public final class PoolArena$c extends PoolArena	// class@001040
{

    public void PoolArena$c(j p0,int p1,int p2,int p3,int p4){
       super(p0, p1, p2, p3, p4);
    }
    public boolean C(){
       return false;
    }
    public void F(Object p0,int p1,Object p2,int p3,int p4){
       if (!p4) {
       }else {
          System.arraycopy(p0, p1, p2, p3, p4);
       }
       return;
    }
    public q G(int p0){
       r or;
       if (PoolArena.y) {
          or = r.x.a();
          or.J7(p0);
       }else {
          or = l.w.a();
          or.J7(p0);
       }
       return or;
    }
    public k H(int p0,int p1,int p2,int p3){
       byte[] uobyteArray = new byte[p3];
       k ok = new k(this, uobyteArray, p0, p1, p2, p3);
       return v7;
    }
    public k K(int p0){
       byte[] uobyteArray = new byte[p0];
       return new k(this, uobyteArray, p0);
    }
    public void y(k p0){
    }
}
