package com.yxcorp.gifshow.comment.presenter.global.g$a;
import xk9.n;
import com.yxcorp.gifshow.comment.presenter.global.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.log.a;
import java.lang.Integer;

public class g$a implements n	// class@0010f6
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "2")) {
          return;
       }
       this.a.t.f();
       this.a.t.e();
       return;
    }
    public void b(int p0,int p1){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, g$a.class, "1")) {
          return;
       }
       this.a.t.j();
       return;
    }
}
