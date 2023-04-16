package fb.b;
import java.lang.Object;
import java.lang.ref.SoftReference;

public class b	// class@001fe2
{
    public SoftReference a;
    public SoftReference b;
    public SoftReference c;

    public void b(){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
    }
    public void a(){
       b ta = this.a;
       if (ta != null) {
          ta.clear();
          this.a = null;
       }
       ta = this.b;
       if (ta != null) {
          ta.clear();
          this.b = null;
       }
       ta = this.c;
       if (ta != null) {
          ta.clear();
          this.c = null;
       }
       return;
    }
}
