package com.k.fs.v3.MFServiceF;
import com.k.s.v2.MServiceF;
import com.k.fs.v3.MFServiceF$a;
import nsd.u;
import gx7.g;
import android.content.Context;
import android.app.Service;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Intent;
import android.os.Build$VERSION;
import android.app.Notification$Builder;
import java.lang.CharSequence;
import android.app.Notification;
import com.k.a.BService;

public class MFServiceF extends MServiceF	// class@0006fa
{
    public Notification c;
    public static final MFServiceF$a d;

    static {
       MFServiceF.d = new MFServiceF$a(null);
    }
    public void MFServiceF(){
       super();
    }
    public void a(){
    }
    public void onCreate(){
       Context applicationC = this.getApplicationContext();
       a.o(applicationC, "applicationContext");
       g.a.b(applicationC);
       super.onCreate();
    }
    public int onStartCommand(Intent p0,int p1,int p2){
       if (p0 != null && Build$VERSION.SDK_INT >= 26) {
          Context applicationC = this.getApplicationContext();
          a.o(applicationC, "applicationContext");
          g.a.b(applicationC);
          if (this.c == null) {
             this.c = new Notification$Builder(this, "foreground_service_low").setContentTitle("").setContentText("").setSmallIcon(0).build();
          }
          this.startForeground(1, this.c);
          this.stopForeground(1);
       }
       super.onStartCommand(p0, p1, p2);
       return 2;
    }
}
