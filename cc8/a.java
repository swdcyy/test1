package cc8.a;
import java.lang.Runnable;
import android.view.View;
import java.lang.Object;

public final class a implements Runnable	// class@0003e0
{
    public final View b;

    public void a(View p0){
       this.b = p0;
    }
    public final void run(){
       this.b.clearFocus();
    }
}
