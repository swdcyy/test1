package gf1.a;
import ok.h;
import android.util.SparseArray;
import java.lang.Object;
import java.lang.Integer;
import z1.i;

public final class a implements h	// class@0024b9
{
    public final SparseArray b;

    public void a(SparseArray p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return this.b.get(p0.intValue());
    }
}
