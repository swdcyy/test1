package com.loc.d$a;
import android.os.Handler;
import com.loc.d;
import android.os.Looper;
import android.os.Message;
import com.amap.api.location.AMapLocation;
import com.loc.g;
import com.amap.api.location.AMapLocationClientOption;
import com.loc.h;
import android.content.Context;
import com.loc.fq;
import com.amap.api.location.AMapLocationListener;
import android.os.Bundle;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fj;

public final class d$a extends Handler	// class@0013d6
{
    public final d a;

    public void d$a(d p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void handleMessage(Message p0){
       d$a ta;
       String str = null;
       super.handleMessage(p0);
       Message what = p0.what;
       if (what != 11) {
          if (what != 12) {
             if (what != 1011) {
                switch (what){
                    case 1002:
                      d.a(this.a, p0.obj);
                      return;
                    case 1003:
                      d.e(this.a);
                      d.a(this.a, 13, str);
                      return;
                    case 1004:
                      d.f(this.a);
                      d.a(this.a, 14, str);
                      return;
                    case 1005:
                      d.b(this.a, p0.obj);
                      return;
                    default:
                      long l = 0x493e0;
                      switch (what){
                          case 1014:
                            d.b(this.a, p0);
                            return;
                          case 1015:
                            ta = this.a;
                            ta.d.a(ta.b);
                            d.a(this.a, 1025, l);
                            return;
                          case 1016:
                            if (fq.m(d.c(this.a))) {
                               d.g(this.a);
                               return;
                            }else if(this.a.d.b()){
                               d.a(this.a, 1016, 1000);
                               return;
                            }else {
                               d.h(this.a);
                               return;
                            }
                            break;
                          case 1017:
                            this.a.d.a();
                            d.i(this.a);
                            return;
                          case 1018:
                            d$a ta1 = this.a;
                            p0 = p0.obj;
                            ta1.b = p0;
                            if (p0 != null) {
                               d.j(ta1);
                            label_008c :
                               return;
                            }else {
                               goto label_008c ;
                            }
                            break;
                          default:
                            switch (what){
                                case 1023:
                                  d.c(this.a, p0);
                                  return;
                                case 1024:
                                  d.d(this.a, p0);
                                  return;
                                case 1025:
                                  if (this.a.d.f()) {
                                     this.a.d.a();
                                     ta = this.a;
                                     ta.d.a(ta.b);
                                  }
                                  d.a(this.a, 1025, l);
                                  goto label_008c ;
                                  break;
                                case 1026:
                                  d.b(this.a).a(this.a.b);
                                  return;
                                case 1027:
                                  d.b(this.a).a();
                                  return;
                                case 1028:
                                  d.b(this.a, p0.obj);
                                  return;
                                default:
                                  goto label_008c ;
                            }
                      }
                }
             }else {
                d.a(this.a, 14, str);
                this.a.g();
                return;
             }
          }else {
             d.a(this.a, p0);
             return;
          }
       }else {
          d.a(this.a, p0.getData());
          return;
       }
    }
}
