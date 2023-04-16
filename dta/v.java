package dta.v;
import zq6.u;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import java.lang.Float;
import lr6.a;

public final class v implements u	// class@002554
{
    public final a a;

    public void v(a p0){
       this.a = p0;
    }
    public final void onChange(Object p0){
       v ta = this.a;
       if (ta.D == null) {
          ta.C.F(p0.floatValue());
       }
       return;
    }
}
