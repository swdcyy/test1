package com.vivo.push.d.i;
import java.lang.Runnable;
import com.vivo.push.d.h;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import com.vivo.push.d.z;
import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

public final class i implements Runnable	// class@001068
{
    public final int a;
    public final List b;
    public final List c;
    public final String d;
    public final h e;

    public void i(h p0,int p1,List p2,List p3,String p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public final void run(){
       i te = this.e;
       te.b.onDelTags(h.a(te), this.a, this.b, this.c, this.d);
    }
}
