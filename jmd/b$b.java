package jmd.b$b;
import erd.g;
import java.lang.Object;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalArgumentException;

public final class b$b implements g	// class@001709
{
    public static final b$b b;

    static {
       b$b.b = new b$b();
    }
    public void b$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else if(p0.mVoteResult != null){
          p0 = 1;
       }else {
          p0 = null;
       }
       if (!p0) {
          throw new IllegalArgumentException("mVoteResult != null".toString());
       }
       return;
    }
}
