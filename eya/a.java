package eya.a;
import android.view.View$OnLongClickListener;
import eya.b;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import android.view.View;
import eya.b$c;

public final class a implements View$OnLongClickListener	// class@002849
{
    public final b b;
    public final User c;

    public void a(b p0,User p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean onLongClick(View p0){
       a tc = this.c;
       b f = this.b.f;
       boolean b = (f != null)? f.a(p0, tc): false;
       return b;
    }
}
