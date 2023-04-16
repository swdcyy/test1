package gaa.x;
import java.util.concurrent.Callable;
import gaa.h0;
import java.util.List;
import java.io.File;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.photo.download.task.s;
import ixb.y;
import java.lang.Boolean;

public final class x implements Callable	// class@002454
{
    public final h0 b;
    public final List c;
    public final File d;
    public final StatModel e;
    public final b f;

    public void x(h0 p0,List p1,File p2,StatModel p3,b p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       x tb = this.b;
       h0 b = tb.b;
       s.h(b, false, s.m(b, this.c), this.d, this.e, this.f, tb.w);
       return Boolean.TRUE;
    }
}
