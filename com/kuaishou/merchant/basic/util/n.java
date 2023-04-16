package com.kuaishou.merchant.basic.util.n;
import android.os.CountDownTimer;
import com.kuaishou.merchant.basic.util.o$a;
import com.kuaishou.merchant.basic.util.o$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public class n extends CountDownTimer	// class@0015e3
{
    public final o$a a;
    public final o$c b;

    public void n(long p0,long p1,o$a p2,o$c p3){
       this.a = p2;
       this.b = p3;
       super(p0, p1);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.b.onFinish();
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(n.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, n.class, "1")) {
          return;
       }
       this.a.onTick(p0);
       return;
    }
}
