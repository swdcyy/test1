package com.kuaishou.live.core.show.vote.e$a;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.vote.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Message;
import hoc.c;
import java.lang.Long;

public class e$a extends CountDownTimer	// class@00122d
{
    public final e a;

    public void e$a(e p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "2")) {
          return;
       }
       e a = this.a.a;
       a.l(a.e(3));
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, e$a.class, "1")) {
          return;
       }
       e a = this.a.a;
       a.l(a.f(6, Long.valueOf(p0)));
       return;
    }
}
