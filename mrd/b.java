package mrd.b;
import io.reactivex.internal.util.a$a;
import mrd.c;
import java.lang.Throwable;
import io.reactivex.internal.util.a;
import java.lang.Object;
import io.reactivex.internal.util.NotificationLite;
import brd.y;
import ird.a;
import crd.b;
import brd.t;

public final class b extends c implements a$a	// class@001d3e
{
    public final c actual;
    public boolean b;
    public a c;
    public boolean d;

    public void b(c p0){
       super();
       this.actual = p0;
    }
    public Throwable b(){
       return this.actual.b();
    }
    public boolean c(){
       return this.actual.c();
    }
    public boolean d(){
       return this.actual.d();
    }
    public boolean e(){
       return this.actual.e();
    }
    public void g(){
       _monitor_enter(this);
       b tc = this.c;
       while (tc != null) {
          this.c = null;
          _monitor_exit(this);
          tc.b(this);
       }
       this.b = false;
       _monitor_exit(this);
       return;
    }
    public void onComplete(){
       if (this.d != null) {
          return;
       }
       _monitor_enter(this);
       if (this.d != null) {
          _monitor_exit(this);
          return;
       }else {
          boolean b = true;
          this.d = b;
          if (this.b != null) {
             b tc = this.c;
             if (tc == null) {
                tc = new a(4);
                this.c = tc;
             }
             tc.a(NotificationLite.complete());
             _monitor_exit(this);
             return;
          }else {
             this.b = b;
             _monitor_exit(this);
             this.actual.onComplete();
             return;
          }
       }
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
          return;
       }else {
          _monitor_enter(this);
          boolean b = true;
          if (this.d == null) {
             this.d = b;
             if (this.b != null) {
                b tc = this.c;
                if (tc == null) {
                   tc = new a(4);
                   this.c = tc;
                }
                tc.c(NotificationLite.error(p0));
                _monitor_exit(this);
                return;
             }else {
                this.b = b;
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
       if (this.d != null) {
          return;
       }
       _monitor_enter(this);
       if (this.d != null) {
          _monitor_exit(this);
          return;
       }else if(this.b != null){
          b tc = this.c;
          if (tc == null) {
             tc = new a(4);
             this.c = tc;
          }
          tc.a(NotificationLite.next(p0));
          _monitor_exit(this);
          return;
       }else {
          this.b = true;
          _monitor_exit(this);
          this.actual.onNext(p0);
          this.g();
          return;
       }
    }
    public void onSubscribe(b p0){
       boolean b = true;
       if (this.d == null) {
          _monitor_enter(this);
          if (this.d == null) {
             if (this.b != null) {
                b tc = this.c;
                if (tc == null) {
                   tc = new a(4);
                   this.c = tc;
                }
                tc.a(NotificationLite.disposable(p0));
                _monitor_exit(this);
                return;
             }else {
                this.b = b;
                b = 0;
             }
          }
          _monitor_exit(this);
       }
       if (b) {
          p0.dispose();
       }else {
          this.actual.onSubscribe(p0);
          this.g();
       }
       return;
    }
    public void subscribeActual(y p0){
       this.actual.subscribe(p0);
    }
    public boolean test(Object p0){
       return NotificationLite.acceptFull(p0, this.actual);
    }
}
