package og.n0;
import com.yxcorp.gifshow.music.utils.a$a;
import java.io.File;
import brd.v;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Throwable;
import brd.g;
import og.l;
import java.lang.Boolean;
import java.lang.String;
import q87.c;
import android.util.Pair;
import com.feature.post.bridge.util.PostVideoHelper;
import kqb.b;

public class n0 implements a$a	// class@0027b6
{
    public final boolean a;
    public final File b;
    public final v c;
    public final Music d;

    public void n0(boolean p0,File p1,v p2,Music p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(Throwable p0){
       this.c.onError(p0);
    }
    public void b(File p0){
       Object[] objArray = new Object[]{Boolean.valueOf(this.a),this.b.getAbsolutePath()};
       Object[] objArray1 = new Object[0];
       l.D().w("PostVideoHelper", String.format("new download file snip=%b, file=%s", objArray), objArray1);
       this.c.onNext(PostVideoHelper.c(this.b, this.d, this.a));
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       b.c(this, p0, p1);
    }
}
