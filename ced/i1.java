package ced.i1;
import java.lang.Runnable;
import com.yxcorp.plugin.search.result.hashtag.presenters.d0;
import xdd.e;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.search.result.hashtag.presenters.e;
import java.util.Map;

public final class i1 implements Runnable	// class@00055d
{
    public final d0 b;
    public final e c;

    public void i1(d0 p0,e p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i1 tb = this.b;
       tb.b9(tb.u);
       d0.A.remove(this.c.a);
    }
}
