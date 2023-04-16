package com.yxcorp.utility.i$b$c;
import java.lang.Runnable;
import com.yxcorp.utility.i$b;
import java.lang.Throwable;
import java.lang.Object;
import com.yxcorp.utility.i$d;

public class i$b$c implements Runnable	// class@0009c8
{
    public final Throwable b;
    public final i$b c;

    public void i$b$c(i$b p0,Throwable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       i$b$c tc = this.c;
       if (tc.i != null && !tc.b()) {
          this.c.i.onError(this.b);
       }
       return;
    }
}
