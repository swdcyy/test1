package com.yxcorp.gifshow.prettify.makeup.c$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.prettify.makeup.c;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupPart;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupMaterial;
import com.yxcorp.gifshow.prettify.makeup.h;

public final class c$c implements Runnable	// class@00116e
{
    public final c b;
    public final MakeupSuite c;

    public void c$c(c p0,MakeupSuite p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "1")) {
          return;
       }
       this.b.s.v2(this.c, null, null, false, 1);
       return;
    }
}
