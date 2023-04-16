package me9.q$h;
import erd.o;
import ne9.b;
import me9.q$b;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicUploadFileRequestData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import e4b.a;
import e4b.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import brd.t;
import me9.r;

public final class q$h implements o	// class@003013
{
    public final b b;
    public final q$b c;
    public final MagicUploadFileRequestData d;

    public void q$h(b p0,q$b p1,MagicUploadFileRequestData p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, q$h.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = c.a();
          SimpleMagicFace mId = this.b.b().mId;
          if (mId == null) {
             mId = "";
          }
          ot = p0.b(mId, this.c.b(), this.d.getUploadType()).map(new r(this));
       }
       return ot;
    }
}
