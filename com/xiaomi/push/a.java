package com.xiaomi.push.a;
import java.lang.Object;
import java.util.LinkedList;
import com.xiaomi.push.a$a;

public class a	// class@0010f9
{
    public LinkedList a;

    public void a(){
       this.a = new LinkedList();
    }
    public static a b(){
       return a$a.a();
    }
    public synchronized int a(){
       return this.a.size();
    }
    public synchronized LinkedList c(){
       a ta = this.a;
       this.a = new LinkedList();
       return ta;
    }
    public final void d(){
       if (this.a.size() > 100) {
          this.a.removeFirst();
       }
       return;
    }
    public synchronized void e(Object p0){
       this.a.add(new a$a(0, p0));
       this.d();
    }
}
