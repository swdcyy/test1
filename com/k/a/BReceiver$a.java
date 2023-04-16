package com.k.a.BReceiver$a;
import java.lang.Runnable;
import com.k.a.BReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import gx7.g;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class BReceiver$a implements Runnable	// class@0006e9
{
    public final BReceiver b;
    public final Context c;
    public final Intent d;
    public final boolean e;

    public void BReceiver$a(BReceiver p0,Context p1,Intent p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       String name = this.b.getClass().getName();
       a.o(name, "this@BReceiver.javaClass.name");
       g.a.d(this.c.getApplicationContext(), this.d, 4, this.e, name);
    }
}
