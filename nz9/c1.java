package nz9.c1;
import java.lang.Runnable;
import nz9.z0$h;
import java.lang.Object;
import qp7.x0;
import qp7.b;
import os7.a;
import z1.e;
import java.lang.Integer;

public final class c1 implements Runnable	// class@003215
{
    public final z0$h b;
    public final int c;
    public final int d;

    public void c1(z0$h p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.a.E().q(new e(Integer.valueOf(54), Integer.valueOf(((this.c * 54) / this.d))));
    }
}
