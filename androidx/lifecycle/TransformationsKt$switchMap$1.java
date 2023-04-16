package androidx.lifecycle.TransformationsKt$switchMap$1;
import z0.a;
import msd.l;
import java.lang.Object;
import androidx.lifecycle.LiveData;

public final class TransformationsKt$switchMap$1 implements a	// class@0007fe
{
    public final l $transform;

    public void TransformationsKt$switchMap$1(l p0){
       this.$transform = p0;
       super();
    }
    public final LiveData apply(Object p0){
       return this.$transform.invoke(p0);
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}
