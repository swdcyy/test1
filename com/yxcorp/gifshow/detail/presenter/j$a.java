package com.yxcorp.gifshow.detail.presenter.j$a;
import d6a.a;
import com.yxcorp.gifshow.detail.presenter.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import java.util.Objects;
import ekd.y0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import m9a.y;
import com.yxcorp.gifshow.entity.QPhoto;
import y4a.u;
import java.lang.Runnable;

public class j$a extends a	// class@0016db
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "2")) {
          return;
       }
       this.b.r.getPlayer().O(this.b.A);
       this.b.r.getPlayer().removeOnInfoListener(this.b.B);
       this.b.S8();
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j$a.class, "1")) {
          return;
       }
       j$a tb = this.b;
       Objects.requireNonNull(tb);
       j oj = j.class;
       if (!PatchProxy.applyVoid(objArray, tb, oj, "5")) {
          Object obj = PatchProxy.apply(objArray, tb, oj, "6");
          long l = (obj != PatchProxyResult.class)? obj.longValue(): y.f(tb.q, y.d(tb.r.getPlayer()));
          tb.z = new y0(l, new u(tb));
       }
       this.b.r.getPlayer().w(this.b.A);
       this.b.r.getPlayer().addOnInfoListener(this.b.B);
       this.b.R8();
       return;
    }
}
