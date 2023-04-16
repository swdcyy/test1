package ced.x1;
import erd.g;
import ced.v1$b;
import ixc.c;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uy5.a;
import q87.c;
import kotlin.jvm.internal.a;
import z3b.a;
import z3b.f;
import ced.w1;
import com.yxcorp.gifshow.model.MagicBaseConfig;

public final class x1 implements g	// class@00058e
{
    public final v1$b b;
    public final c c;

    public void x1(v1$b p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x1.class, "1")) {
       }else if(p0 != null){
          Object[] objArray = new Object[0];
          a.C().w("TagMagicFacePreDownloadPresenter", "pre download tag magicFace", objArray);
          x1 tc = this.c;
          a.o(tc, "magicEmojiPlugin");
          f[] uofArray = new f[]{new w1(p0, this)};
          tc.H0().h(p0, uofArray);
       }
       return;
    }
}
