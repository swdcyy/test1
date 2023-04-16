package o4a.q;
import erd.g;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import java.lang.Object;
import ge5.c;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;

public final class q implements g	// class@003291
{
    public final PlcEntryLoggerImplPresenter b;

    public void q(PlcEntryLoggerImplPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a == 2) {
          tb.w = 0;
          k1.m(tb.F);
       }
       return;
    }
}
