package com.yxcorp.plugin.tencent.map.d;
import java.lang.Runnable;
import com.yxcorp.plugin.tencent.map.e;
import java.lang.String;
import sid.g;
import java.lang.Object;
import sid.x;
import com.yxcorp.plugin.tencent.map.e$b;

public final class d implements Runnable	// class@00094b
{
    public final e b;
    public final String c;
    public final String d;
    public final g e;

    public void d(e p0,String p1,String p2,g p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       d te = this.e;
       this.b.a(this.c, this.d, new x(te), true, 1, 0, te);
    }
}
