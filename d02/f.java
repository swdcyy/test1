package d02.f;
import pp.c;
import msd.a;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class f implements c	// class@001eed
{
    public final a b;

    public void f(a p0){
       this.b = p0;
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       return this.b.invoke();
    }
}
