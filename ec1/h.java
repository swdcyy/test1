package ec1.h;
import java.lang.Runnable;
import ec1.i;
import java.lang.Object;
import android.view.View;

public final class h implements Runnable	// class@0020d8
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       tb.p.setVisibility(0);
       tb.V8();
    }
}
