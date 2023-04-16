package dta.b0;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar$a;
import com.yxcorp.gifshow.homepage.kcube.presenter.a$e;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import java.lang.Runnable;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.String;

public final class b0 implements KCubeTabActionBar$a	// class@002523
{
    public final a$e a;
    public final KCubeTabActionBar b;
    public final Runnable c;

    public void b0(a$e p0,KCubeTabActionBar p1,Runnable p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onTouch(MotionEvent p0){
       this.a.c(this.b, this.c, "touchBar");
    }
}
