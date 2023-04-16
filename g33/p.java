package g33.p;
import pp.c;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class p implements c	// class@002a5a
{
    public final String b;

    public void p(String p0){
       this.b = p0;
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       return this.b;
    }
}
