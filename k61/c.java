package k61.c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import z61.b;

public abstract class c extends RecyclerView$ViewHolder	// class@002c94
{
    public MutableLiveData a;
    public Observer b;

    public void c(View p0){
       super(p0);
       this.doBindView(p0);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          c tb = this.b;
          if (tb != null) {
             ta.removeObserver(tb);
             this.b = null;
          }
       }
       return;
    }
    public abstract void b(b p0);
    public abstract void doBindView(View p0);
}
