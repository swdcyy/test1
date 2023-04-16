package eib.a;
import z3b.f;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Throwable;
import e17.i;
import z3b.e;
import java.lang.Integer;

public final class a implements f	// class@0026a3
{
    public final IMMagicEffectController a;
    public final MagicEmoji$MagicFace b;

    public void a(IMMagicEffectController p0,MagicEmoji$MagicFace p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "magicFace");
       if (!p0 instanceof MagicEmoji$MagicFace) {
          p0 = null;
       }
       if (p0 != null && a.g(p0.mId, this.b.mId)) {
          this.a.c(p0);
       }
       PatchProxy.onMethodExit(a.class, "3");
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "magicFace");
       a.p(p1, "e");
       i.a(R.style.arg_RES_7f11066a, 0x7f102685);
       PatchProxy.onMethodExit(a.class, "2");
       return;
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
       if (PatchProxy.isSupport2(a.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       a.p(p0, "magicFace");
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
