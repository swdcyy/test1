package com.tencent.open.b.b$1;
import java.lang.Runnable;
import com.tencent.open.b.b;
import com.tencent.open.b.c;
import java.lang.Object;
import java.util.List;
import android.content.Context;
import com.tencent.open.utils.f;
import com.tencent.open.utils.k;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.Throwable;

public class b$1 implements Runnable	// class@000f44
{
    public final c a;
    public final b b;

    public void b$1(b p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       b.a(this.b).add(this.a);
       if (!k.b(f.a())) {
          SLog.i("AttaReporter", "attaReport net disconnect, "+this.a);
          return;
       }else {
          try{
             b.b(this.b);
          }catch(java.lang.Exception e0){
             SLog.e("AttaReporter", "Exception", e0);
          }
          return;
       }
    }
}
