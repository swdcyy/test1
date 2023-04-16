package com.yxcorp.plugin.tencent.map.c;
import java.lang.Runnable;
import com.yxcorp.plugin.tencent.map.e;
import java.lang.String;
import java.lang.Object;
import sid.y;
import com.yxcorp.plugin.tencent.map.e$b;
import sid.g;

public final class c implements Runnable	// class@00094a
{
    public final e b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;

    public void c(e p0,String p1,String p2,int p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       this.b.a(this.c, "", new y(this.d, this.e, this.f), false, 5, 0, 0);
    }
}
