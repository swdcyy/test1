package com.kuaishou.android.security.base.thread.b$a;
import java.lang.Runnable;
import com.kuaishou.android.security.base.thread.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Process;

public class b$a implements Runnable	// class@000f13
{
    public final int a;
    public final Runnable b;
    public final b c;

    public void b$a(b p0,Runnable p1,int p2){
       this.c = p0;
       super();
       this.b = p1;
       this.a = p2;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       Process.setThreadPriority(this.a);
       this.b.run();
       return;
    }
}
