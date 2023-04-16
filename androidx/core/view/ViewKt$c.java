package androidx.core.view.ViewKt$c;
import java.lang.Runnable;
import android.view.View;
import msd.l;
import java.lang.Object;

public final class ViewKt$c implements Runnable	// class@000724
{
    public final View b;
    public final l c;

    public void ViewKt$c(View p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       this.c.invoke(this.b);
    }
}
