package dkd.g;
import erd.g;
import com.yxcorp.upgrade.network.CheckUpgradeRequestListener;
import java.lang.Object;
import java.lang.Throwable;

public final class g implements g	// class@000cd8
{
    public final CheckUpgradeRequestListener b;

    public void g(CheckUpgradeRequestListener p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onError(p0);
    }
}
