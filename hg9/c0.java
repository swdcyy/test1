package hg9.c0;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.m;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;

public final class c0 implements g	// class@002650
{
    public final m b;

    public void c0(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.b == null) {
          p0 = tb.O;
          if (p0 != null) {
             p0.p2(false, false, false);
          }
       }
       return;
    }
}
