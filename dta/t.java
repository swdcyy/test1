package dta.t;
import zq6.u;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import java.lang.Object;
import java.lang.Float;

public final class t implements u	// class@002550
{
    public final KCubeTabActionBar a;

    public void t(KCubeTabActionBar p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       this.a.setBackgroundAlpha(p0.floatValue());
    }
}
