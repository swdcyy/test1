package c.t.m.g.ew$a;
import android.os.Handler;
import c.t.m.g.ew;
import android.os.Looper;
import java.io.File;
import c.t.m.g.ew$1;
import java.lang.String;
import android.os.Message;
import java.lang.Object;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.System;
import java.lang.StringBuilder;

public final class ew$a extends Handler	// class@000c7f
{
    public final ew a;
    public File b;

    public void ew$a(ew p0,Looper p1){
       this.a = p0;
       super(p1);
       this.b = this.a();
    }
    public void ew$a(ew p0,Looper p1,ew$1 p2){
       super(p0, p1);
    }
    public final File a(){
       File uFile = ew.e(this.a);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       return new File(uFile, "dexlog");
    }
    public void handleMessage(Message p0){
       BufferedOutputStream uBufferedOut;
       super.handleMessage(p0);
       ew$a tb = this.b;
       if (tb == null || !("dexlog").equals(tb.getName())) {
          this.b = this.a();
       }
       tb = null;
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(this.b, true);
          try{
             uBufferedOut = new BufferedOutputStream(uFileOutputS);
             String str = "GBK";
             if (ew.d(this.a)) {
                uBufferedOut.write(ew.a((p0.obj.toString()).getBytes(str)));
             }else {
                uBufferedOut.write((p0.obj.toString()).getBytes(str));
             }
             try{
                uBufferedOut.flush();
                uBufferedOut.close();
             }catch(java.io.IOException e0){
             }
             File uFile = ew.e(this.a);
             tb = this.b;
             if (uFile != null && tb != null) {
                long l = System.currentTimeMillis();
                if (tb.length() - 0x64000 > 0) {
                   tb.renameTo(new File(uFile, "dexlog_"+l));
                }
             }
             return;
          }catch(java.io.IOException e0){
             try{
                this.b = e0;
                if (uBufferedOut) {
                   uBufferedOut.close();
                }
                return;
             }catch(java.io.IOException e0){
             }
          }
       }catch(java.io.IOException e0){
          uBufferedOut = e0;
          goto label_0091 ;
       }
    }
}
