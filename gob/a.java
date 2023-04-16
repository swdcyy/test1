package gob.a;
import erd.g;
import gob.b;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.smile.gifmaker.mvps.presenter.b;

public final class a implements g	// class@002b4a
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          tb.U7(p0);
          tb.P8(false);
       }
       return;
    }
}
