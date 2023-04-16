package com.kuaishou.live.lite.anchorinfo.recommendtag.c$b;
import com.yxcorp.gifshow.widget.LiveCoverIconView$f;
import com.kuaishou.live.lite.anchorinfo.recommendtag.c;
import java.lang.Object;
import tyc.b3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$b implements LiveCoverIconView$f	// class@001e71
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       b3.a(this);
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       this.a.e();
       return;
    }
}
