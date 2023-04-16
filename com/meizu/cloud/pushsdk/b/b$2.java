package com.meizu.cloud.pushsdk.b.b$2;
import java.lang.Runnable;
import com.meizu.cloud.pushsdk.b.b;
import java.lang.Object;
import java.util.List;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;
import com.meizu.cloud.pushsdk.b.e;
import java.lang.String;
import java.util.Iterator;
import com.meizu.cloud.pushsdk.b.b$a;

public class b$2 implements Runnable	// class@00149c
{
    public final b a;

    public void b$2(b p0){
       this.a = p0;
       super();
    }
    public void run(){
       b$2 ta;
       List list = b.a(this.a);
       _monitor_enter(list);
       b.b(this.a).removeCallbacksAndMessages(null);
       ArrayList uArrayList = new ArrayList(b.a(this.a));
       b.a(this.a).clear();
       try{
          _monitor_exit(list);
          b.d(this.a).a(b.c(this.a));
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             b$a uoa = iterator.next();
             b.d(this.a).a(uoa.a, uoa.b, uoa.c);
          }
          ta = this.a;
       }catch(java.lang.Exception e0){
          ta = this.a;
       }catch(java.lang.Exception e0){
          return;
       }
    }
}
