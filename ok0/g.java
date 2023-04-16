package ok0.g;
import androidx.lifecycle.Observer;
import android.widget.TextView;
import ok0.o;
import java.lang.Object;
import ok0.h;

public final class g implements Observer	// class@003513
{
    public final TextView b;
    public final o c;

    public void g(TextView p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onChanged(Object p0){
       h.c(this.b, this.c, p0);
    }
}
