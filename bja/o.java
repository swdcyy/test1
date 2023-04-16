package bja.o;
import lnc.g3;
import com.yxcorp.gifshow.follow.stagger.post.g;
import java.lang.Object;
import java.util.Objects;
import cja.b;
import java.lang.String;
import q87.c;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class o implements g3	// class@0003ef
{
    public final g a;

    public void o(g p0){
       this.a = p0;
    }
    public final void a(){
       o ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = new Object[0];
       b.D().w("MockFeedRepoImp", "Post Plugin loaded", objArray);
       ta.e.onNext(Boolean.TRUE);
    }
}
