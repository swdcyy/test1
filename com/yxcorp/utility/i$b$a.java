package com.yxcorp.utility.i$b$a;
import java.lang.Runnable;
import com.yxcorp.utility.i$b;
import java.lang.Object;
import com.yxcorp.utility.i$d;

public class i$b$a implements Runnable	// class@0009c6
{
    public final i$b b;

    public void i$b$a(i$b p0){
       this.b = p0;
       super();
    }
    public void run(){
       i$b$a tb = this.b;
       if (tb.i != null && !tb.b()) {
          this.b.i.a();
       }
       return;
    }
}
