package bd.a;
import com.facebook.imagepipeline.image.a;
import oc.d;
import oc.b;
import com.facebook.common.references.a;
import java.lang.Iterable;

public class a extends a	// class@000b14
{
    public d d;
    public boolean e;

    public void a(d p0){
       super();
       this.d = p0;
       this.e = true;
    }
    public synchronized int c(){
       int i = (this.isClosed())? 0: this.d.c().getSizeInBytes();
       return i;
    }
    public void close(){
       _monitor_enter(this);
       a td = this.d;
       if (td == null) {
          _monitor_exit(this);
          return;
       }else {
          this.d = null;
          _monitor_exit(this);
          _monitor_enter(td);
          a.f(td.c);
          td.c = null;
          a.g(td.d);
          td.d = null;
          _monitor_exit(td);
          return;
       }
    }
    public boolean e(){
       return this.e;
    }
    public synchronized b g(){
       b uob = (this.isClosed())? null: this.d.c();
       return uob;
    }
    public synchronized int getHeight(){
       int i = (this.isClosed())? 0: this.d.c().getHeight();
       return i;
    }
    public synchronized int getWidth(){
       int i = (this.isClosed())? 0: this.d.c().getWidth();
       return i;
    }
    public synchronized boolean isClosed(){
       boolean b = (this.d == null)? true: false;
       return b;
    }
    public synchronized d j(){
       return this.d;
    }
}
