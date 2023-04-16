package com.yxcorp.utility.i$b$b;
import java.lang.Runnable;
import com.yxcorp.utility.i$b;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.utility.i$d;

public class i$b$b implements Runnable	// class@0009c7
{
    public final String b;
    public final i$b c;

    public void i$b$b(i$b p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       i$b$b tc = this.c;
       if (tc.i != null && !tc.b()) {
          tc = this.c;
          tc.i.c(this.b, tc.g);
       }
       return;
    }
}
