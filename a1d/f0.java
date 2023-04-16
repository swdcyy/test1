package a1d.f0;
import java.util.concurrent.Callable;
import a1d.h0;
import java.lang.Object;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ync.a;
import java.lang.Integer;

public final class f0 implements Callable	// class@000022
{
    public final h0 b;

    public void f0(h0 p0){
       this.b = p0;
    }
    public final Object call(){
       return Integer.valueOf(a.d(this.b.getContext()));
    }
}
