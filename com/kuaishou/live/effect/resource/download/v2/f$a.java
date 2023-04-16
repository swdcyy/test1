package com.kuaishou.live.effect.resource.download.v2.f$a;
import com.kwai.plugin.dva.work.c$c;
import com.kuaishou.live.effect.resource.download.v2.f;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$a;
import wz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import java.lang.Throwable;
import sj7.d;
import java.util.List;

public class f$a implements c$c	// class@001b60
{
    public final IMagicGiftResourceLoader$a a;
    public final a b;
    public final MagicEmoji$MagicFace c;
    public final f d;

    public void f$a(f p0,IMagicGiftResourceLoader$a p1,a p2,MagicEmoji$MagicFace p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       this.a.c(this.d.getType(), this.b, this.c, 0x2716, p0);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
       }else {
          this.a.b(this.d.getType(), this.b, this.c);
       }
       return;
    }
}
