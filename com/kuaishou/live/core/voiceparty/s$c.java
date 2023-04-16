package com.kuaishou.live.core.voiceparty.s$c;
import hu2.o;
import com.kuaishou.live.core.voiceparty.s;
import java.lang.Object;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.livepresenter.LiveVCHostPresenter;

public class s$c implements o	// class@0018fc
{
    public ViewController a;
    public final s b;

    public void s$c(s p0){
       this.b = p0;
       super();
    }
    public void a(ViewController p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$c.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.b.G8(R.id.voice_party_background, p0);
          this.a = p0;
       }else {
          s$c ta = this.a;
          if (ta != null) {
             this.b.o1(ta);
             this.a = null;
          }
       }
       return;
    }
}
