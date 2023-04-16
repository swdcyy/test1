package bt7.d;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;

public class d implements View$OnClickListener	// class@00046d
{
    public long b;

    public void d(){
       super();
       this.b = 0;
    }
    public void a(View p0){
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       System.currentTimeMillis();
       System.currentTimeMillis();
       if ((System.currentTimeMillis() - this.b) - 1000 < 0) {
          return;
       }
       this.a(p0);
       this.b = System.currentTimeMillis();
       return;
    }
}
