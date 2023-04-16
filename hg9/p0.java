package hg9.p0;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.TakePictureFragment;
import wc9.q;
import java.lang.Object;
import ig9.b;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.CameraBaseFragment;
import wc9.v;
import com.yxcorp.gifshow.camera.record.base.b;

public final class p0 implements g	// class@00266f
{
    public final TakePictureFragment b;
    public final q c;

    public void p0(TakePictureFragment p0,q p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0 tb = this.b;
       p0 tc = this.c;
       Objects.requireNonNull(tb);
       tc.g2();
       if (tb.y.d(v.e).b != null) {
          tc.i2();
       }
       return;
    }
}
