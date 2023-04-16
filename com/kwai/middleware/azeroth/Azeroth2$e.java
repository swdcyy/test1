package com.kwai.middleware.azeroth.Azeroth2$e;
import java.lang.Runnable;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import q97.c;
import java.lang.Throwable;

public final class Azeroth2$e implements Runnable	// class@000ef0
{
    public final Intent b;
    public final String c;

    public void Azeroth2$e(Intent p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Azeroth2 b = Azeroth2.B;
       this.b.setPackage(b.d().getPackageName());
       if (this.c == null) {
          b.d().sendBroadcast(this.b);
       }else {
          b.d().sendBroadcast(this.b, this.c);
       }
       return;
    }
}
