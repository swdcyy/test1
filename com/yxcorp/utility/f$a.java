package com.yxcorp.utility.f$a;
import android.os.Handler;
import com.yxcorp.utility.f;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.util.Queue;
import com.yxcorp.utility.f$c;
import android.os.SystemClock;
import java.lang.Long;
import brd.g;

public class f$a extends Handler	// class@0009bd
{
    public final f a;

    public void f$a(f p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       long l;
       int i;
       f$a ta = this.a;
       _monitor_enter(ta);
       while (true) {
          f$c uoc = this.a.b.peek();
          if (uoc == null) {
             this.a.a();
             _monitor_exit(ta);
             return;
          }else {
             l = uoc.e - SystemClock.elapsedRealtime();
             long l1 = uoc.d - SystemClock.elapsedRealtime();
             i = 1;
             long l2 = 0;
             if ((v8 = l1 - l2) > 0 && l - l2 > 0) {
                break ;
             }else {
                this.a.b.poll();
                if (!uoc.isDisposed()) {
                   if (v8 > 0) {
                      f$c c = uoc.c;
                      if (c - l2) {
                         f$c f = uoc.f;
                         long l3 = l1 % c;
                         if (l3 - l2) {
                            l1 = l1 / c;
                            l1 = l1 + 1;
                            l1 = l1 * c;
                         }
                         f.onNext(Long.valueOf(l1));
                         do {
                            l1 = uoc.e + uoc.c;
                            uoc.e = l1;
                         } while (l1 - SystemClock.elapsedRealtime() >= 0);
                         this.a.b.offer(uoc);
                      }
                   }
                   uoc.b = i;
                   uoc.f.onNext(Long.valueOf(l2));
                   uoc.f.onComplete();
                }
             }
          }
       }
       this.sendMessageDelayed(this.obtainMessage(i), l);
       _monitor_exit(ta);
       return;
    }
}
