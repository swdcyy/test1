package c.t.m.g.fg;
import android.content.Context;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.System;

public class fg	// class@000c8d
{
    public File b;
    public File c;
    public Context d;
    public String e;
    public String f;
    public long g;
    public static final String a = "fg";

    public void fg(Context p0,File p1,File p2,String p3,long p4){
       super();
       this.e = "d";
       this.f = this.e+"_";
       this.g = 0x5000;
       if (p0 == null) {
          return;
       }
       this.d = p0.getApplicationContext();
       this.b = p2;
       this.c = p1;
       this.e = p3;
       this.f = this.e+"_";
       this.g = p4;
       return;
    }
    public void a(byte[] p0){
       BufferedOutputStream uBufferedOut;
       try{
          fg tb = this.b;
          fg tc = this.c;
          if (tc != null && (tb == null || (p0 != null && p0.length))) {
             if (!tb.exists()) {
                this.b.createNewFile();
             }
             long l = 0;
             try{
                FileOutputStream uFileOutputS = new FileOutputStream(this.b, true);
                try{
                   uBufferedOut = new BufferedOutputStream(uFileOutputS);
                   uBufferedOut.write(p0);
                   uBufferedOut.flush();
                   uBufferedOut.close();
                   l = System.currentTimeMillis();
                   if (e0.length() - this.g > 0) {
                      e0.renameTo(new File(tc, this.f+l));
                   }
                }catch(java.io.IOException e0){
                   BufferedOutputStream uBufferedOut1 = uBufferedOut;
                }
                if (l) {
                   l.close();
                }
             }catch(java.io.IOException e0){
                goto label_0066 ;
             }
          }
       }catch(java.io.IOException e0){
       }catch(java.io.IOException e0){
       }
    label_006b :
       return;
    }
}
