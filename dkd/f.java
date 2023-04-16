package dkd.f;
import erd.g;
import com.yxcorp.upgrade.network.CheckUpgradeRequestListener;
import java.lang.Object;
import com.yxcorp.upgrade.network.CheckUpgradeRequestListener$UpgradeResponse;

public final class f implements g	// class@000cd7
{
    public final CheckUpgradeRequestListener b;

    public void f(CheckUpgradeRequestListener p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.a(p0);
    }
}
