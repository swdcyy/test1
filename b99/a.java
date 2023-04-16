package b99.a;
import erd.g;
import b99.c;
import java.lang.Object;
import java.lang.Float;
import java.util.Objects;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import b99.f;

public final class a implements g	// class@000394
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          tb.S8((float)(((int)p0.floatValue() - tb.m8().getHeight()) + a1.d(R.dimen.arg_RES_7f07025d)));
       }
       return;
    }
}
