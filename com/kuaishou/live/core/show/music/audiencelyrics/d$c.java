package com.kuaishou.live.core.show.music.audiencelyrics.d$c;
import ft5.d;
import com.kuaishou.live.core.show.music.audiencelyrics.d;
import java.lang.Object;
import ft5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d$c implements d	// class@000d31
{
    public final d a;

    public void d$c(d p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       c.a(this, p0, p1);
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "2")) {
          return;
       }
       this.a.V8(true);
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "1")) {
          return;
       }
       this.a.V8(false);
       return;
    }
}
