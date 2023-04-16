package gc2.c;
import android.view.View$OnClickListener;
import java.lang.Runnable;
import java.lang.Object;
import android.view.View;

public final class c implements View$OnClickListener	// class@002afb
{
    public final Runnable b;

    public void c(Runnable p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.run();
    }
}
