package com.tencent.connect.share.a$1;
import android.os.Handler;
import android.os.Looper;
import com.tencent.open.utils.d;
import android.os.Message;
import java.lang.String;
import java.util.ArrayList;

public final class a$1 extends Handler	// class@000e52
{
    public final d a;

    public void a$1(Looper p0,d p1){
       this.a = p1;
       super(p0);
    }
    public void handleMessage(Message p0){
       Message what = p0.what;
       if (what != 101) {
          if (what != 102) {
             super.handleMessage(p0);
             return;
          }else {
             this.a.a(p0.arg1, null);
             return;
          }
       }else {
          this.a.a(0, p0.obj);
          return;
       }
    }
}
