package ce9.r;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import qm6.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.lang.Throwable;
import s3b.a;
import com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import java.lang.Exception;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class r	// class@0005ce
{

    public void r(){
       super();
    }
    public static b$a a(Activity p0,MagicEmoji$MagicFace p1){
       b$a obj = PatchProxy.applyTwoRefs(p0, p1, null, r.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b$a(p0, 0);
       if (p1 != null) {
          obj.J(p1);
          obj.K(true);
       }else {
          obj.a0(0);
       }
       return obj;
    }
    public static void b(Throwable p0,a p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, r.class, "3")) {
          return;
       }
       if (p0 instanceof UnSupportedMagicException) {
          p1.i(p0);
       }else if(PostExperimentUtils.p()){
          i = 0x7f100de1;
       }else {
          i = 0x7f100de0;
       }
       i.d(R.style.arg_RES_7f110668, a1.p(i));
       return;
    }
}
