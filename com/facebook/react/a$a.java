package com.facebook.react.a$a;
import java.lang.Runnable;
import com.facebook.react.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Process;

public class a$a implements Runnable	// class@00116f
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       Process.setThreadPriority(0);
       return;
    }
}
