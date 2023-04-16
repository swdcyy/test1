package nfd.v0;
import erd.g;
import android.app.Activity;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import um6.h;

public final class v0 implements g	// class@001e16
{
    public final Activity b;
    public final Music c;

    public void v0(Activity p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       v0 tb = this.b;
       p0.kU(tb, this.c);
    }
}
