package dta.c0;
import erd.g;
import com.yxcorp.gifshow.homepage.kcube.presenter.a$e;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;

public final class c0 implements g	// class@002526
{
    public final a$e b;
    public final KCubeTabActionBar c;
    public final Runnable d;

    public void c0(a$e p0,KCubeTabActionBar p1,Runnable p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       this.b.c(this.c, this.d, "launchFinish");
    }
}
