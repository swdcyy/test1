package bb0.g;
import java.lang.Runnable;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import java.lang.Object;
import android.view.View;
import fb0.e;

public final class g implements Runnable	// class@00025d
{
    public final SmartAlbumHorizontalListFragment b;

    public void g(SmartAlbumHorizontalListFragment p0){
       this.b = p0;
    }
    public final void run(){
       e.g(this.b.z);
    }
}
