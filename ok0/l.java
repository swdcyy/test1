package ok0.l;
import androidx.lifecycle.Observer;
import android.widget.EditText;
import java.lang.Object;
import java.lang.CharSequence;
import ok0.m;

public final class l implements Observer	// class@003518
{
    public final EditText b;

    public void l(EditText p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       m.h(this.b, p0);
    }
}
