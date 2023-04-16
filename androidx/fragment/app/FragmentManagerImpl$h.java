package androidx.fragment.app.FragmentManagerImpl$h;
import java.lang.Runnable;
import android.view.animation.AnimationSet;
import android.view.animation.Animation;
import android.view.ViewGroup;
import android.view.View;
import android.view.animation.Transformation;
import a2.c0;

public class FragmentManagerImpl$h extends AnimationSet implements Runnable	// class@00078b
{
    public final ViewGroup b;
    public final View c;
    public boolean d;
    public boolean e;
    public boolean f;

    public void FragmentManagerImpl$h(Animation p0,ViewGroup p1,View p2){
       super(false);
       this.f = true;
       this.b = p1;
       this.c = p2;
       this.addAnimation(p0);
       p1.post(this);
    }
    public boolean getTransformation(long p0,Transformation p1){
       this.f = true;
       if (this.d != null) {
          return (this.e ^ true);
       }
       if (!super.getTransformation(p0, p1)) {
          this.d = true;
          c0.a(this.b, this);
       }
       return true;
    }
    public boolean getTransformation(long p0,Transformation p1,float p2){
       this.f = true;
       if (this.d != null) {
          return (this.e ^ true);
       }
       if (!super.getTransformation(p0, p1, p2)) {
          this.d = true;
          c0.a(this.b, this);
       }
       return true;
    }
    public void run(){
       if (this.d == null && this.f != null) {
          this.f = false;
          this.b.post(this);
       }else {
          this.b.endViewTransition(this.c);
          this.e = true;
       }
       return;
    }
}
