package bja.s;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.post.g;
import o26.c;
import java.lang.Object;
import java.util.Objects;
import h8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.util.Set;

public final class s implements Runnable	// class@0003f3
{
    public final g b;
    public final c c;

    public void s(g p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       s tb = this.b;
       s tc = this.c;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.C().w("MockFeedRepoImp", "addCallback "+tc, objArray);
       tb.h.add(tc);
    }
}
