package com.tencent.open.log.a;
import android.os.Handler$Callback;
import com.tencent.open.log.Tracer;
import com.tencent.open.log.g;
import com.tencent.open.log.b;
import com.tencent.open.log.f;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Looper;
import android.os.Handler;
import com.tencent.open.log.c;
import java.io.File;
import java.lang.System;
import com.tencent.tauth.Tencent;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Thread;
import java.lang.Throwable;
import java.io.Writer;
import java.lang.Object;
import java.io.FileWriter;
import android.os.Message;

public class a extends Tracer implements Handler$Callback	// class@000f61
{
    public b a;
    public FileWriter b;
    public FileWriter c;
    public File d;
    public File e;
    public char[] f;
    public f g;
    public f h;
    public f i;
    public f j;
    public boolean k;
    public HandlerThread l;
    public Handler m;

    public void a(int p0,boolean p1,g p2,b p3){
       super(p0, p1, p2);
       this.k = false;
       this.a(p3);
       this.g = new f();
       this.h = new f();
       this.i = this.g;
       this.j = this.h;
       char[] uocharArray = new char[p3.d()];
       this.f = uocharArray;
       HandlerThread handlerThrea = new HandlerThread(p3.c(), p3.f());
       this.l = handlerThrea;
       handlerThrea.start();
       if (this.l.isAlive() && this.l.getLooper() != null) {
          this.m = new Handler(this.l.getLooper(), this);
       }
       return;
    }
    public void a(b p0){
       super(c.b, true, g.a, p0);
    }
    public void a(){
       if (this.m.hasMessages(1024)) {
          this.m.removeMessages(1024);
       }
       this.m.sendEmptyMessage(1024);
       return;
    }
    public void a(b p0){
       this.a = p0;
    }
    public final void a(File p0){
       p0 = p0.getParentFile();
       if (p0 == null || (p0.exists() && p0.isDirectory())) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray == null) {
             return;
          }else {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                if (this.b(oobject)) {
                   String name = oobject.getName();
                   String str = name.substring(32, 43);
                   long l = System.currentTimeMillis();
                   long l1 = (Tencent.USE_ONE_HOUR)? 0x36ee80: 0xf731400;
                   l = l - l1;
                   if ((b.a(l)).compareTo(str) > 0) {
                      SLog.d("FileTracer", "delete name="+name+", success="+oobject.delete());
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public final void a(String p0){
       this.i.a(p0);
       if (this.i.a() >= this.c().d()) {
          this.a();
       }
       return;
    }
    public void b(){
       this.h();
       this.i();
       this.l.quit();
    }
    public final boolean b(File p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       String name = p0.getName();
       SLog.d("FileTracer", "name="+name);
       if (TextUtils.isEmpty(name)) {
          return b;
       }
       if (name.length() != 47) {
          return b;
       }
       if (name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log")) {
          b = true;
       }
       return b;
    }
    public b c(){
       return this.a;
    }
    public void doTrace(int p0,Thread p1,long p2,String p3,String p4,Throwable p5){
       this.a(this.e().a(p0, p1, p2, p3, p4, p5));
    }
    public final void f(){
       if (Thread.currentThread() != this.l) {
          return;
       }
       if (this.k != null) {
          return;
       }
       this.k = true;
       try{
          this.j();
          this.j.a(this.g(), this.f);
       }catch(java.io.IOException e0){
          SLog.e("FileTracer", "flushBuffer exception", e0);
       }
       this.j.b();
       this.k = false;
       return;
    }
    public final Writer[] g(){
       object oobject1;
       File[] uFileArray = this.c().a();
       int i = 0;
       int i1 = 2;
       if (uFileArray != null && uFileArray.length >= i1) {
          object oobject = uFileArray[i];
          if (oobject == null || (!oobject.equals(this.d) || (this.b == null && oobject != null))) {
             this.d = oobject;
             try{
                this.h();
                this.b = new FileWriter(this.d, true);
             }catch(java.io.IOException e0){
                this.b = null;
                SLog.e("openSDK_LOG", "-->obtainFileWriter\(\) old log file permission denied");
             }
          }
       }
    label_0066 :
       Writer[] writerArray = new Writer[i1];
       writerArray[i] = this.b;
       writerArray[1] = this.c;
       return writerArray;
    }
    public final void h(){
       try{
          a tb = this.b;
          if (tb != null) {
             tb.flush();
             this.b.close();
          }
       }catch(java.io.IOException e0){
          SLog.e("openSDK_LOG", "-->closeFileWriter\(\) exception:", e0);
       }
       return;
    }
    public boolean handleMessage(Message p0){
       if (p0.what != 1024) {
       }else {
          this.f();
       }
       return true;
    }
    public final void i(){
       try{
          a tc = this.c;
          if (tc != null) {
             tc.flush();
             this.c.close();
          }
       }catch(java.io.IOException e0){
          SLog.e("openSDK_LOG", "-->closeAppSpecificFileWriter\(\) exception:", e0);
       }
       return;
    }
    public final void j(){
       _monitor_enter(this);
       if (this.i == this.g) {
          this.i = this.h;
          this.j = this.g;
       }else {
          this.i = this.g;
          this.j = this.h;
       }
       _monitor_exit(this);
       return;
    }
}
