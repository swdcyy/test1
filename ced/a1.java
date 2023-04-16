package ced.a1;
import java.lang.Runnable;
import com.yxcorp.plugin.search.result.hashtag.presenters.v;
import java.lang.Object;
import android.view.ViewGroup;

public final class a1 implements Runnable	// class@00053b
{
    public final v b;

    public void a1(v p0){
       this.b = p0;
    }
    public final void run(){
       a1 tb = this.b;
       if (tb.x == null) {
          tb.x = tb.t.getMeasuredHeight();
          tb.P8();
       }
       return;
    }
}
