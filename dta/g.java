package dta.g;
import zq6.u;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import java.lang.Object;
import java.lang.Float;
import android.view.View;

public final class g implements u	// class@002532
{
    public final KCubeTabActionBar a;

    public void g(KCubeTabActionBar p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       this.a.setAlpha(p0.floatValue());
    }
}
