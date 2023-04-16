package com.vivo.push.k;
import java.lang.Runnable;
import com.vivo.push.e;
import java.lang.String;
import java.lang.Object;
import com.vivo.push.e$a;

public final class k implements Runnable	// class@001085
{
    public final String a;
    public final e b;

    public void k(e p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void run(){
       e$a uoa = e.c(this.b, this.a);
       if (uoa != null) {
          Object[] objArray = new Object[0];
          uoa.a(1003, objArray);
       }
       return;
    }
}
