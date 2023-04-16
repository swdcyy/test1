package pca.m0;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import c26.d;
import java.lang.Object;
import com.yxcorp.gifshow.encode.EncodeManager;

public abstract class m0 implements Runnable	// class@003acc
{
    public final PostEncodeInfo b;
    public final EncodeManager c;
    public boolean d;
    public final d e;

    public void m0(PostEncodeInfo p0,d p1){
       super();
       this.b = p0;
       this.c = EncodeManager.o();
       this.e = p1;
    }
    public void a(int p0){
       this.d = true;
    }
}
