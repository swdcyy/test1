package com.yxcorp.plugin.tencent.map.b;
import java.lang.Runnable;
import com.yxcorp.plugin.tencent.map.e;
import java.lang.String;
import java.lang.Object;
import sid.w;
import com.yxcorp.plugin.tencent.map.e$b;
import sid.g;

public final class b implements Runnable	// class@000949
{
    public final e b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public void b(e p0,String p1,String p2,int p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       b tc = this.c;
       b te = this.e;
       this.b.a(tc, this.d, new w(te, this.f, tc), 1, 2, te, 0);
    }
}
