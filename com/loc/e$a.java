package com.loc.e$a;
import android.os.Handler;
import com.loc.e;
import android.os.Looper;
import android.os.Message;
import android.os.Bundle;
import java.lang.String;
import com.loc.fo;
import com.loc.eo;
import com.loc.ei;
import android.os.Messenger;
import com.amap.api.location.AMapLocation;
import java.lang.Throwable;
import com.loc.fj;
import java.util.List;
import java.lang.Object;
import com.loc.ej;

public final class e$a extends Handler	// class@0013f7
{
    public final e a;

    public void e$a(e p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public final void handleMessage(Message p0){
       e$a uoa = 1;
       String str = null;
       Bundle data = p0.getData();
       Message replyTo = p0.replyTo;
       if (data != null && (!data.isEmpty() && !this.a.a(data.getString("c")))) {
          if (p0.what == uoa) {
             fo.a(str, 2102);
             eo uoeo = e.b("invalid handlder scode!!!#1002");
             ei uoei = new ei();
             uoei.f("#1002");
             uoei.e("conitue");
             e.a(this.a, replyTo, uoeo, uoeo.k(), uoei);
          }
          return;
       }else {
          Message what = p0.what;
          if (what != null) {
             if (what != uoa) {
                switch (what){
                    case 9:
                      e.a(this.a, data);
                      e.a(this.a);
                      break;
                    case 10:
                      e.a(this.a, data);
                      uoa = this.a;
                      str = "FINE_LOC";
                   label_006c :
                      uoa.a(replyTo, data, str);
                      break;
                    case 11:
                      this.a.c();
                      break;
                    case 12:
                      e.a(this.a, replyTo);
                      break;
                    case 13:
                      what = p0.replyTo;
                      if (what != null && (e.b(this.a) != null && !e.b(this.a).contains(what))) {
                         e.b(this.a).add(what);
                         if (e.b(this.a).size() == uoa) {
                            e.c(this.a);
                         }
                      }
                      break;
                    case 14:
                      Message replyTo1 = p0.replyTo;
                      if (replyTo1 != null && (e.b(this.a) != null && e.b(this.a).contains(replyTo1))) {
                         e.b(this.a).remove(replyTo1);
                      }
                      if (e.b(this.a) != null && !e.b(this.a).size()) {
                         this.a.f.h();
                      }
                      break;
                    case 15:
                      e.a(this.a, data);
                      uoa = this.a;
                      str = "COARSE_LOC";
                      goto label_006c ;
                      break;
                    default:
                }
             }else {
                e.a(this.a, data);
                e.b(this.a, replyTo, data);
             }
          }else {
             e.a(this.a, data);
             e.a(this.a, replyTo, data);
          }
       label_0118 :
          super.handleMessage(p0);
          return;
       }
    }
}
