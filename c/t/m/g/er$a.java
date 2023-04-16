package c.t.m.g.er$a;
import android.os.Handler;
import c.t.m.g.er;
import android.os.Looper;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.String;
import c.t.m.g.fc;
import c.t.m.g.ex;
import android.os.Message;
import c.t.m.g.fb;
import android.content.Context;
import c.t.m.g.fj;
import java.io.Closeable;
import java.io.ByteArrayOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class er$a extends Handler	// class@000c77
{
    public final er a;

    public void er$a(er p0,Looper p1){
       this.a = p0;
       super(p1);
       er.a(p0, new StringBuilder(1024));
    }
    public final void a(){
       File uFile = er.e(this.a);
       if (uFile != null && (uFile.exists() && uFile.isDirectory())) {
          File[] uFileArray = uFile.listFiles();
          if (uFileArray != null && uFileArray.length > 0) {
             int i = 0;
             while (i < uFileArray.length) {
                object oobject = uFileArray[i];
                if (oobject.exists() && (oobject.getName()).startsWith(er.f(this.a))) {
                   byte[] uobyteArray = this.a(oobject);
                   if (uobyteArray != null && uobyteArray.length > 0) {
                      uobyteArray = fc.a("https://analytics.map.qq.com/tr?mllc", uobyteArray);
                      if (uobyteArray != null) {
                         if (ex.a) {
                            ex.b(er.a(this.a), "upload files success :"+new String(uobyteArray));
                         }
                         oobject.delete();
                      }
                   }else if(uobyteArray != null && !uobyteArray.length){
                      oobject.delete();
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public void a(Message p0){
       Message what = p0.what;
       if (what != 0x2711) {
          if (what != 0x271d) {
             if (what != 0x2713) {
                if (what == 0x2714) {
                   this.a();
                   fb.a(er.d(this.a), 0x2714, 0xea60);
                }
             }else if(er.b(this.a) != null && (er.b(this.a)).length() > 0){
                (er.b(this.a)).insert(0, fj.c(er.c(this.a), "COMP"));
                String str = er.b(this.a);
                if (ex.a) {
                   ex.a(er.a(this.a), "uploadCorelog:"+str);
                }
                this.a.a(str.getBytes());
                (er.b(this.a)).setLength(0);
             }
          }else {
             p0 = p0.obj;
             if (ex.a) {
                ex.b(er.a(this.a), "catched crash : "+p0);
             }
             this.a.a(p0.getBytes());
          }
       }else {
          p0 = p0.obj;
          if (ex.a) {
             ex.a(er.a(this.a), "writeCoreLog:"+p0);
          }
          this.a(p0);
       }
    label_00db :
       return;
    }
    public final void a(Closeable p0){
       if (p0 != null) {
          p0.close();
       }
       return;
    }
    public final void a(String p0){
       er.b(this.a)+p0+"$";
    }
    public final byte[] a(File p0){
       byte[] uobyteArray;
       if (!p0.exists() || !p0.length() - null) {
          uobyteArray = new byte[0];
          return uobyteArray;
       }else {
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          byte[] uobyteArray1 = new byte[4096];
          BufferedInputStream uBufferedInp = new BufferedInputStream(new FileInputStream(p0));
          int i = uBufferedInp.read(uobyteArray1);
          while (i != -1) {
             uByteArrayOu.write(uobyteArray1, 0, i);
          }
          uobyteArray = uByteArrayOu.toByteArray();
          this.a(uBufferedInp);
          this.a(uByteArrayOu);
          return uobyteArray;
       }
    }
    public void handleMessage(Message p0){
       this.a(p0);
    }
}
