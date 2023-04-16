package akd.w;
import android.view.View$OnClickListener;
import com.yxcorp.upgrade.impl.UpgradeInstallHintDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zjd.b;
import com.yxcorp.upgrade.impl.g;

public final class w implements View$OnClickListener	// class@000062
{
    public final UpgradeInstallHintDialog b;

    public void w(UpgradeInstallHintDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, UpgradeInstallHintDialog.class, "9")) {
       }else if(tb.b != null){
          b e = UpgradeInstallHintDialog.e;
          if (e != null) {
             e.b();
             UpgradeInstallHintDialog.e = null;
          }
          UpgradeInstallHintDialog.Vg();
          g.f();
       }
       return;
    }
}
