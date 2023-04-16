package i61.b;
import androidx.lifecycle.Observer;
import i61.j;
import java.lang.Object;
import z61.b;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;

public final class b implements Observer	// class@002835
{
    public final j b;

    public void b(j p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       p0 = (p0 != null)? "observer update id: "+p0.mFeatureId: "observer update, but item is null";
       tb.f(false, p0);
       return;
    }
}
