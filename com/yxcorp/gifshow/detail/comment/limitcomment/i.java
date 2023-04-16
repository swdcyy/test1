package com.yxcorp.gifshow.detail.comment.limitcomment.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.gifshow.detail.comment.limitcomment.i$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import dx9.d;
import java.lang.Runnable;
import crd.b;
import lnc.b9;

public class i extends PresenterV2	// class@001381
{
    public View p;
    public View q;
    public SlipSwitchButton r;
    public b s;
    public final SlipSwitchButton$b t;
    public static final boolean u;

    static {
       i.u = a.t().d("enableMomentSetPermission", false);
    }
    public void i(){
       super();
       this.t = new i$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       if (!i.u) {
          return;
       }
       this.p.setVisibility(0);
       this.q.setVisibility(0);
       this.r.setSwitch(QCurrentUser.me().isAllowCommentMoment());
       this.r.setOnSwitchChangeListener(this.t);
       this.r.post(new d(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       b9.a(this.s);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a2be2);
       this.p = p0.findViewById(0x7f0a2be3);
       this.q = p0.findViewById(0x7f0a2be4);
       return;
    }
}
