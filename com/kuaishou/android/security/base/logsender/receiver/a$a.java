package com.kuaishou.android.security.base.logsender.receiver.a$a;
import java.lang.Runnable;
import com.kuaishou.android.security.base.logsender.receiver.a;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.base.cloudconfig.b;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;

public class a$a implements Runnable	// class@000ee8
{
    public final String a;
    public final Context b;
    public final a c;

    public void a$a(a p0,String p1,Context p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       if ((this.a).equals("com.kw.r.p")) {
          this.c.a(this.b);
       }else if((this.a).equals("com.kw.pp.action")){
          b.a(this.b).a(false);
       }
       return;
    }
}
