package com.yxcorp.gifshow.comment.presenter.global.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.presenter.global.j$a;
import erd.g;
import crd.b;
import brd.t;
import ek9.k1;

public class j extends PresenterV2	// class@0010fd
{
    public k1 p;
    public t q;

    public void j(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.X7(this.q.subscribe(new j$a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.r8("COMMENT_STAT_PARAM");
       this.q = this.r8("COMMENT_SHOW_PANEL_OBSERVABLE");
       return;
    }
}
