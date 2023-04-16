package com.kuaishou.live.effect.resource.download.v2.e;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader;
import java.lang.Object;
import com.kuaishou.live.effect.resource.download.common.p;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.util.Map;
import java.lang.Integer;
import com.yxcorp.download.DownloadManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uz2.b;
import wz2.a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import wz2.a$a;
import com.kuaishou.live.effect.resource.download.v2.e$a;
import vz2.a0;

public class e implements IMagicGiftResourceLoader	// class@001b5f
{
    public final p a;

    public void e(){
       super();
       this.a = new p();
    }
    public void a(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       this.a.a(p0);
       return;
    }
    public void b(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       this.a.b(p0);
       return;
    }
    public void c(MagicEmoji$MagicFace p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, p.class, "7")) {
          Integer integer = ta.b.get(p0.getUniqueIdentifier());
          if (integer != null) {
             DownloadManager.n().z(integer.intValue());
          }
       }
       return;
    }
    public boolean d(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (b.g(p0) ^ 0x01);
    }
    public void e(a p0,MagicEmoji$MagicFace p1,IMagicGiftResourceLoader$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "2")) {
          return;
       }
       p2.a(this.getType(), p0, p1);
       a$a uoa = a$a.b(p0);
       uoa.g(new e$a(this, p2, p0));
       this.a.e(p1, uoa.a());
       return;
    }
    public IMagicGiftResourceLoader$Type getType(){
       return IMagicGiftResourceLoader$Type.MAGIC_FACE;
    }
}
