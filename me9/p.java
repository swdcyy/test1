package me9.p;
import erd.g;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import w46.b;

public final class p implements g	// class@00300b
{
    public final MagicEmoji$MagicFace b;

    public void p(MagicEmoji$MagicFace p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          a.D().e("MagicRequestStatusHandler", "save data error : "+this.b.mId, p0);
       }
       return;
    }
}
