package a1d.g0;
import java.util.concurrent.Callable;
import a1d.h0;
import java.lang.Object;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;

public final class g0 implements Callable	// class@000025
{
    public final h0 b;

    public void g0(h0 p0){
       this.b = p0;
    }
    public final Object call(){
       return Integer.valueOf(this.b.l8().getColor(0x7f061fde));
    }
}
