package bb0.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bb0.x;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class k extends Accessor	// class@000261
{
    public final SmartAlbumHorizontalListFragment c;
    public final x d;

    public void k(x p0,SmartAlbumHorizontalListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.t;
    }
    public void set(Object p0){
       this.c.t = p0;
    }
}
