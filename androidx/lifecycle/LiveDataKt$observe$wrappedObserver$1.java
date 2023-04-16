package androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1;
import androidx.lifecycle.Observer;
import msd.l;
import java.lang.Object;

public final class LiveDataKt$observe$wrappedObserver$1 implements Observer	// class@0007db
{
    public final l $onChanged;

    public void LiveDataKt$observe$wrappedObserver$1(l p0){
       this.$onChanged = p0;
       super();
    }
    public final void onChanged(Object p0){
       this.$onChanged.invoke(p0);
    }
}
