package androidx.lifecycle.TransformationsKt;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Transformations;
import msd.l;
import androidx.lifecycle.TransformationsKt$map$1;
import z0.a;
import androidx.lifecycle.TransformationsKt$switchMap$1;

public final class TransformationsKt	// class@0007ff
{

    public static final LiveData distinctUntilChanged(LiveData p0){
       a.q(p0, "receiver$0");
       p0 = Transformations.distinctUntilChanged(p0);
       a.h(p0, "Transformations.distinctUntilChanged\(this\)");
       return p0;
    }
    public static final LiveData map(LiveData p0,l p1){
       a.q(p0, "receiver$0");
       a.q(p1, "transform");
       p0 = Transformations.map(p0, new TransformationsKt$map$1(p1));
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       return p0;
    }
    public static final LiveData switchMap(LiveData p0,l p1){
       a.q(p0, "receiver$0");
       a.q(p1, "transform");
       p0 = Transformations.switchMap(p0, new TransformationsKt$switchMap$1(p1));
       a.h(p0, "Transformations.switchMap\(this\) { transform\(it\) }");
       return p0;
    }
}
