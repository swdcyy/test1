package com.kuaishou.android.vader.b$b;
import java.lang.Runnable;
import com.kuaishou.android.vader.b;
import android.content.Context;
import er.m;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zq.d$b;
import zq.d;
import zq.a;
import tq.f;
import zq.f;
import zq.e;
import uq.a;

public class b$b implements Runnable	// class@000708
{
    public final Context b;
    public final m c;
    public final String d;
    public final b e;

    public void b$b(b p0,Context p1,m p2,String p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b$b.class, "1")) {
          return;
       }
       this.e.d = d.c().b(new a(this.b, this.e.c)).c(new f(this.c, this.d)).a();
       b$b te = this.e;
       te.e = te.d.b();
       PatchProxy.onMethodExit(b$b.class, "1");
       return;
    }
}
