package ok0.f;
import androidx.lifecycle.Observer;
import android.widget.TextView;
import java.lang.Object;
import java.lang.CharSequence;

public final class f implements Observer	// class@003512
{
    public final TextView b;

    public void f(TextView p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.setText(p0);
    }
}
