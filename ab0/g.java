package ab0.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab0.j;
import com.kuaishou.gifshow.smartalbum.ui.grid.SmartAlbumGridListFragment;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;

public class g extends Accessor	// class@00003d
{
    public final SmartAlbumGridListFragment c;
    public final j d;

    public void g(j p0,SmartAlbumGridListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.l;
    }
    public void set(Object p0){
       this.c.l = p0;
    }
}
