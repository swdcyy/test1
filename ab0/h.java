package ab0.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab0.j;
import com.kuaishou.gifshow.smartalbum.ui.grid.SmartAlbumGridListFragment;
import java.lang.Object;
import java.lang.String;

public class h extends Accessor	// class@00003e
{
    public final SmartAlbumGridListFragment c;
    public final j d;

    public void h(j p0,SmartAlbumGridListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.k;
    }
    public void set(Object p0){
       this.c.k = p0;
    }
}
