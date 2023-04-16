package dta.e0;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.kcube.presenter.a$e;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import java.lang.Object;
import java.lang.String;

public final class e0 implements Runnable	// class@00252d
{
    public final a$e b;
    public final KCubeTabActionBar c;
    public final Runnable d;

    public void e0(a$e p0,KCubeTabActionBar p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.c(this.c, this.d, "noneFinish");
    }
}
