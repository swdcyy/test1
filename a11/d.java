package a11.d;
import androidx.lifecycle.Observer;
import a11.l;
import java.lang.Object;
import java.lang.Integer;

public final class d implements Observer	// class@00001d
{
    public final l b;

    public void d(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.b();
    }
}
