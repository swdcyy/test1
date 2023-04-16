package nz9.k0;
import java.lang.Runnable;
import nz9.z0;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import qp7.x0;
import qp7.b;
import os7.a;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.drawable.Drawable;
import wb5.i;
import os7.a$c;

public final class k0 implements Runnable	// class@00322c
{
    public final z0 b;
    public final User c;

    public void k0(z0 p0,User p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       k0 tb = this.b;
       a uoa = tb.E();
       ImageRequest[] imageRequest = tb.t0(this.c, HeadImageSize.ADJUST_MIDDLE);
       uoa.j(imageRequest, i.b(tb.u.getUserSex()), null, null);
    }
}
