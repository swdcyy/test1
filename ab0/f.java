package ab0.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab0.j;
import com.kuaishou.gifshow.smartalbum.ui.grid.SmartAlbumGridListFragment;
import java.lang.Object;
import java.lang.Boolean;

public class f extends Accessor	// class@00003c
{
    public final SmartAlbumGridListFragment c;
    public final j d;

    public void f(j p0,SmartAlbumGridListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.p);
    }
    public void set(Object p0){
       this.c.p = p0.booleanValue();
    }
}
