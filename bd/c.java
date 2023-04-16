package bd.c;
import fb.a;
import bd.b;
import android.graphics.Bitmap;
import fb.c;
import bd.h;
import java.lang.Object;
import ab.e;
import com.facebook.common.references.a;
import nd.a;

public class c extends b implements a	// class@000b16
{
    public a d;
    public Bitmap e;
    public final h f;
    public final int g;
    public final int h;

    public void c(Bitmap p0,c p1,h p2,int p3){
       super();
       e.d(p0);
       this.e = p0;
       e.d(p1);
       this.d = a.p(this.e, p1);
       this.f = p2;
       this.g = p3;
       this.h = 0;
    }
    public void c(a p0,h p1,int p2){
       super(p0, p1, p2, 0);
    }
    public void c(a p0,h p1,int p2,int p3){
       super();
       p0 = p0.c();
       e.d(p0);
       this.d = p0;
       this.e = p0.j();
       this.f = p1;
       this.g = p2;
       this.h = p3;
    }
    public static int k(Bitmap p0){
       int i = (p0 == null)? 0: p0.getHeight();
       return i;
    }
    public static int l(Bitmap p0){
       int i = (p0 == null)? 0: p0.getWidth();
       return i;
    }
    public h a(){
       return this.f;
    }
    public int c(){
       return a.d(this.e);
    }
    public void close(){
       _monitor_enter(this);
       c td = this.d;
       this.d = null;
       this.e = null;
       _monitor_exit(this);
       if (td != null) {
          td.close();
       }
       return;
    }
    public Bitmap g(){
       return this.e;
    }
    public int getHeight(){
       if (!(this.g % 180)) {
          c th = this.h;
          if (th != 5 && th != 7) {
             return c.k(this.e);
          }
       }
       return c.l(this.e);
    }
    public int getWidth(){
       if (!(this.g % 180)) {
          c th = this.h;
          if (th != 5 && th != 7) {
             return c.l(this.e);
          }
       }
       return c.k(this.e);
    }
    public synchronized boolean isClosed(){
       boolean b = (this.d == null)? true: false;
       return b;
    }
    public synchronized a j(){
       return a.d(this.d);
    }
    public int o(){
       return this.h;
    }
    public int p(){
       return this.g;
    }
}
