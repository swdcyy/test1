package com.facebook.react.modules.network.e$b;
import com.facebook.react.modules.network.e;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.modules.network.e$b$a;
import android.os.Handler$Callback;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.network.e$b$b;
import java.lang.Runnable;

public class e$b	// class@0012d4
{
    public final Handler a;
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
       this.a = new Handler(Looper.getMainLooper(), new e$b$a(this, p0));
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "1")) {
          return;
       }
       if (e.d) {
          this.a.sendEmptyMessageDelayed(1, 0x7530);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "2")) {
          return;
       }
       this.a.removeMessages(1);
       this.b.c(new e$b$b(this));
       return;
    }
}
