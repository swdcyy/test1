package com.kuaishou.live.effect.resource.download.v2.g$a;
import com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$b;
import com.kuaishou.live.effect.resource.download.v2.g;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$a;
import wz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import boc.b;
import boc.o;

public class g$a implements ResourceDownloadProgressHelper$b	// class@001b62
{
    public final IMagicGiftResourceLoader$a a;
    public final a b;
    public final MagicEmoji$MagicFace c;
    public final g d;

    public void g$a(g p0,IMagicGiftResourceLoader$a p1,a p2,MagicEmoji$MagicFace p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void a(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$a.class, "2")) {
          return;
       }
       this.a.c(this.d.getType(), this.b, this.c, 0x2717, p1);
       return;
    }
    public void h(b p0){
       o.a(this, p0);
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.a.b(this.d.getType(), this.b, this.c);
       return;
    }
    public void onProgress(String p0,float p1){
       o.c(this, p0, p1);
    }
}
