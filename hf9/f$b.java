package hf9.f$b;
import java.lang.Object;
import nsd.u;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.j0;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import com.yxcorp.gifshow.magic.data.repo.response.MagicFaceResponse;
import java.util.List;
import java.lang.Integer;

public final class f$b	// class@002642
{

    public void f$b(){
       super();
    }
    public void f$b(u p0){
       super();
    }
    public final boolean a(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && a.g("slip", j0.f(p0, "uimode"))) {
          MagicFaceResponse magicFaceRes = j0.e(p0, "magic_face_response");
          Integer integer = null;
          MagicFaceResponse mMagicFaces = (magicFaceRes != null)? magicFaceRes.mMagicFaces: integer;
          if (mMagicFaces != null) {
             if (magicFaceRes != null) {
                magicFaceRes = magicFaceRes.mMagicFaces;
                if (magicFaceRes != null) {
                   integer = Integer.valueOf(magicFaceRes.size());
                }
             }
             a.m(integer);
             if (integer.intValue() > 10) {
                b = true;
             }
          }
       }
    label_004f :
       return b;
    }
}
