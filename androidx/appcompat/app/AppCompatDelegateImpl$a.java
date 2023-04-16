package androidx.appcompat.app.AppCompatDelegateImpl$a;
import java.lang.Runnable;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.lang.Object;

public class AppCompatDelegateImpl$a implements Runnable	// class@000570
{
    public final AppCompatDelegateImpl b;

    public void AppCompatDelegateImpl$a(AppCompatDelegateImpl p0){
       this.b = p0;
       super();
    }
    public void run(){
       AppCompatDelegateImpl$a tb = this.b;
       if (tb.X & 0x01) {
          tb.d0(0);
       }
       tb = this.b;
       if (tb.X & 0x1000) {
          tb.d0(108);
       }
       tb = this.b;
       tb.W = false;
       tb.X = 0;
       return;
    }
}
