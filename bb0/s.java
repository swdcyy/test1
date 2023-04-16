package bb0.s;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bb0.x;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class s extends Accessor	// class@000269
{
    public final SmartAlbumHorizontalListFragment c;
    public final x d;

    public void s(x p0,SmartAlbumHorizontalListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.r;
    }
    public void set(Object p0){
       this.c.r = p0;
    }
}
