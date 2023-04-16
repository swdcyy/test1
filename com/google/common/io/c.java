package com.google.common.io.c;
import java.io.Closeable;
import com.google.common.io.c$b;
import com.google.common.io.c$a;
import com.google.common.io.c$c;
import java.lang.Object;
import java.util.ArrayDeque;
import ok.n;
import java.util.Deque;
import java.lang.Throwable;
import java.io.IOException;
import java.lang.Class;
import com.google.common.base.b;
import java.lang.AssertionError;

public final class c implements Closeable	// class@0018ea
{
    public final c$c b;
    public final Deque c;
    public Throwable d;
    public static final c$c e;

    static {
       c$a a;
       c$b uob = (c$b.b != null)? 1: null;
       uob = (uob)? c$b.a: c$a.a;
       c.e = uob;
    }
    public void c(c$c p0){
       super();
       this.c = new ArrayDeque(4);
       n.j(p0);
       this.b = p0;
    }
    public void close(){
       c td = this.d;
       while (!this.c.isEmpty()) {
          this.c.removeFirst().close();
       }
       if (this.d != null || td == null) {
          return;
       }
       b.d(td, IOException.class);
       throw new AssertionError(td);
    }
}
