package com.yxcorp.plugin.setting.entries.holder.v0$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.v0;
import com.yxcorp.plugin.setting.entries.holder.v0$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import java.lang.Integer;
import agd.e;
import ekd.m1;

public class v0$a extends PresenterV2	// class@000899
{
    public TextView p;
    public View$OnClickListener q;
    public final v0 r;

    public void v0$a(v0 p0){
       this.r = p0;
       super();
       this.q = new v0$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v0$a.class, "2")) {
          return;
       }
       this.p.setVisibility(0);
       this.P8((QCurrentUser.me().isNotPublicProfileCollect() ^ 0x01));
       this.m8().setOnClickListener(this.q);
       return;
    }
    public final void P8(boolean p0){
       v0$a uoa = v0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (p0) {
          this.p.setText(R.string.arg_RES_7f103afd);
       }else {
          this.p.setText(R.string.arg_RES_7f1017e4);
       }
       return;
    }
    public final void R8(int p0){
       v0$a uoa = v0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       this.r.f.J0(p0);
       boolean b = (!p0)? true: false;
       this.P8(b);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
