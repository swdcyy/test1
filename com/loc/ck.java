package com.loc.ck;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Thread;
import com.loc.ck$a;
import java.lang.Throwable;
import java.lang.String;
import com.loc.an;

public abstract class ck implements Runnable	// class@0013bf
{
    public ck$a e;

    public void ck(){
       super();
    }
    public abstract void a();
    public final void run(){
       if (Thread.interrupted()) {
          return;
       }
       this.a();
       if (Thread.interrupted()) {
          return;
       }
       ck te = this.e;
       if (te != null) {
          te.a(this);
       }
       return;
    }
}
