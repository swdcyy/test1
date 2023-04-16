package ab0.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab0.j;
import com.kuaishou.gifshow.smartalbum.ui.grid.SmartAlbumGridListFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class d extends Accessor	// class@00003a
{
    public final SmartAlbumGridListFragment c;
    public final j d;

    public void d(j p0,SmartAlbumGridListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.n;
    }
    public void set(Object p0){
       this.c.n = p0;
    }
}
