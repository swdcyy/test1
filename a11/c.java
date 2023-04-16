package a11.c;
import androidx.lifecycle.Observer;
import a11.l;
import java.lang.Object;
import java.lang.Integer;

public final class c implements Observer	// class@00001c
{
    public final l b;

    public void c(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.b();
    }
}
