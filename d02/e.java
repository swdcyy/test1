package d02.e;
import pp.c;
import msd.a;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class e implements c	// class@001eec
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       return this.b.invoke();
    }
}
