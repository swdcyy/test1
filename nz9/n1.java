package nz9.n1;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import nz9.u1;
import java.lang.Object;

public final class n1 implements ViewTreeObserver$OnScrollChangedListener	// class@003236
{
    public final u1 a;

    public void n1(u1 p0){
       this.a = p0;
    }
    public final void onScrollChanged(){
       this.a.b();
    }
}
