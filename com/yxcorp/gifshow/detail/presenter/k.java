package com.yxcorp.gifshow.detail.presenter.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y4a.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.entity.QPhoto;

public class k extends PresenterV2	// class@0016dd
{
    public QPhoto p;
    public a q;
    public final b$b r;

    public void k(){
       super();
       this.r = new x(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       k tq = this.q;
       if (tq != null && tq.getPlayer() != null) {
          this.q.getPlayer().w(this.r);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       k tq = this.q;
       if (tq != null && tq.getPlayer() != null) {
          this.q.getPlayer().O(this.r);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(a.class);
       return;
    }
}
