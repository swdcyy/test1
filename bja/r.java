package bja.r;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.post.g;
import o26.c;
import java.lang.Object;
import java.util.Set;
import h8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class r implements Runnable	// class@0003f2
{
    public final g b;
    public final c c;

    public void r(g p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       r tc = this.c;
       this.b.h.remove(tc);
       Object[] objArray = new Object[0];
       a.C().w("MockFeedRepoImp", "removeCallback "+tc, objArray);
    }
}
