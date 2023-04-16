package gkd.a;
import java.io.Closeable;
import java.lang.String;
import java.util.regex.Pattern;
import gkd.a$b;
import java.io.File;
import java.lang.Object;
import java.util.LinkedHashMap;
import gkd.a$a;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import hkd.b;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.io.IOException;
import java.lang.System;
import java.lang.StringBuilder;
import java.io.PrintStream;
import java.lang.IllegalArgumentException;
import qkd.b;
import java.lang.IllegalStateException;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.ArrayList;
import java.util.Collection;
import gkd.a$d;
import gkd.a$c;
import java.io.Writer;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import gkd.a$e;
import java.io.InputStream;
import java.io.FileInputStream;
import java.lang.CharSequence;
import ekd.p;
import gkd.b;
import java.nio.charset.Charset;
import java.lang.Integer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Long;
import java.util.regex.Matcher;

public final class a implements Closeable	// class@000f4a
{
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final int f;
    public long g;
    public final int h;
    public long i;
    public Writer j;
    public final LinkedHashMap k;
    public int l;
    public long m;
    public final ThreadPoolExecutor n;
    public final Callable o;
    public static final Pattern p;
    public static final OutputStream q;

    static {
       a.p = Pattern.compile("[a-zA-Z0-9\\._-]+");
       a.q = new a$b();
    }
    public void a(File p0,int p1,int p2,long p3){
       a uoa = this;
       File uFile = p0;
       super();
       uoa.i = 0;
       uoa.k = new LinkedHashMap(0, 0x3f400000, true);
       uoa.m = 0;
       uoa.o = new a$a(uoa);
       uoa.b = uFile;
       uoa.f = p1;
       uoa.c = new File(uFile, "journal");
       uoa.d = new File(uFile, "journal.tmp");
       uoa.e = new File(uFile, "journal.bkp");
       uoa.h = p2;
       uoa.g = p3;
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new b("disk-lru-cache-pool"));
       uoa.n = uFile;
       uFile.allowCoreThreadTimeOut(true);
    }
    public static void f(File p0){
       if (!p0.exists() || p0.delete()) {
          return;
       }
       throw new IOException();
    }
    public static a l(File p0,int p1,int p2,long p3){
       if (p3 - null <= 0) {
          throw new IllegalArgumentException("maxSize <= 0");
       }
       if (p2 <= 0) {
          throw new IllegalArgumentException("valueCount <= 0");
       }
       File uFile = new File(p0, "journal.bkp");
       if (uFile.exists()) {
          File uFile1 = new File(p0, "journal");
          if (uFile1.exists()) {
             uFile.delete();
          }else {
             a.v(uFile, uFile1, false);
          }
       }
       a uoa = new a(p0, p1, p2, p3);
       if (uFile.c.exists()) {
          try{
             uFile.p();
             uFile.o();
             return uFile;
          }catch(java.io.IOException e1){
             System.out.println("DiskLruCache "+p0+" is corrupt: "+e1.getMessage()+", removing");
             uFile.e(v2);
          }
          p0.mkdirs();
          uoa = new a(p0, p1, p2, p3);
          uFile.s();
          return uFile;
       }else {
          goto label_006e ;
       }
    }
    public static void v(File p0,File p1,boolean p2){
       if (p2) {
          a.f(p1);
       }
       if (b.k0(p0, p1)) {
          return;
       }else {
          throw new IOException();
       }
    }
    public final void a(){
       if (this.j != null) {
          return;
       }
       throw new IllegalStateException("cache is closed");
    }
    public synchronized void c(){
       while (this.i > 0 && this.k.size() > 0) {
          this.u(this.k.entrySet().iterator().next().getKey());
       }
       return;
    }
    public synchronized void close(){
       if (this.j == null) {
          return;
       }
       Iterator iterator = new ArrayList(this.k.values()).iterator();
       while (iterator.hasNext()) {
          a$d d = iterator.next().d;
          if (d != null) {
             d.a();
          }
       }
       this.y();
       this.j.close();
       this.j = null;
       return;
    }
    public synchronized void d(a$c p0,boolean p1){
       a$c a = p0.a;
       if (a.d != p0) {
          throw new IOException();
       }
       int i = 0;
       if (p1 && a.c == null) {
          int i1 = 0;
          while (true) {
             if (i1 < this.h) {
                if (p0.b[i1]) {
                   if (!a.b(i1).exists()) {
                      p0.a();
                      return;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   p0.a();
                   throw new IOException("Newly created entry didn\'t create value for index "+i1);
                }
             }
          }
       }
       while (i < this.h) {
          File uFile = a.b(i);
          if (p1) {
             if (uFile.exists()) {
                File uFile1 = a.a(i);
                b.k0(uFile, uFile1);
                long l = a.b[i];
                long l1 = uFile1.length();
                uFile[i] = l1;
                long l2 = this.i - l;
                l2 = l2 + l1;
                this.i = l2;
             }
          }else {
             a.f(uFile);
          }
          i = i + 1;
       }
       i = 1;
       this.l = this.l + i;
       a.d = null;
       char c = 10;
       if (a.c | p1) {
          a.c = i;
          this.j.write("CLEAN "+a.a+a.c()+c);
          if (p1) {
             a tm = this.m;
             this.m = 1 + tm;
             a.e = tm;
          }
       }else {
          this.k.remove(a.a);
          this.j.write("REMOVE "+a.a+c);
       }
       this.j.flush();
       if (this.i - this.g > 0 || this.k()) {
          this.n.submit(this.o);
       }
       return;
    }
    public void e(boolean p0){
       this.close();
       b.o(this.b, p0);
    }
    public synchronized void flush(){
       this.a();
       this.y();
       this.j.flush();
    }
    public a$c g(String p0){
       a$c uoc;
       _monitor_enter(this);
       this.a();
       this.z(p0);
       a$d uod = this.k.get(p0);
       a$a uoa = null;
       if (uod == null) {
          uod = new a$d(this, p0, uoa);
          this.k.put(p0, uod);
       }else {
          uoc = uod.d;
          if (uoc != null) {
             _monitor_exit(this);
          label_004b :
             return uoc;
          }
       }
       uoc = new a$c(this, uod, uoa);
       uod.d = uoc;
       this.j.write("DIRTY "+p0+10);
       this.j.flush();
       _monitor_exit(this);
       goto label_004b ;
    }
    public synchronized a$e h(String p0){
       this.a();
       this.z(p0);
       a$d uod = this.k.get(p0);
       a$e uoe = null;
       if (uod == null) {
          return uoe;
       }
       if (uod.c == null) {
          return uoe;
       }
       a th = this.h;
       InputStream[] inputStreamA = new InputStream[th];
       File[] uFileArray = new File[th];
       try{
          for (int i = 0; i < this.h; i = i + 1) {
             inputStreamA[i] = new FileInputStream(uod.a(i));
             uFileArray[i] = uod.a(i);
          }
          this.l = this.l + 1;
          this.j.append("READ "+p0+10);
          if (this.k()) {
             this.n.submit(this.o);
          }
          a$e uoe1 = new a$e(this, p0, uod.e, inputStreamA, uFileArray, uod.b, null);
          return uoe;
       }catch(java.io.FileNotFoundException e0){
          if (null >= this.h || inputStreamA[0] == null) {
             return uoe;
          }
          p.c(inputStreamA[0]);
          int i1 = null + 1;
          goto label_0077 ;
       }
    }
    public synchronized boolean isClosed(){
       boolean b = (this.j == null)? true: false;
       return b;
    }
    public File j(){
       return this.b;
    }
    public boolean k(){
       a tl = this.l;
       boolean b = (tl >= 2000 && tl >= this.k.size())? true: false;
       return b;
    }
    public final void o(){
       int i;
       a.f(this.d);
       Iterator iterator = this.k.values().iterator();
       while (iterator.hasNext()) {
          a$d uod = iterator.next();
          if (uod.d == null) {
             for (i = 0; i < this.h; i = i + 1) {
                long l = this.i + uod.b[i];
                this.i = l;
             }
          }else {
             uod.d = null;
             for (; i < this.h; i = i + 1) {
                a.f(uod.a(i));
                a.f(uod.b(i));
             }
             iterator.remove();
          }
       }
       return;
    }
    public final void p(){
       boolean b;
       String str = ", ";
       b uob = new b(new FileInputStream(this.c), b.a);
       String str1 = uob.c();
       String str2 = uob.c();
       String str3 = uob.c();
       String str4 = uob.c();
       String str5 = uob.c();
       if (!("libcore.io.DiskLruCache").equals(str1) || (!("1").equals(str2) || (!(Integer.toString(this.f)).equals(str3) || (!(Integer.toString(this.h)).equals(str4) || !("").equals(str5))))) {
          throw new IOException("unexpected journal header: ["+str1+str+str2+str+str4+str+str5+"]");
       }
       int i = 0;
       try{
          while (true) {
             this.r(uob.c());
             i = i + 1;
          }
       }catch(java.io.EOFException e0){
          this.l = i - this.k.size();
          b = true;
          if (uob.f == -1) {
             BufferedWriter uBufferedWri = 1;
          }
          if (uBufferedWri) {
             this.s();
          }else {
             this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, b), b.a));
          }
          p.b(uob);
          return;
       }
    }
    public final void r(String p0){
       String str1;
       int i = 32;
       int i1 = p0.indexOf(i);
       String str = "unexpected journal line: ";
       if (i1 == -1) {
          throw new IOException(str+p0);
       }
       int i2 = i1 + 1;
       i = p0.indexOf(i, i2);
       if (i == -1) {
          str1 = p0.substring(i2);
          if (i1 == 6 && p0.startsWith("REMOVE")) {
             this.k.remove(str1);
             return;
          }
       }else {
          str1 = p0.substring(i2, i);
       }
       a$d uod = this.k.get(str1);
       if (uod == null) {
          uod = new a$d(this, str1, null);
          this.k.put(str1, uod);
       }
       str1 = 5;
       if (i != -1 && (i1 == str1 && p0.startsWith("CLEAN"))) {
          String[] stringArray = (p0.substring((i + 1))).split(" ");
          uod.c = true;
          uod.d = null;
          if (stringArray.length == uod.f.h) {
             try{
                for (i = 0; i < stringArray.length; i = i + 1) {
                   uod.b[i] = Long.parseLong(stringArray[i]);
                }
             }catch(java.lang.NumberFormatException e0){
                uod.d(stringArray);
                throw null;
             }
          }else {
             uod.d(stringArray);
             throw null;
          }
       }else if(i == -1 && (i1 == str1 && p0.startsWith("DIRTY"))){
          uod.d = new a$c(this, uod, null);
       }else if(i == -1 && (i1 == 4 && p0.startsWith("READ"))){
          throw new IOException(str+p0);
       }
       return;
    }
    public synchronized void s(){
       boolean b;
       a tj = this.j;
       if (tj != null) {
          tj.close();
       }
       BufferedWriter uBufferedWri = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), b.a));
       uBufferedWri.write("libcore.io.DiskLruCache");
       uBufferedWri.write("\n");
       uBufferedWri.write("1");
       uBufferedWri.write("\n");
       uBufferedWri.write(Integer.toString(this.f));
       uBufferedWri.write("\n");
       uBufferedWri.write(Integer.toString(this.h));
       uBufferedWri.write("\n");
       uBufferedWri.write("\n");
       Iterator iterator = this.k.values().iterator();
       while (iterator.hasNext()) {
          a$d uod = iterator.next();
          char c = 10;
          if (uod.d != null) {
             uBufferedWri.write("DIRTY "+uod.a+c);
          }else {
             uBufferedWri.write("CLEAN "+uod.a+uod.c()+c);
          }
       }
       uBufferedWri.close();
       b = true;
       if (this.c.exists()) {
          a.v(this.c, this.e, b);
       }
       a.v(this.d, this.c, false);
       this.e.delete();
       this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, b), b.a));
       return;
    }
    public synchronized boolean u(String p0){
       this.a();
       this.z(p0);
       a$d uod = this.k.get(p0);
       boolean b = false;
       if (uod == null || uod.d != null) {
          return b;
       }
       while (true) {
          if (b < this.h) {
             File uFile = uod.a(b);
             if (!uFile.exists() || uFile.delete()) {
                a$d b1 = uod.b;
                long l = this.i - b1[b];
                this.i = l;
                b1[b] = 0;
                b = b + 1;
             }else {
                throw new IOException("failed to delete "+uFile);
             }
          }else {
             this.l = this.l + 1;
             this.j.append("REMOVE "+p0+10);
             this.k.remove(p0);
             if (this.k()) {
                this.n.submit(this.o);
                break ;
             }
             break ;
          }
       }
       return 1;
    }
    public synchronized long x(){
       return this.i;
    }
    public void y(){
       while (this.i - this.g > 0) {
          this.u(this.k.entrySet().iterator().next().getKey());
       }
       return;
    }
    public final void z(String p0){
       if (a.p.matcher(p0).matches()) {
          return;
       }
       throw new IllegalArgumentException("keys must match regex [a-zA-Z0-9\\._-]+: \""+p0+"\"");
    }
}
