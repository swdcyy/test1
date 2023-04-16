package com.yxcorp.gifshow.detail.comment.limitcomment.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.comment.limitcomment.j$a;
import dx9.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import com.yxcorp.gifshow.detail.comment.limitcomment.d;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.library.widget.button.SlipSwitchButton;
import android.view.View;
import ekd.m1;

public class j extends PresenterV2	// class@001383
{
    public SlipSwitchButton p;
    public d q;
    public final q r;
    public final SlipSwitchButton$b s;

    public void j(){
       super();
       this.r = new j$a(this);
       this.s = new g(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.q.d(this.r);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "4")) {
          return;
       }
       this.p.setOnSwitchChangeListener(objArray);
       this.q.e(this.r);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3c3f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.q = this.r8("COMMENT_LIMIT_CONTROLLER");
       return;
    }
}
