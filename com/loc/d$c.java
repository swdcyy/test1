package com.loc.d$c;
import android.os.Handler;
import com.loc.d;
import android.os.Looper;
import android.os.Message;
import android.os.Bundle;
import com.loc.g;
import com.amap.api.location.AMapLocationClientOption;
import com.loc.fj;
import java.lang.String;
import com.loc.fo;
import com.amap.api.location.AMapLocation;
import com.loc.h;
import java.lang.Throwable;

public final class d$c extends Handler	// class@0013d8
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void d$c(d p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void handleMessage(Message p0){
       Bundle data;
       d d;
       Message message;
       d c;
       String str = null;
       super.handleMessage(p0);
       d$c ta = this.a;
       if (ta.p != null) {
          return;
       }
       Message what = p0.what;
       if (what != 1) {
          if (what != 2) {
             if (what != 13) {
                switch (what){
                    case 5:
                      data = p0.getData();
                      data.putBundle("optBundle", fj.a(this.a.b));
                      d.a(this.a, 10, data);
                      return;
                    case 6:
                      data = p0.getData();
                      d = this.a.d;
                      if (d != null) {
                         d.a(data);
                         return;
                      }
                      break;
                    case 7:
                      d.b(this.a, p0.getData().getBoolean("ngpsAble"));
                      return;
                    case 8:
                      fo.a(str, 2141);
                   label_0102 :
                      message = Message.obtain();
                      message.what = 12;
                      message.obj = p0.obj;
                      this.a.z.sendMessage(message);
                      if (d.a(this.a) != null && d.a(this.a).getCacheCallBack()) {
                         c = this.a.c;
                         if (c != null) {
                            c.removeMessages(13);
                         }
                      }
                      break;
                    case 9:
                      d.b(p0.getData().getBoolean("installMockApp"));
                      break;
                    case 10:
                      d.a(ta, p0.obj);
                      return;
                    default:
                      switch (what){
                          case 'd':
                            fo.a(str, 2155);
                          case 'e':
                            message = Message.obtain();
                            message.what = 1028;
                            message.obj = p0.obj;
                            this.a.z.sendMessage(message);
                            if (d.a(this.a) != null && d.a(this.a).getCacheCallBack()) {
                               c = this.a.c;
                               if (c != null) {
                                  c.removeMessages(13);
                                  return;
                               }
                            }
                            break;
                          case 'f':
                          case 'g':
                            data = p0.getData();
                            if (d.b(this.a) != null) {
                               d.b(this.a).a(data);
                               return;
                            }
                            break;
                          default:
                      }
                      data = p0.getData();
                      data.putBundle("optBundle", fj.a(this.a.b));
                      d.a(this.a, 15, data);
                      return;
                }
             }else {
                c = ta.a;
                if (c != null) {
                   d.a(ta, c);
                   return;
                }else {
                   AMapLocation uAMapLocatio = new AMapLocation("LBS");
                   uAMapLocatio.setErrorCode(33);
                   d.a(this.a, uAMapLocatio);
                   return;
                }
             }
          }else {
             goto label_0102 ;
          }
          return;
       }else {
          message = ta.z.obtainMessage();
          message.what = 11;
          message.setData(p0.getData());
          this.a.z.sendMessage(message);
          return;
       }
    }
}
