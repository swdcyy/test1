package com.meizu.cloud.pushsdk.c.g.n;
import com.meizu.cloud.pushsdk.c.g.n$1;
import java.lang.Object;
import java.lang.Thread;
import java.lang.System;
import java.io.InterruptedIOException;
import java.lang.String;

public class n	// class@0014fb
{
    public boolean b;
    public long c;
    public static final n a;

    static {
       n.a = new n$1();
    }
    public void n(){
       super();
    }
    public void a(){
       if (Thread.interrupted()) {
          throw new InterruptedIOException("thread interrupted");
       }
       if (this.b == null || (this.c - System.nanoTime()) > 0) {
          return;
       }
       throw new InterruptedIOException("deadline reached");
    }
}
