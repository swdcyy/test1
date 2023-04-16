package c.t.m.g.e$a;
import android.os.Handler;
import c.t.m.g.e;
import android.os.Looper;
import c.t.m.g.j;
import java.util.List;
import java.util.Collection;
import c.t.m.g.by;
import java.lang.Object;
import c.t.m.g.d;
import android.location.Location;
import c.t.m.g.c;
import java.lang.String;
import c.t.m.g.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import c.t.m.g.bu;
import java.lang.StringBuffer;
import java.io.File;
import c.t.m.g.bp;
import c.t.m.g.bt;
import java.lang.StringBuilder;
import java.lang.System;
import c.t.m.g.bm;
import c.t.m.g.bf;
import java.io.FileOutputStream;
import java.lang.Throwable;
import android.os.Message;
import java.lang.Long;
import c.t.m.g.ca;
import java.io.Closeable;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.text.SimpleDateFormat;
import c.t.m.g.bh;
import java.util.Date;
import oe6.g;
import c.t.m.g.l;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

public class e$a extends Handler	// class@000c61
{
    public final e a;
    public File b;
    public BufferedOutputStream c;
    public StringBuffer d;
    public String e;
    public long f;

    public void e$a(e p0,Looper p1){
       this.a = p0;
       super(p1);
       this.e = "";
       this.f = 0;
    }
    public final long a(){
       long l = (j.f)? 0xc800: 0x7d000;
       if (e.c(this.a) - l <= 0) {
          l = e.c(this.a);
       }
       return l;
    }
    public final void a(int p0){
       String str;
       d e;
       this.d();
       boolean b = true;
       if (by.a(e.k(this.a))) {
       }else {
          e = e.k(this.a).get(0).e;
          if (!this.f - e) {
             b = false;
          }
          this.f = e;
       }
       if (p0 == 102) {
          str = k.a(j.i, e.l(this.a), null, e.k(this.a), b);
       }else if(p0 == 101){
          List list = e.m(this.a);
          if (!by.a(list)) {
             str = k.a(j.i, e.l(this.a), list, e.k(this.a), b);
          }
       }
       str = "";
       if (this.c == null || (!TextUtils.isEmpty(str) && str.length() >= 25)) {
          StringBuffer str1 = bu.a((str.substring(22)).getBytes(), "SHA-256");
          if ((this.e).equals(str1)) {
             return;
          }else {
             this.e = str1;
             if (this.d == null) {
                this.d = new StringBuffer(e.n(this.a));
             }
             str1 = this.d+str+"\n";
             if ((this.d).length() <= e.n(this.a)) {
                e$a tb = this.b;
                if (tb != null && !tb.length()) {
                label_00cd :
                   this.b();
                   if (this.b.length() - this.a() > 0) {
                      bp.a(e.a(this.a), 106);
                   }
                }
             }else {
                goto label_00cd ;
             }
             if (bt.a()) {
                bt.a("DC_Pro", "write:"+str.substring(0, 60)+"***,len="+str.length());
             }
          }
       }
       return;
    }
    public final void a(int p0,File p1){
       if (!p1.isFile()) {
          return;
       }
       File uFile = new File(p1.getAbsolutePath()+"."+System.currentTimeMillis()+".enc");
       if (p0 == 4) {
          byte[] uobyteArray = bm.a(p1);
          if (!by.a(uobyteArray)) {
             uobyteArray = bf.a(uobyteArray);
             if (!by.a(uobyteArray)) {
                FileOutputStream uFileOutputS = new FileOutputStream(uFile, true);
                uFileOutputS.write(uobyteArray);
                uFileOutputS.close();
                p1.delete();
             }
          }
       }else {
          p1.renameTo(uFile);
       }
       if (bt.a()) {
          bt.a("DC_Pro", "rename:"+p1.getName()+" to "+uFile.getName());
       }
    label_00a6 :
       return;
    }
    public final void a(long p0,long p1){
       e$a uoa = this;
       File uFile = null;
       int i = (e.e(uoa.a) == null)? uFile: e.e(uoa.a).listFiles();
       if (i != null && i.length) {
          long l = System.currentTimeMillis();
          int len = i.length;
          int i1 = 0;
          long l1 = 0;
          String str = "DC_Pro";
          while (i1 < len) {
             object oobject = i[i1];
             if (!oobject.exists() || (oobject.isFile() && !(e.c()).equals(oobject.getName()))) {
                long l2 = l - oobject.lastModified();
                if (l2 - p0 > 0 || !oobject.length()) {
                   if (bt.a()) {
                      bt.a(str, "delete expired file:"+oobject.getName()+",len:"+oobject.length());
                   }
                   oobject.delete();
                }else {
                   str = oobject.getName();
                   l2 = l - oobject.lastModified();
                   if (l2 - 0xa4cb800 > 0 && (!str.endsWith(".enc") && str.startsWith(j.a()))) {
                      uoa.a(j.a(str), oobject);
                   }else {
                      l1 = l1 + oobject.length();
                      if (uFile == null || uFile.lastModified() - oobject.lastModified() > 0) {
                         uFile = oobject;
                      }
                   }
                }
             }
             i1 = i1 + 1;
          }
          if (l1 - p1 >= 0 && uFile != null) {
             if (bt.a()) {
                bt.a(str, "too big folder size:"+l1+", delete "+uFile.getName()+",size:"+uFile.length());
             }
             uFile.delete();
          }
       }
       return;
    }
    public final void a(Message p0){
       e$a tb;
       p0 = p0.what;
       boolean b = 107;
       String str = "DC_Pro";
       switch (p0){
           case 'e':
           case 'f':
             this.a(p0);
             break;
           case 'g':
             bt.a(str, "upload msg");
             if (!e.d(this.a)) {
                return;
             }else {
                String absolutePath = e.e(this.a).getAbsolutePath();
                if (!this.a(absolutePath)) {
                   this.a(absolutePath.replaceAll("f_c", "d_c"));
                }
             }
             break;
           case 'h':
             this.c();
             break;
           case 'i':
             this.b();
             e$a td = this.d;
             if (td != null) {
                td.setLength(0);
             }
             this.b = null;
             bm.a(this.c);
             this.a(e.f(this.a), e.g(this.a));
             this.removeCallbacksAndMessages(null);
             break;
           case 'j':
             this.d();
             if (e.e(this.a) != null) {
                tb = this.b;
                if (tb != null && tb.exists()) {
                   this.b();
                   long l = ca.b("LocationSDK", "log_fc_create", Long.valueOf(0)).longValue();
                   long l1 = System.currentTimeMillis();
                   if (bt.a()) {
                      bt.a(str, "desFileLen="+this.b.length()+",maxFileSize="+this.a()+",curT="+l1+",createT="+l+",maxTimeRename:"+e.h(this.a));
                   }
                   if (this.b.length() - this.a() > 0 || (l1 - l) - e.h(this.a) > 0) {
                      bt.a(str, "start rename file.");
                      this.f();
                      this.a(e.f(this.a), e.g(this.a));
                      if (j.f) {
                         this.sendEmptyMessage(b);
                      }
                   }
                }
             }
             return;
             break;
           case 'k':
             this.removeMessages(b);
             tb = this.a;
             e.a(tb, e.a(tb));
             bp.a(e.a(this.a), b, e.i(this.a));
             break;
           default:
       }
    label_013b :
       return;
    }
    public final boolean a(long p0){
       String str = "log_up_fc_date";
       SharedPreferences sharedPrefer = ca.a("LocationSDK");
       SharedPreferences$Editor uEditor = sharedPrefer.edit();
       String str1 = sharedPrefer.getString(str, "");
       long longx = sharedPrefer.getLong("log_up_fc_size", 0);
       String str2 = bh.a("yyyyMMdd").format(new Date());
       if (str2.equals(str1)) {
          if (longx - e.o(this.a) > 0) {
             return false;
          }else {
             uEditor.putLong("log_up_fc_size", (p0 + longx));
          }
       }else {
          uEditor.putString(str, str2);
          uEditor.putLong("log_up_fc_size", p0);
       }
       g.a(uEditor);
       return true;
    }
    public final boolean a(String p0){
       int b2;
       e$a uoa = this;
       String str = p0;
       File[] uFileArray = null;
       File uFile = (TextUtils.isEmpty(p0))? uFileArray: new File(str);
       if (uFile == null || (uFile.exists() && uFile.isDirectory())) {
          uFileArray = uFile.listFiles();
       }
    label_0025 :
       boolean b = false;
       if (uFileArray == null || !uFileArray.length) {
          if (uFileArray != null && str.endsWith("d_c")) {
             uFile.delete();
          }
          return b;
       }else {
          long l = System.currentTimeMillis();
          int i = e.j(uoa.a);
          int i1 = 0;
          while (i1 < uFileArray.length && i > 0) {
             object oobject = uFileArray[i1];
             String str1 = (oobject != null && (!oobject.exists() || !oobject.isFile()))? "": oobject.getName();
             String str2 = "dc";
             if (str1.startsWith(str2) || str1.startsWith("fc")) {
                if (str.endsWith("d_c")) {
                   if (oobject.length() - null) {
                      long l1 = l - oobject.lastModified();
                      if (l1 - e.f(uoa.a) <= 0) {
                      label_008e :
                         l1 = (str1.startsWith("fc2") || str1.startsWith("fc3"))? 1: 0;
                         String str3 = ".enc";
                         boolean b1 = (!str1.startsWith(j.a()) || (str1.endsWith(str3) || l1))? true: false;
                         String str4 = "DC_Pro";
                         if (!b1) {
                            if (bt.a()) {
                               bt.a(str4, str+",has no "+j.a()+"***"+str3+" files!!!");
                            }
                            if (str1.startsWith(str2)) {
                               long l2 = System.currentTimeMillis() - oobject.lastModified();
                               if (l2 - 0xa4cb800 > 0) {
                                  b2 = true;
                               label_0105 :
                                  b1 = b2;
                               }
                            }
                            b2 = false;
                            goto label_0105 ;
                         }
                         if (b1 && uoa.a(oobject.length())) {
                            if (bt.a()) {
                               bt.a(str4, "upload:"+oobject.getName()+",len="+oobject.length());
                            }
                            b2 = j.a(str1);
                            if (b2 > 0) {
                               String str5 = j.a(b2);
                               if (!TextUtils.isEmpty(str5)) {
                                  if (!j.e) {
                                     str5 = str5.replace("https:", "http:");
                                  }
                                  e.a(uoa.a, oobject, str5);
                                  i = i - 1;
                               }
                            }
                         }
                      }
                   }
                   oobject.delete();
                }else {
                   goto label_008e ;
                }
             }
          label_015f :
             i1 = i1 + 1;
          }
          if (i != e.j(uoa.a)) {
             b = true;
          }
          return b;
       }
    }
    public final void b(){
       e$a td = this.d;
       if (td == null || (td.length() && this.c != null)) {
          byte[] uobyteArray = l.a(this.d);
          if (bt.a()) {
             StringBuilder str = "write buf to file:buf:"+(this.d).length()+",enc:";
             int i = (uobyteArray == null)? 0: uobyteArray.length;
             bt.a("DC_Pro", str+i);
          }
          (this.d).setLength(0);
          if (uobyteArray == null || !uobyteArray.length) {
             bt.a("DC_Pro", "enc result is null or len = 0");
          }else {
             this.c.write(uobyteArray);
             this.c.write(36);
             this.c.flush();
             return;
          }
       }
    label_007a :
       return;
    }
    public final void c(){
       e$a tc = this.c;
       if (tc != null) {
          tc.flush();
       }
       return;
    }
    public final void d(){
       e$a tb = this.b;
       if (tb != null && (tb.exists() && (this.c == null || !(e.c()).equals(this.b.getName())))) {
          File uFile = this.e();
          this.b = uFile;
          this.c = new BufferedOutputStream(new FileOutputStream(this.b, true), 1024);
          if (!uFile.exists()) {
             ca.a("LocationSDK", "log_fc_create", Long.valueOf(System.currentTimeMillis()));
          }
       }
       return;
    }
    public final File e(){
       File uFile = e.e(this.a);
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       return new File(uFile, e.c());
    }
    public final void f(){
       this.c();
       e$a tb = this.b;
       if (tb != null && tb.length() - 1024 >= 0) {
          bm.a(this.c);
          this.c = null;
          this.a(4, this.b);
          this.b = null;
          ca.a("LocationSDK", "log_fc_create", Long.valueOf(0));
       }
       return;
    }
    public void handleMessage(Message p0){
       if (bt.a()) {
          bt.a("DC_Pro", "handleMessage:"+p0.what);
       }
       this.a(p0);
       return;
    }
}
