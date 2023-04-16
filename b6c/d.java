package b6c.d;
import a1.a$e;
import com.yxcorp.gifshow.profile.widget.a;
import java.lang.Throwable;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;

public final class d implements a$e	// class@0003bc
{
    public final a a;
    public final Throwable b;

    public void d(a p0,Throwable p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onInflateFinished(View p0,int p1,ViewGroup p2){
       d ta = this.a;
       d tb = this.b;
       if (ta.f != null) {
       }else {
          ta.d = p0;
          if (p2 != null) {
             p2.addView(p0);
          }
          if (ta.g == 2) {
             ta.c(ta.d, tb);
          }else {
             ta.d.setVisibility(8);
          }
       }
       return;
    }
}
