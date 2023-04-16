package com.kuaishou.live.core.show.guestactivity.h$a;
import oq5.c;
import com.kuaishou.live.core.show.guestactivity.h;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import jv1.b;

public class h$a implements c	// class@000bd7
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       if (this.b.T.x.H2()) {
          this.b.d9();
       }else {
          h$a tb = this.b;
          if (tb.M != null) {
             tb.a9();
          }
       }
       return;
    }
}
