package com.sina.weibo.sdk.a.c$1;
import android.os.Handler;
import com.sina.weibo.sdk.a.c;
import android.os.Looper;
import android.os.Message;
import com.sina.weibo.sdk.a.c$a;
import java.lang.Object;

public final class c$1 extends Handler	// class@000b8f
{
    public final c Q;

    public void c$1(c p0,Looper p1){
       this.Q = p0;
       super(p1);
    }
    public final void handleMessage(Message p0){
       Message obj = p0.obj;
       if (p0.what != 1) {
       }else {
          c.a(obj.S, obj.T[0]);
          p0.obj = null;
       }
       return;
    }
}
