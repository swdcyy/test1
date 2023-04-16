package bb0.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bb0.x;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import java.lang.Object;
import java.lang.String;

public class l extends Accessor	// class@000262
{
    public final SmartAlbumHorizontalListFragment c;
    public final x d;

    public void l(x p0,SmartAlbumHorizontalListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.D;
    }
    public void set(Object p0){
       this.c.D = p0;
    }
}
