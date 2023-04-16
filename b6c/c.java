package b6c.c;
import a1.a$e;
import com.yxcorp.gifshow.profile.widget.a;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;

public final class c implements a$e	// class@0003bb
{
    public final a a;

    public void c(a p0){
       this.a = p0;
    }
    public final void onInflateFinished(View p0,int p1,ViewGroup p2){
       c ta = this.a;
       if (ta.f != null) {
       }else {
          ta.c = p0;
          if (p2 != null) {
             p2.addView(p0);
          }
          if (ta.g == 1) {
             ta.e(ta.c);
          }else {
             ta.c.setVisibility(8);
          }
       }
       return;
    }
}
