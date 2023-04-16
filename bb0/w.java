package bb0.w;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bb0.x;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import java.lang.Object;
import java.lang.Boolean;

public class w extends Accessor	// class@00026d
{
    public final SmartAlbumHorizontalListFragment c;
    public final x d;

    public void w(x p0,SmartAlbumHorizontalListFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.s);
    }
    public void set(Object p0){
       this.c.s = p0.booleanValue();
    }
}
