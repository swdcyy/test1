package c.t.m.g.cd$b;
import java.lang.Runnable;
import c.t.m.g.cd;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import c.t.m.g.bv$a;
import c.t.m.g.bv;
import java.lang.StringBuilder;
import java.io.File;
import c.t.m.g.by;
import java.lang.System;
import c.t.m.g.bm;
import c.t.m.g.bt;
import java.lang.Throwable;
import c.t.m.g.bj;
import c.t.m.g.ej;
import c.t.m.g.cd$b$1;
import c.t.m.g.bq;

public class cd$b implements Runnable	// class@000c07
{
    public String a;
    public boolean b;
    public final cd c;

    public void cd$b(cd p0,String p1,boolean p2){
       this.c = p0;
       super();
       this.a = "";
       this.b = false;
       this.a = p1;
       this.b = p2;
    }
    public final void a(){
       File[] uFileArray1;
       long l2;
       boolean b;
       cd$b uob = this;
       String str = ",";
       bv$a uoa = bv.a(cd.i());
       if (uoa != bv$a.c) {
          uob.c.a("NET", uoa+",no up file.");
          return;
       }else {
          long l = 0;
          File uFile = new File(cd.i().getExternalFilesDir("data").getAbsolutePath()+"/mllc");
          File[] uFileArray = (uFile.exists())? uFile.listFiles(): null;
          if (by.b(uFileArray)) {
             return;
          }else {
             long l1 = System.currentTimeMillis();
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                if (l - 0x19000 >= 0) {
                   break ;
                }else if(oobject == null || !oobject.exists()){
                   long l3 = l1 - oobject.lastModified();
                   if (l3 - 0x9a7ec800 >= 0) {
                      oobject.delete();
                   }else {
                      byte[] uobyteArray = bm.a(oobject);
                      if (!by.a(uobyteArray)) {
                         uFileArray1 = uFileArray;
                         l2 = l1;
                         l = l + (long)uobyteArray.length;
                         b = uob.a(uobyteArray, false);
                         if (cd.h()) {
                            bt.a(uob.c.b(), "upload:"+oobject.getName()+str+uobyteArray.length+str+b);
                         }
                      }else {
                         uFileArray1 = uFileArray;
                         l2 = l1;
                         b = true;
                      }
                      oobject.delete();
                      if (!b) {
                         bm.a(uFile.getAbsolutePath(), 0xa00000);
                         break ;
                      }
                   }
                }
                uFileArray1 = uFileArray;
                l2 = l1;
             label_00f3 :
                i = i + 1;
                uFileArray = uFileArray1;
                l1 = l2;
             }
             uob.c.a("NET", uoa+",up file len:"+l);
             return;
          }
       }
    }
    public final boolean a(byte[] p0,boolean p1){
       boolean b = true;
       if (by.a(p0)) {
          return b;
       }
       byte[] uobyteArray = (p1)? ej.a(p0, bj.a("fc_base")): p0;
       if (by.a(uobyteArray)) {
          return b;
       }else {
          String str = "[src,enc]=["+p0.length+","+uobyteArray.length+"],type="+bv.b(cd.i());
          this.c.a("NET", str);
          if (cd.h()) {
             bt.a(this.c.b(), str);
          }
          boolean[] uobooleanArr = new boolean[b];
          uobooleanArr[0] = b;
          bq.a("https://analytics.map.qq.com/tr?mllc", uobyteArray, new cd$b$1(this, uobyteArray, uobooleanArr));
          return uobooleanArr[0];
       }
    }
    public void run(){
       if (!by.a(this.a)) {
          if (cd.h()) {
             bt.a(this.c.b(), this.a);
          }
          try{
             this.a((this.a).getBytes(), true);
          }catch(java.lang.Exception e0){
          }
       }
    }
}
