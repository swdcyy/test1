package e3.c0;
import e3.d0;
import android.view.View;
import java.lang.Object;
import android.view.WindowId;

public class c0 implements d0	// class@001ede
{
    public final WindowId a;

    public void c0(View p0){
       super();
       this.a = p0.getWindowId();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof c0 && p0.a.equals(this.a))? true: false;
       return b;
    }
    public int hashCode(){
       return this.a.hashCode();
    }
}
