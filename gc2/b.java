package gc2.b;
import android.view.View$OnClickListener;
import java.lang.Runnable;
import java.lang.Object;
import android.view.View;

public final class b implements View$OnClickListener	// class@002afa
{
    public final Runnable b;

    public void b(Runnable p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.run();
    }
}
