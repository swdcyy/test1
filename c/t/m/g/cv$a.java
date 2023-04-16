package c.t.m.g.cv$a;
import android.os.Handler;
import c.t.m.g.cv;
import android.os.Looper;
import java.lang.Object;
import java.util.List;
import c.t.m.g.dv;
import c.t.m.g.cf;
import java.lang.System;
import c.t.m.g.cu;
import android.location.Location;
import c.t.m.g.cs;
import android.os.Bundle;
import java.lang.String;
import c.t.m.g.dv$a;
import c.t.m.g.ed;
import java.lang.StringBuilder;
import android.os.Message;
import com.tencent.map.geolocation.TencentLocationListener;
import c.t.m.g.ef;
import c.t.m.g.cv$b;
import com.tencent.map.geolocation.TencentLocationRequest;
import android.util.Pair;
import c.t.m.g.cz$a;
import c.t.m.g.dh;
import c.t.m.g.dj;
import c.t.m.g.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import c.t.m.g.p;
import c.t.m.g.ax;
import c.t.m.g.ce;
import android.content.Context;
import c.t.m.g.dw;
import c.t.m.g.cd;
import java.lang.Math;
import c.t.m.g.q;
import c.t.m.g.ej;
import c.t.m.g.dk;
import com.tencent.map.geolocation.TencentLocation;
import c.t.m.g.cz;
import java.lang.Throwable;

public class cv$a extends Handler	// class@000c27
{
    public final cv a;
    public long b;
    public boolean c;
    public boolean d;
    public int e;

    public void cv$a(cv p0,Looper p1){
       this.a = p0;
       super(p1);
       this.e = 0;
       this.b = 0;
       this.c = false;
       this.d = false;
    }
    public void a(){
       this.e = 0;
       this.removeCallbacksAndMessages(null);
    }
    public final void a(int p0){
       if (cv.v(this.a) != null) {
          if (!cv.h(this.a)) {
             cv$a ta = this.a;
             cv.a(ta, cv.g(ta), cv.h(this.a), 3103);
          }else {
             cv.a(this.a, dv.a, p0, 3103);
          }
          cv.c(this.a, 0);
       }
       return;
    }
    public final void b(){
       if (!cv.u(this.a).l() - null) {
          cv.u(this.a).b((System.currentTimeMillis() - cv.u(this.a).k()));
       }
       return;
    }
    public final void b(int p0){
       double doublex;
       Location location = cv.w(this.a).a();
       if (location != cs.b && (!cv.j(this.a) && (System.currentTimeMillis() - location.getTime()) - 0x1d4c0 <= 0)) {
          Location location1 = new Location(location);
          Bundle extras = location1.getExtras();
          String str = null;
          if (extras != null) {
             str = extras.getDouble("lat");
             doublex = extras.getDouble("lng");
          }else {
             doublex = str;
          }
          dv uodv = new dv$a().b("network").a(location).a();
          if (cv.m(this.a) == 1) {
             location1.setLatitude(str);
             location1.setLongitude(doublex);
             uodv.a(location1);
          }
          if (!cv.t(this.a)) {
             cv.a(this.a, 0, uodv);
             if (ed.a) {
                ed.a("UPDATE_LOCATION", "handleLocationFailed: "+uodv.toString());
             }
          }
          this.a(0);
       }else if(!cv.h(this.a) && (cv.g(this.a) != null && (System.currentTimeMillis() - cv.g(this.a).getTime()) - 0xea60 < 0)){
          this.a(0);
       }else {
          cv.a(this.a, p0, dv.a);
          this.a(p0);
          if (ed.a) {
             ed.a("UPDATE_LOCATION", "handleLocationFailed: error location");
          }
       }
       return;
    }
    public void handleMessage(Message p0){
       StringBuilder str;
       int i3;
       String str4;
       cv$a uoa = this;
       Message message = p0;
       TencentLocationRequest obj = cv.b(uoa.a);
       _monitor_enter(obj);
       if (!ef.b(cv.c(uoa.a)) && cv.d(uoa.a) == cv$b.a) {
          _monitor_exit(obj);
          return;
       }else {
          _monitor_exit(obj);
          obj = cv.e(uoa.a);
          int requestLevel = obj.getRequestLevel();
          long l = cv.f(uoa.a);
          Message what = message.what;
          if (what != 554) {
             dv uodv = null;
             int i = 3999;
             if (what != 555) {
                if (what != 3991) {
                   int i1 = 0;
                   boolean b = true;
                   if (what != 3997) {
                      int i2 = 3101;
                      if (what != i) {
                         long l1 = 0;
                         if (what != 7999) {
                            str = 4998;
                            if (what != str) {
                               try{
                                  if (what != 4999) {
                                     if (what != 0x2ede) {
                                        if (what == 0x2edf) {
                                           if (ed.a) {
                                              ed.a("TxLocationManagerImpl", "MSG_ID_TIMED_CALLBACK");
                                           }
                                           if (cv.g(uoa.a) != null && obj.getInterval() - l1 > 0) {
                                              cv$a a = uoa.a;
                                              cv.a(a, cv.g(a));
                                              a = uoa.a;
                                              cv.a(a, cv.g(a), cv.h(uoa.a), i2);
                                              if (ed.a) {
                                                 ed.a("TxLocationManagerImpl", "MSG_ID_TIMED_CALLBACK mLastLocation: "+cv.g(uoa.a).toString());
                                              }
                                           }
                                           if (l - l1 > 0) {
                                              uoa.sendEmptyMessageDelayed(0x2edf, l);
                                           }
                                        }
                                     }else if(ed.a){
                                        ed.a("TxLocationManagerImpl", "MSG_ID_DIRECT_CALLBACK");
                                     }
                                     if (cv.g(uoa.a) != null) {
                                        cv$a a1 = uoa.a;
                                        cv.a(a1, cv.g(a1));
                                        a1 = uoa.a;
                                        cv.a(a1, cv.g(a1), cv.h(uoa.a), i2);
                                     }
                                  }else if(ed.a){
                                     ed.a("TxLocationManagerImpl", "MSG_ID_HTTP_LOCATION_RESPONSE");
                                  }
                                  this.b();
                                  uoa.removeMessages(str);
                                  message = message.obj;
                                  String str1 = message.first.toString();
                                  Pair second = message.second;
                                  cv.a(uoa.a, second.a.a());
                                  if (ed.a) {
                                     ed.a("TxLocationManagerImpl", "MSG_ID_HTTP_LOCATION_RESPONSE -> response: "+str1);
                                  }
                                  try{
                                     dv uodv1 = new dv$a().a(str1).a(requestLevel).b("network").a();
                                     if (uodv1.isMockGps() == b) {
                                        uoa.d = b;
                                     }
                                     dv.a(uodv1);
                                     if (cv.r(uoa.a) != null) {
                                        cv.r(uoa.a).a(uodv1.b(), cv.m(uoa.a), uodv1.getLatitude(), uodv1.getLongitude(), (double)uodv1.getAccuracy());
                                     }
                                     cv.b(uoa.a, System.currentTimeMillis());
                                     i3 = TextUtils.isEmpty(uodv1.getIndoorBuildingId()) ^ b;
                                     if (i3 && cv.s(uoa.a) == b) {
                                        cv.a(uoa.a, 2);
                                        uoa.e = i1;
                                     }
                                     if (cv.s(uoa.a) == 2) {
                                        uoa.e = (!i3)? uoa.e + b: i1;
                                        if (uoa.e >= 5) {
                                           if (ed.a) {
                                              ed.b("TxLocationManagerImpl", "indoor stop,"+cv.e(uoa.a).getInterval());
                                           }
                                           cv.a(uoa.a, b);
                                           uoa.e = i1;
                                        }
                                     }
                                     if (ed.a) {
                                        ed.a("UPDATE_LOCATION", "isGpsValid\(\): "+cv.t(uoa.a)+", isIndoorLocation: "+i3+", mIndoorLocationStatus: "+cv.s(uoa.a));
                                     }
                                     if (!cv.t(uoa.a) || (i3 && cv.s(uoa.a) > 0)) {
                                        dv.a(uodv1, i3);
                                        cv.a(uoa.a, i1, uodv1);
                                        if (ed.a) {
                                           ed.a("UPDATE_LOCATION", "MSG_ID_HTTP_LOCATION_RESPONSE updateLastLocation: "+uodv1.toString());
                                        }
                                     }
                                     if (cv.g(uoa.a) != null) {
                                        dv.a(cv.g(uoa.a), uodv1);
                                     }
                                     uoa.a(i1);
                                     cv.b(uoa.a, uodv1);
                                     if (cv.d(uoa.a) == cv$b.a) {
                                        p.c().e();
                                     }
                                     dw.a(cv.a(uoa.a).a);
                                  }catch(org.json.JSONException e0){
                                     if (ed.a) {
                                        ed.b("TxLocationManagerImpl", "handleMessage: location failed");
                                     }
                                     cd.c().a("LOC", "server location error.");
                                     cd.c().a("LOC", "request:"+e0);
                                     cd.c().a("LOC", "response:"+str1);
                                     uoa.b(404);
                                     return;
                                  }
                               }catch(java.lang.Exception e0){
                               }
                            }else if(ed.a){
                               ed.a("TxLocationManagerImpl", "MSG_ID_HTTP_LOCATION_TIMEOUT");
                            }
                            if (!cv.u(uoa.a).l() - l1) {
                               cv.u(uoa.a).b(-1);
                            }
                            uoa.b(b);
                            cv.b(uoa.a, -1);
                         }else if(ed.a){
                            ed.a("TxLocationManagerImpl", "MSG_ID_NETWORK_CONNECTED");
                         }
                         if (cv.i(uoa.a)) {
                            return;
                         }else {
                            l = Math.max(cv.e(uoa.a).getInterval(), 4000);
                            if (!cv.j(uoa.a) - l1 || (System.currentTimeMillis() - cv.j(uoa.a)) - l < 0) {
                               return;
                            }else if(ed.a){
                               ed.a("TxLocationManagerImpl", "network connected --> prepare json");
                            }
                         }
                      }
                      if (ed.a) {
                         ed.a("TxLocationManagerImpl", "MSG_ID_PREPARE_JSON");
                      }
                      cv.a(uoa.a, b);
                      uoa.removeMessages(i);
                      if (ed.a) {
                         ed.b("TxLocationManagerImpl", "the daemonLocation");
                      }
                      cv$b b1 = cv$b.b;
                      if (cv.d(uoa.a) == b1 || cv.k(uoa.a)) {
                         long l2 = q.a().c("up_daemon_delay");
                         str = 0x1d4c0;
                         if (l2 - str < 0) {
                            l2 = str;
                         }
                         if (ed.a) {
                            ed.b("TxLocationManagerImpl", "the daemonLocation, so we delay long time upload:"+l2+","+System.currentTimeMillis()+","+cv.l(uoa.a));
                         }
                         if ((System.currentTimeMillis() - cv.l(uoa.a)) - l2 >= 0) {
                            cv.a(uoa.a, System.currentTimeMillis());
                         }else if(ed.a){
                            ed.b("TxLocationManagerImpl", "the daemonLocation, < daeInterval");
                         }
                         return;
                      }
                      i3 = cv.m(uoa.a);
                      if (ed.a) {
                         ed.b("TxLocationManagerImpl", "getFromLastKnownInfo");
                      }
                      dh uodh = cv.n(uoa.a);
                      if (uodh == null) {
                         if (ed.a) {
                            ed.b("TxLocationManagerImpl", "info is null");
                         }
                         cd.c().a("LOC", "info is null.");
                         uoa.b(2);
                         return;
                      }else if(uodh.b() && (System.currentTimeMillis() - uoa.b) - 0xea60 > 0){
                         uoa.c = b;
                         uoa.d = i1;
                         uoa.b = System.currentTimeMillis();
                      }else {
                         uoa.c = i1;
                      }
                      if (ed.a) {
                         ed.b("TxLocationManagerImpl", "toJsonString");
                      }
                      String str2 = cv.o(uoa.a);
                      ce uoce = cv.a(uoa.a);
                      cv$a c = uoa.c;
                      cv$a d = uoa.d;
                      int i4 = (cv.d(uoa.a) == b1)? 1: 0;
                      dh uodh1 = uodh;
                      String str3 = uodh.a(requestLevel, str2, uoce, c, d, i4);
                      if (ed.a) {
                         ed.a("TxLocationManagerImpl", "json = "+str3);
                      }
                      int i5 = (str3 == null || !ej.a(str3))? 1: 0;
                      if (i5) {
                         if (ed.a) {
                            ed.b("TxLocationManagerImpl", "handleMessage: bad json ");
                         }
                         cd.c().a("LOC", "bad json "+str3);
                         uoa.b(2);
                         return;
                      }else if(ed.a){
                         ed.b("TxLocationManagerImpl", "RUNNING_STATUS");
                      }
                      if (cv.d(uoa.a) == cv$b.a && dk.a(obj)) {
                         dv uodv2 = new dv$a().a(uodv).a(requestLevel).a();
                         dk.a(uodv2, str3.getBytes("UTF-8"));
                         cv.a(uoa.a, uodv2);
                         cv.a(uoa.a, uodv2, i1, i2);
                         if (ed.a) {
                            ed.b("TxLocationManagerImpl", "mRunningStatus");
                         }
                         return;
                      }else if(!dk.a){
                         if (ed.a) {
                            ed.b("TxLocationManagerImpl", "!MOCK_LOCATION_FILTER");
                         }
                         return;
                      }else if(ed.a){
                         ed.b("TxLocationManagerImpl", "postLocationRequest");
                      }
                      cv.p(uoa.a).a(str3, uodh1, i3);
                   }else if(ed.a){
                      ed.a("TxLocationManagerImpl", "MSG_ID_SINGLE_PREPARE_JSON");
                   }
                   dh uodh2 = cv.n(uoa.a);
                   if (uodh2 != null) {
                      uodv = uodh2.a(requestLevel, cv.o(uoa.a), cv.a(uoa.a), false, false, false);
                      if (ed.a) {
                         ed.a("TxLocationManagerImpl", "json3 = "+uodv);
                      }
                      i1 = ej.a(uodv) ^ 0x01;
                   }
                   if (uodh2 == null || i1) {
                      if (ed.a) {
                         str4 = (uodh2 == null)? "info3 is null": "handleMessage: bad json "+uodv;
                         ed.b("TxLocationManagerImpl", str4);
                      }
                      uoa.b(2);
                      return;
                   }else {
                      cv.p(uoa.a).a(uodv, uodh2, cv.m(uoa.a));
                   }
                }else if(ed.a){
                   ed.a("TxLocationManagerImpl", "MSG_ID_CHECK_PREPARE_JSON");
                }
                if (!cv.q(uoa.a)) {
                   if (ed.a) {
                      ed.a("TxLocationManagerImpl", "send prepare json beacase no cell wifi gps");
                   }
                   uoa.sendEmptyMessage(i);
                   cd.c().a("P", "time out");
                }else if(ed.a){
                   ed.a("TxLocationManagerImpl", "donot send prepare json beacase already send");
                }
             }else if(ed.a){
                ed.a("TxLocationManagerImpl", "MSG_ID_CLEAR_WIFI");
             }
             cv.b(uoa.a, uodv);
             cd.c().a("WIFI", "wifi clear req");
             uoa.sendEmptyMessage(i);
          }else if(ed.a){
             ed.a("TxLocationManagerImpl", "MSG_ID_UPLOAD_WIFI");
          }
          Bundle data = p0.getData();
          if (data != null) {
             str4 = data.getString("WIFIS");
             if (TextUtils.isEmpty(str4)) {
                return;
             }else {
                cv.p(uoa.a).a(str4);
             }
          }
       }
    }
}
