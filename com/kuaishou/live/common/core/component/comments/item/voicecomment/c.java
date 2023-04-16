package com.kuaishou.live.common.core.component.comments.item.voicecomment.c;
import kf1.f;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.b$b;

public class c implements f	// class@0010ac
{
    public final b a;

    public void c(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.a.c.onClick();
       return;
    }
    public boolean b(){
       return this.a.e;
    }
}
