package bb0.v;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bb0.x;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import java.lang.Object;
import java.lang.Boolean;

public class v extends Accessor	// class@00026c
{
    public final SmartAlbumHorizontalListFragment c;
    public final x d;

    public void v(x p0,SmartAlbumHorizontalListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.F);
    }
    public void set(Object p0){
       this.c.F = p0.booleanValue();
    }
}
