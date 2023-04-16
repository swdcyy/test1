package com.loc.e$b;
import android.os.HandlerThread;
import com.loc.e;
import java.lang.String;
import com.loc.j;
import android.content.Context;
import java.lang.Throwable;
import com.loc.fj;
import com.loc.fi;
import com.loc.ej;

public final class e$b extends HandlerThread	// class@0013f8
{
    public final e a;

    public void e$b(e p0,String p1){
       this.a = p0;
       super(p1);
    }
    public final void onLooperPrepared(){
       e$b ta = this.a;
       e.a(ta, new j(ta.e));
       fi.b(this.a.e);
       fi.a(this.a.e);
       this.a.f = new ej(false);
       super.onLooperPrepared();
       return;
    }
    public final void run(){
       super.run();
    }
}
