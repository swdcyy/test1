package hf2.g;
import androidx.lifecycle.Observer;
import hf2.l;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;

public final class g implements Observer	// class@002d82
{
    public final l b;

    public void g(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.X8();
    }
}
