package bb0.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bb0.x;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import java.lang.Object;
import za0.b;

public class o extends Accessor	// class@000265
{
    public final SmartAlbumHorizontalListFragment c;
    public final x d;

    public void o(x p0,SmartAlbumHorizontalListFragment p1){
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
