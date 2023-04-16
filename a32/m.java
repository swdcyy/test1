package a32.m;
import java.lang.Runnable;
import a32.k;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class m implements Runnable	// class@00002b
{
    public final k b;
    public final int c;

    public void m(k p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       m tb = this.b;
       m tc = this.c;
       View view = tb.a();
       if (!view.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
       }else {
          ViewGroup$MarginLayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams.topMargin != (tb.b() + tc)) {
             layoutParams.topMargin = tc + tb.b();
             view.requestLayout();
          }
       }
       return;
    }
}
