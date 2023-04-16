package og.q;
import com.yxcorp.gifshow.music.utils.a$a;
import brd.v;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Throwable;
import brd.g;
import java.io.File;
import java.lang.String;
import kqb.b;

public class q implements a$a	// class@0027bd
{
    public final v a;
    public final Music b;

    public void q(v p0,Music p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(Throwable p0){
       this.a.onError(p0);
    }
    public void b(File p0){
       this.a.onNext(this.b);
       this.a.onComplete();
    }
    public void c(String p0){
       b.d(this, p0);
    }
    public void onProgress(long p0,long p1){
       b.c(this, p0, p1);
    }
}
