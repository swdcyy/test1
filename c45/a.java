package c45.a;
import java.lang.Runnable;
import msd.l;
import java.lang.Object;
import com.kwai.android.longinus.Longinus;

public final class a implements Runnable	// class@00041a
{
    public final l b;

    public void a(l p0){
       this.b = p0;
    }
    public final void run(){
       Longinus.a(this.b);
    }
}
