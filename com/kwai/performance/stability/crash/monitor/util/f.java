package com.kwai.performance.stability.crash.monitor.util.f;
import java.io.PrintWriter;
import android.util.Printer;
import com.kwai.performance.stability.crash.monitor.util.f$a;
import java.io.Writer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.System;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import java.lang.Appendable;
import qrd.l1;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;
import java.nio.charset.CharsetEncoder;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

public final class f extends PrintWriter	// class@000e47
{
    public final int b;
    public final char[] c;
    public int d;
    public final OutputStream e;
    public final boolean f;
    public final String g;
    public final Writer h;
    public final Printer i;
    public CharsetEncoder j;
    public final ByteBuffer k;
    public boolean l;

    public void f(Printer p0){
       super(new f$a(), true);
       Objects.requireNonNull(p0, "pr is null");
       this.b = 512;
       char[] uocharArray = new char[512];
       this.c = uocharArray;
       this.k = null;
       this.e = null;
       this.h = null;
       this.i = p0;
       this.f = true;
       String property = System.getProperty("line.separator");
       if (property == null) {
          property = "\n";
       }
       this.g = property;
       this.g();
       return;
    }
    public void f(OutputStream p0){
       super(new f$a(), false);
       Objects.requireNonNull(p0, "out is null");
       this.b = 8192;
       char[] uocharArray = new char[8192];
       this.c = uocharArray;
       this.k = ByteBuffer.allocate(8192);
       this.e = p0;
       this.h = null;
       this.i = null;
       this.f = false;
       String property = System.getProperty("line.separator");
       if (property == null) {
          property = "\n";
       }
       this.g = property;
       this.g();
       return;
    }
    public void f(Writer p0){
       super(p0, false, 8192);
    }
    public void f(Writer p0,boolean p1,int p2){
       super(new f$a(), p1);
       Objects.requireNonNull(p0, "wr is null");
       this.b = p2;
       char[] uocharArray = new char[p2];
       this.c = uocharArray;
       this.k = null;
       this.e = null;
       this.h = p0;
       this.i = null;
       this.f = p1;
       String property = System.getProperty("line.separator");
       if (property == null) {
          property = "\n";
       }
       this.g = property;
       this.g();
       return;
    }
    public final void a(char p0){
       f td = this.d;
       if (td >= (this.b - 1)) {
          this.f();
          td = this.d;
       }
       this.c[td] = p0;
       this.d = td + 1;
       return;
    }
    public PrintWriter append(CharSequence p0,int p1,int p2){
       a.p(p0, "csq");
       String str = p0.subSequence(p1, p2).toString();
       this.write(str, 0, str.length());
       return this;
    }
    public Writer append(CharSequence p0,int p1,int p2){
       this.append(p0, p1, p2);
       return this;
    }
    public Appendable append(CharSequence p0,int p1,int p2){
       this.append(p0, p1, p2);
       return this;
    }
    public final void b(String p0,int p1,int p2){
       f tb = this.b;
       if (p2 > tb) {
          p2 = p2 + p1;
          for (; p1 < p2; p1 = i) {
             int i = p1 + tb;
             f uof = (i < p2)? tb: p2 - p1;
             this.b(p0, p1, uof);
          }
          return;
       }else {
          f td = this.d;
          if ((td + p2) > tb) {
             this.f();
             td = this.d;
          }
          Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
          p0.getChars(p1, (p1 + p2), this.c, td);
          this.d = td + p2;
          return;
       }
    }
    public final void c(char[] p0,int p1,int p2){
       f tb = this.b;
       if (p2 > tb) {
          p2 = p2 + p1;
          for (; p1 < p2; p1 = i) {
             int i = p1 + tb;
             f uof = (i < p2)? tb: p2 - p1;
             this.c(p0, p1, uof);
          }
          return;
       }else {
          f td = this.d;
          if ((td + p2) > tb) {
             this.f();
             td = this.d;
          }
          System.arraycopy(p0, p1, this.c, td, p2);
          this.d = td + p2;
          return;
       }
    }
    public boolean checkError(){
       this.flush();
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       _monitor_enter(tlock);
       _monitor_exit(tlock);
       return this.l;
    }
    public void clearError(){
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       _monitor_enter(tlock);
       this.l = false;
       _monitor_exit(tlock);
    }
    public void close(){
       l1 a;
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       try{
          _monitor_enter(tlock);
          this.f();
          f te = this.e;
          if (te == null) {
             te = null;
          label_0016 :
             if (te == null) {
                te = this.h;
                if (te != null) {
                   te.close();
                   a = l1.a;
                }
             }
          }else {
             te.close();
             a = l1.a;
             goto label_0016 ;
          }
       }catch(java.io.IOException e0){
          this.setError();
          a = l1.a;
       }
       _monitor_exit(e0);
       return;
    }
    public final void e(){
       if (this.l == null) {
          f tk = this.k;
          a.m(tk);
          int i = tk.position();
          if (i > 0) {
             this.k.flip();
             f te = this.e;
             a.m(te);
             te.write(this.k.array(), 0, i);
             this.k.clear();
          }
       }
       return;
    }
    public final void f(){
       f tj;
       f td = this.d;
       if (td > null) {
          boolean b = true;
          if (this.e != null) {
             CharBuffer uCharBuffer = CharBuffer.wrap(this.c, 0, td);
             tj = this.j;
             a.m(tj);
             CoderResult uCoderResult = tj.encode(uCharBuffer, this.k, b);
             while (true) {
                if (this.l == null) {
                   if (!uCoderResult.isError()) {
                      if (uCoderResult.isOverflow()) {
                         this.e();
                         tj = this.j;
                         a.m(tj);
                         uCoderResult = tj.encode(uCharBuffer, this.k, b);
                      }else if(this.l == null){
                         this.e();
                         this.e.flush();
                      }
                   }else {
                      throw new IOException(uCoderResult.toString());
                   }
                }else {
                   goto label_0044 ;
                }
             }
          }else {
             tj = this.h;
             if (tj != null) {
                if (this.l == null) {
                   tj.write(this.c, 0, td);
                   this.h.flush();
                }
             }else {
                int i = (this.g).length();
                tj = this.d;
                if (i >= tj) {
                   i = tj;
                }
                int i1 = 0;
                while (i1 < i) {
                   int i2 = this.d - b;
                   i2 = i2 - i1;
                   f tg = this.g;
                   int i3 = tg.length() - b;
                   i3 = i3 - i1;
                   if (this.c[i2] == tg.charAt(i3)) {
                      i1 = i1 + 1;
                   }else if(i1 >= this.d){
                      td = this.i;
                      a.m(td);
                      td.println("");
                   }else {
                      td = this.i;
                      a.m(td);
                      td.println(new String(this.c, 0, (this.d - i1)));
                   }
                }
             }
          }
          this.d = 0;
       }
       return;
    }
    public void flush(){
       l1 a;
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       try{
          _monitor_enter(tlock);
          this.f();
          if (this.l == null) {
             f te = this.e;
             if (te == null) {
                te = null;
             }else {
                te.flush();
                a = l1.a;
             }
             if (te == null) {
                te = this.h;
                if (te != null) {
                   te.flush();
                }
             }
          }
       }catch(java.io.IOException e0){
          this.setError();
       }
       _monitor_exit(e0);
       return;
    }
    public final void g(){
       CharsetEncoder uCharsetEnco = Charset.defaultCharset().newEncoder();
       this.j = uCharsetEnco;
       if (uCharsetEnco == null) {
       }else {
          uCharsetEnco.onMalformedInput(CodingErrorAction.REPLACE);
       }
       f tj = this.j;
       if (tj != null) {
          tj.onUnmappableCharacter(CodingErrorAction.REPLACE);
       }
       return;
    }
    public void print(char p0){
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       try{
          _monitor_enter(tlock);
          this.a(p0);
       }catch(java.io.IOException e0){
          this.setError();
       }
       _monitor_exit(e0);
       return;
    }
    public void print(int p0){
       if (!p0) {
          this.print("0");
       }else {
          super.print(p0);
       }
       return;
    }
    public void print(long p0){
       if (!p0) {
          this.print("0");
       }else {
          super.print(p0);
       }
       return;
    }
    public void print(String p0){
       a.p(p0, "str");
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       _monitor_enter(tlock);
       try{
          int i = 0;
          this.b(p0, i, p0.length());
       }catch(java.io.IOException e0){
          this.setError();
       }
       _monitor_exit(e0);
       return;
    }
    public void print(char[] p0){
       a.p(p0, "charArray");
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       _monitor_enter(tlock);
       try{
          int i = 0;
          this.c(p0, i, p0.length);
       }catch(java.io.IOException e0){
          this.setError();
       }
       _monitor_exit(e0);
       return;
    }
    public void println(){
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       try{
          _monitor_enter(tlock);
          f tg = this.g;
          this.b(tg, 0, tg.length());
          if (this.f != null) {
             this.f();
          }
       }catch(java.io.IOException e0){
          this.setError();
       }
       _monitor_exit(e0);
       return;
    }
    public void println(char p0){
       this.print(p0);
       this.println();
    }
    public void println(int p0){
       if (!p0) {
          this.println("0");
       }else {
          super.println(p0);
       }
       return;
    }
    public void println(long p0){
       if (!p0) {
          this.println("0");
       }else {
          super.println(p0);
       }
       return;
    }
    public void println(char[] p0){
       a.p(p0, "chars");
       this.print(p0);
       this.println();
    }
    public void setError(){
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       _monitor_enter(tlock);
       this.l = true;
       _monitor_exit(tlock);
    }
    public void write(int p0){
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       _monitor_enter(tlock);
       try{
          char c = (char)p0;
          this.a(c);
       }catch(java.io.IOException e0){
          this.setError();
       }
       _monitor_exit(e0);
       return;
    }
    public void write(String p0){
       a.p(p0, "str");
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       _monitor_enter(tlock);
       try{
          int i = 0;
          this.b(p0, i, p0.length());
       }catch(java.io.IOException e0){
          this.setError();
       }
       _monitor_exit(e0);
       return;
    }
    public void write(String p0,int p1,int p2){
       a.p(p0, "str");
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       try{
          _monitor_enter(tlock);
          this.b(p0, p1, p2);
       }catch(java.io.IOException e0){
          this.setError();
       }
       _monitor_exit(e0);
       return;
    }
    public void write(char[] p0,int p1,int p2){
       a.p(p0, "buf");
       PrintWriter tlock = this.lock;
       a.o(tlock, "lock");
       try{
          _monitor_enter(tlock);
          this.c(p0, p1, p2);
       }catch(java.io.IOException e0){
          this.setError();
       }
       _monitor_exit(e0);
       return;
    }
}
