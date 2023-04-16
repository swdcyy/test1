package ai5.h;
import java.lang.Runnable;
import bkd.b;
import java.lang.Object;
import com.kwai.component.upgrade.UpgradeInstallHintHelper;
import zjd.d;
import com.kwai.component.upgrade.f;
import zjd.e;
import zjd.f;
import bkd.a;
import zjd.c;
import zjd.g;
import zjd.h;

public final class h implements Runnable	// class@0000ac
{
    public final b b;
    public final boolean c;

    public void h(b p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       UpgradeInstallHintHelper.b();
       e.a(f.b()).b().i(f.d(0, true), this.b, f.a(this.c), f.c(0), 0);
    }
}
