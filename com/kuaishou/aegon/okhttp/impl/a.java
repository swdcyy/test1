package com.kuaishou.aegon.okhttp.impl.a;
import okio.m;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;
import java.lang.InterruptedException;
import java.io.IOException;
import java.lang.IllegalStateException;
import okio.o;
import java.util.concurrent.TimeUnit;
import okio.b;
import java.lang.Long;
import java.nio.Buffer;

public class a implements m	// class@0007bc
{
    public boolean b;
    public boolean c;
    public ByteBuffer d;
    public long e;

    public void a(long p0){
       super();
       this.b = false;
       this.c = false;
       this.d = null;
       this.e = 0;
       if (p0 > 0) {
          this.e = p0;
       }
       return;
    }
    public boolean a(ByteBuffer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.hasRemaining()) {
          throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
       }
       int i = p0.position();
       _monitor_enter(this);
       this.d = p0;
       this.notifyAll();
       long l = System.nanoTime() + (this.e * 0xf4240);
       while (this.d.position() <= i && (this.c == null && (this.b == null && System.nanoTime() - l <= 0))) {
          try{
             this.wait(this.e);
          }catch(java.lang.InterruptedException e3){
             e3.printStackTrace();
             goto label_002f ;
          }
       }
       if (this.b != null) {
          throw new IOException("interrupted");
       }
       if (System.nanoTime() - l > 0) {
          throw new IOException("timeout");
       }
       this.d = null;
       if (this.c == null && p0.position() <= i) {
          throw new IOException();
       }
       _monitor_exit(this);
       return this.c;
    }
    public void close(){
    }
    public void flush(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       _monitor_enter(this);
       this.c = true;
       this.notifyAll();
       _monitor_exit(this);
       return;
    }
    public o timeout(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e <= 0) {
          return o.NONE;
       }
       return new o().timeout(this.e, TimeUnit.MILLISECONDS);
    }
    public void write(b p0,long p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, a.class, "1")) {
          return;
       }
       while (true) {
          if (p1 <= 0) {
             return;
          }
          _monitor_enter(this);
          long l = this.e * 0xf4240;
          long l1 = System.nanoTime() + l;
          a td = this.d;
          while (td == null || (!td.hasRemaining() && (this.b == null && System.nanoTime() - l1 <= 0))) {
             try{
                this.wait(this.e);
             }catch(java.lang.InterruptedException e2){
                e2.printStackTrace();
                goto label_002a ;
             }
          }
          if (this.b != null) {
             throw new IOException("interrupted");
          }
          if (System.nanoTime() - l1 <= 0) {
             int i = this.d.limit();
             if ((long)this.d.remaining() - p1 > 0) {
                a td1 = this.d;
                l = (long)td1.position() + p1;
                td1.limit((int)l);
             }
             this.d.limit(i);
             p1 = p1 - (long)p0.read(this.d);
             this.notifyAll();
             _monitor_exit(this);
          }else {
          }
       }
       throw new IOException("timeout");
    }
}
