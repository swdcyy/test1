package co2.k2;
import erd.r;
import java.lang.Object;
import android.os.Message;

public final class k2 implements r	// class@000598
{
    public final int b;

    public void k2(int p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       boolean b = (p0.what == this.b)? true: false;
       return b;
    }
}
