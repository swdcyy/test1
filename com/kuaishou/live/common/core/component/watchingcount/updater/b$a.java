package com.kuaishou.live.common.core.component.watchingcount.updater.b$a;
import ho1.l$b;
import com.kuaishou.live.common.core.component.watchingcount.updater.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import z1.k;
import android.widget.TextView;
import xy1.b;
import com.kuaishou.live.common.core.component.watchingcount.updater.a$a;

public class b$a implements l$b	// class@0017ca
{
    public final long a;
    public final b b;

    public void b$a(b p0,long p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public long a(){
       return this.a;
    }
    public void b(long p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       if (uoa.b == null) {
          TextView textView = uoa.a.get();
          if (textView != null) {
             b.a(textView, String.valueOf(p0));
          }
       }
       this.b.c.a(p0);
       return;
    }
}
