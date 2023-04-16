package com.kwai.live.gzone.promotion.h;
import erd.g;
import com.kwai.live.gzone.promotion.f;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import fq5.b;
import lnc.a1;
import oq5.a;
import java.util.Queue;

public class h implements g	// class@000dc4
{
    public final f b;

    public void h(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else if(this.b.J.I().isFollowingOrFollowRequesting()){
          p0 = a1.r(R.string.arg_RES_7f101407, this.b.V8());
       }else {
          p0 = a1.r(R.string.arg_RES_7f101408, this.b.V8());
       }
       if (!this.b.s.H2()) {
          if (this.b.W8()) {
             if (!this.b.z.isEmpty()) {
                h tb = this.b;
                tb.X8(tb.z.poll());
             }
             this.b.X8(p0);
          }
       }else {
          this.b.z.offer(p0);
       }
       return;
    }
}
