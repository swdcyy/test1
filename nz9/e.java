package nz9.e;
import erd.g;
import nz9.z0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import qp7.b;
import ms7.a;

public final class e implements g	// class@00321c
{
    public final z0 b;

    public void e(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       if ((tb.u.getPhotoId()).equals(p0.getPhotoId())) {
          tb.i.a();
       }
       return;
    }
}
