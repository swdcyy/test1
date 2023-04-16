package hg9.r0;
import java.lang.Runnable;
import java.io.File;
import qr4.i;
import java.lang.String;
import java.lang.Object;
import qr4.m$k0;
import s16.j;
import android.content.Context;
import lnc.a1;
import qkd.a;
import j8c.a;
import q87.c;

public final class r0 implements Runnable	// class@002673
{
    public final File b;
    public final i c;
    public final byte[] d;
    public final String e;

    public void r0(File p0,i p1,byte[] p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       r0 tb = this.b;
       j.i(tb.getPath(), this.c.b.a);
       j.d().h(tb, this.d);
       a.e(a1.c(), tb);
       Object[] objArray = new Object[0];
       a.D().w(this.e, "处理文件信息 end", objArray);
    }
}
