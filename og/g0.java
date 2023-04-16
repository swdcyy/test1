package og.g0;
import erd.c;
import com.feature.post.bridge.jsmodel.JsCameraCallbackParams$Param;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import qm6.b$a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.feature.post.bridge.util.PostVideoHelper;

public final class g0 implements c	// class@0027a5
{
    public final JsCameraCallbackParams$Param a;

    public void g0(JsCameraCallbackParams$Param p0){
       this.a = p0;
    }
    public final Object a(Object p0,Object p1){
       g0 ta = this.a;
       if (!TextUtils.x(p0.mId)) {
          p1.J(p0).K(true);
          p1.L(PostVideoHelper.e(ta));
       }
       return p1;
    }
}
