package me9.n;
import erd.g;
import me9.m;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class n implements g	// class@003009
{
    public final m b;
    public final MagicEmoji$MagicFace c;
    public final JsonObject d;

    public void n(m p0,MagicEmoji$MagicFace p1,JsonObject p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          this.b.j(this.c, this.d);
       }
       return;
    }
}
