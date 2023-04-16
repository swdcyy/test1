package bb0.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bb0.x;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class i extends Accessor	// class@00025f
{
    public final SmartAlbumHorizontalListFragment c;
    public final x d;

    public void i(x p0,SmartAlbumHorizontalListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.o;
    }
    public void set(Object p0){
       this.c.o = p0;
    }
}
