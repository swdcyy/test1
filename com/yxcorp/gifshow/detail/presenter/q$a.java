package com.yxcorp.gifshow.detail.presenter.q$a;
import d6a.a;
import com.yxcorp.gifshow.detail.presenter.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import od5.f;
import com.yxcorp.gifshow.entity.QPhoto;
import uy6.h;
import uy6.b;
import y4a.j0;
import java.lang.Runnable;
import pd5.a;

public class q$a extends a	// class@0016f8
{
    public final q b;

    public void q$a(q p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, q$a.class, "1")) {
          return;
       }
       q$a tb = this.b;
       boolean b = true;
       if (tb.K == null && tb.q.isVideoType()) {
          this.b.Y8(b);
       }
       tb = this.b;
       f s = tb.s;
       if (tb.q.getPosition() <= 0 || !h.a.a()) {
          b = false;
       }
       s.a(b, new j0(this));
       return;
    }
}
