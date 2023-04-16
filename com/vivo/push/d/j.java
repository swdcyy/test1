package com.vivo.push.d.j;
import java.lang.Runnable;
import com.vivo.push.d.h;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import com.vivo.push.d.z;
import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

public final class j implements Runnable	// class@001069
{
    public final int a;
    public final List b;
    public final List c;
    public final String d;
    public final h e;

    public void j(h p0,int p1,List p2,List p3,String p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public final void run(){
       j te = this.e;
       te.b.onDelAlias(h.b(te), this.a, this.b, this.c, this.d);
    }
}
