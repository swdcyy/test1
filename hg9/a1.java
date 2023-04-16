package hg9.a1;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.p;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;

public final class a1 implements g	// class@00264b
{
    public final p b;

    public void a1(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a1 tb = this.b;
       Objects.requireNonNull(tb);
       a.D().e(tb.a, "notifyAlbumScan", p0);
       PostUtils.D(tb.a, "notifyAlbumScan error", p0);
    }
}
