package fd2.b;
import n3d.a;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier;
import java.lang.Object;
import android.content.Intent;

public final class b implements a	// class@002935
{
    public final LiveEntryCoverSelectSupplier b;

    public void b(LiveEntryCoverSelectSupplier p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       LiveEntryCoverSelectSupplier.a(this.b, p0, p1, p2);
    }
}
