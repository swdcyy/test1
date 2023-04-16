package com.kuaishou.android.security.internal.init.e;
import java.lang.Runnable;
import com.kuaishou.android.security.internal.init.f;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import java.lang.Exception;

public class e implements Runnable	// class@000f57
{
    public final Context a;
    public final f b;

    public void e(f p0,Context p1){
       super();
       this.b = p0;
       this.a = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       int i = 50;
       try{
          KSecurityTrack.sLog(i);
          KSecurityTrack.sLog(51);
          this.b.b(this.b.b(this.a));
       }catch(com.kuaishou.android.security.base.exception.KSException e0){
          KSecurityTrack.sLog(52);
          e0.printStackTrace();
          this.b.a(-1);
       }
       return;
    }
}
