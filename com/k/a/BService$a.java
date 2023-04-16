package com.k.a.BService$a;
import java.lang.Runnable;
import com.k.a.BService;
import android.content.Intent;
import java.lang.Object;
import gx7.g;
import android.content.Context;
import android.app.Service;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class BService$a implements Runnable	// class@0006ed
{
    public final BService b;
    public final Intent c;
    public final boolean d;

    public void BService$a(BService p0,Intent p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (this.c != null) {
          String name = this.b.getClass().getName();
          a.o(name, "this@BService.javaClass.name");
          g.a.d(this.b.getApplicationContext(), this.c, 1, this.d, name);
       }
       this.b.a();
       return;
    }
}
