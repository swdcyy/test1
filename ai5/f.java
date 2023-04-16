package ai5.f;
import java.lang.Runnable;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import com.kwai.component.upgrade.UpgradeInstallHintHelper;
import zjd.d;
import com.kwai.component.upgrade.f;
import zjd.e;
import zjd.f;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ai5.i;
import q07.a;
import q07.c;

public final class f implements Runnable	// class@0000aa
{
    public final RequestTiming b;

    public void f(RequestTiming p0){
       this.b = p0;
    }
    public final void run(){
       f tb = this.b;
       UpgradeInstallHintHelper.b();
       f uof = e.a(f.b()).b();
       Activity uActivity = f.b().c();
       if (!uActivity instanceof FragmentActivity) {
       }else {
          i oi = new i(0x790e, uActivity, uof, tb);
          f.h = oi;
          c.a(oi);
       }
       return;
    }
}
