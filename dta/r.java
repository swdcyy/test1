package dta.r;
import zq6.u;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import java.lang.Object;
import java.lang.Float;
import android.view.View;

public final class r implements u	// class@00254c
{
    public final KCubeTabActionBar a;

    public void r(KCubeTabActionBar p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       this.a.setTranslationY(p0.floatValue());
    }
}
