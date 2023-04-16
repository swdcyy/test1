package bj8.b;
import java.lang.Runnable;
import bj8.d;
import java.lang.Object;
import android.view.View;
import android.view.Window;
import android.view.View$OnSystemUiVisibilityChangeListener;

public final class b implements Runnable	// class@000377
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       tb.b.getDecorView().setOnSystemUiVisibilityChangeListener(tb);
    }
}
