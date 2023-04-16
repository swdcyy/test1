package com.alibaba.android.bindingx.core.internal.d$h0;
import java.lang.Object;
import java.util.ArrayDeque;
import java.util.Deque;

public class d$h0	// class@000e0a
{
    public final ArrayDeque a;

    public void d$h0(int p0){
       super();
       this.a = new ArrayDeque(p0);
    }
    public void a(Object p0){
       if (this.a.size() >= 4) {
          this.a.removeFirst();
          this.a.addLast(p0);
       }else {
          this.a.addLast(p0);
       }
       return;
    }
    public Deque b(){
       return this.a;
    }
}
