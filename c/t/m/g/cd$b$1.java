package c.t.m.g.cd$b$1;
import c.t.m.g.bq$b;
import c.t.m.g.cd$b;
import java.lang.Object;
import java.lang.String;
import c.t.m.g.cd;
import java.lang.StringBuilder;
import c.t.m.g.bt;
import java.io.File;
import android.content.Context;
import java.lang.System;
import java.io.FileOutputStream;
import java.lang.Throwable;

public class cd$b$1 implements bq$b	// class@000c06
{
    public final byte[] a;
    public final boolean[] b;
    public final cd$b c;

    public void cd$b$1(cd$b p0,byte[] p1,boolean[] p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(String p0){
       if (cd.h()) {
          bt.a(this.c.c.b(), "upload success:"+p0);
       }
       return;
    }
    public void b(String p0){
       String str = "up byte[] error.";
       if (cd.h()) {
          bt.a(this.c.c.b(), "upload failed:"+p0);
       }
       File uFile = new File(cd.i().getExternalFilesDir("data").getAbsolutePath()+"/mllc");
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       FileOutputStream uFileOutputS = new FileOutputStream(new File(uFile, "mllc_"+System.currentTimeMillis()+".enc"), true);
       uFileOutputS.write(this.a);
       try{
          uFileOutputS.close();
          uFileOutputS.close();
       }catch(java.io.IOException e8){
          if (cd.h()) {
             bt.a(this.c.c.b(), str, e8);
          }
       }
    label_00bb :
       p0[0] = false;
       return;
    }
}
