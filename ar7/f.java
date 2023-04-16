package ar7.f;
import androidx.lifecycle.Observer;
import ar7.j;
import java.lang.Object;
import eh5.a;

public final class f implements Observer	// class@00034c
{
    public final j b;

    public void f(j p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       this.b.r = p0;
    }
}
