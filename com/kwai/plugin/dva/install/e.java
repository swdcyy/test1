package com.kwai.plugin.dva.install.e;
import android.content.Context;
import java.lang.Object;
import android.app.Application;
import com.kwai.plugin.dva.install.remote.c;
import java.lang.String;
import com.kwai.plugin.dva.install.e$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import fj7.c;
import com.kwai.plugin.dva.install.e$a;
import gj7.b;
import fj7.a;

public class e	// class@000e9a
{
    public final Context a;
    public final c b;

    public void e(Context p0){
       super();
       Context uContext = (p0 instanceof Application)? p0: p0.getApplicationContext();
       this.a = uContext;
       this.b = new c(p0);
       return;
    }
    public synchronized void a(String p0,int p1,e$b p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, e.class, "3")) {
          return;
       }
       c uoc = new c(p0, p1);
       uoc.b(new e$a(this, p2));
       this.b.f(uoc);
       return;
    }
}
