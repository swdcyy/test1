package o4a.g;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import java.lang.Float;
import java.util.Objects;

public final class g implements Observer	// class@003287
{
    public final b b;

    public void g(b p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       float f = (p0 == null)? 0x3f800000: p0.floatValue();
       tb.G = f;
       return;
    }
}
