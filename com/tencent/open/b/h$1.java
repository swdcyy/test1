package com.tencent.open.b.h$1;
import android.os.Handler;
import com.tencent.open.b.h;
import android.os.Looper;
import android.os.Message;

public class h$1 extends Handler	// class@000f4b
{
    public final h a;

    public void h$1(h p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       Message what = p0.what;
       if (what != 1000) {
          if (what == 1001) {
             this.a.e();
          }
       }else {
          this.a.b();
       }
       super.handleMessage(p0);
       return;
    }
}
