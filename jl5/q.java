package jl5.q;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;

public abstract class q implements View$OnClickListener	// class@002c56
{
    public static long b;

    public void q(){
       super();
    }
    public abstract void a(View p0);
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       long l = System.currentTimeMillis();
       if ((l - q.b) - 1000 >= 0) {
          q.b = l;
          this.a(p0);
       }
       return;
    }
}
