package com.loc.bd;
import java.io.Closeable;
import java.lang.String;
import java.util.regex.Pattern;
import java.nio.charset.Charset;
import com.loc.bd$1;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import com.loc.bd$3;
import java.io.File;
import java.lang.Object;
import java.util.LinkedHashMap;
import com.loc.bd$2;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.IllegalArgumentException;
import com.loc.bd$a;
import java.io.IOException;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.loc.bd$b;
import com.loc.bd$c;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.lang.IllegalStateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.loc.be;
import java.lang.Integer;
import java.util.Set;
import java.util.Map$Entry;

public final class bd implements Closeable	// class@00138a
{
    public final File e;
    public final File f;
    public final File g;
    public final File h;
    public final int i;
    public long j;
    public final int k;
    public long l;
    public Writer m;
    public int n;
    public final LinkedHashMap o;
    public int p;
    public long q;
    public final Callable s;
    public static final Pattern a;
    public static final Charset b;
    public static final Charset c;
    public static ThreadPoolExecutor d;
    public static final ThreadFactory r;
    public static final OutputStream t;

    static {
       bd.a = Pattern.compile("[a-z0-9_-]{1,120}");
       bd.b = Charset.forName("US-ASCII");
       bd.c = Charset.forName("UTF-8");
       bd$1 u1 = new bd$1();
       bd.r = u1;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), u1);
       bd.d = v0;
       bd.t = new bd$3();
    }
    public void bd(File p0,long p1){
       super();
       this.l = 0;
       this.n = 1000;
       this.o = new LinkedHashMap(0, 0x3f400000, true);
       this.q = 0;
       this.s = new bd$2(this);
       this.e = p0;
       this.i = 1;
       this.f = new File(p0, "journal");
       this.g = new File(p0, "journal.tmp");
       this.h = new File(p0, "journal.bkp");
       this.k = 1;
       this.j = p1;
    }
    public static bd a(File p0,long p1){
       if (p1 - null <= 0) {
          throw new IllegalArgumentException("maxSize <= 0");
       }
       File uFile = new File(p0, "journal.bkp");
       if (uFile.exists()) {
          File uFile1 = new File(p0, "journal");
          if (uFile1.exists()) {
             uFile.delete();
          }else {
             bd.a(uFile, uFile1, false);
          }
       }
       bd uobd = new bd(p0, p1);
       if (uobd.f.exists()) {
          uobd.g();
          uobd.h();
          uobd.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(uobd.f, true), bd.b));
          return uobd;
       }else {
          p0.mkdirs();
          uobd = new bd(p0, p1);
          uobd.i();
          return uobd;
       }
    }
    public static Writer a(bd p0){
       return p0.m;
    }
    public static void a(){
       ThreadPoolExecutor d = bd.d;
       if (d != null && !d.isShutdown()) {
          bd.d.shutdown();
       }
       return;
    }
    public static void a(bd p0,bd$a p1,boolean p2){
       p0.a(p1, p2);
    }
    public static void a(Closeable p0){
       if (p0 == null) {
          return;
       }
       try{
          p0.close();
          return;
       }catch(java.lang.RuntimeException e0){
          throw e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static void a(File p0){
       if (!p0.exists() || p0.delete()) {
          return;
       }
       throw new IOException();
    }
    public static void a(File p0,File p1,boolean p2){
       if (p2) {
          bd.a(p1);
       }
       if (p0.renameTo(p1)) {
          return;
       }else {
          throw new IOException();
       }
    }
    public static void b(bd p0){
       p0.l();
    }
    public static void b(File p0){
       object oobject;
       File[] uFileArray = p0.listFiles();
       if (uFileArray == null) {
          throw new IOException(("not a readable directory: ").concat(String.valueOf(p0)));
       }
       int len = uFileArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return;
          }
          oobject = uFileArray[i];
          if (oobject.isDirectory()) {
             bd.b(oobject);
          }
          if (oobject.delete()) {
             i = i + 1;
          }else {
             break ;
          }
       }
       throw new IOException(("failed to delete file: ").concat(String.valueOf(oobject)));
    }
    public static boolean c(bd p0){
       return p0.j();
    }
    public static void d(bd p0){
       p0.i();
    }
    public static int e(bd p0){
       p0.p = 0;
       return 0;
    }
    public static OutputStream e(){
       return bd.t;
    }
    public static void e(String p0){
       if (bd.a.matcher(p0).matches()) {
          return;
       }
       throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \""+p0+"\"");
    }
    public static int f(bd p0){
       return p0.k;
    }
    public static ThreadPoolExecutor f(){
       ThreadPoolExecutor d = bd.d;
       if (d == null || d.isShutdown()) {
          ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(256), bd.r);
          bd.d = d;
       }
       return bd.d;
    }
    public static File g(bd p0){
       return p0.e;
    }
    public synchronized final bd$b a(String p0){
       this.k();
       bd.e(p0);
       bd$c uoc = this.o.get(p0);
       bd$b uob = null;
       if (uoc == null) {
          return uob;
       }
       if (!bd$c.e(uoc)) {
          return uob;
       }
       InputStream[] inputStreamA = new InputStream[this.k];
       try{
          for (int i = 0; i < this.k; i = i + 1) {
             inputStreamA[i] = new FileInputStream(uoc.a(i));
          }
          this.p = this.p + 1;
          this.m.append("READ "+p0+10);
          if (this.j()) {
             bd.f().submit(this.s);
          }
          bd$b uob1 = new bd$b(this, p0, bd$c.f(uoc), inputStreamA, bd$c.c(uoc), 0);
          return uob;
       }catch(java.io.FileNotFoundException e0){
          if (null >= this.k || inputStreamA[0] == null) {
             return uob;
          }
          bd.a(inputStreamA[0]);
          int i1 = null + 1;
          goto label_0074 ;
       }
    }
    public final void a(int p0){
       if (p0 < 10) {
          p0 = 10;
       }else if(p0 > 0x2710){
          p0 = 0x2710;
       }
       this.n = p0;
       return;
    }
    public synchronized final void a(bd$a p0,boolean p1){
       bd$c uoc = bd$a.a(p0);
       if (bd$c.b(uoc) != p0) {
          throw new IllegalStateException();
       }
       int i = 0;
       if (p1 && !bd$c.e(uoc)) {
          int i1 = 0;
          while (true) {
             if (i1 < this.k) {
                if (bd$a.b(p0)[i1]) {
                   if (!uoc.b(i1).exists()) {
                      p0.c();
                      return;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   p0.c();
                   throw new IllegalStateException(("Newly created entry didn\'t create value for index ").concat(String.valueOf(i1)));
                }
             }
          }
       }
       while (i < this.k) {
          File uFile = uoc.b(i);
          if (p1) {
             if (uFile.exists()) {
                File uFile1 = uoc.a(i);
                uFile.renameTo(uFile1);
                long l = bd$c.c(uoc)[i];
                long l1 = uFile1.length();
                uFile[i] = l1;
                long l2 = this.l - l;
                l2 = l2 + l1;
                this.l = l2;
             }
          }else {
             bd.a(uFile);
          }
          i = i + 1;
       }
       this.p = this.p + 1;
       bd$c.a(uoc, null);
       char c = 10;
       if (bd$c.e(uoc) | p1) {
          bd$c.a(uoc);
          this.m.write("CLEAN "+bd$c.d(uoc)+uoc.a()+c);
          if (p1) {
             bd tq = this.q;
             this.q = 1 + tq;
             bd$c.a(uoc, tq);
          }
       }else {
          this.o.remove(bd$c.d(uoc));
          this.m.write("REMOVE "+bd$c.d(uoc)+c);
       }
       this.m.flush();
       if (this.l - this.j > 0 || this.j()) {
          bd.f().submit(this.s);
       }
       return;
    }
    public final bd$a b(String p0){
       return this.d(p0);
    }
    public final File b(){
       return this.e;
    }
    public synchronized final void c(){
       this.k();
       this.l();
       this.m.flush();
    }
    public synchronized final boolean c(String p0){
       this.k();
       bd.e(p0);
       bd$c uoc = this.o.get(p0);
       boolean b = false;
       if (uoc == null || bd$c.b(uoc) != null) {
          return b;
       }
       while (true) {
          if (b < this.k) {
             File uFile = uoc.a(b);
             if (!uFile.exists() || uFile.delete()) {
                long l = this.l - bd$c.c(uoc)[b];
                this.l = l;
                bd$c.c(uoc)[b] = 0;
                b = b + 1;
             }else {
                throw new IOException(("failed to delete ").concat(String.valueOf(uFile)));
             }
          }else {
             this.p = this.p + 1;
             this.m.append("REMOVE "+p0+10);
             this.o.remove(p0);
             if (this.j()) {
                bd.f().submit(this.s);
                break ;
             }
             break ;
          }
       }
       return 1;
    }
    public synchronized final void close(){
       if (this.m == null) {
          return;
       }
       Iterator iterator = new ArrayList(this.o.values()).iterator();
       while (iterator.hasNext()) {
          bd$c uoc = iterator.next();
          if (bd$c.b(uoc) != null) {
             bd$c.b(uoc).c();
          }
       }
       this.l();
       this.m.close();
       this.m = null;
       return;
    }
    public synchronized final bd$a d(String p0){
       this.k();
       bd.e(p0);
       bd$c uoc = this.o.get(p0);
       byte b = 0;
       if (uoc == null) {
          uoc = new bd$c(this, p0, b);
          this.o.put(p0, uoc);
       }else if(bd$c.b(uoc) != null){
          return null;
       }
       bd$a uoa = new bd$a(this, uoc, b);
       bd$c.a(uoc, uoa);
       this.m.write("DIRTY "+p0+10);
       this.m.flush();
       return uoa;
    }
    public final void d(){
       this.close();
       bd.b(this.e);
    }
    public final void g(){
       String str6;
       String str = ", ";
       be uobe = new be(new FileInputStream(this.f), bd.b);
       String str1 = uobe.a();
       String str2 = uobe.a();
       String str3 = uobe.a();
       String str4 = uobe.a();
       String str5 = uobe.a();
       if (!("libcore.io.DiskLruCache").equals(str1) || (!("1").equals(str2) || (!(Integer.toString(this.i)).equals(str3) || (!(Integer.toString(this.k)).equals(str4) || !("").equals(str5))))) {
          throw new IOException("unexpected journal header: ["+str1+str+str2+str+str4+str+str5+"]");
       }
       byte b = 0;
       int i = 0;
       try{
          while (true) {
             str2 = uobe.a();
             int i1 = 32;
             int i2 = str2.indexOf(i1);
             if (i2 == -1) {
                throw new IOException("unexpected journal line: ".concat(str2));
             }
             int i3 = i2 + 1;
             i1 = str2.indexOf(i1, i3);
             if (i1 == -1) {
                str6 = str2.substring(i3);
                if (i2 == 6 && str2.startsWith("REMOVE")) {
                   this.o.remove(str6);
                }else {
                label_0086 :
                   bd$c uoc = this.o.get(str6);
                   if (uoc == null) {
                      uoc = new bd$c(this, str6, b);
                      this.o.put(str6, uoc);
                   }
                   i3 = 5;
                   if (i1 != -1 && (i2 == i3 && str2.startsWith("CLEAN"))) {
                      i1 = i1 + 1;
                      str2 = str2.substring(i1);
                      bd$c.a(uoc);
                      bd$c.a(uoc, null);
                      bd$c.a(uoc, str2.split(" "));
                   }else if(i1 == -1 && (i2 == i3 && str2.startsWith("DIRTY"))){
                      bd$c.a(uoc, new bd$a(this, uoc, b));
                   }else if(i1 == -1 && (i2 == 4 && str2.startsWith("READ"))){
                      break ;
                   }
                }
             }else {
                str6 = str2.substring(i3, i1);
                goto label_0086 ;
             }
             i = i + 1;
          }
          throw new IOException("unexpected journal line: ".concat(str2));
       }catch(java.io.EOFException e0){
          this.p = i - this.o.size();
          bd.a(uobe);
          return;
       }
    }
    public final void h(){
       int i;
       bd.a(this.g);
       Iterator iterator = this.o.values().iterator();
       while (iterator.hasNext()) {
          bd$c uoc = iterator.next();
          if (bd$c.b(uoc) == null) {
             for (i = 0; i < this.k; i = i + 1) {
                long l = this.l + bd$c.c(uoc)[i];
                this.l = l;
             }
          }else {
             bd$c.a(uoc, null);
             for (; i < this.k; i = i + 1) {
                bd.a(uoc.a(i));
                bd.a(uoc.b(i));
             }
             iterator.remove();
          }
       }
       return;
    }
    public synchronized final void i(){
       bd tm = this.m;
       if (tm != null) {
          tm.close();
       }
       BufferedWriter uBufferedWri = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g), bd.b));
       uBufferedWri.write("libcore.io.DiskLruCache");
       uBufferedWri.write("\n");
       uBufferedWri.write("1");
       uBufferedWri.write("\n");
       uBufferedWri.write(Integer.toString(this.i));
       uBufferedWri.write("\n");
       uBufferedWri.write(Integer.toString(this.k));
       uBufferedWri.write("\n");
       uBufferedWri.write("\n");
       Iterator iterator = this.o.values().iterator();
       while (iterator.hasNext()) {
          bd$c uoc = iterator.next();
          char c = 10;
          String str = (bd$c.b(uoc) != null)? "DIRTY "+bd$c.d(uoc)+c: "CLEAN "+bd$c.d(uoc)+uoc.a()+c;
          uBufferedWri.write(str);
       }
       uBufferedWri.close();
       boolean b = true;
       if (this.f.exists()) {
          bd.a(this.f, this.h, b);
       }
       bd.a(this.g, this.f, false);
       this.h.delete();
       this.m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f, b), bd.b));
       return;
    }
    public final boolean j(){
       bd tp = this.p;
       if (tp >= 2000 && tp >= this.o.size()) {
          return true;
       }
       return false;
    }
    public final void k(){
       if (this.m != null) {
          return;
       }
       throw new IllegalStateException("cache is closed");
    }
    public final void l(){
       while (this.l - this.j > 0 || this.o.size() > this.n) {
          this.c(this.o.entrySet().iterator().next().getKey());
       }
       return;
    }
}
