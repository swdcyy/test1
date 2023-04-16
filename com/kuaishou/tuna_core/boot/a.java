package com.kuaishou.tuna_core.boot.a;
import java.lang.Runnable;
import omc.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import tz4.a;
import msd.a;
import c15.b;
import tz4.b;
import java.lang.Throwable;

public final class a implements Runnable	// class@00108b
{
    public final b b;
    public final List c;

    public void a(b p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       String str = tb.z1();
       try{
          b.f(KsLogTunaCoreTag.TUNA_BOOT.appendTag("TunaBootLoader"), new a(str));
          tb.execute(tc);
       }catch(java.lang.Exception e0){
          b.e(KsLogTunaCoreTag.TUNA_BOOT.appendTag("TunaBootLoader"), new b(str), e0);
       }
       return;
    }
}
