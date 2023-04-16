package gha.e;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import gha.p;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import brd.g;

public final class e implements g	// class@002ad5
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void subscribe(v p0){
       p0.onNext(Bitmap.createBitmap(p.e, p.e, Bitmap$Config.ARGB_8888));
       p0.onComplete();
    }
}
