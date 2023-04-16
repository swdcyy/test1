package com.kuaishou.live.common.core.component.comments.fluency.b$a;
import xq5.c;
import com.kuaishou.live.common.core.component.comments.fluency.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class b$a implements c	// class@00107b
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       this.b.a();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       this.b.b();
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
