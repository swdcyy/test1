package a43.e;
import java.lang.Runnable;
import com.kuaishou.live.feedback.b;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;

public final class e implements Runnable	// class@00003d
{
    public final b b;
    public final ViewGroup c;

    public void e(b p0,ViewGroup p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.c.removeView(this.b.b);
    }
}
