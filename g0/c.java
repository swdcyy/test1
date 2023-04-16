package g0.c;
import g0.i;
import android.view.Choreographer;
import java.lang.Object;
import java.lang.Runnable;
import g0.c$a;
import android.view.Choreographer$FrameCallback;
import g0.c$b;

public final class c implements i	// class@002022
{
    public final Choreographer a;

    public void c(Choreographer p0){
       super();
       this.a = p0;
    }
    public void a(Runnable p0){
       this.a.postFrameCallback(new c$a(this, p0));
    }
    public boolean b(){
       boolean b = false;
       try{
          if (this.a == Choreographer.getInstance()) {
             b = true;
          }
          return e0;
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public void c(Runnable p0,long p1){
       this.a.postFrameCallbackDelayed(new c$b(this, p0), p1);
    }
}
