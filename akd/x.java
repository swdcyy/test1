package akd.x;
import android.view.View$OnClickListener;
import com.yxcorp.upgrade.impl.UpgradeInstallHintDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zjd.b;

public final class x implements View$OnClickListener	// class@000063
{
    public final UpgradeInstallHintDialog b;

    public void x(UpgradeInstallHintDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, UpgradeInstallHintDialog.class, "10")) {
       }else if(tb.b != null){
          b e = UpgradeInstallHintDialog.e;
          if (e != null) {
             e.a();
             UpgradeInstallHintDialog.e = null;
          }
          UpgradeInstallHintDialog.Vg();
       }
       return;
    }
}
