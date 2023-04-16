package bb0.r;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bb0.x;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import java.lang.Object;
import android.view.View;

public class r extends Accessor	// class@000268
{
    public final SmartAlbumHorizontalListFragment c;
    public final x d;

    public void r(x p0,SmartAlbumHorizontalListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.G;
    }
    public void set(Object p0){
       this.c.G = p0;
    }
}
