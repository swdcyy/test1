package com.tencent.open.utils.c$1;
import android.os.Handler;
import com.tencent.open.utils.c;
import android.os.Looper;
import android.os.Message;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.d;

public class c$1 extends Handler	// class@000f76
{
    public final c a;

    public void c$1(c p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       SLog.v("AsynLoadImg", "handleMessage:"+p0.arg1);
       if (p0.arg1 == null) {
          c.a(this.a).a(p0.arg1, p0.obj);
       }else {
          c.a(this.a).a(p0.arg1, null);
       }
       return;
    }
}
