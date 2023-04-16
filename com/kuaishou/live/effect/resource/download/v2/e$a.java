package com.kuaishou.live.effect.resource.download.v2.e$a;
import vz2.a0;
import com.kuaishou.live.effect.resource.download.v2.e;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$a;
import wz2.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import vz2.z;

public class e$a implements a0	// class@001b5e
{
    public final IMagicGiftResourceLoader$a a;
    public final a b;
    public final e c;

    public void e$a(e p0,IMagicGiftResourceLoader$a p1,a p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(MagicEmoji$MagicFace p0,a p1,int p2,Throwable p3){
       if (PatchProxy.isSupport(e$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, e$a.class, "2")) {
          return;
       }
       this.a.c(this.c.getType(), this.b, p0, p2, p3);
       return;
    }
    public boolean b(MagicEmoji$MagicFace p0){
       return z.b(this, p0);
    }
    public void c(MagicEmoji$MagicFace p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "1")) {
          return;
       }
       this.a.b(this.c.getType(), this.b, p0);
       return;
    }
}
