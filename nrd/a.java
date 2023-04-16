package nrd.a;
import brd.k;
import cxd.d;
import cxd.c;
import java.lang.Object;
import io.reactivex.internal.util.a;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Throwable;
import ird.a;
import java.lang.NullPointerException;
import java.lang.String;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

public final class a implements k, d	// class@001eb6
{
    public final c actual;
    public final boolean b;
    public d c;
    public boolean d;
    public a e;
    public boolean f;

    public void a(c p0){
       super();
       this.actual = p0;
       this.b = false;
    }
    public void cancel(){
       this.c.cancel();
    }
    public void onComplete(){
       if (this.f != null) {
          return;
       }
       _monitor_enter(this);
       if (this.f != null) {
          _monitor_exit(this);
          return;
       }else if(this.d != null){
          a te = this.e;
          if (te == null) {
             te = new a(4);
             this.e = te;
          }
          te.a(NotificationLite.complete());
          _monitor_exit(this);
          return;
       }else {
          this.f = true;
          this.d = true;
          _monitor_exit(this);
          this.actual.onComplete();
          return;
       }
    }
    public void onError(Throwable p0){
       if (this.f != null) {
          a.l(p0);
          return;
       }else {
          _monitor_enter(this);
          boolean b = true;
          if (this.f == null) {
             if (this.d != null) {
                this.f = b;
                a te = this.e;
                if (te == null) {
                   te = new a(4);
                   this.e = te;
                }
                p0 = NotificationLite.error(p0);
                if (this.b != null) {
                   te.a(p0);
                }else {
                   te.c(p0);
                }
                _monitor_exit(this);
                return;
             }else {
                this.f = b;
                this.d = b;
                b = 0;
             }
          }
          _monitor_exit(this);
          if (b) {
             a.l(p0);
             return;
          }else {
             this.actual.onError(p0);
             return;
          }
       }
    }
    public void onNext(Object p0){
       if (this.f != null) {
          return;
       }
       if (p0 == null) {
          this.c.cancel();
          this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
          return;
       }else {
          _monitor_enter(this);
          if (this.f != null) {
             _monitor_exit(this);
             return;
          }else if(this.d != null){
             a te = this.e;
             if (te == null) {
                te = new a(4);
                this.e = te;
             }
             te.a(NotificationLite.next(p0));
             _monitor_exit(this);
             return;
          }else {
             this.d = true;
             _monitor_exit(this);
             this.actual.onNext(p0);
             do {
                _monitor_enter(this);
                p0 = this.e;
                boolean b = false;
                if (p0 == null) {
                   this.d = b;
                   _monitor_exit(this);
                   break ;
                }else {
                   this.e = null;
                   _monitor_exit(this);
                   a tactual = this.actual;
                   a b1 = p0.b;
                   p0 = p0.a;
                   while (b1 != null) {
                      int i = 0;
                      while (true) {
                         if (i < p0) {
                            object oobject = b1[i];
                            if (oobject == null) {
                            label_0069 :
                               b1 = b1[p0];
                            }else if(NotificationLite.acceptFull(oobject, tactual)){
                               b = true;
                            }else {
                               i = i + 1;
                            }
                         }else {
                            goto label_0069 ;
                         }
                      }
                   }
                   if (!b) {
                      continue ;
                   }
                }
                break ;
             } while (b);
             return;
          }
       }
    }
    public void onSubscribe(d p0){
       if (SubscriptionHelper.validate(this.c, p0)) {
          this.c = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void request(long p0){
       this.c.request(p0);
    }
}
