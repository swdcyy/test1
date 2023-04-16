package com.yxcorp.plugin.setting.entries.holder.i$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.i;
import com.yxcorp.plugin.setting.entries.holder.i$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kwai.framework.model.user.QCurrentUser;
import android.view.View;
import android.view.View$OnClickListener;
import java.lang.Integer;
import java.lang.CharSequence;
import ekd.m1;

public class i$a extends PresenterV2	// class@000861
{
    public TextView p;
    public View$OnClickListener q;
    public final i r;

    public void i$a(i p0){
       this.r = p0;
       super();
       this.q = new i$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "2")) {
          return;
       }
       this.p.setVisibility(0);
       this.P8(QCurrentUser.ME.getFollowListVisibilityOption());
       this.m8().setOnClickListener(this.q);
       return;
    }
    public void P8(int p0){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                this.p.setText("");
             }else {
                this.p.setText(R.string.arg_RES_7f103ae1);
             }
          }else {
             this.p.setText(R.string.arg_RES_7f10508a);
          }
       }else {
          this.p.setText(R.string.arg_RES_7f1017e4);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}
