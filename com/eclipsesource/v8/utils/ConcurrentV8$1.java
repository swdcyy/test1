package com.eclipsesource.v8.utils.ConcurrentV8$1;
import com.eclipsesource.v8.utils.V8Runnable;
import com.eclipsesource.v8.utils.ConcurrentV8;
import java.lang.Object;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.V8Value;

public class ConcurrentV8$1 implements V8Runnable	// class@001012
{
    public final ConcurrentV8 this$0;

    public void ConcurrentV8$1(ConcurrentV8 p0){
       this.this$0 = p0;
       super();
    }
    public void run(V8 p0){
       if (p0 != null && !p0.isReleased()) {
          p0.close();
       }
       return;
    }
}
