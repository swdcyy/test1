package gg9.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.permission.b;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import sm6.b;

public final class f implements Runnable	// class@002478
{
    public final b b;
    public final View c;
    public final View d;

    public void f(b p0,View p1,View p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       f tb = this.b;
       Objects.requireNonNull(tb);
       b.v(this.d, (n.j(tb.e) - n.p(this.c)[1]));
    }
}
