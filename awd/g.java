package awd.g;
import java.lang.Object;
import awd.f;
import java.lang.IllegalStateException;
import java.lang.String;

public final class g	// class@000296
{
    public f a;
    public f b;

    public void g(){
       super();
    }
    public synchronized void a(f p0){
       g tb = this.b;
       if (tb != null) {
          tb.c = p0;
          this.b = p0;
       }else if(this.a == null){
          this.b = p0;
          this.a = p0;
       }else {
          throw new IllegalStateException("Head present, but no tail");
       }
       this.notifyAll();
       return;
    }
    public synchronized f b(){
       g ta = this.a;
       if (ta != null) {
          f c = ta.c;
          this.a = c;
          if (c == null) {
             this.b = null;
          }
       }
       return ta;
    }
}
