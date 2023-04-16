package hk9.n;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.common.b;
import java.lang.Object;
import android.view.View;

public final class n implements Runnable	// class@0026aa
{
    public final b b;

    public void n(b p0){
       this.b = p0;
    }
    public final void run(){
       this.b.m.requestLayout();
    }
}
