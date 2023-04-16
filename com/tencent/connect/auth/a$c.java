package com.tencent.connect.auth.a$c;
import android.os.Handler;
import com.tencent.connect.auth.a;
import com.tencent.connect.auth.a$b;
import android.os.Looper;
import android.os.Message;
import android.content.Context;
import java.lang.String;

public class a$c extends Handler	// class@000e28
{
    public final a a;
    public a$b b;

    public void a$c(a p0,a$b p1,Looper p2){
       this.a = p0;
       super(p2);
       this.b = p1;
    }
    public void handleMessage(Message p0){
       Message what = p0.what;
       if (what != 1) {
          if (what != 2) {
             if (what == 3) {
                a.a(a.a(this.a), p0.obj);
             }
          }else {
             this.b.onCancel();
          }
       }else {
          a$b.a(this.b, p0.obj);
       }
       return;
    }
}
