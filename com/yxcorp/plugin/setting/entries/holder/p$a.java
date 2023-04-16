package com.yxcorp.plugin.setting.entries.holder.p$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.p;
import com.yxcorp.plugin.setting.entries.holder.p$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import android.view.View;
import android.view.View$OnClickListener;
import ekd.m1;
import android.widget.ImageView;

public class p$a extends PresenterV2	// class@000881
{
    public TextView p;
    public ImageView q;
    public View$OnClickListener r;
    public final p s;

    public void p$a(p p0){
       this.s = p0;
       super();
       this.r = new p$a$a(this);
    }
    public void E8(){
       p$a uoa = p$a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "2")) {
          return;
       }
       this.p.setVisibility(0);
       boolean b = QCurrentUser.ME.isPrivateLocation();
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uoa, "8")) {
          if (b) {
             this.p.setText(R.string.arg_RES_7f103e29);
          }else {
             this.p.setText(R.string.arg_RES_7f103afd);
          }
       }
       this.m8().setOnClickListener(this.r);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       this.q = m1.f(p0, 0x7f0a0d61);
       return;
    }
}
