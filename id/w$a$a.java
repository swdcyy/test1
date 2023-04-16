package id.w$a$a;
import id.b;
import id.w$a;
import kd.b;
import java.lang.String;
import java.io.Closeable;
import com.facebook.common.util.TriState;
import java.lang.Throwable;
import java.lang.Object;

public class w$a$a extends b	// class@0021ce
{
    public final w$a b;

    public void w$a$a(w$a p0){
       this.b = p0;
       super();
    }
    public void g(){
       if (b.d()) {
          b.a("MultiplexProducer#onCancellation");
       }
       w$a$a tb = this.b;
       _monitor_enter(tb);
       if (tb.g != this) {
          _monitor_exit(tb);
       }else {
          tb.g = null;
          tb.f = null;
          tb.b(tb.c);
          tb.c = null;
          _monitor_exit(tb);
          tb.i(TriState.UNSET);
       }
       if (b.d()) {
          b.b();
       }
       return;
    }
    public void h(Throwable p0){
       if (b.d()) {
          b.a("MultiplexProducer#onFailure");
       }
       this.b.f(this, p0);
       if (b.d()) {
          b.b();
       }
       return;
    }
    public void i(Object p0,int p1){
       if (b.d()) {
          b.a("MultiplexProducer#onNewResult");
       }
       this.b.g(this, p0, p1);
       if (b.d()) {
          b.b();
       }
       return;
    }
    public void j(float p0){
       if (b.d()) {
          b.a("MultiplexProducer#onProgressUpdate");
       }
       this.b.h(this, p0);
       if (b.d()) {
          b.b();
       }
       return;
    }
}
