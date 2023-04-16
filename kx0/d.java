package kx0.d;
import erd.o;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import android.util.Pair;
import kx0.b;
import io.reactivex.g;
import brd.t;

public final class d implements o	// class@002e13
{
    public final Drawable[] b;

    public void d(Drawable[] p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return t.create(new b(p0, this.b));
    }
}
