package c.t.m.g.dn$a;
import android.os.Handler;
import c.t.m.g.dn;
import android.os.Looper;
import java.io.File;
import c.t.m.g.dn$1;
import java.lang.String;
import java.io.IOException;
import android.os.Message;
import android.os.HandlerThread;
import java.lang.Object;
import c.t.m.g.ej;
import c.t.m.g.ea;
import java.lang.System;
import java.lang.StringBuilder;

public final class dn$a extends Handler	// class@000c4c
{
    public final dn a;
    public File b;

    public void dn$a(dn p0,Looper p1){
       this.a = p0;
       super(p1);
       this.b = this.a();
    }
    public void dn$a(dn p0,Looper p1,dn$1 p2){
       super(p0, p1);
    }
    public final File a(){
       File uFile1;
       File uFile = dn.d(this.a);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       try{
          uFile1 = new File(uFile, "txwatchdog");
          uFile1.createNewFile();
       }catch(java.io.IOException e0){
          e0.printStackTrace();
       }
       return uFile1;
    }
    public void handleMessage(Message p0){
       super.handleMessage(p0);
       if (dn.c(this.a) != null && dn.c(this.a).isAlive()) {
          try{
             dn$a tb = this.b;
             if (tb != null) {
                if (!tb.exists() || !("txwatchdog").equals(this.b.getName())) {
                   File uFile = this.a();
                   this.b = uFile;
                   uFile.getName();
                }
                ea.a(ej.a((p0.obj.toString()).getBytes("GBK")), this.b);
                this.b.getAbsolutePath();
                File uFile1 = dn.d(this.a);
                tb = this.b;
                if (uFile1 != null && tb != null) {
                   long l = System.currentTimeMillis();
                   if (tb.length() - 0x64000 > 0) {
                      tb.renameTo(new File(uFile1, "txwatchdog_"+l));
                   }
                }
                return;
             }
          }catch(java.io.IOException e9){
             this.b = null;
             e9.getMessage();
          }
       }
    }
}
